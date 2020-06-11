import java.util.*;


public class MyVisitor extends benqBaseVisitor<Object> {


    Stack<HashMap<String, Value>> Stackvar = new Stack<>();
    HashMap<String, benqParser.BlockContext> function = new HashMap<>();
    HashMap<String, Value> tableforprint = new HashMap<>();
    private HashSet<String> global = new HashSet<>();

    private Value getVariable(String varName) throws Exception {
        if (tableforprint.containsKey(varName)) {
            return tableforprint.get(varName);
        }
        for (HashMap<String, Value> cv: Stackvar) {
            if (cv.containsKey(varName)) {
                return cv.get(varName);
            }
        }
        throw new Exception("Variable " + varName + " is not identified");
    }

    private void setVariable(String varName, Value value) throws Exception {
        value.setIdent(varName);
        if (tableforprint.containsKey(varName)) {
            Value val = tableforprint.get(varName);
            if (val.getType().equals("INTEGER")) {
                System.out.println(value);
                tableforprint.replace(varName, value);

                String str = "%" + (GenerateLLVM.reg-1);
                GenerateLLVM.assign_i32(varName, str, global);


            }
            else if (val.getType().equals("FLOAT")){
                tableforprint.replace(varName, value);
                    String str = "%" + (GenerateLLVM.reg-1) ;
                    GenerateLLVM.assign_double(varName, str,global);


            }

        }
        else
            for (HashMap<String, Value> cv: Stackvar) {
                if (cv.containsKey(varName)) {
                    Value val = cv.get(varName);

                    cv.replace(varName, value);
                }
                else throw  new Exception("Variable" + varName + " is not identified");
            }
            tableforprint.put(varName,value);
    }


    private void callProcedure(String ident){

        if (function.containsKey(ident)) {
            GenerateLLVM.call(ident);
            //visit(function.get(ident));
        }

    }

    @Override public Object visitStart(benqParser.StartContext ctx) {
        visitChildren(ctx);
        GenerateLLVM.generate();
        return null; }

    @Override public Object visitBlock(benqParser.BlockContext ctx) {
        boolean stack = false;
        if (!tableforprint.isEmpty()) {
            Stackvar.push(tableforprint);
            stack = true;
        }

        visitChildren(ctx);
        if (stack) tableforprint = Stackvar.pop();
        else tableforprint.clear();
        return null;

    }


    @Override public Object visitVars(benqParser.VarsContext ctx) {

        String name = ctx.ident().getText();
        String type = null;
        Value value;
        if ((ctx.children).contains(ctx.integertype())) {
            Object gen = (ctx.integertype()).getText();
            type = "INTEGER";
            value = new Value(name, type, gen);
            tableforprint.put(name, value);

            System.out.println(type + " Переменная: " +  " " + name + " = " + value);
            global.add(value.getIdent());
            GenerateLLVM.declare_i32(value.getIdent(),true);
            GenerateLLVM.assign_i32(value.getIdent(), value.getValue().toString(), global);



        }
        else if (ctx.children.contains(ctx.floattype())){
            Object gen = (ctx.floattype()).getText();
            type = "FLOAT";
            value = new Value(name, type, gen);
            tableforprint.put(name, value);
            System.out.println(type + " Переменная: " +  " " + name + " = " + value.getValue());
            global.add(value.getIdent());
            GenerateLLVM.declare_double(value.getIdent(),true);
            GenerateLLVM.assign_double(value.getIdent(), value.getValue().toString(), global);

        }
        else if (ctx.children.contains(ctx.literal())){
            Object gen = (ctx.literal()).getText();
            type = "LITERAL";
            value = new Value(name, type, gen);

            tableforprint.put(name, value);

            System.out.println(type + " Переменная: " +  " " + name + " = " + value);

        }

        return null;


    }

    @Override public Object visitProcedure(benqParser.ProcedureContext ctx) {
        String ident = ctx.ident().getText();
        function.put(ident, ctx.block());
        GenerateLLVM.function_start(ident);
        visit(ctx.block());
        GenerateLLVM.function_end();
        return null;
    }
    @Override public Object visitStatement(benqParser.StatementContext ctx) {
        return visitChildren(ctx); }

    @Override public Object visitAssign(benqParser.AssignContext ctx) {
        String name = ctx.ident().getText();
        Value value = (Value) visit(ctx.expression());
        System.out.println(value);
        try {
            setVariable(name, value);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }




    @Override public Object visitCall(benqParser.CallContext ctx) {
        try {
            callProcedure(ctx.ident().getText());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override public Object visitBreakfunc(benqParser.BreakfuncContext ctx)
    {
        GenerateLLVM.Break();
        return null;
    }

    @Override public Object visitContinuefunc(benqParser.ContinuefuncContext ctx)
    {
        GenerateLLVM.Continue();
        return null;
    }

    @Override public Object visitPrintmess(benqParser.PrintmessContext ctx) {
        String name = null;

        if (ctx.children.contains(ctx.expression())) {
            try{
                name = ctx.expression().getText();
                Value val = getVariable(name);
                if (val.getType().equals("INTEGER")) {
                    System.out.println("PRINT Значение из таблицы: " + val);
                    GenerateLLVM.printf_i32(name,global);
                }
                else if (val.getType().equals("FLOAT")){
                    System.out.println("PRINT Значение из таблицы: " + val);
                    GenerateLLVM.printf_double(name,global);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (ctx.children.contains(ctx.literal()))
        {
            name = ctx.literal().getText();
            name = Utils.removeChatAt(ctx.literal().getText());
            System.out.println("PRINT Строковой литерал: " + name);
            GenerateLLVM.printlit(name);
        }


        return null;
    }

    @Override public Object visitBeginfunc(benqParser.BeginfuncContext ctx) {

        return visitChildren(ctx);
    }

    @Override public Object visitIfthen(benqParser.IfthenContext ctx) {
        Value value = (Value) visit(ctx.orandcheck());
        //System.out.println(value);
        //System.out.println(value.getValue() + " from visitIfthen");
        GenerateLLVM.if_start();
        //if (Boolean.parseBoolean(value.getValue().toString())){
            visit(ctx.statement());
        //}
        GenerateLLVM.if_end();
        return null;
    }

    @Override public Object visitWhiledo(benqParser.WhiledoContext ctx) {
        GenerateLLVM.while_start();
        Value value = (Value) visit(ctx.orandcheck());
        GenerateLLVM.while_condition(GenerateLLVM.reg-1);

        visit(ctx.statement());
        value = (Value) visit(ctx.orandcheck());

        GenerateLLVM.while_end();
        return null;
    }

    @Override public Object visitOrandcheck(benqParser.OrandcheckContext ctx) {
        if (ctx.condition().size() > 1) {
            Value left = (Value) visit(ctx.condition(0));

            Value right = (Value) visit(ctx.condition(1));


            if (ctx.check.getText().equals("or")) {
                if(!isExpr(ctx.condition(1).getChild(1).getText()) && !isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.or(GenerateLLVM.reg-1,GenerateLLVM.reg-2);
                } else if(isExpr(ctx.condition(1).getChild(1).getText()) && isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.or(GenerateLLVM.reg-1,GenerateLLVM.reg-4);
                } else if(!isExpr(ctx.condition(1).getChild(1).getText()) || !isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.or(GenerateLLVM.reg-1,GenerateLLVM.reg-3);
                }
                return new Value("", Utils.Bool, (Boolean.parseBoolean(left.getValue().toString()) || Boolean.parseBoolean(right.getValue().toString())));
            } else if (ctx.check.getText().equals("and")) {
                if(!isExpr(ctx.condition(1).getChild(1).getText()) && !isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.and(GenerateLLVM.reg-1,GenerateLLVM.reg-2);
                } else if(isExpr(ctx.condition(1).getChild(1).getText()) && isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.and(GenerateLLVM.reg-1,GenerateLLVM.reg-4);
                } else if(!isExpr(ctx.condition(1).getChild(1).getText()) || !isExpr(ctx.condition(1).getChild(3).getText()) ){
                    GenerateLLVM.and(GenerateLLVM.reg-1,GenerateLLVM.reg-3);
                }

                return new Value("", Utils.Bool, (Boolean.parseBoolean(left.getValue().toString()) && Boolean.parseBoolean(right.getValue().toString())));
            }
            return visitChildren(ctx);
        }
        else {
            return visitChildren(ctx);
        }
    }

    @Override public Object visitCond_expr_all(benqParser.Cond_expr_allContext ctx) {
        Value left = (Value) visit(ctx.expression(0));
        Value right = (Value) visit(ctx.expression(1));
        try {
            if (!Utils.CheckType(left, right)) return null;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        if (ctx.check.getText().equals("==")) {
            if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))){
                try {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.eq2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.eq1(ctx.expression(1).getText(), "INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.eq1(ctx.expression(0).getText(), "INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.eq0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);

                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if (left.getType().equals("FLOAT") && right.getType().equals("FLOAT")){
                try {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.eq2("FLOAT");

                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.eq1(ctx.expression(1).getText(),"FLOAT");

                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.eq1(ctx.expression(0).getText(), "FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.eq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);

                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
        else if (ctx.check.getText().equals(">")) {
            try {
                if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.more2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.more1_1(ctx.expression(1).getText(), "INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.more1_2(ctx.expression(0).getText(), "INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.more0(ctx.expression(0).getText(), ctx.expression(1).getText(), "INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
                else if (left.getType().equals("FLOAT") && right.getType().equals(("FLOAT"))){
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.more2("FLOAT");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.more1_1(ctx.expression(1).getText(), "FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.more1_2(ctx.expression(0).getText(), "FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.more0(ctx.expression(0).getText(), ctx.expression(1).getText(), "FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ctx.check.getText().equals("<")) {
            try {
                if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.less2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.less1_1(ctx.expression(1).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.less1_2(ctx.expression(0).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.less0(ctx.expression(0).getText(), ctx.expression(1).getText(),"INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
                else if (left.getType().equals("FLOAT") && right.getType().equals(("FLOAT"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.less2("FLOAT");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.less1_1(ctx.expression(1).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.less1_2(ctx.expression(0).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.less0(ctx.expression(0).getText(), ctx.expression(1).getText(),"FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ctx.check.getText().equals(">=")) {
            try {
                if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.moreeq2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.moreeq1_1(ctx.expression(1).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.moreeq1_2(ctx.expression(0).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.moreeq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
                else if (left.getType().equals("FLOAT") && right.getType().equals(("FLOAT"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.moreeq2("FLOAT");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.moreeq1_1(ctx.expression(1).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.moreeq1_2(ctx.expression(0).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.moreeq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ctx.check.getText().equals("<=")) {
            try {
                if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.lesseq2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.lesseq1_1(ctx.expression(1).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.lesseq1_2(ctx.expression(0).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.lesseq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
                else if (left.getType().equals("FLOAT") && right.getType().equals(("FLOAT"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.lesseq2("FLOAT");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.lesseq1_1(ctx.expression(1).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.lesseq1_2(ctx.expression(0).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.lesseq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (ctx.check.getText().equals("!=")) {
            try {
                if (left.getType().equals("INTEGER") && right.getType().equals(("INTEGER"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.noeq2("INTEGER");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(0).getText(), global);
                        GenerateLLVM.noeq1(ctx.expression(1).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_i32(ctx.expression(1).getText(), global);
                        GenerateLLVM.noeq1(ctx.expression(0).getText(),"INTEGER");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.noeq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"INTEGER");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
                else if (left.getType().equals("FLOAT") && right.getType().equals(("FLOAT"))) {
                    System.out.println("first: " + ctx.expression(0).getText());
                    System.out.println("second: " + ctx.expression(1).getText());
                    if (isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.noeq2("FLOAT");
                    } else if (isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(0).getText(), global);
                        GenerateLLVM.noeq1(ctx.expression(1).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.load_double(ctx.expression(1).getText(), global);
                        GenerateLLVM.noeq1(ctx.expression(0).getText(),"FLOAT");
                    } else if (!isExpr(ctx.expression(0).getText()) && !isExpr(ctx.expression(1).getText())) {
                        GenerateLLVM.noeq0(ctx.expression(0).getText(), ctx.expression(1).getText(),"FLOAT");
                    }
                    Object obj = Utils.Compare(ctx.check.getText(), left, right);
                    System.out.println(obj.toString() + " from visitCond_expr_all");
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override public Object visitCond_expr(benqParser.Cond_exprContext ctx) {
        Value result = (Value) visit(ctx.expression());
        try {
            return result;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static boolean isExpr(String s) {
        if (s.matches(".*[a-zA-Z].*")) {

            return true;
        } else {

            return false;
        }
    }

    @Override public Object visitExpr_op(benqParser.Expr_opContext ctx) {
        Value left = (Value) visit(ctx.expression());
        Value right = (Value) visit(ctx.term());
        if (left.getType().equals("INTEGER") && right.getType().equals("INTEGER")) {
            switch (ctx.op.getText()) {
                case "+":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sum(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_i32(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.add_i32(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "-":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sub(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_i32(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.sub_i32(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }
        else if (left.getType().equals("FLOAT") && right.getType().equals("INTEGER")) {
            switch (ctx.op.getText()) {
                case "+":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sum(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_double(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg -1);
                            } else {

                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {

                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                GenerateLLVM.translate_int_to_float(GenerateLLVM.reg -1);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString()+".0";
                            }
                            System.out.println(firstValue);
                            GenerateLLVM.add_double(firstValue, secondValue);

                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "-":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sub(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_i32(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                GenerateLLVM.translate_int_to_float(GenerateLLVM.reg -1);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString()+".0";
                            }
                            GenerateLLVM.sub_i32(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }
        else if (left.getType().equals("FLOAT") && right.getType().equals("FLOAT")) {
            switch (ctx.op.getText()) {
                case "+":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sum(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_double(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.add_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "-":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Sub(left, right);
                            String firstValue;
                            if (isExpr(ctx.expression().getText())) {
                                GenerateLLVM.load_double(ctx.expression().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.sub_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            }
        }
        return null;

    }


    @Override public Object visitTerm_op(benqParser.Term_opContext ctx) {
        Value left = (Value) visit(ctx.term());
        Value right = (Value) visit(ctx.factor());
        if (left.getType().equals("INTEGER") && right.getType().equals("INTEGER")) {
            switch (ctx.op.getText()) {
                case "/":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Div(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);

                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.div_i32(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "*":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Mult(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_i32(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.mult_i32(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

            }
        } else if (left.getType().equals("FLOAT") && right.getType().equals("INTEGER")) {
            switch (ctx.op.getText()) {
                case "/":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Div(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                GenerateLLVM.translate_int_to_float(GenerateLLVM.reg -1);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString()+".0";
                            }
                            GenerateLLVM.div_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "*":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Mult(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                GenerateLLVM.translate_int_to_float(GenerateLLVM.reg -1);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString()+".0";
                            }
                            GenerateLLVM.mul_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }


        } else if (left.getType().equals("FLOAT") && right.getType().equals("FLOAT")) {
            switch (ctx.op.getText()) {
                case "/":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Div(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.div_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "*":
                    try {
                        if (Utils.CheckType(left, right)) {
                            Object obj = Utils.Mult(left, right);
                            String firstValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                firstValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                firstValue = left.getValue().toString();
                            }
                            String secondValue;
                            if (isExpr(ctx.term().getText())) {
                                GenerateLLVM.load_double(ctx.term().getText(), global);
                                secondValue = "%" + (GenerateLLVM.reg - 1);
                            } else {
                                secondValue = right.getValue().toString();
                            }
                            GenerateLLVM.mul_double(firstValue, secondValue);
                            return obj;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
        return null;
    }

    @Override public Object visitFactor_term(benqParser.Factor_termContext ctx) {
        return (Value) visit(ctx.factor()); }


    @Override public Object visitExpr_factor(benqParser.Expr_factorContext ctx) {
        return (Value) visit(ctx.expression()); }

    @Override public Object visitIdent_factor(benqParser.Ident_factorContext ctx) {
        try {
            return getVariable(ctx.ident().getText());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override public Object visitInteger_factor(benqParser.Integer_factorContext ctx) {


        return new Value ("", "INTEGER", Integer.parseInt(ctx.integertype().getText()));

    }


    @Override public Object visitFloat_factor(benqParser.Float_factorContext ctx) {

        return new Value ("", "FLOAT", Float.parseFloat(ctx.floattype().getText()));
         }



    @Override public Object visitIdent(benqParser.IdentContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitTerm_expr(benqParser.Term_exprContext ctx) {
        return (Value) visit(ctx.term());
    }

    @Override public Object visitFloattype(benqParser.FloattypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitLiteral(benqParser.LiteralContext ctx) {
        return visitChildren(ctx);
    }
}