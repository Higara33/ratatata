// Generated from /home/killsing4/finalkursovaya/benq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link benqParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface benqVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link benqParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(benqParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(benqParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(benqParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(benqParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(benqParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(benqParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(benqParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#breakfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakfunc(benqParser.BreakfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#continuefunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuefunc(benqParser.ContinuefuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#printmess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintmess(benqParser.PrintmessContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#beginfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginfunc(benqParser.BeginfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#ifthen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfthen(benqParser.IfthenContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#whiledo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledo(benqParser.WhiledoContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#orandcheck}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrandcheck(benqParser.OrandcheckContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_expr_all}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expr_all(benqParser.Cond_expr_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond_expr}
	 * labeled alternative in {@link benqParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_expr(benqParser.Cond_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_op}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_op(benqParser.Expr_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_expr}
	 * labeled alternative in {@link benqParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_expr(benqParser.Term_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code term_op}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_op(benqParser.Term_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factor_term}
	 * labeled alternative in {@link benqParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_term(benqParser.Factor_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ident_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_factor(benqParser.Ident_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_factor(benqParser.Integer_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat_factor(benqParser.Float_factorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_factor}
	 * labeled alternative in {@link benqParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_factor(benqParser.Expr_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(benqParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#integertype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegertype(benqParser.IntegertypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#floattype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloattype(benqParser.FloattypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link benqParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(benqParser.LiteralContext ctx);
}