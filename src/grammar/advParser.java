// Generated from adv.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class advParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, BoolOperator=52, 
		GridProperties=53, PropertiesKeys=54, AutomatonTypes=55, Number=56, ID=57, 
		SYMBOL=58, STRING=59, WS=60, NEWLINE=61, SingleLineComment=62, BlockComment=63, 
		ERROR=64;
	public static final int
		RULE_program = 0, RULE_importstat = 1, RULE_alphabetDef = 2, RULE_alphabetElement = 3, 
		RULE_automatonDef = 4, RULE_automatonStat = 5, RULE_automatonFor = 6, 
		RULE_stateDef = 7, RULE_propertiesDef = 8, RULE_propertyElement = 9, RULE_transitionDef = 10, 
		RULE_transitionElement = 11, RULE_viewDef = 12, RULE_viewStat = 13, RULE_viewFor = 14, 
		RULE_transitionRedefine = 15, RULE_transitionPoint = 16, RULE_transitionLabelAlter = 17, 
		RULE_transition = 18, RULE_placeDef = 19, RULE_placeElement = 20, RULE_gridDef = 21, 
		RULE_gridOptions = 22, RULE_animationDef = 23, RULE_viewportDef = 24, 
		RULE_viewportOn = 25, RULE_viewportStat = 26, RULE_viewportFor = 27, RULE_viewportInstructions = 28, 
		RULE_viewportInstructionsShowElement = 29, RULE_playDef = 30, RULE_decl = 31, 
		RULE_algebricOP = 32, RULE_whileStat = 33, RULE_ifStat = 34, RULE_booleanExpr = 35, 
		RULE_expr = 36, RULE_assign = 37, RULE_list = 38, RULE_point = 39, RULE_pointRect = 40, 
		RULE_pointPol = 41, RULE_type = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importstat", "alphabetDef", "alphabetElement", "automatonDef", 
			"automatonStat", "automatonFor", "stateDef", "propertiesDef", "propertyElement", 
			"transitionDef", "transitionElement", "viewDef", "viewStat", "viewFor", 
			"transitionRedefine", "transitionPoint", "transitionLabelAlter", "transition", 
			"placeDef", "placeElement", "gridDef", "gridOptions", "animationDef", 
			"viewportDef", "viewportOn", "viewportStat", "viewportFor", "viewportInstructions", 
			"viewportInstructionsShowElement", "playDef", "decl", "algebricOP", "whileStat", 
			"ifStat", "booleanExpr", "expr", "assign", "list", "point", "pointRect", 
			"pointPol", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "';'", "'alphabet'", "'{'", "','", "'}'", "'-'", "'<<<'", 
			"'>>>'", "'for'", "'in'", "'state'", "'['", "'='", "']'", "'transition'", 
			"'->'", "'view'", "'of'", "'as'", "'--'", "'#label'", "'<'", "'>'", "'place'", 
			"'at'", "'grid'", "'animation'", "'viewport'", "'++'", "'on'", "'show'", 
			"'pause'", "'play'", "'while'", "'do'", "'if'", "'+'", "'*'", "'/'", 
			"'('", "')'", "'read'", "'[prompt='", "'{{'", "'}}'", "':'", "'number'", 
			"'point'", "'list'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "BoolOperator", "GridProperties", "PropertiesKeys", 
			"AutomatonTypes", "Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", 
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

	@Override
	public String getGrammarFileName() { return "adv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public advParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public AlphabetDefContext alphabetDef() {
			return getRuleContext(AlphabetDefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(advParser.EOF, 0); }
		public List<ImportstatContext> importstat() {
			return getRuleContexts(ImportstatContext.class);
		}
		public ImportstatContext importstat(int i) {
			return getRuleContext(ImportstatContext.class,i);
		}
		public List<AutomatonDefContext> automatonDef() {
			return getRuleContexts(AutomatonDefContext.class);
		}
		public AutomatonDefContext automatonDef(int i) {
			return getRuleContext(AutomatonDefContext.class,i);
		}
		public List<ViewDefContext> viewDef() {
			return getRuleContexts(ViewDefContext.class);
		}
		public ViewDefContext viewDef(int i) {
			return getRuleContext(ViewDefContext.class,i);
		}
		public List<AnimationDefContext> animationDef() {
			return getRuleContexts(AnimationDefContext.class);
		}
		public AnimationDefContext animationDef(int i) {
			return getRuleContext(AnimationDefContext.class,i);
		}
		public List<PlayDefContext> playDef() {
			return getRuleContexts(PlayDefContext.class);
		}
		public PlayDefContext playDef(int i) {
			return getRuleContext(PlayDefContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			alphabetDef();
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(87);
					importstat();
					}
					break;
				case AutomatonTypes:
					{
					setState(88);
					automatonDef();
					}
					break;
				case T__17:
					{
					setState(89);
					viewDef();
					}
					break;
				case T__27:
					{
					setState(90);
					animationDef();
					}
					break;
				case T__33:
					{
					setState(91);
					playDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 36028814467530754L) != 0) );
			setState(96);
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
	public static class ImportstatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ImportstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importstat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterImportstat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitImportstat(this);
		}
	}

	public final ImportstatContext importstat() throws RecognitionException {
		ImportstatContext _localctx = new ImportstatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			match(ID);
			setState(100);
			match(T__1);
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
	public static class AlphabetDefContext extends ParserRuleContext {
		public List<AlphabetElementContext> alphabetElement() {
			return getRuleContexts(AlphabetElementContext.class);
		}
		public AlphabetElementContext alphabetElement(int i) {
			return getRuleContext(AlphabetElementContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public AlphabetDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAlphabetDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAlphabetDef(this);
		}
	}

	public final AlphabetDefContext alphabetDef() throws RecognitionException {
		AlphabetDefContext _localctx = new AlphabetDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alphabetDef);
		try {
			int _alt;
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__2);
				setState(103);
				match(T__3);
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(104);
						alphabetElement();
						setState(105);
						match(T__4);
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(112);
				alphabetElement();
				setState(113);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(T__2);
				setState(116);
				match(ID);
				setState(117);
				match(T__6);
				setState(118);
				match(ID);
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
	public static class AlphabetElementContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(advParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(advParser.SYMBOL, i);
		}
		public AlphabetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAlphabetElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAlphabetElement(this);
		}
	}

	public final AlphabetElementContext alphabetElement() throws RecognitionException {
		AlphabetElementContext _localctx = new AlphabetElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alphabetElement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(SYMBOL);
				setState(122);
				match(T__6);
				setState(123);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(SYMBOL);
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
	public static class AutomatonDefContext extends ParserRuleContext {
		public TerminalNode AutomatonTypes() { return getToken(advParser.AutomatonTypes, 0); }
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public TransitionDefContext transitionDef() {
			return getRuleContext(TransitionDefContext.class,0);
		}
		public List<StateDefContext> stateDef() {
			return getRuleContexts(StateDefContext.class);
		}
		public StateDefContext stateDef(int i) {
			return getRuleContext(StateDefContext.class,i);
		}
		public List<AutomatonStatContext> automatonStat() {
			return getRuleContexts(AutomatonStatContext.class);
		}
		public AutomatonStatContext automatonStat(int i) {
			return getRuleContext(AutomatonStatContext.class,i);
		}
		public AutomatonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonDef(this);
		}
	}

	public final AutomatonDefContext automatonDef() throws RecognitionException {
		AutomatonDefContext _localctx = new AutomatonDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_automatonDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(AutomatonTypes);
			setState(128);
			match(ID);
			setState(129);
			match(T__7);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				stateDef();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==ID) {
				{
				{
				setState(135);
				automatonStat();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			transitionDef();
			setState(142);
			match(T__8);
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
	public static class AutomatonStatContext extends ParserRuleContext {
		public AutomatonForContext automatonFor() {
			return getRuleContext(AutomatonForContext.class,0);
		}
		public PropertiesDefContext propertiesDef() {
			return getRuleContext(PropertiesDefContext.class,0);
		}
		public AutomatonStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonStat(this);
		}
	}

	public final AutomatonStatContext automatonStat() throws RecognitionException {
		AutomatonStatContext _localctx = new AutomatonStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_automatonStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(144);
				automatonFor();
				}
				break;
			case ID:
				{
				setState(145);
				propertiesDef();
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
	public static class AutomatonForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AutomatonStatContext automatonStat() {
			return getRuleContext(AutomatonStatContext.class,0);
		}
		public AutomatonForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonFor(this);
		}
	}

	public final AutomatonForContext automatonFor() throws RecognitionException {
		AutomatonForContext _localctx = new AutomatonForContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonFor);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__9);
				setState(149);
				match(ID);
				setState(150);
				match(T__10);
				setState(151);
				expr(0);
				setState(152);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(T__9);
				setState(155);
				match(ID);
				setState(156);
				match(T__10);
				setState(157);
				expr(0);
				setState(158);
				match(T__7);
				setState(159);
				automatonStat();
				setState(160);
				match(T__8);
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
	public static class StateDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public StateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterStateDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitStateDef(this);
		}
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__11);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(ID);
					setState(166);
					match(T__4);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(172);
			match(ID);
			setState(173);
			match(T__1);
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
	public static class PropertiesDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public List<PropertyElementContext> propertyElement() {
			return getRuleContexts(PropertyElementContext.class);
		}
		public PropertyElementContext propertyElement(int i) {
			return getRuleContext(PropertyElementContext.class,i);
		}
		public PropertiesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPropertiesDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPropertiesDef(this);
		}
	}

	public final PropertiesDefContext propertiesDef() throws RecognitionException {
		PropertiesDefContext _localctx = new PropertiesDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ID);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				propertyElement();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(181);
			match(T__1);
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
	public static class PropertyElementContext extends ParserRuleContext {
		public TerminalNode PropertiesKeys() { return getToken(advParser.PropertiesKeys, 0); }
		public TerminalNode Number() { return getToken(advParser.Number, 0); }
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public PropertyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPropertyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPropertyElement(this);
		}
	}

	public final PropertyElementContext propertyElement() throws RecognitionException {
		PropertyElementContext _localctx = new PropertyElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__12);
			setState(184);
			match(PropertiesKeys);
			setState(185);
			match(T__13);
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					match(ID);
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(191);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(194);
			match(T__14);
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
	public static class TransitionDefContext extends ParserRuleContext {
		public List<TransitionElementContext> transitionElement() {
			return getRuleContexts(TransitionElementContext.class);
		}
		public TransitionElementContext transitionElement(int i) {
			return getRuleContext(TransitionElementContext.class,i);
		}
		public TransitionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionDef(this);
		}
	}

	public final TransitionDefContext transitionDef() throws RecognitionException {
		TransitionDefContext _localctx = new TransitionDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__15);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(197);
					transitionElement();
					setState(198);
					match(T__4);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(205);
			transitionElement();
			setState(206);
			match(T__1);
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
	public static class TransitionElementContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(advParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(advParser.SYMBOL, i);
		}
		public TransitionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionElement(this);
		}
	}

	public final TransitionElementContext transitionElement() throws RecognitionException {
		TransitionElementContext _localctx = new TransitionElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(T__16);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(SYMBOL);
					setState(211);
					match(T__4);
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(217);
			match(SYMBOL);
			setState(218);
			match(T__16);
			setState(219);
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
	public static class ViewDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public List<ViewStatContext> viewStat() {
			return getRuleContexts(ViewStatContext.class);
		}
		public ViewStatContext viewStat(int i) {
			return getRuleContext(ViewStatContext.class,i);
		}
		public ViewDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewDef(this);
		}
	}

	public final ViewDefContext viewDef() throws RecognitionException {
		ViewDefContext _localctx = new ViewDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__17);
			setState(222);
			match(ID);
			setState(223);
			match(T__18);
			setState(224);
			match(ID);
			setState(225);
			match(T__7);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220441361306883200L) != 0)) {
				{
				{
				setState(226);
				viewStat();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__8);
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
	public static class ViewStatContext extends ParserRuleContext {
		public AlgebricOPContext algebricOP() {
			return getRuleContext(AlgebricOPContext.class,0);
		}
		public ViewForContext viewFor() {
			return getRuleContext(ViewForContext.class,0);
		}
		public PlaceDefContext placeDef() {
			return getRuleContext(PlaceDefContext.class,0);
		}
		public TransitionRedefineContext transitionRedefine() {
			return getRuleContext(TransitionRedefineContext.class,0);
		}
		public PropertiesDefContext propertiesDef() {
			return getRuleContext(PropertiesDefContext.class,0);
		}
		public GridDefContext gridDef() {
			return getRuleContext(GridDefContext.class,0);
		}
		public ViewStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewStat(this);
		}
	}

	public final ViewStatContext viewStat() throws RecognitionException {
		ViewStatContext _localctx = new ViewStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(234);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(235);
				viewFor();
				}
				break;
			case 3:
				{
				setState(236);
				placeDef();
				}
				break;
			case 4:
				{
				setState(237);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(238);
				propertiesDef();
				}
				break;
			case 6:
				{
				setState(239);
				gridDef();
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
	public static class ViewForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ViewStatContext viewStat() {
			return getRuleContext(ViewStatContext.class,0);
		}
		public ViewForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewFor(this);
		}
	}

	public final ViewForContext viewFor() throws RecognitionException {
		ViewForContext _localctx = new ViewForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_viewFor);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(T__9);
				setState(243);
				match(ID);
				setState(244);
				match(T__10);
				setState(245);
				expr(0);
				setState(246);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__9);
				setState(249);
				match(ID);
				setState(250);
				match(T__10);
				setState(251);
				expr(0);
				setState(252);
				match(T__7);
				setState(253);
				viewStat();
				setState(254);
				match(T__8);
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
	public static class TransitionRedefineContext extends ParserRuleContext {
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public List<TransitionPointContext> transitionPoint() {
			return getRuleContexts(TransitionPointContext.class);
		}
		public TransitionPointContext transitionPoint(int i) {
			return getRuleContext(TransitionPointContext.class,i);
		}
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public TransitionRedefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionRedefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionRedefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionRedefine(this);
		}
	}

	public final TransitionRedefineContext transitionRedefine() throws RecognitionException {
		TransitionRedefineContext _localctx = new TransitionRedefineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_transitionRedefine);
		try {
			int _alt;
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				transition();
				setState(259);
				match(T__19);
				setState(260);
				transitionPoint();
				setState(261);
				match(T__20);
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						transitionPoint();
						setState(263);
						match(T__20);
						}
						} 
					}
					setState(269);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(270);
				transitionPoint();
				setState(271);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				transitionLabelAlter();
				setState(274);
				match(T__1);
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
	public static class TransitionPointContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<PropertyElementContext> propertyElement() {
			return getRuleContexts(PropertyElementContext.class);
		}
		public PropertyElementContext propertyElement(int i) {
			return getRuleContext(PropertyElementContext.class,i);
		}
		public TransitionPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionPoint(this);
		}
	}

	public final TransitionPointContext transitionPoint() throws RecognitionException {
		TransitionPointContext _localctx = new TransitionPointContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			expr(0);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(279);
				propertyElement();
				}
				}
				setState(284);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionLabelAlterContext extends ParserRuleContext {
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public List<PropertyElementContext> propertyElement() {
			return getRuleContexts(PropertyElementContext.class);
		}
		public PropertyElementContext propertyElement(int i) {
			return getRuleContext(PropertyElementContext.class,i);
		}
		public TransitionLabelAlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionLabelAlter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionLabelAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionLabelAlter(this);
		}
	}

	public final TransitionLabelAlterContext transitionLabelAlter() throws RecognitionException {
		TransitionLabelAlterContext _localctx = new TransitionLabelAlterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			transition();
			setState(286);
			match(T__21);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12) {
				{
				{
				setState(287);
				propertyElement();
				}
				}
				setState(292);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__22);
			setState(294);
			match(ID);
			setState(295);
			match(T__4);
			setState(296);
			match(ID);
			setState(297);
			match(T__23);
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
	public static class PlaceDefContext extends ParserRuleContext {
		public List<PlaceElementContext> placeElement() {
			return getRuleContexts(PlaceElementContext.class);
		}
		public PlaceElementContext placeElement(int i) {
			return getRuleContext(PlaceElementContext.class,i);
		}
		public PlaceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPlaceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPlaceDef(this);
		}
	}

	public final PlaceDefContext placeDef() throws RecognitionException {
		PlaceDefContext _localctx = new PlaceDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__24);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					placeElement();
					setState(301);
					match(T__4);
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(308);
			placeElement();
			setState(309);
			match(T__1);
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
	public static class PlaceElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public PlaceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPlaceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPlaceElement(this);
		}
	}

	public final PlaceElementContext placeElement() throws RecognitionException {
		PlaceElementContext _localctx = new PlaceElementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_placeElement);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(ID);
				setState(312);
				match(T__25);
				setState(313);
				expr(0);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				transitionLabelAlter();
				setState(315);
				match(T__25);
				setState(316);
				expr(0);
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
	public static class GridDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<GridOptionsContext> gridOptions() {
			return getRuleContexts(GridOptionsContext.class);
		}
		public GridOptionsContext gridOptions(int i) {
			return getRuleContext(GridOptionsContext.class,i);
		}
		public GridDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterGridDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitGridDef(this);
		}
	}

	public final GridDefContext gridDef() throws RecognitionException {
		GridDefContext _localctx = new GridDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__26);
			setState(321);
			match(ID);
			setState(322);
			expr(0);
			setState(323);
			match(T__12);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(324);
					gridOptions();
					setState(325);
					match(T__4);
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(332);
			gridOptions();
			setState(333);
			match(T__14);
			setState(334);
			match(T__1);
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
	public static class GridOptionsContext extends ParserRuleContext {
		public TerminalNode GridProperties() { return getToken(advParser.GridProperties, 0); }
		public TerminalNode Number() { return getToken(advParser.Number, 0); }
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public GridOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterGridOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitGridOptions(this);
		}
	}

	public final GridOptionsContext gridOptions() throws RecognitionException {
		GridOptionsContext _localctx = new GridOptionsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(GridProperties);
			setState(337);
			match(T__13);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(338);
					match(ID);
					}
					}
					setState(341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(343);
				match(Number);
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
	public static class AnimationDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public List<ViewportDefContext> viewportDef() {
			return getRuleContexts(ViewportDefContext.class);
		}
		public ViewportDefContext viewportDef(int i) {
			return getRuleContext(ViewportDefContext.class,i);
		}
		public List<ViewportOnContext> viewportOn() {
			return getRuleContexts(ViewportOnContext.class);
		}
		public ViewportOnContext viewportOn(int i) {
			return getRuleContext(ViewportOnContext.class,i);
		}
		public AnimationDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_animationDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAnimationDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAnimationDef(this);
		}
	}

	public final AnimationDefContext animationDef() throws RecognitionException {
		AnimationDefContext _localctx = new AnimationDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__27);
			setState(347);
			match(ID);
			setState(348);
			match(T__7);
			setState(351); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(351);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
					{
					setState(349);
					viewportDef();
					}
					break;
				case T__30:
					{
					setState(350);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__28 || _la==T__30 );
			setState(355);
			match(T__8);
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
	public static class ViewportDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ViewportDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportDef(this);
		}
	}

	public final ViewportDefContext viewportDef() throws RecognitionException {
		ViewportDefContext _localctx = new ViewportDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__28);
			setState(358);
			match(ID);
			setState(359);
			match(T__9);
			setState(360);
			match(ID);
			setState(361);
			match(T__25);
			setState(362);
			expr(0);
			setState(363);
			match(T__20);
			setState(364);
			match(T__29);
			setState(365);
			expr(0);
			setState(366);
			match(T__1);
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
	public static class ViewportOnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public List<ViewportStatContext> viewportStat() {
			return getRuleContexts(ViewportStatContext.class);
		}
		public ViewportStatContext viewportStat(int i) {
			return getRuleContext(ViewportStatContext.class,i);
		}
		public ViewportOnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportOn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportOn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportOn(this);
		}
	}

	public final ViewportOnContext viewportOn() throws RecognitionException {
		ViewportOnContext _localctx = new ViewportOnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__30);
			setState(369);
			match(ID);
			setState(370);
			match(T__7);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 220441374015624320L) != 0)) {
				{
				{
				setState(371);
				viewportStat();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(T__8);
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
	public static class ViewportStatContext extends ParserRuleContext {
		public PropertiesDefContext propertiesDef() {
			return getRuleContext(PropertiesDefContext.class,0);
		}
		public ViewportForContext viewportFor() {
			return getRuleContext(ViewportForContext.class,0);
		}
		public ViewportInstructionsContext viewportInstructions() {
			return getRuleContext(ViewportInstructionsContext.class,0);
		}
		public AlgebricOPContext algebricOP() {
			return getRuleContext(AlgebricOPContext.class,0);
		}
		public ViewportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportStat(this);
		}
	}

	public final ViewportStatContext viewportStat() throws RecognitionException {
		ViewportStatContext _localctx = new ViewportStatContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(379);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(380);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(381);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(382);
				algebricOP();
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
	public static class ViewportForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ViewportStatContext viewportStat() {
			return getRuleContext(ViewportStatContext.class,0);
		}
		public ViewportForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportFor(this);
		}
	}

	public final ViewportForContext viewportFor() throws RecognitionException {
		ViewportForContext _localctx = new ViewportForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_viewportFor);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(T__9);
				setState(386);
				match(ID);
				setState(387);
				match(T__10);
				setState(388);
				expr(0);
				setState(389);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(T__9);
				setState(392);
				match(ID);
				setState(393);
				match(T__10);
				setState(394);
				expr(0);
				setState(395);
				match(T__7);
				setState(396);
				viewportStat();
				setState(397);
				match(T__8);
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
	public static class ViewportInstructionsContext extends ParserRuleContext {
		public List<ViewportInstructionsShowElementContext> viewportInstructionsShowElement() {
			return getRuleContexts(ViewportInstructionsShowElementContext.class);
		}
		public ViewportInstructionsShowElementContext viewportInstructionsShowElement(int i) {
			return getRuleContext(ViewportInstructionsShowElementContext.class,i);
		}
		public ViewportInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportInstructions(this);
		}
	}

	public final ViewportInstructionsContext viewportInstructions() throws RecognitionException {
		ViewportInstructionsContext _localctx = new ViewportInstructionsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_viewportInstructions);
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(T__31);
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						viewportInstructionsShowElement();
						setState(403);
						match(T__4);
						}
						} 
					}
					setState(409);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(410);
				viewportInstructionsShowElement();
				setState(411);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(T__31);
				setState(414);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(T__32);
				setState(416);
				match(T__1);
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
	public static class ViewportInstructionsShowElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public List<PropertyElementContext> propertyElement() {
			return getRuleContexts(PropertyElementContext.class);
		}
		public PropertyElementContext propertyElement(int i) {
			return getRuleContext(PropertyElementContext.class,i);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public ViewportInstructionsShowElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportInstructionsShowElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportInstructionsShowElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportInstructionsShowElement(this);
		}
	}

	public final ViewportInstructionsShowElementContext viewportInstructionsShowElement() throws RecognitionException {
		ViewportInstructionsShowElementContext _localctx = new ViewportInstructionsShowElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(ID);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(420);
					propertyElement();
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				transition();
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
	public static class PlayDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public PlayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPlayDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPlayDef(this);
		}
	}

	public final PlayDefContext playDef() throws RecognitionException {
		PlayDefContext _localctx = new PlayDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__33);
			setState(430);
			match(ID);
			setState(431);
			match(T__1);
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
	public static class DeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_decl);
		try {
			int _alt;
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				type();
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						assign();
						setState(435);
						match(T__4);
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(442);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				type();
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(445);
						match(ID);
						setState(446);
						match(T__4);
						}
						} 
					}
					setState(451);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(452);
				match(ID);
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
	public static class AlgebricOPContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AlgebricOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algebricOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAlgebricOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAlgebricOP(this);
		}
	}

	public final AlgebricOPContext algebricOP() throws RecognitionException {
		AlgebricOPContext _localctx = new AlgebricOPContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(456);
				expr(0);
				}
				break;
			case 2:
				{
				setState(457);
				decl();
				}
				break;
			case 3:
				{
				setState(458);
				assign();
				}
				break;
			}
			setState(461);
			match(T__1);
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
	public static class WhileStatContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitWhileStat(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__34);
			setState(464);
			booleanExpr();
			setState(465);
			match(T__35);
			setState(466);
			expr(0);
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
	public static class IfStatContext extends ParserRuleContext {
		public BooleanExprContext booleanExpr() {
			return getRuleContext(BooleanExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__36);
			setState(469);
			booleanExpr();
			setState(470);
			match(T__35);
			setState(471);
			expr(0);
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
	public static class BooleanExprContext extends ParserRuleContext {
		public TerminalNode BoolOperator() { return getToken(advParser.BoolOperator, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BooleanExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitBooleanExpr(this);
		}
	}

	public final BooleanExprContext booleanExpr() throws RecognitionException {
		BooleanExprContext _localctx = new BooleanExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_booleanExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 216219236480057472L) != 0)) {
				{
				setState(473);
				expr(0);
				}
			}

			setState(476);
			match(BoolOperator);
			setState(477);
			expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode Number() { return getToken(advParser.Number, 0); }
		public TerminalNode STRING() { return getToken(advParser.STRING, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(480);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__37) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(481);
				expr(10);
				}
				break;
			case 2:
				{
				setState(482);
				match(T__40);
				setState(483);
				match(ID);
				setState(484);
				match(T__41);
				}
				break;
			case 3:
				{
				setState(485);
				match(T__40);
				setState(486);
				expr(0);
				setState(487);
				match(T__41);
				}
				break;
			case 4:
				{
				setState(489);
				point();
				}
				break;
			case 5:
				{
				setState(490);
				list();
				}
				break;
			case 6:
				{
				setState(491);
				match(Number);
				}
				break;
			case 7:
				{
				setState(492);
				match(ID);
				}
				break;
			case 8:
				{
				setState(493);
				match(T__42);
				setState(497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(494);
					match(T__43);
					setState(495);
					match(STRING);
					setState(496);
					match(T__14);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(507);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(501);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(502);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(503);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(504);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(505);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__37) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(506);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(ID);
			setState(513);
			match(T__13);
			setState(514);
			expr(0);
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
	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(T__44);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(517);
					match(ID);
					setState(518);
					match(T__4);
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(524);
			match(ID);
			setState(525);
			match(T__45);
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
	public static class PointContext extends ParserRuleContext {
		public PointRectContext pointRect() {
			return getRuleContext(PointRectContext.class,0);
		}
		public PointPolContext pointPol() {
			return getRuleContext(PointPolContext.class,0);
		}
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPoint(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_point);
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				pointPol();
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
	public static class PointRectContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(advParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(advParser.Number, i);
		}
		public PointRectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointRect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPointRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPointRect(this);
		}
	}

	public final PointRectContext pointRect() throws RecognitionException {
		PointRectContext _localctx = new PointRectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__40);
			setState(532);
			match(Number);
			setState(533);
			match(T__4);
			setState(534);
			match(Number);
			setState(535);
			match(T__41);
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
	public static class PointPolContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(advParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(advParser.Number, i);
		}
		public PointPolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointPol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPointPol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPointPol(this);
		}
	}

	public final PointPolContext pointPol() throws RecognitionException {
		PointPolContext _localctx = new PointPolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__40);
			setState(538);
			match(Number);
			setState(539);
			match(T__46);
			setState(540);
			match(Number);
			setState(541);
			match(T__41);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650663936L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0222\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000]\b\u0000\u000b\u0000"+
		"\f\u0000^\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002l\b\u0002\n\u0002\f\u0002o\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"x\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"~\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004"+
		"\u0084\b\u0004\u000b\u0004\f\u0004\u0085\u0001\u0004\u0005\u0004\u0089"+
		"\b\u0004\n\u0004\f\u0004\u008c\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0093\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00a8\b\u0007\n\u0007\f\u0007\u00ab\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0004\b\u00b2\b\b\u000b\b\f\b\u00b3\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00bc\b\t\u000b\t\f\t\u00bd"+
		"\u0001\t\u0003\t\u00c1\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00c9\b\n\n\n\f\n\u00cc\t\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d5\b\u000b\n\u000b"+
		"\f\u000b\u00d8\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00e4\b\f\n\f"+
		"\f\f\u00e7\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u00f1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0101\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u010a\b\u000f\n\u000f\f\u000f\u010d\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u0115\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0119\b\u0010"+
		"\n\u0010\f\u0010\u011c\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0121\b\u0011\n\u0011\f\u0011\u0124\t\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0130\b\u0013\n\u0013\f\u0013\u0133"+
		"\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u013f"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0148\b\u0015\n\u0015\f\u0015\u014b\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u0154\b\u0016\u000b\u0016\f\u0016\u0155\u0001"+
		"\u0016\u0003\u0016\u0159\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0160\b\u0017\u000b\u0017\f\u0017\u0161"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0175\b\u0019\n\u0019\f\u0019\u0178\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0180\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0190\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0196\b\u001c\n\u001c\f\u001c\u0199\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01a2\b\u001c\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u01a6\b\u001d\n\u001d\f\u001d\u01a9\t\u001d\u0001\u001d\u0003\u001d\u01ac"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b6\b\u001f\n\u001f\f\u001f"+
		"\u01b9\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u01c0\b\u001f\n\u001f\f\u001f\u01c3\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u01c7\b\u001f\u0001 \u0001 \u0001 \u0003 \u01cc\b "+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0003#\u01db\b#\u0001#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01f2\b$\u0003"+
		"$\u01f4\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u01fc\b$\n"+
		"$\f$\u01ff\t$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0005&"+
		"\u0208\b&\n&\f&\u020b\t&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0003\'"+
		"\u0212\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0000\u0001H+\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0003\u0002\u0000\u0007\u0007&&\u0001"+
		"\u0000\'(\u0002\u0000\f\f03\u0236\u0000V\u0001\u0000\u0000\u0000\u0002"+
		"b\u0001\u0000\u0000\u0000\u0004w\u0001\u0000\u0000\u0000\u0006}\u0001"+
		"\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000"+
		"\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e\u00a4\u0001\u0000\u0000"+
		"\u0000\u0010\u00af\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000"+
		"\u0000\u0014\u00c4\u0001\u0000\u0000\u0000\u0016\u00d0\u0001\u0000\u0000"+
		"\u0000\u0018\u00dd\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000"+
		"\u0000\u001c\u0100\u0001\u0000\u0000\u0000\u001e\u0114\u0001\u0000\u0000"+
		"\u0000 \u0116\u0001\u0000\u0000\u0000\"\u011d\u0001\u0000\u0000\u0000"+
		"$\u0125\u0001\u0000\u0000\u0000&\u012b\u0001\u0000\u0000\u0000(\u013e"+
		"\u0001\u0000\u0000\u0000*\u0140\u0001\u0000\u0000\u0000,\u0150\u0001\u0000"+
		"\u0000\u0000.\u015a\u0001\u0000\u0000\u00000\u0165\u0001\u0000\u0000\u0000"+
		"2\u0170\u0001\u0000\u0000\u00004\u017f\u0001\u0000\u0000\u00006\u018f"+
		"\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000\u0000:\u01ab\u0001\u0000"+
		"\u0000\u0000<\u01ad\u0001\u0000\u0000\u0000>\u01c6\u0001\u0000\u0000\u0000"+
		"@\u01cb\u0001\u0000\u0000\u0000B\u01cf\u0001\u0000\u0000\u0000D\u01d4"+
		"\u0001\u0000\u0000\u0000F\u01da\u0001\u0000\u0000\u0000H\u01f3\u0001\u0000"+
		"\u0000\u0000J\u0200\u0001\u0000\u0000\u0000L\u0204\u0001\u0000\u0000\u0000"+
		"N\u0211\u0001\u0000\u0000\u0000P\u0213\u0001\u0000\u0000\u0000R\u0219"+
		"\u0001\u0000\u0000\u0000T\u021f\u0001\u0000\u0000\u0000V\\\u0003\u0004"+
		"\u0002\u0000W]\u0003\u0002\u0001\u0000X]\u0003\b\u0004\u0000Y]\u0003\u0018"+
		"\f\u0000Z]\u0003.\u0017\u0000[]\u0003<\u001e\u0000\\W\u0001\u0000\u0000"+
		"\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000bc\u0005"+
		"\u0001\u0000\u0000cd\u00059\u0000\u0000de\u0005\u0002\u0000\u0000e\u0003"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000\u0000gm\u0005\u0004\u0000"+
		"\u0000hi\u0003\u0006\u0003\u0000ij\u0005\u0005\u0000\u0000jl\u0001\u0000"+
		"\u0000\u0000kh\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000pq\u0003\u0006\u0003\u0000qr\u0005\u0006\u0000"+
		"\u0000rx\u0001\u0000\u0000\u0000st\u0005\u0003\u0000\u0000tu\u00059\u0000"+
		"\u0000uv\u0005\u0007\u0000\u0000vx\u00059\u0000\u0000wf\u0001\u0000\u0000"+
		"\u0000ws\u0001\u0000\u0000\u0000x\u0005\u0001\u0000\u0000\u0000yz\u0005"+
		":\u0000\u0000z{\u0005\u0007\u0000\u0000{~\u0005:\u0000\u0000|~\u0005:"+
		"\u0000\u0000}y\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0007"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u00057\u0000\u0000\u0080\u0081\u0005"+
		"9\u0000\u0000\u0081\u0083\u0005\b\u0000\u0000\u0082\u0084\u0003\u000e"+
		"\u0007\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u008a\u0001\u0000\u0000\u0000\u0087\u0089\u0003\n\u0005"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f\u0005\t\u0000\u0000"+
		"\u008f\t\u0001\u0000\u0000\u0000\u0090\u0093\u0003\f\u0006\u0000\u0091"+
		"\u0093\u0003\u0010\b\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\n\u0000\u0000\u0095\u0096\u00059\u0000\u0000\u0096\u0097\u0005"+
		"\u000b\u0000\u0000\u0097\u0098\u0003H$\u0000\u0098\u0099\u0003\n\u0005"+
		"\u0000\u0099\u00a3\u0001\u0000\u0000\u0000\u009a\u009b\u0005\n\u0000\u0000"+
		"\u009b\u009c\u00059\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d"+
		"\u009e\u0003H$\u0000\u009e\u009f\u0005\b\u0000\u0000\u009f\u00a0\u0003"+
		"\n\u0005\u0000\u00a0\u00a1\u0005\t\u0000\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u0094\u0001\u0000\u0000\u0000\u00a2\u009a\u0001\u0000"+
		"\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000\u00a4\u00a9\u0005\f\u0000"+
		"\u0000\u00a5\u00a6\u00059\u0000\u0000\u00a6\u00a8\u0005\u0005\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u00059\u0000\u0000\u00ad\u00ae\u0005\u0002\u0000\u0000\u00ae"+
		"\u000f\u0001\u0000\u0000\u0000\u00af\u00b1\u00059\u0000\u0000\u00b0\u00b2"+
		"\u0003\u0012\t\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0002\u0000\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\r\u0000\u0000\u00b8\u00b9\u00056\u0000\u0000\u00b9\u00c0\u0005\u000e"+
		"\u0000\u0000\u00ba\u00bc\u00059\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u00058\u0000\u0000\u00c0\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u000f\u0000\u0000\u00c3\u0013\u0001\u0000\u0000\u0000"+
		"\u00c4\u00ca\u0005\u0010\u0000\u0000\u00c5\u00c6\u0003\u0016\u000b\u0000"+
		"\u00c6\u00c7\u0005\u0005\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0003\u0016\u000b\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000"+
		"\u00cf\u0015\u0001\u0000\u0000\u0000\u00d0\u00d1\u00059\u0000\u0000\u00d1"+
		"\u00d6\u0005\u0011\u0000\u0000\u00d2\u00d3\u0005:\u0000\u0000\u00d3\u00d5"+
		"\u0005\u0005\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0005:\u0000\u0000\u00da\u00db\u0005"+
		"\u0011\u0000\u0000\u00db\u00dc\u00059\u0000\u0000\u00dc\u0017\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u0012\u0000\u0000\u00de\u00df\u00059\u0000"+
		"\u0000\u00df\u00e0\u0005\u0013\u0000\u0000\u00e0\u00e1\u00059\u0000\u0000"+
		"\u00e1\u00e5\u0005\b\u0000\u0000\u00e2\u00e4\u0003\u001a\r\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\t\u0000\u0000\u00e9\u0019\u0001\u0000\u0000\u0000\u00ea\u00f1"+
		"\u0003@ \u0000\u00eb\u00f1\u0003\u001c\u000e\u0000\u00ec\u00f1\u0003&"+
		"\u0013\u0000\u00ed\u00f1\u0003\u001e\u000f\u0000\u00ee\u00f1\u0003\u0010"+
		"\b\u0000\u00ef\u00f1\u0003*\u0015\u0000\u00f0\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u001b\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005\n\u0000\u0000\u00f3\u00f4\u00059\u0000\u0000"+
		"\u00f4\u00f5\u0005\u000b\u0000\u0000\u00f5\u00f6\u0003H$\u0000\u00f6\u00f7"+
		"\u0003\u001a\r\u0000\u00f7\u0101\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\n\u0000\u0000\u00f9\u00fa\u00059\u0000\u0000\u00fa\u00fb\u0005\u000b"+
		"\u0000\u0000\u00fb\u00fc\u0003H$\u0000\u00fc\u00fd\u0005\b\u0000\u0000"+
		"\u00fd\u00fe\u0003\u001a\r\u0000\u00fe\u00ff\u0005\t\u0000\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00f2\u0001\u0000\u0000\u0000\u0100"+
		"\u00f8\u0001\u0000\u0000\u0000\u0101\u001d\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003$\u0012\u0000\u0103\u0104\u0005\u0014\u0000\u0000\u0104\u0105"+
		"\u0003 \u0010\u0000\u0105\u010b\u0005\u0015\u0000\u0000\u0106\u0107\u0003"+
		" \u0010\u0000\u0107\u0108\u0005\u0015\u0000\u0000\u0108\u010a\u0001\u0000"+
		"\u0000\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0003 \u0010\u0000\u010f\u0110\u0005\u0002\u0000"+
		"\u0000\u0110\u0115\u0001\u0000\u0000\u0000\u0111\u0112\u0003\"\u0011\u0000"+
		"\u0112\u0113\u0005\u0002\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000"+
		"\u0114\u0102\u0001\u0000\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000"+
		"\u0115\u001f\u0001\u0000\u0000\u0000\u0116\u011a\u0003H$\u0000\u0117\u0119"+
		"\u0003\u0012\t\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119\u011c\u0001"+
		"\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b!\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0003$\u0012\u0000\u011e\u0122\u0005\u0016\u0000"+
		"\u0000\u011f\u0121\u0003\u0012\t\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123#\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0017\u0000\u0000\u0126"+
		"\u0127\u00059\u0000\u0000\u0127\u0128\u0005\u0005\u0000\u0000\u0128\u0129"+
		"\u00059\u0000\u0000\u0129\u012a\u0005\u0018\u0000\u0000\u012a%\u0001\u0000"+
		"\u0000\u0000\u012b\u0131\u0005\u0019\u0000\u0000\u012c\u012d\u0003(\u0014"+
		"\u0000\u012d\u012e\u0005\u0005\u0000\u0000\u012e\u0130\u0001\u0000\u0000"+
		"\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0003(\u0014\u0000\u0135\u0136\u0005\u0002\u0000\u0000"+
		"\u0136\'\u0001\u0000\u0000\u0000\u0137\u0138\u00059\u0000\u0000\u0138"+
		"\u0139\u0005\u001a\u0000\u0000\u0139\u013f\u0003H$\u0000\u013a\u013b\u0003"+
		"\"\u0011\u0000\u013b\u013c\u0005\u001a\u0000\u0000\u013c\u013d\u0003H"+
		"$\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u0137\u0001\u0000\u0000"+
		"\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013f)\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0005\u001b\u0000\u0000\u0141\u0142\u00059\u0000\u0000\u0142"+
		"\u0143\u0003H$\u0000\u0143\u0149\u0005\r\u0000\u0000\u0144\u0145\u0003"+
		",\u0016\u0000\u0145\u0146\u0005\u0005\u0000\u0000\u0146\u0148\u0001\u0000"+
		"\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000"+
		"\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0003,\u0016\u0000\u014d\u014e\u0005\u000f\u0000"+
		"\u0000\u014e\u014f\u0005\u0002\u0000\u0000\u014f+\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u00055\u0000\u0000\u0151\u0158\u0005\u000e\u0000\u0000\u0152"+
		"\u0154\u00059\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156"+
		"\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0159"+
		"\u00058\u0000\u0000\u0158\u0153\u0001\u0000\u0000\u0000\u0158\u0157\u0001"+
		"\u0000\u0000\u0000\u0159-\u0001\u0000\u0000\u0000\u015a\u015b\u0005\u001c"+
		"\u0000\u0000\u015b\u015c\u00059\u0000\u0000\u015c\u015f\u0005\b\u0000"+
		"\u0000\u015d\u0160\u00030\u0018\u0000\u015e\u0160\u00032\u0019\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\t\u0000\u0000\u0164/\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0005\u001d\u0000\u0000\u0166\u0167\u00059\u0000\u0000\u0167\u0168\u0005"+
		"\n\u0000\u0000\u0168\u0169\u00059\u0000\u0000\u0169\u016a\u0005\u001a"+
		"\u0000\u0000\u016a\u016b\u0003H$\u0000\u016b\u016c\u0005\u0015\u0000\u0000"+
		"\u016c\u016d\u0005\u001e\u0000\u0000\u016d\u016e\u0003H$\u0000\u016e\u016f"+
		"\u0005\u0002\u0000\u0000\u016f1\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\u001f\u0000\u0000\u0171\u0172\u00059\u0000\u0000\u0172\u0176\u0005\b"+
		"\u0000\u0000\u0173\u0175\u00034\u001a\u0000\u0174\u0173\u0001\u0000\u0000"+
		"\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0179\u017a\u0005\t\u0000\u0000"+
		"\u017a3\u0001\u0000\u0000\u0000\u017b\u0180\u0003\u0010\b\u0000\u017c"+
		"\u0180\u00036\u001b\u0000\u017d\u0180\u00038\u001c\u0000\u017e\u0180\u0003"+
		"@ \u0000\u017f\u017b\u0001\u0000\u0000\u0000\u017f\u017c\u0001\u0000\u0000"+
		"\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u017e\u0001\u0000\u0000"+
		"\u0000\u01805\u0001\u0000\u0000\u0000\u0181\u0182\u0005\n\u0000\u0000"+
		"\u0182\u0183\u00059\u0000\u0000\u0183\u0184\u0005\u000b\u0000\u0000\u0184"+
		"\u0185\u0003H$\u0000\u0185\u0186\u00034\u001a\u0000\u0186\u0190\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005\n\u0000\u0000\u0188\u0189\u00059"+
		"\u0000\u0000\u0189\u018a\u0005\u000b\u0000\u0000\u018a\u018b\u0003H$\u0000"+
		"\u018b\u018c\u0005\b\u0000\u0000\u018c\u018d\u00034\u001a\u0000\u018d"+
		"\u018e\u0005\t\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f\u0181"+
		"\u0001\u0000\u0000\u0000\u018f\u0187\u0001\u0000\u0000\u0000\u01907\u0001"+
		"\u0000\u0000\u0000\u0191\u0197\u0005 \u0000\u0000\u0192\u0193\u0003:\u001d"+
		"\u0000\u0193\u0194\u0005\u0005\u0000\u0000\u0194\u0196\u0001\u0000\u0000"+
		"\u0000\u0195\u0192\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0003:\u001d\u0000\u019b\u019c\u0005\u0002\u0000\u0000"+
		"\u019c\u01a2\u0001\u0000\u0000\u0000\u019d\u019e\u0005 \u0000\u0000\u019e"+
		"\u01a2\u0005\u0002\u0000\u0000\u019f\u01a0\u0005!\u0000\u0000\u01a0\u01a2"+
		"\u0005\u0002\u0000\u0000\u01a1\u0191\u0001\u0000\u0000\u0000\u01a1\u019d"+
		"\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a29\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a7\u00059\u0000\u0000\u01a4\u01a6\u0003\u0012"+
		"\t\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01ac\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ac\u0003$\u0012\u0000\u01ab\u01a3\u0001\u0000\u0000\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac;\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0005\"\u0000\u0000\u01ae\u01af\u00059\u0000\u0000\u01af\u01b0"+
		"\u0005\u0002\u0000\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1\u01b7\u0003"+
		"T*\u0000\u01b2\u01b3\u0003J%\u0000\u01b3\u01b4\u0005\u0005\u0000\u0000"+
		"\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003J%\u0000\u01bb\u01c7"+
		"\u0001\u0000\u0000\u0000\u01bc\u01c1\u0003T*\u0000\u01bd\u01be\u00059"+
		"\u0000\u0000\u01be\u01c0\u0005\u0005\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c5\u00059\u0000"+
		"\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01b1\u0001\u0000\u0000"+
		"\u0000\u01c6\u01bc\u0001\u0000\u0000\u0000\u01c7?\u0001\u0000\u0000\u0000"+
		"\u01c8\u01cc\u0003H$\u0000\u01c9\u01cc\u0003>\u001f\u0000\u01ca\u01cc"+
		"\u0003J%\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0005\u0002\u0000\u0000\u01ceA\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d0\u0005#\u0000\u0000\u01d0\u01d1\u0003F#\u0000\u01d1"+
		"\u01d2\u0005$\u0000\u0000\u01d2\u01d3\u0003H$\u0000\u01d3C\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0005%\u0000\u0000\u01d5\u01d6\u0003F#\u0000"+
		"\u01d6\u01d7\u0005$\u0000\u0000\u01d7\u01d8\u0003H$\u0000\u01d8E\u0001"+
		"\u0000\u0000\u0000\u01d9\u01db\u0003H$\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u00054\u0000\u0000\u01dd\u01de\u0003H$\u0000\u01de"+
		"G\u0001\u0000\u0000\u0000\u01df\u01e0\u0006$\uffff\uffff\u0000\u01e0\u01e1"+
		"\u0007\u0000\u0000\u0000\u01e1\u01f4\u0003H$\n\u01e2\u01e3\u0005)\u0000"+
		"\u0000\u01e3\u01e4\u00059\u0000\u0000\u01e4\u01f4\u0005*\u0000\u0000\u01e5"+
		"\u01e6\u0005)\u0000\u0000\u01e6\u01e7\u0003H$\u0000\u01e7\u01e8\u0005"+
		"*\u0000\u0000\u01e8\u01f4\u0001\u0000\u0000\u0000\u01e9\u01f4\u0003N\'"+
		"\u0000\u01ea\u01f4\u0003L&\u0000\u01eb\u01f4\u00058\u0000\u0000\u01ec"+
		"\u01f4\u00059\u0000\u0000\u01ed\u01f1\u0005+\u0000\u0000\u01ee\u01ef\u0005"+
		",\u0000\u0000\u01ef\u01f0\u0005;\u0000\u0000\u01f0\u01f2\u0005\u000f\u0000"+
		"\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01df\u0001\u0000\u0000"+
		"\u0000\u01f3\u01e2\u0001\u0000\u0000\u0000\u01f3\u01e5\u0001\u0000\u0000"+
		"\u0000\u01f3\u01e9\u0001\u0000\u0000\u0000\u01f3\u01ea\u0001\u0000\u0000"+
		"\u0000\u01f3\u01eb\u0001\u0000\u0000\u0000\u01f3\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f3\u01ed\u0001\u0000\u0000\u0000\u01f4\u01fd\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f6\n\t\u0000\u0000\u01f6\u01f7\u0007\u0001\u0000\u0000"+
		"\u01f7\u01fc\u0003H$\n\u01f8\u01f9\n\b\u0000\u0000\u01f9\u01fa\u0007\u0000"+
		"\u0000\u0000\u01fa\u01fc\u0003H$\t\u01fb\u01f5\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f8\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000"+
		"\u01feI\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u00059\u0000\u0000\u0201\u0202\u0005\u000e\u0000\u0000\u0202\u0203"+
		"\u0003H$\u0000\u0203K\u0001\u0000\u0000\u0000\u0204\u0209\u0005-\u0000"+
		"\u0000\u0205\u0206\u00059\u0000\u0000\u0206\u0208\u0005\u0005\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0208\u020b\u0001\u0000\u0000\u0000"+
		"\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000"+
		"\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u00059\u0000\u0000\u020d\u020e\u0005.\u0000\u0000\u020eM"+
		"\u0001\u0000\u0000\u0000\u020f\u0212\u0003P(\u0000\u0210\u0212\u0003R"+
		")\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0210\u0001\u0000\u0000"+
		"\u0000\u0212O\u0001\u0000\u0000\u0000\u0213\u0214\u0005)\u0000\u0000\u0214"+
		"\u0215\u00058\u0000\u0000\u0215\u0216\u0005\u0005\u0000\u0000\u0216\u0217"+
		"\u00058\u0000\u0000\u0217\u0218\u0005*\u0000\u0000\u0218Q\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0005)\u0000\u0000\u021a\u021b\u00058\u0000\u0000"+
		"\u021b\u021c\u0005/\u0000\u0000\u021c\u021d\u00058\u0000\u0000\u021d\u021e"+
		"\u0005*\u0000\u0000\u021eS\u0001\u0000\u0000\u0000\u021f\u0220\u0007\u0002"+
		"\u0000\u0000\u0220U\u0001\u0000\u0000\u0000/\\^mw}\u0085\u008a\u0092\u00a2"+
		"\u00a9\u00b3\u00bd\u00c0\u00ca\u00d6\u00e5\u00f0\u0100\u010b\u0114\u011a"+
		"\u0122\u0131\u013e\u0149\u0155\u0158\u015f\u0161\u0176\u017f\u018f\u0197"+
		"\u01a1\u01a7\u01ab\u01b7\u01c1\u01c6\u01cb\u01da\u01f1\u01f3\u01fb\u01fd"+
		"\u0209\u0211";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}