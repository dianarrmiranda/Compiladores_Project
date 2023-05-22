// Generated from /home/jose/Desktop/LEI/2ºano/2ºSemestre/C/Práticas/c2023-adv-02/src/grammar/xAdv.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AutomatonProperty=7, ViewportProperty=8, 
		Value=9, WS=10, INT=11, NEWLINE=12, ID=13, SingleLineComment=14, BlockComment=15;
	public static final int
		RULE_program = 0, RULE_importDef = 1, RULE_definition = 2, RULE_automatonStyle = 3, 
		RULE_viewportStyle = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDef", "definition", "automatonStyle", "viewportStyle"
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
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ImportDefContext importDef() {
			return getRuleContext(ImportDefContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				definition();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(11);
				importDef();
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

	public static class ImportDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
		public ImportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDef; }
	}

	public final ImportDefContext importDef() throws RecognitionException {
		ImportDefContext _localctx = new ImportDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(ID);
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

	public static class DefinitionContext extends ParserRuleContext {
		public AutomatonStyleContext automatonStyle() {
			return getRuleContext(AutomatonStyleContext.class,0);
		}
		public ViewportStyleContext viewportStyle() {
			return getRuleContext(ViewportStyleContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				automatonStyle();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				viewportStyle();
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

	public static class AutomatonStyleContext extends ParserRuleContext {
		public List<TerminalNode> AutomatonProperty() { return getTokens(xAdvParser.AutomatonProperty); }
		public TerminalNode AutomatonProperty(int i) {
			return getToken(xAdvParser.AutomatonProperty, i);
		}
		public List<TerminalNode> Value() { return getTokens(xAdvParser.Value); }
		public TerminalNode Value(int i) {
			return getToken(xAdvParser.Value, i);
		}
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
		public AutomatonStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonStyle; }
	}

	public final AutomatonStyleContext automatonStyle() throws RecognitionException {
		AutomatonStyleContext _localctx = new AutomatonStyleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_automatonStyle);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(T__1);
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(22);
					match(AutomatonProperty);
					setState(23);
					match(T__2);
					setState(24);
					match(Value);
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AutomatonProperty );
				setState(29);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(ID);
				setState(31);
				match(T__4);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(32);
					match(AutomatonProperty);
					setState(33);
					match(T__2);
					setState(34);
					match(Value);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AutomatonProperty );
				setState(39);
				match(T__3);
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
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
		public ViewportStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStyle; }
	}

	public final ViewportStyleContext viewportStyle() throws RecognitionException {
		ViewportStyleContext _localctx = new ViewportStyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_viewportStyle);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__5);
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(ViewportProperty);
					setState(44);
					match(T__2);
					setState(45);
					match(Value);
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ViewportProperty );
				setState(50);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(ID);
				setState(52);
				match(T__4);
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(53);
					match(ViewportProperty);
					setState(54);
					match(T__2);
					setState(55);
					match(Value);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ViewportProperty );
				setState(60);
				match(T__3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\4\3\4\5\4"+
		"\26\n\4\3\5\3\5\3\5\3\5\6\5\34\n\5\r\5\16\5\35\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\6\5&\n\5\r\5\16\5\'\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\6\6\61\n\6\r\6\16\6"+
		"\62\3\6\3\6\3\6\3\6\3\6\3\6\6\6;\n\6\r\6\16\6<\3\6\5\6@\n\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\2D\2\16\3\2\2\2\4\20\3\2\2\2\6\25\3\2\2\2\b*\3\2\2\2\n"+
		"?\3\2\2\2\f\17\5\6\4\2\r\17\5\4\3\2\16\f\3\2\2\2\16\r\3\2\2\2\17\3\3\2"+
		"\2\2\20\21\7\3\2\2\21\22\7\17\2\2\22\5\3\2\2\2\23\26\5\b\5\2\24\26\5\n"+
		"\6\2\25\23\3\2\2\2\25\24\3\2\2\2\26\7\3\2\2\2\27\33\7\4\2\2\30\31\7\t"+
		"\2\2\31\32\7\5\2\2\32\34\7\13\2\2\33\30\3\2\2\2\34\35\3\2\2\2\35\33\3"+
		"\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37+\7\6\2\2 !\7\17\2\2!%\7\7\2\2\""+
		"#\7\t\2\2#$\7\5\2\2$&\7\13\2\2%\"\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2"+
		"\2\2()\3\2\2\2)+\7\6\2\2*\27\3\2\2\2* \3\2\2\2+\t\3\2\2\2,\60\7\b\2\2"+
		"-.\7\n\2\2./\7\5\2\2/\61\7\13\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3\2"+
		"\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64@\7\6\2\2\65\66\7\17\2\2\66:\7\7\2"+
		"\2\678\7\n\2\289\7\5\2\29;\7\13\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<="+
		"\3\2\2\2=>\3\2\2\2>@\7\6\2\2?,\3\2\2\2?\65\3\2\2\2@\13\3\2\2\2\n\16\25"+
		"\35\'*\62<?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}