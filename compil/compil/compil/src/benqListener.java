// Generated from /home/killsing4/finalkursovaya/benq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link benqParser}.
 */
public interface benqListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link benqParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(benqParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(benqParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(benqParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(benqParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(benqParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(benqParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(benqParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(benqParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(benqParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(benqParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(benqParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(benqParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(benqParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(benqParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#breakfunc}.
	 * @param ctx the parse tree
	 */
	void enterBreakfunc(benqParser.BreakfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#breakfunc}.
	 * @param ctx the parse tree
	 */
	void exitBreakfunc(benqParser.BreakfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#continuefunc}.
	 * @param ctx the parse tree
	 */
	void enterContinuefunc(benqParser.ContinuefuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#continuefunc}.
	 * @param ctx the parse tree
	 */
	void exitContinuefunc(benqParser.ContinuefuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#printmess}.
	 * @param ctx the parse tree
	 */
	void enterPrintmess(benqParser.PrintmessContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#printmess}.
	 * @param ctx the parse tree
	 */
	void exitPrintmess(benqParser.PrintmessContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#beginfunc}.
	 * @param ctx the parse tree
	 */
	void enterBeginfunc(benqParser.BeginfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#beginfunc}.
	 * @param ctx the parse tree
	 */
	void exitBeginfunc(benqParser.BeginfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void enterIfthen(benqParser.IfthenContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#ifthen}.
	 * @param ctx the parse tree
	 */
	void exitIfthen(benqParser.IfthenContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#whiledo}.
	 * @param ctx the parse tree
	 */
	void enterWhiledo(benqParser.WhiledoContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#whiledo}.
	 * @param ctx the parse tree
	 */
	void exitWhiledo(benqParser.WhiledoContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#orandcheck}.
	 * @param ctx the parse tree
	 */
	void enterOrandcheck(benqParser.OrandcheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#orandcheck}.
	 * @param ctx the parse tree
	 */
	void exitOrandcheck(benqParser.OrandcheckContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_expr_all}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr_all(benqParser.Cond_expr_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_expr_all}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr_all(benqParser.Cond_expr_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCond_expr(benqParser.Cond_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCond_expr(benqParser.Cond_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpr_op(benqParser.Expr_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpr_op(benqParser.Expr_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTerm_expr(benqParser.Term_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTerm_expr(benqParser.Term_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm_op(benqParser.Term_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm_op(benqParser.Term_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factor_term}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactor_term(benqParser.Factor_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factor_term}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactor_term(benqParser.Factor_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ident_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdent_factor(benqParser.Ident_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ident_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdent_factor(benqParser.Ident_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterInteger_factor(benqParser.Integer_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitInteger_factor(benqParser.Integer_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFloat_factor(benqParser.Float_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFloat_factor(benqParser.Float_factorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpr_factor(benqParser.Expr_factorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpr_factor(benqParser.Expr_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(benqParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(benqParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#integertype}.
	 * @param ctx the parse tree
	 */
	void enterIntegertype(benqParser.IntegertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#integertype}.
	 * @param ctx the parse tree
	 */
	void exitIntegertype(benqParser.IntegertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#floattype}.
	 * @param ctx the parse tree
	 */
	void enterFloattype(benqParser.FloattypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#floattype}.
	 * @param ctx the parse tree
	 */
	void exitFloattype(benqParser.FloattypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link benqParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(benqParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link benqParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(benqParser.LiteralContext ctx);
}