// Generated from /home/tiago/UA/2 Ano/2 Semestre/C/PFinal/c2023-adv-02/src/adv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class advLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, Number=76, ID=77, SYMBOL=78, STRING=79, WS=80, NEWLINE=81, 
		SingleLineComment=82, BlockComment=83, ERROR=84;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", 
			"SingleLineComment", "BlockComment", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'.txt'", "'alphabet'", "'{'", "','", "'}'", "'-'", 
			"'NFA'", "'<<<'", "'>>>'", "'complete'", "'DFA'", "'for'", "'in'", "'while'", 
			"'do'", "'if'", "'else'", "'state'", "';'", "'['", "'='", "']'", "'transition'", 
			"'->'", "'view'", "'of'", "'as'", "'--'", "'#label'", "'<'", "'>'", "'place'", 
			"'at'", "'grid'", "'animation'", "'viewport'", "'++'", "'on'", "'update'", 
			"'show'", "'pause'", "'play'", "'+'", "'not'", "'*'", "'/'", "'%'", "'>='", 
			"'<='", "'=='", "'!='", "'and'", "'or'", "'('", "')'", "'read'", "'[prompt='", 
			"'{{'", "'}}'", "':'", "'number'", "'point'", "'list'", "'string'", "'boolean'", 
			"'step'", "'margin'", "'color'", "'line'", "'initial'", "'accepting'", 
			"'align'", "'slope'", "'highlighted'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", 
			"SingleLineComment", "BlockComment", "ERROR"
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


	public advLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "adv.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2V\u025a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\3@\3@"+
		"\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J"+
		"\3J\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\5M\u0209"+
		"\nM\3M\6M\u020c\nM\rM\16M\u020d\3M\3M\6M\u0212\nM\rM\16M\u0213\5M\u0216"+
		"\nM\3N\3N\7N\u021a\nN\fN\16N\u021d\13N\3O\3O\7O\u0221\nO\fO\16O\u0224"+
		"\13O\3O\3O\3P\3P\7P\u022a\nP\fP\16P\u022d\13P\3P\3P\3Q\6Q\u0232\nQ\rQ"+
		"\16Q\u0233\3Q\3Q\3R\5R\u0239\nR\3R\3R\3R\3R\3S\3S\3S\7S\u0242\nS\fS\16"+
		"S\u0245\13S\3S\3S\3S\3S\3T\3T\3T\3T\7T\u024f\nT\fT\16T\u0252\13T\3T\3"+
		"T\3T\3T\3T\3U\3U\5\u022b\u0243\u0250\2V\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\3\2\t"+
		"\4\2--//\3\2\62;\4\2C\\c|\5\2\62;C\\c|\3\2))\4\2\13\13\"\"\3\2\61\61\2"+
		"\u0264\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2"+
		"m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3"+
		"\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2"+
		"\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2"+
		"\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00b2\3\2\2\2\7\u00b7\3\2\2"+
		"\2\t\u00c0\3\2\2\2\13\u00c2\3\2\2\2\r\u00c4\3\2\2\2\17\u00c6\3\2\2\2\21"+
		"\u00c8\3\2\2\2\23\u00cc\3\2\2\2\25\u00d0\3\2\2\2\27\u00d4\3\2\2\2\31\u00dd"+
		"\3\2\2\2\33\u00e1\3\2\2\2\35\u00e5\3\2\2\2\37\u00e8\3\2\2\2!\u00ee\3\2"+
		"\2\2#\u00f1\3\2\2\2%\u00f4\3\2\2\2\'\u00f9\3\2\2\2)\u00ff\3\2\2\2+\u0101"+
		"\3\2\2\2-\u0103\3\2\2\2/\u0105\3\2\2\2\61\u0107\3\2\2\2\63\u0112\3\2\2"+
		"\2\65\u0115\3\2\2\2\67\u011a\3\2\2\29\u011d\3\2\2\2;\u0120\3\2\2\2=\u0123"+
		"\3\2\2\2?\u012a\3\2\2\2A\u012c\3\2\2\2C\u012e\3\2\2\2E\u0134\3\2\2\2G"+
		"\u0137\3\2\2\2I\u013c\3\2\2\2K\u0146\3\2\2\2M\u014f\3\2\2\2O\u0152\3\2"+
		"\2\2Q\u0155\3\2\2\2S\u015c\3\2\2\2U\u0161\3\2\2\2W\u0167\3\2\2\2Y\u016c"+
		"\3\2\2\2[\u016e\3\2\2\2]\u0172\3\2\2\2_\u0174\3\2\2\2a\u0176\3\2\2\2c"+
		"\u0178\3\2\2\2e\u017b\3\2\2\2g\u017e\3\2\2\2i\u0181\3\2\2\2k\u0184\3\2"+
		"\2\2m\u0188\3\2\2\2o\u018b\3\2\2\2q\u018d\3\2\2\2s\u018f\3\2\2\2u\u0194"+
		"\3\2\2\2w\u019d\3\2\2\2y\u01a0\3\2\2\2{\u01a3\3\2\2\2}\u01a5\3\2\2\2\177"+
		"\u01ac\3\2\2\2\u0081\u01b2\3\2\2\2\u0083\u01b7\3\2\2\2\u0085\u01be\3\2"+
		"\2\2\u0087\u01c6\3\2\2\2\u0089\u01cb\3\2\2\2\u008b\u01d2\3\2\2\2\u008d"+
		"\u01d8\3\2\2\2\u008f\u01dd\3\2\2\2\u0091\u01e5\3\2\2\2\u0093\u01ef\3\2"+
		"\2\2\u0095\u01f5\3\2\2\2\u0097\u01fb\3\2\2\2\u0099\u0208\3\2\2\2\u009b"+
		"\u0217\3\2\2\2\u009d\u021e\3\2\2\2\u009f\u0227\3\2\2\2\u00a1\u0231\3\2"+
		"\2\2\u00a3\u0238\3\2\2\2\u00a5\u023e\3\2\2\2\u00a7\u024a\3\2\2\2\u00a9"+
		"\u0258\3\2\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7r\2"+
		"\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7v\2\2\u00b1\4\3"+
		"\2\2\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7z\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\6\3\2\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7r\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7d\2\2"+
		"\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\b\3\2\2\2\u00c0\u00c1\7}"+
		"\2\2\u00c1\n\3\2\2\2\u00c2\u00c3\7.\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7"+
		"\177\2\2\u00c5\16\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7\20\3\2\2\2\u00c8\u00c9"+
		"\7P\2\2\u00c9\u00ca\7H\2\2\u00ca\u00cb\7C\2\2\u00cb\22\3\2\2\2\u00cc\u00cd"+
		"\7>\2\2\u00cd\u00ce\7>\2\2\u00ce\u00cf\7>\2\2\u00cf\24\3\2\2\2\u00d0\u00d1"+
		"\7@\2\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\7@\2\2\u00d3\26\3\2\2\2\u00d4\u00d5"+
		"\7e\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		"\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2"+
		"\u00dc\30\3\2\2\2\u00dd\u00de\7F\2\2\u00de\u00df\7H\2\2\u00df\u00e0\7"+
		"C\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4"+
		"\7t\2\2\u00e4\34\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7\36"+
		"\3\2\2\2\u00e8\u00e9\7y\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed \3\2\2\2\u00ee\u00ef\7f\2\2\u00ef"+
		"\u00f0\7q\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7h\2\2\u00f3"+
		"$\3\2\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7g\2\2\u00f8&\3\2\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe(\3\2\2\2\u00ff"+
		"\u0100\7=\2\2\u0100*\3\2\2\2\u0101\u0102\7]\2\2\u0102,\3\2\2\2\u0103\u0104"+
		"\7?\2\2\u0104.\3\2\2\2\u0105\u0106\7_\2\2\u0106\60\3\2\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7c\2\2\u010a\u010b\7p\2\2\u010b"+
		"\u010c\7u\2\2\u010c\u010d\7k\2\2\u010d\u010e\7v\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7q\2\2\u0110\u0111\7p\2\2\u0111\62\3\2\2\2\u0112\u0113\7"+
		"/\2\2\u0113\u0114\7@\2\2\u0114\64\3\2\2\2\u0115\u0116\7x\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7g\2\2\u0118\u0119\7y\2\2\u0119\66\3\2\2\2\u011a\u011b"+
		"\7q\2\2\u011b\u011c\7h\2\2\u011c8\3\2\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7u\2\2\u011f:\3\2\2\2\u0120\u0121\7/\2\2\u0121\u0122\7/\2\2\u0122<\3"+
		"\2\2\2\u0123\u0124\7%\2\2\u0124\u0125\7n\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7d\2\2\u0127\u0128\7g\2\2\u0128\u0129\7n\2\2\u0129>\3\2\2\2\u012a"+
		"\u012b\7>\2\2\u012b@\3\2\2\2\u012c\u012d\7@\2\2\u012dB\3\2\2\2\u012e\u012f"+
		"\7r\2\2\u012f\u0130\7n\2\2\u0130\u0131\7c\2\2\u0131\u0132\7e\2\2\u0132"+
		"\u0133\7g\2\2\u0133D\3\2\2\2\u0134\u0135\7c\2\2\u0135\u0136\7v\2\2\u0136"+
		"F\3\2\2\2\u0137\u0138\7i\2\2\u0138\u0139\7t\2\2\u0139\u013a\7k\2\2\u013a"+
		"\u013b\7f\2\2\u013bH\3\2\2\2\u013c\u013d\7c\2\2\u013d\u013e\7p\2\2\u013e"+
		"\u013f\7k\2\2\u013f\u0140\7o\2\2\u0140\u0141\7c\2\2\u0141\u0142\7v\2\2"+
		"\u0142\u0143\7k\2\2\u0143\u0144\7q\2\2\u0144\u0145\7p\2\2\u0145J\3\2\2"+
		"\2\u0146\u0147\7x\2\2\u0147\u0148\7k\2\2\u0148\u0149\7g\2\2\u0149\u014a"+
		"\7y\2\2\u014a\u014b\7r\2\2\u014b\u014c\7q\2\2\u014c\u014d\7t\2\2\u014d"+
		"\u014e\7v\2\2\u014eL\3\2\2\2\u014f\u0150\7-\2\2\u0150\u0151\7-\2\2\u0151"+
		"N\3\2\2\2\u0152\u0153\7q\2\2\u0153\u0154\7p\2\2\u0154P\3\2\2\2\u0155\u0156"+
		"\7w\2\2\u0156\u0157\7r\2\2\u0157\u0158\7f\2\2\u0158\u0159\7c\2\2\u0159"+
		"\u015a\7v\2\2\u015a\u015b\7g\2\2\u015bR\3\2\2\2\u015c\u015d\7u\2\2\u015d"+
		"\u015e\7j\2\2\u015e\u015f\7q\2\2\u015f\u0160\7y\2\2\u0160T\3\2\2\2\u0161"+
		"\u0162\7r\2\2\u0162\u0163\7c\2\2\u0163\u0164\7w\2\2\u0164\u0165\7u\2\2"+
		"\u0165\u0166\7g\2\2\u0166V\3\2\2\2\u0167\u0168\7r\2\2\u0168\u0169\7n\2"+
		"\2\u0169\u016a\7c\2\2\u016a\u016b\7{\2\2\u016bX\3\2\2\2\u016c\u016d\7"+
		"-\2\2\u016dZ\3\2\2\2\u016e\u016f\7p\2\2\u016f\u0170\7q\2\2\u0170\u0171"+
		"\7v\2\2\u0171\\\3\2\2\2\u0172\u0173\7,\2\2\u0173^\3\2\2\2\u0174\u0175"+
		"\7\61\2\2\u0175`\3\2\2\2\u0176\u0177\7\'\2\2\u0177b\3\2\2\2\u0178\u0179"+
		"\7@\2\2\u0179\u017a\7?\2\2\u017ad\3\2\2\2\u017b\u017c\7>\2\2\u017c\u017d"+
		"\7?\2\2\u017df\3\2\2\2\u017e\u017f\7?\2\2\u017f\u0180\7?\2\2\u0180h\3"+
		"\2\2\2\u0181\u0182\7#\2\2\u0182\u0183\7?\2\2\u0183j\3\2\2\2\u0184\u0185"+
		"\7c\2\2\u0185\u0186\7p\2\2\u0186\u0187\7f\2\2\u0187l\3\2\2\2\u0188\u0189"+
		"\7q\2\2\u0189\u018a\7t\2\2\u018an\3\2\2\2\u018b\u018c\7*\2\2\u018cp\3"+
		"\2\2\2\u018d\u018e\7+\2\2\u018er\3\2\2\2\u018f\u0190\7t\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7c\2\2\u0192\u0193\7f\2\2\u0193t\3\2\2\2\u0194\u0195"+
		"\7]\2\2\u0195\u0196\7r\2\2\u0196\u0197\7t\2\2\u0197\u0198\7q\2\2\u0198"+
		"\u0199\7o\2\2\u0199\u019a\7r\2\2\u019a\u019b\7v\2\2\u019b\u019c\7?\2\2"+
		"\u019cv\3\2\2\2\u019d\u019e\7}\2\2\u019e\u019f\7}\2\2\u019fx\3\2\2\2\u01a0"+
		"\u01a1\7\177\2\2\u01a1\u01a2\7\177\2\2\u01a2z\3\2\2\2\u01a3\u01a4\7<\2"+
		"\2\u01a4|\3\2\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7"+
		"o\2\2\u01a8\u01a9\7d\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab\7t\2\2\u01ab~"+
		"\3\2\2\2\u01ac\u01ad\7r\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7k\2\2\u01af"+
		"\u01b0\7p\2\2\u01b0\u01b1\7v\2\2\u01b1\u0080\3\2\2\2\u01b2\u01b3\7n\2"+
		"\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7v\2\2\u01b6\u0082"+
		"\3\2\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7t\2\2\u01ba"+
		"\u01bb\7k\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7i\2\2\u01bd\u0084\3\2\2"+
		"\2\u01be\u01bf\7d\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7q\2\2\u01c1\u01c2"+
		"\7n\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7c\2\2\u01c4\u01c5\7p\2\2\u01c5"+
		"\u0086\3\2\2\2\u01c6\u01c7\7u\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7g\2"+
		"\2\u01c9\u01ca\7r\2\2\u01ca\u0088\3\2\2\2\u01cb\u01cc\7o\2\2\u01cc\u01cd"+
		"\7c\2\2\u01cd\u01ce\7t\2\2\u01ce\u01cf\7i\2\2\u01cf\u01d0\7k\2\2\u01d0"+
		"\u01d1\7p\2\2\u01d1\u008a\3\2\2\2\u01d2\u01d3\7e\2\2\u01d3\u01d4\7q\2"+
		"\2\u01d4\u01d5\7n\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7t\2\2\u01d7\u008c"+
		"\3\2\2\2\u01d8\u01d9\7n\2\2\u01d9\u01da\7k\2\2\u01da\u01db\7p\2\2\u01db"+
		"\u01dc\7g\2\2\u01dc\u008e\3\2\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7p\2"+
		"\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7v\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3"+
		"\7c\2\2\u01e3\u01e4\7n\2\2\u01e4\u0090\3\2\2\2\u01e5\u01e6\7c\2\2\u01e6"+
		"\u01e7\7e\2\2\u01e7\u01e8\7e\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7r\2\2"+
		"\u01ea\u01eb\7v\2\2\u01eb\u01ec\7k\2\2\u01ec\u01ed\7p\2\2\u01ed\u01ee"+
		"\7i\2\2\u01ee\u0092\3\2\2\2\u01ef\u01f0\7c\2\2\u01f0\u01f1\7n\2\2\u01f1"+
		"\u01f2\7k\2\2\u01f2\u01f3\7i\2\2\u01f3\u01f4\7p\2\2\u01f4\u0094\3\2\2"+
		"\2\u01f5\u01f6\7u\2\2\u01f6\u01f7\7n\2\2\u01f7\u01f8\7q\2\2\u01f8\u01f9"+
		"\7r\2\2\u01f9\u01fa\7g\2\2\u01fa\u0096\3\2\2\2\u01fb\u01fc\7j\2\2\u01fc"+
		"\u01fd\7k\2\2\u01fd\u01fe\7i\2\2\u01fe\u01ff\7j\2\2\u01ff\u0200\7n\2\2"+
		"\u0200\u0201\7k\2\2\u0201\u0202\7i\2\2\u0202\u0203\7j\2\2\u0203\u0204"+
		"\7v\2\2\u0204\u0205\7g\2\2\u0205\u0206\7f\2\2\u0206\u0098\3\2\2\2\u0207"+
		"\u0209\t\2\2\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2"+
		"\2\2\u020a\u020c\t\3\2\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0215\3\2\2\2\u020f\u0211\7\60"+
		"\2\2\u0210\u0212\t\3\2\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u020f\3\2"+
		"\2\2\u0215\u0216\3\2\2\2\u0216\u009a\3\2\2\2\u0217\u021b\t\4\2\2\u0218"+
		"\u021a\t\5\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u009c\3\2\2\2\u021d\u021b\3\2\2\2\u021e"+
		"\u0222\t\6\2\2\u021f\u0221\t\5\2\2\u0220\u021f\3\2\2\2\u0221\u0224\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0226\t\6\2\2\u0226\u009e\3\2\2\2\u0227\u022b\7$"+
		"\2\2\u0228\u022a\13\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u022f\7$\2\2\u022f\u00a0\3\2\2\2\u0230\u0232\t\7\2\2\u0231"+
		"\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0236\bQ\2\2\u0236\u00a2\3\2\2\2\u0237"+
		"\u0239\7\17\2\2\u0238\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3"+
		"\2\2\2\u023a\u023b\7\f\2\2\u023b\u023c\3\2\2\2\u023c\u023d\bR\2\2\u023d"+
		"\u00a4\3\2\2\2\u023e\u023f\t\b\2\2\u023f\u0243\t\b\2\2\u0240\u0242\13"+
		"\2\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2\2\2\u0243\u0244\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\5\u00a3"+
		"R\2\u0247\u0248\3\2\2\2\u0248\u0249\bS\2\2\u0249\u00a6\3\2\2\2\u024a\u024b"+
		"\7\61\2\2\u024b\u024c\7,\2\2\u024c\u0250\3\2\2\2\u024d\u024f\13\2\2\2"+
		"\u024e\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0251\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7,\2\2\u0254"+
		"\u0255\7\61\2\2\u0255\u0256\3\2\2\2\u0256\u0257\bT\2\2\u0257\u00a8\3\2"+
		"\2\2\u0258\u0259\13\2\2\2\u0259\u00aa\3\2\2\2\16\2\u0208\u020d\u0213\u0215"+
		"\u021b\u0222\u022b\u0233\u0238\u0243\u0250\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}