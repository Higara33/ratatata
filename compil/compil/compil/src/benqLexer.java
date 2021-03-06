// Generated from /home/killsing4/finalkursovaya/benq.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class benqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, TYPE=12, DEF=13, CALLF=14, PRINTEXPR=15, IF=16, THEN=17, 
		WHILE=18, DO=19, SIGN=20, ORAND=21, BREAKF=22, CONTINUEF=23, STRINGLITERAL=24, 
		STRING=25, NUMBER=26, OneComment=27, ManyComment=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "TYPE", "DEF", "CALLF", "PRINTEXPR", "IF", "THEN", "WHILE", 
			"DO", "SIGN", "ORAND", "BREAKF", "CONTINUEF", "STRINGLITERAL", "STRING", 
			"NUMBER", "OneComment", "ManyComment", "WS"
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


	public benqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "benq.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\\\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0088\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u008f\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00a2\n\31\f\31"+
		"\16\31\u00a5\13\31\3\31\3\31\3\32\6\32\u00aa\n\32\r\32\16\32\u00ab\3\33"+
		"\6\33\u00af\n\33\r\33\16\33\u00b0\3\34\3\34\3\34\3\34\7\34\u00b7\n\34"+
		"\f\34\16\34\u00ba\13\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00c4"+
		"\n\35\f\35\16\35\u00c7\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\4\u00b8\u00c5\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37\3\2\6\4\2\17\17$$\4\2C\\c|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\2\u00dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2"+
		"\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3"+
		"\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35a\3\2\2\2\37f\3\2\2\2!l\3\2\2\2#o\3\2"+
		"\2\2%t\3\2\2\2\'z\3\2\2\2)\u0087\3\2\2\2+\u008e\3\2\2\2-\u0090\3\2\2\2"+
		"/\u0096\3\2\2\2\61\u009f\3\2\2\2\63\u00a9\3\2\2\2\65\u00ae\3\2\2\2\67"+
		"\u00b2\3\2\2\29\u00bf\3\2\2\2;\u00cd\3\2\2\2=>\7`\2\2>\4\3\2\2\2?@\7?"+
		"\2\2@\6\3\2\2\2AB\7*\2\2B\b\3\2\2\2CD\7+\2\2D\n\3\2\2\2EF\7}\2\2F\f\3"+
		"\2\2\2GH\7\177\2\2H\16\3\2\2\2IJ\7-\2\2J\20\3\2\2\2KL\7/\2\2L\22\3\2\2"+
		"\2MN\7\61\2\2N\24\3\2\2\2OP\7,\2\2P\26\3\2\2\2QR\7\60\2\2R\30\3\2\2\2"+
		"ST\7k\2\2TU\7p\2\2U\\\7v\2\2VW\7h\2\2WX\7n\2\2XY\7q\2\2YZ\7c\2\2Z\\\7"+
		"v\2\2[S\3\2\2\2[V\3\2\2\2\\\32\3\2\2\2]^\7f\2\2^_\7g\2\2_`\7h\2\2`\34"+
		"\3\2\2\2ab\7e\2\2bc\7c\2\2cd\7n\2\2de\7n\2\2e\36\3\2\2\2fg\7r\2\2gh\7"+
		"t\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k \3\2\2\2lm\7k\2\2mn\7h\2\2n\"\3\2\2"+
		"\2op\7v\2\2pq\7j\2\2qr\7g\2\2rs\7p\2\2s$\3\2\2\2tu\7y\2\2uv\7j\2\2vw\7"+
		"k\2\2wx\7n\2\2xy\7g\2\2y&\3\2\2\2z{\7f\2\2{|\7q\2\2|(\3\2\2\2}~\7?\2\2"+
		"~\u0088\7?\2\2\177\u0080\7#\2\2\u0080\u0088\7?\2\2\u0081\u0088\7>\2\2"+
		"\u0082\u0083\7>\2\2\u0083\u0088\7?\2\2\u0084\u0088\7@\2\2\u0085\u0086"+
		"\7@\2\2\u0086\u0088\7?\2\2\u0087}\3\2\2\2\u0087\177\3\2\2\2\u0087\u0081"+
		"\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"*\3\2\2\2\u0089\u008a\7q\2\2\u008a\u008f\7t\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7p\2\2\u008d\u008f\7f\2\2\u008e\u0089\3\2\2\2\u008e\u008b\3\2\2"+
		"\2\u008f,\3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7t\2\2\u0092\u0093\7"+
		"g\2\2\u0093\u0094\7c\2\2\u0094\u0095\7m\2\2\u0095.\3\2\2\2\u0096\u0097"+
		"\7e\2\2\u0097\u0098\7q\2\2\u0098\u0099\7p\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2"+
		"\u009e\60\3\2\2\2\u009f\u00a3\7$\2\2\u00a0\u00a2\n\2\2\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7$\2\2\u00a7\62\3\2\2\2"+
		"\u00a8\u00aa\t\3\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\64\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7\61\2\2\u00b4"+
		"\u00b8\3\2\2\2\u00b5\u00b7\13\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\34"+
		"\2\2\u00be8\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c5"+
		"\3\2\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\35\2\2\u00cc:\3\2\2\2\u00cd\u00ce\t\5\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00cf\u00d0\b\36\2\2\u00d0<\3\2\2\2\13\2[\u0087\u008e\u00a3\u00ab\u00b0"+
		"\u00b8\u00c5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}