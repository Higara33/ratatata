public class Utils {
    private static String Int = "INTEGER";
    private static String Flo = "FLOAT";
    public static String Bool = "BOOLEAN";
    private static String str = "STRING";

    public static boolean CheckType(Value v1, Value v2) throws  Exception {
        String type1 = v1.getType();
        String type2 = v2.getType();
        if ((type1.equals(Int) || type1.equals(Flo)) && (type2.equals(Int) || type2.equals(Flo))) {
            return true;
        } else {
            throw new Exception(v1.getValue().toString() + " and " + v2.getValue().toString() + " of different types");
        }
    }
    public static boolean CheckTypeAll(Value v1, Value v2) throws Exception {
        String type1 = v1.getType();
        String type2 = v2.getType();
        if (type1.equals(type2)) {
            return true;
        }
        else if ((type1.equals(Int) || type1.equals(Flo)) && (type2.equals(Int) || type2.equals(Flo))) {
            return true;
        } else {
            throw new Exception(v1.getValue().toString() + " and " + v2.getValue().toString() + " of different types");
        }
    }

    public static Value Compare(String op, Value left, Value right) throws Exception {
        String type_left = left.getType();
        String type_right = right.getType();
        Value value;
        switch (op) {
            case "==":
                if (type_left.equals(Bool)) value = new Value("", Bool, (Boolean.parseBoolean(left.getValue().toString()) == Boolean.parseBoolean(right.getValue().toString())));
                else if (type_left.equals(str)) value = new Value("", Bool, left.getValue().toString().equals(right.getValue().toString()));

                else value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) == Float.parseFloat(right.getValue().toString())));

                break;
            case "!=":
                if (type_left.equals(Bool)) value = new Value("", Bool, (Boolean.parseBoolean(left.getValue().toString()) != Boolean.parseBoolean(right.getValue().toString())));
                else if (type_left.equals(str)) value = new Value("", Bool, (!left.getValue().toString().equals(right.getValue().toString())));
                else value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) != Float.parseFloat(right.getValue().toString())));
                break;
            case ">=":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) >= Float.parseFloat(right.getValue().toString())));
                else throw new Exception(">= can't accept bool and string types");
                break;
            case "<=":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) <= Float.parseFloat(right.getValue().toString())));
                else throw new Exception("<= can't accept bool and string types");
                break;
            case ">":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) > Float.parseFloat(right.getValue().toString())));
                else throw new Exception("> can't accept bool and string types");
                break;
            case "<":
                if ((type_left.equals(Int)) || (type_left.equals(Flo))) value = new Value("", Bool, (Float.parseFloat(left.getValue().toString()) < Float.parseFloat(right.getValue().toString())));
                else throw new Exception("< can't accept bool and string types");
                break;
            default:
                throw new Exception("The op sign is not identified");
        }

        return value;
    }


    public static Value Div(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) / Integer.parseInt(v2.toString()));
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) / Float.parseFloat(v2.toString()));
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) / Float.parseFloat(v2.toString()));
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) / Integer.parseInt(v2.toString()));

        return value;
    }

    public static Value Mult(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) * Integer.parseInt(v2.toString()));
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) * Float.parseFloat(v2.toString()));
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) * Float.parseFloat(v2.toString()));
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) * Integer.parseInt(v2.toString()));

        return value;
    }

    public static Value Sub(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) - Integer.parseInt(v2.toString()));
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) - Float.parseFloat(v2.toString()));
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) - Float.parseFloat(v2.toString()));
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) - Integer.parseInt(v2.toString()));

        return value;
    }

    public static Value Sum(Value v1, Value v2) {
        String type1 = v1.getType();
        String type2 = v2.getType();
        Value value;
        if ((type1.equals(Int)) && (type2.equals(Int))) {
            value = new Value("", Int, Integer.parseInt(v1.toString()) + Integer.parseInt(v2.toString()));
        } else if ((type1.equals(Int)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Integer.parseInt(v1.toString()) + Float.parseFloat(v2.toString()));
        } else if ((type1.equals(Flo)) && (type2.equals(Flo))) {
            value = new Value("", Flo, Float.parseFloat(v1.toString()) + Float.parseFloat(v2.toString()));
        } else
            value = value = new Value("", Flo, Float.parseFloat(v1.toString()) + Integer.parseInt(v2.toString()));

        return value;
    }
    public static String removeChatAt(String s) {
        String ss = s.substring(1,s.length()-1);
        return ss;
    }

}