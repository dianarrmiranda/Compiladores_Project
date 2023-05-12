// Generated from /home/tiago/UA/2 Ano/2 Semestre/C/PFinal/c2023-adv-02/src/grammar/adv.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class advParser extends Parser {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__17) | (1L << T__27) | (1L << T__33) | (1L << AutomatonTypes))) != 0) );
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

	public static class ImportstatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ImportstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importstat; }
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

	public static class AlphabetElementContext extends ParserRuleContext {
		public List<TerminalNode> SYMBOL() { return getTokens(advParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(advParser.SYMBOL, i);
		}
		public AlphabetElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphabetElement; }
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

	public static class StateDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public StateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDef; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__22) | (1L << T__24) | (1L << T__26) | (1L << T__37) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << Number) | (1L << ID))) != 0)) {
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

	public static class TransitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__31) | (1L << T__32) | (1L << T__37) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << Number) | (1L << ID))) != 0)) {
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

	public static class PlayDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public PlayDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playDef; }
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__37) | (1L << T__40) | (1L << T__42) | (1L << T__44) | (1L << Number) | (1L << ID))) != 0)) {
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
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

	public static class ListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(advParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(advParser.ID, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
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

	public static class PointRectContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(advParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(advParser.Number, i);
		}
		public PointRectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointRect; }
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

	public static class PointPolContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(advParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(advParser.Number, i);
		}
		public PointPolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointPol; }
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u0224\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\6\2_\n\2\r\2\16\2`\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4z\n\4\3\5\3\5\3\5\3\5\5\5\u0080\n\5\3\6\3\6\3\6\3\6\6\6\u0086"+
		"\n\6\r\6\16\6\u0087\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\3\6\3\6\3\6"+
		"\3\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\7\t\u00aa\n\t\f\t\16\t\u00ad\13\t\3"+
		"\t\3\t\3\t\3\n\3\n\6\n\u00b4\n\n\r\n\16\n\u00b5\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\6\13\u00be\n\13\r\13\16\13\u00bf\3\13\5\13\u00c3\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\7\r\u00d7\n\r\f\r\16\r\u00da\13\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00e6\n\16\f\16\16\16\u00e9\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f3\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0117\n\21\3\22\3\22\7\22\u011b\n\22\f"+
		"\22\16\22\u011e\13\22\3\23\3\23\3\23\7\23\u0123\n\23\f\23\16\23\u0126"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u0132\n"+
		"\25\f\25\16\25\u0135\13\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0141\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u014a\n"+
		"\27\f\27\16\27\u014d\13\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\6\30\u0156"+
		"\n\30\r\30\16\30\u0157\3\30\5\30\u015b\n\30\3\31\3\31\3\31\3\31\3\31\6"+
		"\31\u0162\n\31\r\31\16\31\u0163\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0177\n\33\f\33\16"+
		"\33\u017a\13\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u0182\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0192"+
		"\n\35\3\36\3\36\3\36\3\36\7\36\u0198\n\36\f\36\16\36\u019b\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a4\n\36\3\37\3\37\7\37\u01a8\n"+
		"\37\f\37\16\37\u01ab\13\37\3\37\5\37\u01ae\n\37\3 \3 \3 \3 \3!\3!\3!\3"+
		"!\7!\u01b8\n!\f!\16!\u01bb\13!\3!\3!\3!\3!\3!\7!\u01c2\n!\f!\16!\u01c5"+
		"\13!\3!\3!\5!\u01c9\n!\3\"\3\"\3\"\5\"\u01ce\n\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3%\5%\u01dd\n%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01f4\n&\5&\u01f6\n&\3&\3&\3&\3&\3&\3&\7"+
		"&\u01fe\n&\f&\16&\u0201\13&\3\'\3\'\3\'\3\'\3(\3(\3(\7(\u020a\n(\f(\16"+
		"(\u020d\13(\3(\3(\3(\3)\3)\5)\u0214\n)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3+\3,\3,\3,\2\3J-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTV\2\5\4\2\t\t((\3\2)*\4\2\16\16\62\65\2\u0238"+
		"\2X\3\2\2\2\4d\3\2\2\2\6y\3\2\2\2\b\177\3\2\2\2\n\u0081\3\2\2\2\f\u0094"+
		"\3\2\2\2\16\u00a4\3\2\2\2\20\u00a6\3\2\2\2\22\u00b1\3\2\2\2\24\u00b9\3"+
		"\2\2\2\26\u00c6\3\2\2\2\30\u00d2\3\2\2\2\32\u00df\3\2\2\2\34\u00f2\3\2"+
		"\2\2\36\u0102\3\2\2\2 \u0116\3\2\2\2\"\u0118\3\2\2\2$\u011f\3\2\2\2&\u0127"+
		"\3\2\2\2(\u012d\3\2\2\2*\u0140\3\2\2\2,\u0142\3\2\2\2.\u0152\3\2\2\2\60"+
		"\u015c\3\2\2\2\62\u0167\3\2\2\2\64\u0172\3\2\2\2\66\u0181\3\2\2\28\u0191"+
		"\3\2\2\2:\u01a3\3\2\2\2<\u01ad\3\2\2\2>\u01af\3\2\2\2@\u01c8\3\2\2\2B"+
		"\u01cd\3\2\2\2D\u01d1\3\2\2\2F\u01d6\3\2\2\2H\u01dc\3\2\2\2J\u01f5\3\2"+
		"\2\2L\u0202\3\2\2\2N\u0206\3\2\2\2P\u0213\3\2\2\2R\u0215\3\2\2\2T\u021b"+
		"\3\2\2\2V\u0221\3\2\2\2X^\5\6\4\2Y_\5\4\3\2Z_\5\n\6\2[_\5\32\16\2\\_\5"+
		"\60\31\2]_\5> \2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_`"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\2\2\3c\3\3\2\2\2de\7\3\2\2"+
		"ef\7;\2\2fg\7\4\2\2g\5\3\2\2\2hi\7\5\2\2io\7\6\2\2jk\5\b\5\2kl\7\7\2\2"+
		"ln\3\2\2\2mj\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\5\b\5\2st\7\b\2\2tz\3\2\2\2uv\7\5\2\2vw\7;\2\2wx\7\t\2\2xz\7;\2\2y"+
		"h\3\2\2\2yu\3\2\2\2z\7\3\2\2\2{|\7<\2\2|}\7\t\2\2}\u0080\7<\2\2~\u0080"+
		"\7<\2\2\177{\3\2\2\2\177~\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082\79\2\2\u0082"+
		"\u0083\7;\2\2\u0083\u0085\7\n\2\2\u0084\u0086\5\20\t\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008c\3\2\2\2\u0089\u008b\5\f\7\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\13\2\2\u0091\13\3\2"+
		"\2\2\u0092\u0095\5\16\b\2\u0093\u0095\5\22\n\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\r\3\2\2\2\u0096\u0097\7\f\2\2\u0097\u0098\7;\2\2"+
		"\u0098\u0099\7\r\2\2\u0099\u009a\5J&\2\u009a\u009b\5\f\7\2\u009b\u00a5"+
		"\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\7;\2\2\u009e\u009f\7\r\2\2\u009f"+
		"\u00a0\5J&\2\u00a0\u00a1\7\n\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\13"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u009c\3\2\2\2\u00a5"+
		"\17\3\2\2\2\u00a6\u00ab\7\16\2\2\u00a7\u00a8\7;\2\2\u00a8\u00aa\7\7\2"+
		"\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7;\2\2\u00af"+
		"\u00b0\7\4\2\2\u00b0\21\3\2\2\2\u00b1\u00b3\7;\2\2\u00b2\u00b4\5\24\13"+
		"\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8\23\3\2\2\2\u00b9"+
		"\u00ba\7\17\2\2\u00ba\u00bb\78\2\2\u00bb\u00c2\7\20\2\2\u00bc\u00be\7"+
		";\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c3\7:\2\2\u00c2\u00bd\3\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7\21\2\2\u00c5"+
		"\25\3\2\2\2\u00c6\u00cc\7\22\2\2\u00c7\u00c8\5\30\r\2\u00c8\u00c9\7\7"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d1\7\4\2\2\u00d1\27\3\2\2\2\u00d2\u00d3"+
		"\7;\2\2\u00d3\u00d8\7\23\2\2\u00d4\u00d5\7<\2\2\u00d5\u00d7\7\7\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7<\2\2\u00dc"+
		"\u00dd\7\23\2\2\u00dd\u00de\7;\2\2\u00de\31\3\2\2\2\u00df\u00e0\7\24\2"+
		"\2\u00e0\u00e1\7;\2\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3\7;\2\2\u00e3\u00e7"+
		"\7\n\2\2\u00e4\u00e6\5\34\17\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb\33\3\2\2\2\u00ec\u00f3\5B\"\2\u00ed"+
		"\u00f3\5\36\20\2\u00ee\u00f3\5(\25\2\u00ef\u00f3\5 \21\2\u00f0\u00f3\5"+
		"\22\n\2\u00f1\u00f3\5,\27\2\u00f2\u00ec\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\35\3\2\2\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\7;\2\2\u00f6\u00f7"+
		"\7\r\2\2\u00f7\u00f8\5J&\2\u00f8\u00f9\5\34\17\2\u00f9\u0103\3\2\2\2\u00fa"+
		"\u00fb\7\f\2\2\u00fb\u00fc\7;\2\2\u00fc\u00fd\7\r\2\2\u00fd\u00fe\5J&"+
		"\2\u00fe\u00ff\7\n\2\2\u00ff\u0100\5\34\17\2\u0100\u0101\7\13\2\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00f4\3\2\2\2\u0102\u00fa\3\2\2\2\u0103\37\3\2\2"+
		"\2\u0104\u0105\5&\24\2\u0105\u0106\7\26\2\2\u0106\u0107\5\"\22\2\u0107"+
		"\u010d\7\27\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7\27\2\2\u010a\u010c"+
		"\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5\""+
		"\22\2\u0111\u0112\7\4\2\2\u0112\u0117\3\2\2\2\u0113\u0114\5$\23\2\u0114"+
		"\u0115\7\4\2\2\u0115\u0117\3\2\2\2\u0116\u0104\3\2\2\2\u0116\u0113\3\2"+
		"\2\2\u0117!\3\2\2\2\u0118\u011c\5J&\2\u0119\u011b\5\24\13\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"#\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5&\24\2\u0120\u0124\7\30\2\2"+
		"\u0121\u0123\5\24\13\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125%\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0128\7\31\2\2\u0128\u0129\7;\2\2\u0129\u012a\7\7\2\2\u012a\u012b\7;"+
		"\2\2\u012b\u012c\7\32\2\2\u012c\'\3\2\2\2\u012d\u0133\7\33\2\2\u012e\u012f"+
		"\5*\26\2\u012f\u0130\7\7\2\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\5*\26\2\u0137\u0138\7\4\2\2\u0138"+
		")\3\2\2\2\u0139\u013a\7;\2\2\u013a\u013b\7\34\2\2\u013b\u0141\5J&\2\u013c"+
		"\u013d\5$\23\2\u013d\u013e\7\34\2\2\u013e\u013f\5J&\2\u013f\u0141\3\2"+
		"\2\2\u0140\u0139\3\2\2\2\u0140\u013c\3\2\2\2\u0141+\3\2\2\2\u0142\u0143"+
		"\7\35\2\2\u0143\u0144\7;\2\2\u0144\u0145\5J&\2\u0145\u014b\7\17\2\2\u0146"+
		"\u0147\5.\30\2\u0147\u0148\7\7\2\2\u0148\u014a\3\2\2\2\u0149\u0146\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\5.\30\2\u014f\u0150\7\21"+
		"\2\2\u0150\u0151\7\4\2\2\u0151-\3\2\2\2\u0152\u0153\7\67\2\2\u0153\u015a"+
		"\7\20\2\2\u0154\u0156\7;\2\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u015b\7:"+
		"\2\2\u015a\u0155\3\2\2\2\u015a\u0159\3\2\2\2\u015b/\3\2\2\2\u015c\u015d"+
		"\7\36\2\2\u015d\u015e\7;\2\2\u015e\u0161\7\n\2\2\u015f\u0162\5\62\32\2"+
		"\u0160\u0162\5\64\33\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\7\13\2\2\u0166\61\3\2\2\2\u0167\u0168\7\37\2\2\u0168\u0169\7;\2"+
		"\2\u0169\u016a\7\f\2\2\u016a\u016b\7;\2\2\u016b\u016c\7\34\2\2\u016c\u016d"+
		"\5J&\2\u016d\u016e\7\27\2\2\u016e\u016f\7 \2\2\u016f\u0170\5J&\2\u0170"+
		"\u0171\7\4\2\2\u0171\63\3\2\2\2\u0172\u0173\7!\2\2\u0173\u0174\7;\2\2"+
		"\u0174\u0178\7\n\2\2\u0175\u0177\5\66\34\2\u0176\u0175\3\2\2\2\u0177\u017a"+
		"\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a"+
		"\u0178\3\2\2\2\u017b\u017c\7\13\2\2\u017c\65\3\2\2\2\u017d\u0182\5\22"+
		"\n\2\u017e\u0182\58\35\2\u017f\u0182\5:\36\2\u0180\u0182\5B\"\2\u0181"+
		"\u017d\3\2\2\2\u0181\u017e\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0180\3\2"+
		"\2\2\u0182\67\3\2\2\2\u0183\u0184\7\f\2\2\u0184\u0185\7;\2\2\u0185\u0186"+
		"\7\r\2\2\u0186\u0187\5J&\2\u0187\u0188\5\66\34\2\u0188\u0192\3\2\2\2\u0189"+
		"\u018a\7\f\2\2\u018a\u018b\7;\2\2\u018b\u018c\7\r\2\2\u018c\u018d\5J&"+
		"\2\u018d\u018e\7\n\2\2\u018e\u018f\5\66\34\2\u018f\u0190\7\13\2\2\u0190"+
		"\u0192\3\2\2\2\u0191\u0183\3\2\2\2\u0191\u0189\3\2\2\2\u01929\3\2\2\2"+
		"\u0193\u0199\7\"\2\2\u0194\u0195\5<\37\2\u0195\u0196\7\7\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u0194\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\5<"+
		"\37\2\u019d\u019e\7\4\2\2\u019e\u01a4\3\2\2\2\u019f\u01a0\7\"\2\2\u01a0"+
		"\u01a4\7\4\2\2\u01a1\u01a2\7#\2\2\u01a2\u01a4\7\4\2\2\u01a3\u0193\3\2"+
		"\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4;\3\2\2\2\u01a5\u01a9"+
		"\7;\2\2\u01a6\u01a8\5\24\13\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2"+
		"\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ac\u01ae\5&\24\2\u01ad\u01a5\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"=\3\2\2\2\u01af\u01b0\7$\2\2\u01b0\u01b1\7;\2\2\u01b1\u01b2\7\4\2\2\u01b2"+
		"?\3\2\2\2\u01b3\u01b9\5V,\2\u01b4\u01b5\5L\'\2\u01b5\u01b6\7\7\2\2\u01b6"+
		"\u01b8\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\5L\'\2\u01bd\u01c9\3\2\2\2\u01be\u01c3\5V,\2\u01bf\u01c0\7;\2\2"+
		"\u01c0\u01c2\7\7\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\7;\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01b3\3\2\2\2\u01c8\u01be\3\2"+
		"\2\2\u01c9A\3\2\2\2\u01ca\u01ce\5J&\2\u01cb\u01ce\5@!\2\u01cc\u01ce\5"+
		"L\'\2\u01cd\u01ca\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01d0\7\4\2\2\u01d0C\3\2\2\2\u01d1\u01d2\7%\2\2\u01d2"+
		"\u01d3\5H%\2\u01d3\u01d4\7&\2\2\u01d4\u01d5\5J&\2\u01d5E\3\2\2\2\u01d6"+
		"\u01d7\7\'\2\2\u01d7\u01d8\5H%\2\u01d8\u01d9\7&\2\2\u01d9\u01da\5J&\2"+
		"\u01daG\3\2\2\2\u01db\u01dd\5J&\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\7\66\2\2\u01df\u01e0\5J&\2\u01e0"+
		"I\3\2\2\2\u01e1\u01e2\b&\1\2\u01e2\u01e3\t\2\2\2\u01e3\u01f6\5J&\f\u01e4"+
		"\u01e5\7+\2\2\u01e5\u01e6\7;\2\2\u01e6\u01f6\7,\2\2\u01e7\u01e8\7+\2\2"+
		"\u01e8\u01e9\5J&\2\u01e9\u01ea\7,\2\2\u01ea\u01f6\3\2\2\2\u01eb\u01f6"+
		"\5P)\2\u01ec\u01f6\5N(\2\u01ed\u01f6\7:\2\2\u01ee\u01f6\7;\2\2\u01ef\u01f3"+
		"\7-\2\2\u01f0\u01f1\7.\2\2\u01f1\u01f2\7=\2\2\u01f2\u01f4\7\21\2\2\u01f3"+
		"\u01f0\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01e1\3\2"+
		"\2\2\u01f5\u01e4\3\2\2\2\u01f5\u01e7\3\2\2\2\u01f5\u01eb\3\2\2\2\u01f5"+
		"\u01ec\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01ef\3\2"+
		"\2\2\u01f6\u01ff\3\2\2\2\u01f7\u01f8\f\13\2\2\u01f8\u01f9\t\3\2\2\u01f9"+
		"\u01fe\5J&\f\u01fa\u01fb\f\n\2\2\u01fb\u01fc\t\2\2\2\u01fc\u01fe\5J&\13"+
		"\u01fd\u01f7\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200K\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u0203\7;\2\2\u0203\u0204\7\20\2\2\u0204\u0205\5J&\2\u0205M\3\2\2\2\u0206"+
		"\u020b\7/\2\2\u0207\u0208\7;\2\2\u0208\u020a\7\7\2\2\u0209\u0207\3\2\2"+
		"\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e"+
		"\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u020f\7;\2\2\u020f\u0210\7\60\2\2\u0210"+
		"O\3\2\2\2\u0211\u0214\5R*\2\u0212\u0214\5T+\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0212\3\2\2\2\u0214Q\3\2\2\2\u0215\u0216\7+\2\2\u0216\u0217\7:\2\2\u0217"+
		"\u0218\7\7\2\2\u0218\u0219\7:\2\2\u0219\u021a\7,\2\2\u021aS\3\2\2\2\u021b"+
		"\u021c\7+\2\2\u021c\u021d\7:\2\2\u021d\u021e\7\61\2\2\u021e\u021f\7:\2"+
		"\2\u021f\u0220\7,\2\2\u0220U\3\2\2\2\u0221\u0222\t\4\2\2\u0222W\3\2\2"+
		"\2\61^`oy\177\u0087\u008c\u0094\u00a4\u00ab\u00b5\u00bf\u00c2\u00cc\u00d8"+
		"\u00e7\u00f2\u0102\u010d\u0116\u011c\u0124\u0133\u0140\u014b\u0157\u015a"+
		"\u0161\u0163\u0178\u0181\u0191\u0199\u01a3\u01a9\u01ad\u01b9\u01c3\u01c8"+
		"\u01cd\u01dc\u01f3\u01f5\u01fd\u01ff\u020b\u0213";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}