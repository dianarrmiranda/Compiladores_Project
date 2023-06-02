// Generated from xAdv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class xAdvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, AutomatonProperty=8, 
		ViewportProperty=9, WS=10, Ignore=11, Value=12, INT=13, ID=14, NEWLINE=15, 
		SingleLineComment=16, BlockComment=17;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_importDef = 2, RULE_concreteDefinition = 3, 
		RULE_automatonStyle = 4, RULE_viewportStyle = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "importDef", "concreteDefinition", "automatonStyle", 
			"viewportStyle"
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

	@Override
	public String getGrammarFileName() { return "xAdv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xAdvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(xAdvParser.EOF, 0); }
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				definitions();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
			setState(17);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsContext extends ParserRuleContext {
		public ImportDefContext importDef() {
			return getRuleContext(ImportDefContext.class,0);
		}
		public ConcreteDefinitionContext concreteDefinition() {
			return getRuleContext(ConcreteDefinitionContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitDefinitions(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(19);
				importDef();
				}
				break;
			case T__1:
				{
				setState(20);
				concreteDefinition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefContext extends ParserRuleContext {
		public TerminalNode Value() { return getToken(xAdvParser.Value, 0); }
		public ImportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterImportDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitImportDef(this);
		}
	}

	public final ImportDefContext importDef() throws RecognitionException {
		ImportDefContext _localctx = new ImportDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(Value);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConcreteDefinitionContext extends ParserRuleContext {
		public AutomatonStyleContext automatonStyle() {
			return getRuleContext(AutomatonStyleContext.class,0);
		}
		public ViewportStyleContext viewportStyle() {
			return getRuleContext(ViewportStyleContext.class,0);
		}
		public ConcreteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concreteDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterConcreteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitConcreteDefinition(this);
		}
	}

	public final ConcreteDefinitionContext concreteDefinition() throws RecognitionException {
		ConcreteDefinitionContext _localctx = new ConcreteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concreteDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__1);
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(27);
				automatonStyle();
				}
				break;
			case 2:
				{
				setState(28);
				viewportStyle();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AutomatonStyleContext extends ParserRuleContext {
		public List<TerminalNode> AutomatonProperty() { return getTokens(xAdvParser.AutomatonProperty); }
		public TerminalNode AutomatonProperty(int i) {
			return getToken(xAdvParser.AutomatonProperty, i);
		}
		public List<TerminalNode> Value() { return getTokens(xAdvParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(xAdvParser.Value, i);
		}
		public AutomatonStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterAutomatonStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitAutomatonStyle(this);
		}
	}

	public final AutomatonStyleContext automatonStyle() throws RecognitionException {
		AutomatonStyleContext _localctx = new AutomatonStyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_automatonStyle);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__2);
				setState(32);
				match(T__3);
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(33);
					match(AutomatonProperty);
					setState(34);
					match(T__4);
					setState(35);
					match(Value);
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AutomatonProperty );
				setState(40);
				match(T__5);
				}
				break;
			case Value:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(Value);
				setState(42);
				match(T__3);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(AutomatonProperty);
					setState(44);
					match(T__4);
					setState(45);
					match(Value);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AutomatonProperty );
				setState(50);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ViewportStyleContext extends ParserRuleContext {
		public List<TerminalNode> ViewportProperty() { return getTokens(xAdvParser.ViewportProperty); }
		public TerminalNode ViewportProperty(int i) {
			return getToken(xAdvParser.ViewportProperty, i);
		}
		public List<TerminalNode> Value() { return getTokens(xAdvParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(xAdvParser.Value, i);
		}
		public ViewportStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterViewportStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitViewportStyle(this);
		}
	}

	public final ViewportStyleContext viewportStyle() throws RecognitionException {
		ViewportStyleContext _localctx = new ViewportStyleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_viewportStyle);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__6);
				setState(54);
				match(T__3);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					match(ViewportProperty);
					setState(56);
					match(T__4);
					setState(57);
					match(Value);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ViewportProperty );
				setState(62);
				match(T__5);
				}
				break;
			case Value:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(Value);
				setState(64);
				match(T__3);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					match(ViewportProperty);
					setState(66);
					match(T__4);
					setState(67);
					match(Value);
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ViewportProperty );
				setState(72);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0011L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u001e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004%\b\u0004\u000b\u0004\f\u0004&\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004/\b\u0004\u000b\u0004\f\u00040\u0001\u0004\u0003\u00044\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		";\b\u0005\u000b\u0005\f\u0005<\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005E\b\u0005\u000b\u0005\f\u0005"+
		"F\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0000N\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0015\u0001\u0000\u0000\u0000\u0004\u0017\u0001\u0000\u0000\u0000\u0006"+
		"\u001a\u0001\u0000\u0000\u0000\b3\u0001\u0000\u0000\u0000\nI\u0001\u0000"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000\u0013"+
		"\u0016\u0003\u0004\u0002\u0000\u0014\u0016\u0003\u0006\u0003\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018"+
		"\u0019\u0005\f\u0000\u0000\u0019\u0005\u0001\u0000\u0000\u0000\u001a\u001d"+
		"\u0005\u0002\u0000\u0000\u001b\u001e\u0003\b\u0004\u0000\u001c\u001e\u0003"+
		"\n\u0005\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e\u0007\u0001\u0000\u0000\u0000\u001f \u0005\u0003\u0000"+
		"\u0000 $\u0005\u0004\u0000\u0000!\"\u0005\b\u0000\u0000\"#\u0005\u0005"+
		"\u0000\u0000#%\u0005\f\u0000\u0000$!\u0001\u0000\u0000\u0000%&\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(4\u0005\u0006\u0000\u0000)*\u0005\f\u0000\u0000*.\u0005"+
		"\u0004\u0000\u0000+,\u0005\b\u0000\u0000,-\u0005\u0005\u0000\u0000-/\u0005"+
		"\f\u0000\u0000.+\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"24\u0005\u0006\u0000\u00003\u001f\u0001\u0000\u0000\u00003)\u0001\u0000"+
		"\u0000\u00004\t\u0001\u0000\u0000\u000056\u0005\u0007\u0000\u00006:\u0005"+
		"\u0004\u0000\u000078\u0005\t\u0000\u000089\u0005\u0005\u0000\u00009;\u0005"+
		"\f\u0000\u0000:7\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">J\u0005\u0006\u0000\u0000?@\u0005\f\u0000\u0000@D\u0005\u0004\u0000\u0000"+
		"AB\u0005\t\u0000\u0000BC\u0005\u0005\u0000\u0000CE\u0005\f\u0000\u0000"+
		"DA\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0005\u0006"+
		"\u0000\u0000I5\u0001\u0000\u0000\u0000I?\u0001\u0000\u0000\u0000J\u000b"+
		"\u0001\u0000\u0000\u0000\t\u000f\u0015\u001d&03<FI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}