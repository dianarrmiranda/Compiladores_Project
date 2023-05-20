// Generated from /home/jose/Desktop/LEI/2ºano/2ºSemestre/C/Práticas/c2023-adv-02/src/grammar/xAdv.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AutomatonProperty=7, ViewportProperty=8, 
		Value=9, WS=10, INT=11, NEWLINE=12, ID=13, SingleLineComment=14, BlockComment=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "AutomatonProperty", 
			"ViewportProperty", "Value", "WS", "INT", "NEWLINE", "ID", "SingleLineComment", 
			"BlockComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'automaton {'", "':'", "'}'", "'{'", "'viewport {'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AutomatonProperty", "ViewportProperty", 
			"Value", "WS", "INT", "NEWLINE", "ID", "SingleLineComment", "BlockComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t}\n\t\3\n\3\n\5\n\u0081\n\n\3\13\6\13\u0084\n\13\r\13\16\13\u0085"+
		"\3\13\3\13\3\f\3\f\7\f\u008c\n\f\f\f\16\f\u008f\13\f\3\r\5\r\u0092\n\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\7\16\u009a\n\16\f\16\16\16\u009d\13\16\3\17"+
		"\3\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\7\20\u00af\n\20\f\20\16\20\u00b2\13\20\3\20\3\20"+
		"\3\20\3\20\3\20\4\u00a3\u00b0\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\b\4\2\13\13\"\"\3\2\63;\3"+
		"\2\62;\4\2C\\c|\5\2\62;C\\c|\3\2\61\61\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5(\3\2\2\2\7\64\3\2\2\2\t\66\3"+
		"\2\2\2\138\3\2\2\2\r:\3\2\2\2\17`\3\2\2\2\21|\3\2\2\2\23\u0080\3\2\2\2"+
		"\25\u0083\3\2\2\2\27\u0089\3\2\2\2\31\u0091\3\2\2\2\33\u0097\3\2\2\2\35"+
		"\u009e\3\2\2\2\37\u00aa\3\2\2\2!\"\7k\2\2\"#\7o\2\2#$\7r\2\2$%\7q\2\2"+
		"%&\7t\2\2&\'\7v\2\2\'\4\3\2\2\2()\7c\2\2)*\7w\2\2*+\7v\2\2+,\7q\2\2,-"+
		"\7o\2\2-.\7c\2\2./\7v\2\2/\60\7q\2\2\60\61\7p\2\2\61\62\7\"\2\2\62\63"+
		"\7}\2\2\63\6\3\2\2\2\64\65\7<\2\2\65\b\3\2\2\2\66\67\7\177\2\2\67\n\3"+
		"\2\2\289\7}\2\29\f\3\2\2\2:;\7x\2\2;<\7k\2\2<=\7g\2\2=>\7y\2\2>?\7r\2"+
		"\2?@\7q\2\2@A\7t\2\2AB\7v\2\2BC\7\"\2\2CD\7}\2\2D\16\3\2\2\2EF\7e\2\2"+
		"FG\7q\2\2GH\7n\2\2HI\7q\2\2Ia\7t\2\2JK\7u\2\2KL\7k\2\2LM\7|\2\2Ma\7g\2"+
		"\2NO\7h\2\2OP\7q\2\2PQ\7p\2\2QR\7v\2\2RS\7/\2\2ST\7u\2\2TU\7k\2\2UV\7"+
		"|\2\2Va\7g\2\2WX\7n\2\2XY\7k\2\2YZ\7p\2\2Z[\7g\2\2[\\\7e\2\2\\]\7q\2\2"+
		"]^\7n\2\2^_\7q\2\2_a\7t\2\2`E\3\2\2\2`J\3\2\2\2`N\3\2\2\2`W\3\2\2\2a\20"+
		"\3\2\2\2bc\7d\2\2cd\7c\2\2de\7e\2\2ef\7m\2\2fg\7i\2\2gh\7t\2\2hi\7q\2"+
		"\2ij\7w\2\2jk\7p\2\2k}\7f\2\2lm\7j\2\2mn\7g\2\2no\7k\2\2op\7i\2\2pq\7"+
		"j\2\2q}\7v\2\2rs\7y\2\2st\7k\2\2tu\7f\2\2uv\7v\2\2v}\7j\2\2wx\7v\2\2x"+
		"y\7k\2\2yz\7v\2\2z{\7n\2\2{}\7g\2\2|b\3\2\2\2|l\3\2\2\2|r\3\2\2\2|w\3"+
		"\2\2\2}\22\3\2\2\2~\u0081\5\33\16\2\177\u0081\5\27\f\2\u0080~\3\2\2\2"+
		"\u0080\177\3\2\2\2\u0081\24\3\2\2\2\u0082\u0084\t\2\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\b\13\2\2\u0088\26\3\2\2\2\u0089\u008d\t\3\2"+
		"\2\u008a\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\30\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0092\7\17\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3"+
		"\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\r\2\2\u0096"+
		"\32\3\2\2\2\u0097\u009b\t\5\2\2\u0098\u009a\t\6\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\34"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\t\7\2\2\u009f\u00a3\t\7\2\2\u00a0"+
		"\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\5\31\r\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\17\2\2\u00a9\36\3\2"+
		"\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7,\2\2\u00ac\u00b0\3\2\2\2\u00ad"+
		"\u00af\13\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7,\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\20"+
		"\2\2\u00b7 \3\2\2\2\f\2`|\u0080\u0085\u008d\u0091\u009b\u00a3\u00b0\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}