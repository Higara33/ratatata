// Generated from /home/killsing4/finalkursovaya/benq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class benqParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TYPE=12, DEF=13, CALLF=14, PRINTEXPR=15, IF=16, THEN=17, 
		WHILE=18, DO=19, SIGN=20, ORAND=21, BREAKF=22, CONTINUEF=23, STRINGLITERAL=24, 
		STRING=25, NUMBER=26, OneComment=27, ManyComment=28, WS=29;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_vars = 2, RULE_procedure = 3, RULE_statement = 4, 
		RULE_assign = 5, RULE_call = 6, RULE_breakfunc = 7, RULE_continuefunc = 8, 
		RULE_printmess = 9, RULE_beginfunc = 10, RULE_ifthen = 11, RULE_whiledo = 12, 
		RULE_orandcheck = 13, RULE_condition = 14, RULE_expression = 15, RULE_term = 16, 
		RULE_factor = 17, RULE_ident = 18, RULE_integertype = 19, RULE_floattype = 20, 
		RULE_literal = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "vars", "procedure", "statement", "assign", "call", 
			"breakfunc", "continuefunc", "printmess", "beginfunc", "ifthen", "whiledo", 
			"orandcheck", "condition", "expression", "term", "factor", "ident", "integertype", 
			"floattype", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'='", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'/'", 
			"'*'", "'.'", null, "'def'", "'call'", "'print'", "'if'", "'then'", "'while'", 
			"'do'", null, null, "'break'", "'continue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"TYPE", "DEF", "CALLF", "PRINTEXPR", "IF", "THEN", "WHILE", "DO", "SIGN", 
			"ORAND", "BREAKF", "CONTINUEF", "STRINGLITERAL", "STRING", "NUMBER", 
			"OneComment", "ManyComment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "benq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public benqParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			block();
			setState(45);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(47);
				vars();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(53);
				procedure();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(benqParser.TYPE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IntegertypeContext integertype() {
			return getRuleContext(IntegertypeContext.class,0);
		}
		public FloattypeContext floattype() {
			return getRuleContext(FloattypeContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(TYPE);
			setState(62);
			ident();
			setState(63);
			match(T__1);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(64);
				integertype();
				}
				break;
			case 2:
				{
				setState(65);
				floattype();
				}
				break;
			case 3:
				{
				setState(66);
				literal();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(benqParser.DEF, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(DEF);
			setState(70);
			ident();
			setState(71);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public PrintmessContext printmess() {
			return getRuleContext(PrintmessContext.class,0);
		}
		public BeginfuncContext beginfunc() {
			return getRuleContext(BeginfuncContext.class,0);
		}
		public IfthenContext ifthen() {
			return getRuleContext(IfthenContext.class,0);
		}
		public WhiledoContext whiledo() {
			return getRuleContext(WhiledoContext.class,0);
		}
		public BreakfuncContext breakfunc() {
			return getRuleContext(BreakfuncContext.class,0);
		}
		public ContinuefuncContext continuefunc() {
			return getRuleContext(ContinuefuncContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(73);
				assign();
				}
				break;
			case CALLF:
				{
				setState(74);
				call();
				}
				break;
			case PRINTEXPR:
				{
				setState(75);
				printmess();
				}
				break;
			case T__4:
				{
				setState(76);
				beginfunc();
				}
				break;
			case IF:
				{
				setState(77);
				ifthen();
				}
				break;
			case WHILE:
				{
				setState(78);
				whiledo();
				}
				break;
			case BREAKF:
				{
				setState(79);
				breakfunc();
				}
				break;
			case CONTINUEF:
				{
				setState(80);
				continuefunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			ident();
			setState(84);
			match(T__1);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(85);
				expression(0);
				}
				break;
			case 2:
				{
				setState(86);
				literal();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public TerminalNode CALLF() { return getToken(benqParser.CALLF, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(CALLF);
			setState(90);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakfuncContext extends ParserRuleContext {
		public TerminalNode BREAKF() { return getToken(benqParser.BREAKF, 0); }
		public BreakfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterBreakfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitBreakfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitBreakfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakfuncContext breakfunc() throws RecognitionException {
		BreakfuncContext _localctx = new BreakfuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_breakfunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(BREAKF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinuefuncContext extends ParserRuleContext {
		public TerminalNode CONTINUEF() { return getToken(benqParser.CONTINUEF, 0); }
		public ContinuefuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuefunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterContinuefunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitContinuefunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitContinuefunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuefuncContext continuefunc() throws RecognitionException {
		ContinuefuncContext _localctx = new ContinuefuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continuefunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(CONTINUEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintmessContext extends ParserRuleContext {
		public TerminalNode PRINTEXPR() { return getToken(benqParser.PRINTEXPR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrintmessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printmess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterPrintmess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitPrintmess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitPrintmess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintmessContext printmess() throws RecognitionException {
		PrintmessContext _localctx = new PrintmessContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printmess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PRINTEXPR);
			setState(97);
			match(T__2);
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
			case STRING:
			case NUMBER:
				{
				setState(98);
				expression(0);
				}
				break;
			case STRINGLITERAL:
				{
				setState(99);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(102);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginfuncContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BeginfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginfunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterBeginfunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitBeginfunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitBeginfunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginfuncContext beginfunc() throws RecognitionException {
		BeginfuncContext _localctx = new BeginfuncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_beginfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__4);
			setState(105);
			statement();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << CALLF) | (1L << PRINTEXPR) | (1L << IF) | (1L << WHILE) | (1L << BREAKF) | (1L << CONTINUEF) | (1L << STRING))) != 0)) {
				{
				{
				setState(106);
				statement();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfthenContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(benqParser.IF, 0); }
		public OrandcheckContext orandcheck() {
			return getRuleContext(OrandcheckContext.class,0);
		}
		public TerminalNode THEN() { return getToken(benqParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfthenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifthen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterIfthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitIfthen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitIfthen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfthenContext ifthen() throws RecognitionException {
		IfthenContext _localctx = new IfthenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifthen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IF);
			setState(115);
			orandcheck();
			setState(116);
			match(THEN);
			setState(117);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhiledoContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(benqParser.WHILE, 0); }
		public OrandcheckContext orandcheck() {
			return getRuleContext(OrandcheckContext.class,0);
		}
		public TerminalNode DO() { return getToken(benqParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhiledoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whiledo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterWhiledo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitWhiledo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitWhiledo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiledoContext whiledo() throws RecognitionException {
		WhiledoContext _localctx = new WhiledoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whiledo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(WHILE);
			setState(120);
			orandcheck();
			setState(121);
			match(DO);
			setState(122);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrandcheckContext extends ParserRuleContext {
		public Token check;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> ORAND() { return getTokens(benqParser.ORAND); }
		public TerminalNode ORAND(int i) {
			return getToken(benqParser.ORAND, i);
		}
		public OrandcheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orandcheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterOrandcheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitOrandcheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitOrandcheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrandcheckContext orandcheck() throws RecognitionException {
		OrandcheckContext _localctx = new OrandcheckContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orandcheck);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			condition();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ORAND) {
				{
				{
				setState(125);
				((OrandcheckContext)_localctx).check = match(ORAND);
				setState(126);
				condition();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Cond_expr_allContext extends ConditionContext {
		public Token check;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SIGN() { return getToken(benqParser.SIGN, 0); }
		public Cond_expr_allContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterCond_expr_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitCond_expr_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitCond_expr_all(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cond_exprContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Cond_exprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterCond_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitCond_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitCond_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Cond_expr_allContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__2);
				setState(133);
				expression(0);
				{
				setState(134);
				((Cond_expr_allContext)_localctx).check = match(SIGN);
				}
				setState(135);
				expression(0);
				setState(136);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new Cond_exprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_opContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Expr_opContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterExpr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitExpr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitExpr_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Term_exprContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_exprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterTerm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitTerm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitTerm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Term_exprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(142);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_opContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(144);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(145);
					((Expr_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__6 || _la==T__7) ) {
						((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(146);
					term(0);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Term_opContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Term_opContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterTerm_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitTerm_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitTerm_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Factor_termContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterFactor_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitFactor_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitFactor_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Factor_termContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(153);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_opContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(155);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(156);
					((Term_opContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__8 || _la==T__9) ) {
						((Term_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					factor();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Integer_factorContext extends FactorContext {
		public IntegertypeContext integertype() {
			return getRuleContext(IntegertypeContext.class,0);
		}
		public Integer_factorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterInteger_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitInteger_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitInteger_factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Float_factorContext extends FactorContext {
		public FloattypeContext floattype() {
			return getRuleContext(FloattypeContext.class,0);
		}
		public Float_factorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterFloat_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitFloat_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitFloat_factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_factorContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expr_factorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterExpr_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitExpr_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitExpr_factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ident_factorContext extends FactorContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Ident_factorContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterIdent_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitIdent_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitIdent_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Ident_factorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				ident();
				}
				break;
			case 2:
				_localctx = new Integer_factorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				integertype();
				}
				break;
			case 3:
				_localctx = new Float_factorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				floattype();
				}
				break;
			case 4:
				_localctx = new Expr_factorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(T__2);
				setState(167);
				expression(0);
				setState(168);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(benqParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(benqParser.STRING, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(benqParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(benqParser.NUMBER, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ident);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(STRING);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegertypeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(benqParser.NUMBER, 0); }
		public IntegertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterIntegertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitIntegertype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitIntegertype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegertypeContext integertype() throws RecognitionException {
		IntegertypeContext _localctx = new IntegertypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_integertype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(179);
				match(T__7);
				}
			}

			setState(182);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloattypeContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(benqParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(benqParser.NUMBER, i);
		}
		public FloattypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floattype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterFloattype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitFloattype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitFloattype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloattypeContext floattype() throws RecognitionException {
		FloattypeContext _localctx = new FloattypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_floattype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(184);
				match(T__7);
				}
			}

			setState(187);
			match(NUMBER);
			setState(188);
			match(T__10);
			setState(189);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(benqParser.STRINGLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof benqListener ) ((benqListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof benqVisitor ) return ((benqVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 16:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6T\n\6\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13g\n\13\3\13\3\13\3\f\3\f\3\f\7\fn\n\f\f\f\16\fq\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\7\17\u0082\n\17\f\17\16\17\u0085\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u008e\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0096\n\21\f"+
		"\21\16\21\u0099\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00a1\n\22\f"+
		"\22\16\22\u00a4\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ad\n"+
		"\23\3\24\3\24\7\24\u00b1\n\24\f\24\16\24\u00b4\13\24\3\25\5\25\u00b7\n"+
		"\25\3\25\3\25\3\26\5\26\u00bc\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\2\4 \"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2\t\n"+
		"\3\2\13\f\3\2\33\34\2\u00c6\2.\3\2\2\2\4\64\3\2\2\2\6?\3\2\2\2\bG\3\2"+
		"\2\2\nS\3\2\2\2\fU\3\2\2\2\16[\3\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24b\3\2"+
		"\2\2\26j\3\2\2\2\30t\3\2\2\2\32y\3\2\2\2\34~\3\2\2\2\36\u008d\3\2\2\2"+
		" \u008f\3\2\2\2\"\u009a\3\2\2\2$\u00ac\3\2\2\2&\u00ae\3\2\2\2(\u00b6\3"+
		"\2\2\2*\u00bb\3\2\2\2,\u00c1\3\2\2\2./\5\4\3\2/\60\7\3\2\2\60\3\3\2\2"+
		"\2\61\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65:\3\2\2\2\66\64\3\2\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\n\6\2>\5\3\2\2\2?@\7\16\2\2@A\5&"+
		"\24\2AE\7\4\2\2BF\5(\25\2CF\5*\26\2DF\5,\27\2EB\3\2\2\2EC\3\2\2\2ED\3"+
		"\2\2\2F\7\3\2\2\2GH\7\17\2\2HI\5&\24\2IJ\5\4\3\2J\t\3\2\2\2KT\5\f\7\2"+
		"LT\5\16\b\2MT\5\24\13\2NT\5\26\f\2OT\5\30\r\2PT\5\32\16\2QT\5\20\t\2R"+
		"T\5\22\n\2SK\3\2\2\2SL\3\2\2\2SM\3\2\2\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2"+
		"SQ\3\2\2\2SR\3\2\2\2T\13\3\2\2\2UV\5&\24\2VY\7\4\2\2WZ\5 \21\2XZ\5,\27"+
		"\2YW\3\2\2\2YX\3\2\2\2YZ\3\2\2\2Z\r\3\2\2\2[\\\7\20\2\2\\]\5&\24\2]\17"+
		"\3\2\2\2^_\7\30\2\2_\21\3\2\2\2`a\7\31\2\2a\23\3\2\2\2bc\7\21\2\2cf\7"+
		"\5\2\2dg\5 \21\2eg\5,\27\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hi\7\6\2\2i\25"+
		"\3\2\2\2jk\7\7\2\2ko\5\n\6\2ln\5\n\6\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2o"+
		"p\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\b\2\2s\27\3\2\2\2tu\7\22\2\2uv\5\34"+
		"\17\2vw\7\23\2\2wx\5\n\6\2x\31\3\2\2\2yz\7\24\2\2z{\5\34\17\2{|\7\25\2"+
		"\2|}\5\n\6\2}\33\3\2\2\2~\u0083\5\36\20\2\177\u0080\7\27\2\2\u0080\u0082"+
		"\5\36\20\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\35\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\5\2"+
		"\2\u0087\u0088\5 \21\2\u0088\u0089\7\26\2\2\u0089\u008a\5 \21\2\u008a"+
		"\u008b\7\6\2\2\u008b\u008e\3\2\2\2\u008c\u008e\5 \21\2\u008d\u0086\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\37\3\2\2\2\u008f\u0090\b\21\1\2\u0090\u0091"+
		"\5\"\22\2\u0091\u0097\3\2\2\2\u0092\u0093\f\4\2\2\u0093\u0094\t\2\2\2"+
		"\u0094\u0096\5\"\22\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\b\22\1\2\u009b\u009c\5$\23\2\u009c\u00a2\3\2\2\2\u009d\u009e\f"+
		"\3\2\2\u009e\u009f\t\3\2\2\u009f\u00a1\5$\23\2\u00a0\u009d\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3#\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00ad\5&\24\2\u00a6\u00ad\5(\25\2\u00a7\u00ad"+
		"\5*\26\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5 \21\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a5\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ad%\3\2\2\2\u00ae\u00b2\7\33\2\2\u00af\u00b1"+
		"\t\4\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\'\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\n\2\2"+
		"\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\7\34\2\2\u00b9)\3\2\2\2\u00ba\u00bc\7\n\2\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\34\2\2\u00be\u00bf\7"+
		"\r\2\2\u00bf\u00c0\7\34\2\2\u00c0+\3\2\2\2\u00c1\u00c2\7\32\2\2\u00c2"+
		"-\3\2\2\2\21\64:ESYfo\u0083\u008d\u0097\u00a2\u00ac\u00b2\u00b6\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}