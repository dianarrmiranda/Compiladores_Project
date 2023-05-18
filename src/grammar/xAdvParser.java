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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAdvVisitor ) return ((xAdvVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAdvVisitor ) return ((xAdvVisitor<? extends T>)visitor).visitImportDef(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xAdvListener ) ((xAdvListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAdvVisitor ) return ((xAdvVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AutomatonStyleContext extends ParserRuleContext {
		public TerminalNode AutomatonProperty() { return getToken(xAdvParser.AutomatonProperty, 0); }
		public TerminalNode Value() { return getToken(xAdvParser.Value, 0); }
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAdvVisitor ) return ((xAdvVisitor<? extends T>)visitor).visitAutomatonStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonStyleContext automatonStyle() throws RecognitionException {
		AutomatonStyleContext _localctx = new AutomatonStyleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_automatonStyle);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(T__1);
				setState(22);
				match(AutomatonProperty);
				setState(23);
				match(T__2);
				setState(24);
				match(Value);
				setState(25);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(ID);
				setState(27);
				match(T__4);
				setState(28);
				match(AutomatonProperty);
				setState(29);
				match(T__2);
				setState(30);
				match(Value);
				setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ViewportStyleContext extends ParserRuleContext {
		public TerminalNode ViewportProperty() { return getToken(xAdvParser.ViewportProperty, 0); }
		public TerminalNode Value() { return getToken(xAdvParser.Value, 0); }
		public TerminalNode ID() { return getToken(xAdvParser.ID, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof xAdvVisitor ) return ((xAdvVisitor<? extends T>)visitor).visitViewportStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportStyleContext viewportStyle() throws RecognitionException {
		ViewportStyleContext _localctx = new ViewportStyleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_viewportStyle);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__5);
				setState(35);
				match(ViewportProperty);
				setState(36);
				match(T__2);
				setState(37);
				match(Value);
				setState(38);
				match(T__3);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(ID);
				setState(40);
				match(T__4);
				setState(41);
				match(ViewportProperty);
				setState(42);
				match(T__2);
				setState(43);
				match(Value);
				setState(44);
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
		"\u0004\u0001\u000f0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u0014\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003!\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004.\b"+
		"\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000"+
		".\u0000\f\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000"+
		"\u0004\u0013\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b"+
		"-\u0001\u0000\u0000\u0000\n\r\u0003\u0004\u0002\u0000\u000b\r\u0003\u0002"+
		"\u0001\u0000\f\n\u0001\u0000\u0000\u0000\f\u000b\u0001\u0000\u0000\u0000"+
		"\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f"+
		"\u0010\u0005\r\u0000\u0000\u0010\u0003\u0001\u0000\u0000\u0000\u0011\u0014"+
		"\u0003\u0006\u0003\u0000\u0012\u0014\u0003\b\u0004\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0005\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005"+
		"\u0007\u0000\u0000\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u0019\u0005"+
		"\t\u0000\u0000\u0019!\u0005\u0004\u0000\u0000\u001a\u001b\u0005\r\u0000"+
		"\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001d\u0005\u0007\u0000"+
		"\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005\t\u0000\u0000"+
		"\u001f!\u0005\u0004\u0000\u0000 \u0015\u0001\u0000\u0000\u0000 \u001a"+
		"\u0001\u0000\u0000\u0000!\u0007\u0001\u0000\u0000\u0000\"#\u0005\u0006"+
		"\u0000\u0000#$\u0005\b\u0000\u0000$%\u0005\u0003\u0000\u0000%&\u0005\t"+
		"\u0000\u0000&.\u0005\u0004\u0000\u0000\'(\u0005\r\u0000\u0000()\u0005"+
		"\u0005\u0000\u0000)*\u0005\b\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0005"+
		"\t\u0000\u0000,.\u0005\u0004\u0000\u0000-\"\u0001\u0000\u0000\u0000-\'"+
		"\u0001\u0000\u0000\u0000.\t\u0001\u0000\u0000\u0000\u0004\f\u0013 -";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}