// Generated from /home/tiago/UA/2 Ano/2 Semestre/C/PFinal/c2023-adv-02/src/xAdv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xAdvLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AutomatonProperty=8, 
		ViewportProperty=9, WS=10, Ignore=11, Value=12, INT=13, ID=14, NEWLINE=15, 
		SingleLineComment=16, BlockComment=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "AutomatonProperty", 
			"ViewportProperty", "WS", "Ignore", "Value", "INT", "ID", "NEWLINE", 
			"SingleLineComment", "BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'define'", "'automaton'", "'{'", "':'", "'}'", "'viewport'", 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "AutomatonProperty", 
			"ViewportProperty", "WS", "Ignore", "Value", "INT", "ID", "NEWLINE", 
			"SingleLineComment", "BlockComment"
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


	public xAdvLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "xAdv.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3"+
		"\13\6\13\u008c\n\13\r\13\16\13\u008d\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\6\r\u009b\n\r\r\r\16\r\u009c\3\r\3\r\3\r\3\r\5\r\u00a3\n"+
		"\r\3\16\3\16\7\16\u00a7\n\16\f\16\16\16\u00aa\13\16\3\17\3\17\7\17\u00ae"+
		"\n\17\f\17\16\17\u00b1\13\17\3\20\5\20\u00b4\n\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\7\21\u00bd\n\21\f\21\16\21\u00c0\13\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u00ca\n\22\f\22\16\22\u00cd\13\22\3\22"+
		"\3\22\3\22\3\22\3\22\4\u00be\u00cb\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\b\4\2\13\13"+
		"\"\"\3\2\63;\3\2\62;\4\2C\\c|\5\2\62;C\\c|\3\2\61\61\2\u00e2\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2"+
		"\2\2\5,\3\2\2\2\7\63\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2"+
		"\2\2\21l\3\2\2\2\23\u0088\3\2\2\2\25\u008b\3\2\2\2\27\u0091\3\2\2\2\31"+
		"\u00a2\3\2\2\2\33\u00a4\3\2\2\2\35\u00ab\3\2\2\2\37\u00b3\3\2\2\2!\u00b9"+
		"\3\2\2\2#\u00c5\3\2\2\2%&\7k\2\2&\'\7o\2\2\'(\7r\2\2()\7q\2\2)*\7t\2\2"+
		"*+\7v\2\2+\4\3\2\2\2,-\7f\2\2-.\7g\2\2./\7h\2\2/\60\7k\2\2\60\61\7p\2"+
		"\2\61\62\7g\2\2\62\6\3\2\2\2\63\64\7c\2\2\64\65\7w\2\2\65\66\7v\2\2\66"+
		"\67\7q\2\2\678\7o\2\289\7c\2\29:\7v\2\2:;\7q\2\2;<\7p\2\2<\b\3\2\2\2="+
		">\7}\2\2>\n\3\2\2\2?@\7<\2\2@\f\3\2\2\2AB\7\177\2\2B\16\3\2\2\2CD\7x\2"+
		"\2DE\7k\2\2EF\7g\2\2FG\7y\2\2GH\7r\2\2HI\7q\2\2IJ\7t\2\2JK\7v\2\2K\20"+
		"\3\2\2\2LM\7e\2\2MN\7q\2\2NO\7n\2\2OP\7q\2\2Pm\7t\2\2QR\7u\2\2RS\7k\2"+
		"\2ST\7|\2\2Tm\7g\2\2UV\7h\2\2VW\7q\2\2WX\7p\2\2XY\7v\2\2YZ\7/\2\2Z[\7"+
		"u\2\2[\\\7k\2\2\\]\7|\2\2]m\7g\2\2^_\7n\2\2_`\7k\2\2`a\7p\2\2ab\7g\2\2"+
		"bc\7e\2\2cd\7q\2\2de\7n\2\2ef\7q\2\2fm\7t\2\2gh\7n\2\2hi\7c\2\2ij\7d\2"+
		"\2jk\7g\2\2km\7n\2\2lL\3\2\2\2lQ\3\2\2\2lU\3\2\2\2l^\3\2\2\2lg\3\2\2\2"+
		"m\22\3\2\2\2no\7d\2\2op\7c\2\2pq\7e\2\2qr\7m\2\2rs\7i\2\2st\7t\2\2tu\7"+
		"q\2\2uv\7w\2\2vw\7p\2\2w\u0089\7f\2\2xy\7j\2\2yz\7g\2\2z{\7k\2\2{|\7i"+
		"\2\2|}\7j\2\2}\u0089\7v\2\2~\177\7y\2\2\177\u0080\7k\2\2\u0080\u0081\7"+
		"f\2\2\u0081\u0082\7v\2\2\u0082\u0089\7j\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7v\2\2\u0086\u0087\7n\2\2\u0087\u0089\7g\2\2\u0088"+
		"n\3\2\2\2\u0088x\3\2\2\2\u0088~\3\2\2\2\u0088\u0083\3\2\2\2\u0089\24\3"+
		"\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\13"+
		"\2\2\u0090\26\3\2\2\2\u0091\u0092\7=\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\b\f\2\2\u0094\30\3\2\2\2\u0095\u0096\7$\2\2\u0096\u009a\5\35\17\2\u0097"+
		"\u0098\5\25\13\2\u0098\u0099\5\35\17\2\u0099\u009b\3\2\2\2\u009a\u0097"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a3\5\35"+
		"\17\2\u00a1\u00a3\5\33\16\2\u00a2\u0095\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\32\3\2\2\2\u00a4\u00a8\t\3\2\2\u00a5\u00a7\t\4\2"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\34\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00af\t\5\2\2\u00ac"+
		"\u00ae\t\6\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\36\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4"+
		"\7\17\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\7\f\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\20\2\2\u00b8 \3"+
		"\2\2\2\u00b9\u00ba\t\7\2\2\u00ba\u00be\t\7\2\2\u00bb\u00bd\13\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5\37\20\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\21\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7\61\2"+
		"\2\u00c6\u00c7\7,\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7\61"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\22\2\2\u00d2$\3\2\2\2\r\2l\u0088"+
		"\u008d\u009c\u00a2\u00a8\u00af\u00b3\u00be\u00cb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}