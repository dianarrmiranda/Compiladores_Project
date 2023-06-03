// Generated from /home/tiago/UA/2 Ano/2 Semestre/C/PFinal/c2023-adv-02/src/xAdv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class xAdvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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

	public static class ImportDefContext extends ParserRuleContext {
		public TerminalNode Value() { return getToken(xAdvParser.Value, 0); }
		public ImportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDef; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\3\2"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\3\6\3\6\3"+
		"\6\6\6\'\n\6\r\6\16\6(\3\6\3\6\3\6\3\6\3\6\3\6\6\6\61\n\6\r\6\16\6\62"+
		"\3\6\5\6\66\n\6\3\7\3\7\3\7\3\7\3\7\6\7=\n\7\r\7\16\7>\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\6\7G\n\7\r\7\16\7H\3\7\5\7L\n\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2P"+
		"\2\17\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\34\3\2\2\2\n\65\3\2\2\2\fK\3"+
		"\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3"+
		"\2\2\2\22\23\3\2\2\2\23\24\7\2\2\3\24\3\3\2\2\2\25\30\5\6\4\2\26\30\5"+
		"\b\5\2\27\25\3\2\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\7\3\2\2\32\33\7"+
		"\16\2\2\33\7\3\2\2\2\34\37\7\4\2\2\35 \5\n\6\2\36 \5\f\7\2\37\35\3\2\2"+
		"\2\37\36\3\2\2\2 \t\3\2\2\2!\"\7\5\2\2\"&\7\6\2\2#$\7\n\2\2$%\7\7\2\2"+
		"%\'\7\16\2\2&#\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)*\3\2\2\2*\66\7"+
		"\b\2\2+,\7\16\2\2,\60\7\6\2\2-.\7\n\2\2./\7\7\2\2/\61\7\16\2\2\60-\3\2"+
		"\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\66\7\b"+
		"\2\2\65!\3\2\2\2\65+\3\2\2\2\66\13\3\2\2\2\678\7\t\2\28<\7\6\2\29:\7\13"+
		"\2\2:;\7\7\2\2;=\7\16\2\2<9\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3"+
		"\2\2\2@L\7\b\2\2AB\7\16\2\2BF\7\6\2\2CD\7\13\2\2DE\7\7\2\2EG\7\16\2\2"+
		"FC\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JL\7\b\2\2K\67\3\2\2"+
		"\2KA\3\2\2\2L\r\3\2\2\2\13\21\27\37(\62\65>HK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}