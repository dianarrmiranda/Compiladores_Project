// Generated from /home/jose/Desktop/LEI/2ºano/2ºSemestre/C/Práticas/c2023-adv-02/src/grammar/adv.g4 by ANTLR 4.9.2
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, Number=73, 
		ID=74, SYMBOL=75, STRING=76, WS=77, NEWLINE=78, SingleLineComment=79, 
		BlockComment=80, ERROR=81;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_importstat = 2, RULE_alphabetDef = 3, 
		RULE_alphabetElement = 4, RULE_automatonDef = 5, RULE_automatonNFADef = 6, 
		RULE_automatonDFADef = 7, RULE_automatonStat = 8, RULE_automatonFor = 9, 
		RULE_automatonWhile = 10, RULE_automatonIf = 11, RULE_stateDef = 12, RULE_propertiesDef = 13, 
		RULE_propertyElement = 14, RULE_transitionDef = 15, RULE_transitionElement = 16, 
		RULE_viewDef = 17, RULE_viewStat = 18, RULE_viewFor = 19, RULE_viewWhile = 20, 
		RULE_viewIf = 21, RULE_transitionRedefine = 22, RULE_transitionPoint = 23, 
		RULE_transitionLabelAlter = 24, RULE_transitionLabelAlterWithComma = 25, 
		RULE_transition = 26, RULE_placeDef = 27, RULE_placeElement = 28, RULE_gridDef = 29, 
		RULE_gridOptions = 30, RULE_animationDef = 31, RULE_viewportDef = 32, 
		RULE_viewportOn = 33, RULE_viewportStat = 34, RULE_viewportWhile = 35, 
		RULE_viewportIf = 36, RULE_viewportFor = 37, RULE_viewportInstructions = 38, 
		RULE_viewportInstructionsShowElement = 39, RULE_playDef = 40, RULE_decl = 41, 
		RULE_algebricOP = 42, RULE_expr = 43, RULE_assign = 44, RULE_list = 45, 
		RULE_point = 46, RULE_pointRect = 47, RULE_pointPol = 48, RULE_type = 49, 
		RULE_gridProperties = 50, RULE_propertiesKeys = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "importstat", "alphabetDef", "alphabetElement", "automatonDef", 
			"automatonNFADef", "automatonDFADef", "automatonStat", "automatonFor", 
			"automatonWhile", "automatonIf", "stateDef", "propertiesDef", "propertyElement", 
			"transitionDef", "transitionElement", "viewDef", "viewStat", "viewFor", 
			"viewWhile", "viewIf", "transitionRedefine", "transitionPoint", "transitionLabelAlter", 
			"transitionLabelAlterWithComma", "transition", "placeDef", "placeElement", 
			"gridDef", "gridOptions", "animationDef", "viewportDef", "viewportOn", 
			"viewportStat", "viewportWhile", "viewportIf", "viewportFor", "viewportInstructions", 
			"viewportInstructionsShowElement", "playDef", "decl", "algebricOP", "expr", 
			"assign", "list", "point", "pointRect", "pointPol", "type", "gridProperties", 
			"propertiesKeys"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "';'", "'alphabet'", "'{'", "','", "'}'", "'-'", "'NFA'", 
			"'<<<'", "'>>>'", "'complete'", "'DFA'", "'for'", "'in'", "'while'", 
			"'do'", "'if'", "'state'", "'['", "'='", "']'", "'transition'", "'->'", 
			"'view'", "'of'", "'as'", "'--'", "'#label'", "'<'", "'>'", "'place'", 
			"'at'", "'grid'", "'animation'", "'viewport'", "'++'", "'on'", "'show'", 
			"'pause'", "'play'", "'+'", "'not'", "'*'", "'/'", "'%'", "'>='", "'<='", 
			"'=='", "'!='", "'and'", "'or'", "'('", "')'", "'read'", "'[prompt='", 
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
			null, "Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", "SingleLineComment", 
			"BlockComment", "ERROR"
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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
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
			setState(104);
			alphabetDef();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__23) | (1L << T__33) | (1L << T__39))) != 0)) {
				{
				{
				setState(105);
				stat();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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

	public static class StatContext extends ParserRuleContext {
		public ImportstatContext importstat() {
			return getRuleContext(ImportstatContext.class,0);
		}
		public AutomatonDefContext automatonDef() {
			return getRuleContext(AutomatonDefContext.class,0);
		}
		public ViewDefContext viewDef() {
			return getRuleContext(ViewDefContext.class,0);
		}
		public AnimationDefContext animationDef() {
			return getRuleContext(AnimationDefContext.class,0);
		}
		public PlayDefContext playDef() {
			return getRuleContext(PlayDefContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(113);
				importstat();
				}
				break;
			case T__7:
			case T__10:
			case T__11:
				{
				setState(114);
				automatonDef();
				}
				break;
			case T__23:
				{
				setState(115);
				viewDef();
				}
				break;
			case T__33:
				{
				setState(116);
				animationDef();
				}
				break;
			case T__39:
				{
				setState(117);
				playDef();
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

	public static class ImportstatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ImportstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importstat; }
	}

	public final ImportstatContext importstat() throws RecognitionException {
		ImportstatContext _localctx = new ImportstatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__0);
			setState(121);
			match(ID);
			setState(122);
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
		enterRule(_localctx, 6, RULE_alphabetDef);
		try {
			int _alt;
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__2);
				setState(125);
				match(T__3);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						alphabetElement();
						setState(127);
						match(T__4);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(134);
				alphabetElement();
				setState(135);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__2);
				setState(138);
				match(ID);
				setState(139);
				match(T__6);
				setState(140);
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
		enterRule(_localctx, 8, RULE_alphabetElement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(SYMBOL);
				setState(144);
				match(T__6);
				setState(145);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		public AutomatonNFADefContext automatonNFADef() {
			return getRuleContext(AutomatonNFADefContext.class,0);
		}
		public AutomatonDFADefContext automatonDFADef() {
			return getRuleContext(AutomatonDFADefContext.class,0);
		}
		public AutomatonDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonDef; }
	}

	public final AutomatonDefContext automatonDef() throws RecognitionException {
		AutomatonDefContext _localctx = new AutomatonDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_automatonDef);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				automatonNFADef();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				automatonDFADef();
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

	public static class AutomatonNFADefContext extends ParserRuleContext {
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
		public AutomatonNFADefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonNFADef; }
	}

	public final AutomatonNFADefContext automatonNFADef() throws RecognitionException {
		AutomatonNFADefContext _localctx = new AutomatonNFADefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonNFADef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__7);
			setState(154);
			match(ID);
			setState(155);
			match(T__8);
			setState(157); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(156);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(162); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(161);
				automatonStat();
				}
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
			setState(166);
			transitionDef();
			setState(167);
			match(T__9);
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

	public static class AutomatonDFADefContext extends ParserRuleContext {
		public Token complete;
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
		public AutomatonDFADefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonDFADef; }
	}

	public final AutomatonDFADefContext automatonDFADef() throws RecognitionException {
		AutomatonDFADefContext _localctx = new AutomatonDFADefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_automatonDFADef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(169);
				((AutomatonDFADefContext)_localctx).complete = match(T__10);
				}
			}

			setState(172);
			match(T__11);
			setState(173);
			match(ID);
			setState(174);
			match(T__8);
			setState(176); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(175);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				automatonStat();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
			setState(185);
			transitionDef();
			setState(186);
			match(T__9);
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
		public AutomatonIfContext automatonIf() {
			return getRuleContext(AutomatonIfContext.class,0);
		}
		public AutomatonWhileContext automatonWhile() {
			return getRuleContext(AutomatonWhileContext.class,0);
		}
		public PropertiesDefContext propertiesDef() {
			return getRuleContext(PropertiesDefContext.class,0);
		}
		public AlgebricOPContext algebricOP() {
			return getRuleContext(AlgebricOPContext.class,0);
		}
		public AutomatonStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonStat; }
	}

	public final AutomatonStatContext automatonStat() throws RecognitionException {
		AutomatonStatContext _localctx = new AutomatonStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_automatonStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(188);
				automatonFor();
				}
				break;
			case 2:
				{
				setState(189);
				automatonIf();
				}
				break;
			case 3:
				{
				setState(190);
				automatonWhile();
				}
				break;
			case 4:
				{
				setState(191);
				propertiesDef();
				}
				break;
			case 5:
				{
				setState(192);
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

	public static class AutomatonForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AutomatonStatContext> automatonStat() {
			return getRuleContexts(AutomatonStatContext.class);
		}
		public AutomatonStatContext automatonStat(int i) {
			return getRuleContext(AutomatonStatContext.class,i);
		}
		public AutomatonForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonFor; }
	}

	public final AutomatonForContext automatonFor() throws RecognitionException {
		AutomatonForContext _localctx = new AutomatonForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_automatonFor);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__12);
				setState(196);
				match(ID);
				setState(197);
				match(T__13);
				setState(198);
				expr(0);
				setState(199);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(T__12);
				setState(202);
				match(ID);
				setState(203);
				match(T__13);
				setState(204);
				expr(0);
				setState(205);
				match(T__8);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206);
					automatonStat();
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(211);
				match(T__9);
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

	public static class AutomatonWhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AutomatonStatContext> automatonStat() {
			return getRuleContexts(AutomatonStatContext.class);
		}
		public AutomatonStatContext automatonStat(int i) {
			return getRuleContext(AutomatonStatContext.class,i);
		}
		public AutomatonWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonWhile; }
	}

	public final AutomatonWhileContext automatonWhile() throws RecognitionException {
		AutomatonWhileContext _localctx = new AutomatonWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_automatonWhile);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__14);
				setState(216);
				expr(0);
				setState(217);
				match(T__15);
				setState(218);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__14);
				setState(221);
				expr(0);
				setState(222);
				match(T__15);
				setState(223);
				match(T__8);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					automatonStat();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(229);
				match(T__9);
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

	public static class AutomatonIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<AutomatonStatContext> automatonStat() {
			return getRuleContexts(AutomatonStatContext.class);
		}
		public AutomatonStatContext automatonStat(int i) {
			return getRuleContext(AutomatonStatContext.class,i);
		}
		public AutomatonIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonIf; }
	}

	public final AutomatonIfContext automatonIf() throws RecognitionException {
		AutomatonIfContext _localctx = new AutomatonIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_automatonIf);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__16);
				setState(234);
				expr(0);
				setState(235);
				match(T__15);
				setState(236);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__16);
				setState(239);
				expr(0);
				setState(240);
				match(T__15);
				setState(241);
				match(T__8);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242);
					automatonStat();
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(247);
				match(T__9);
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
		enterRule(_localctx, 24, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__17);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
					match(ID);
					setState(253);
					match(T__4);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(259);
			match(ID);
			setState(260);
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
		enterRule(_localctx, 26, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(ID);
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				propertyElement();
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(268);
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
		public PropertiesKeysContext propertiesKeys() {
			return getRuleContext(PropertiesKeysContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__18);
			setState(271);
			propertiesKeys();
			setState(272);
			match(T__19);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					match(ID);
					}
					}
					setState(276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(278);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			match(T__20);
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
		enterRule(_localctx, 30, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(T__21);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(284);
					transitionElement();
					setState(285);
					match(T__4);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(292);
			transitionElement();
			setState(293);
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
		enterRule(_localctx, 32, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(ID);
			setState(296);
			match(T__22);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(297);
					match(SYMBOL);
					setState(298);
					match(T__4);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(304);
			match(SYMBOL);
			setState(305);
			match(T__22);
			setState(306);
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
		enterRule(_localctx, 34, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__23);
			setState(309);
			match(ID);
			setState(310);
			match(T__24);
			setState(311);
			match(ID);
			setState(312);
			match(T__8);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID) {
				{
				{
				setState(313);
				viewStat();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__9);
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
		public TransitionLabelAlterWithCommaContext transitionLabelAlterWithComma() {
			return getRuleContext(TransitionLabelAlterWithCommaContext.class,0);
		}
		public GridDefContext gridDef() {
			return getRuleContext(GridDefContext.class,0);
		}
		public ViewIfContext viewIf() {
			return getRuleContext(ViewIfContext.class,0);
		}
		public ViewWhileContext viewWhile() {
			return getRuleContext(ViewWhileContext.class,0);
		}
		public ViewStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewStat; }
	}

	public final ViewStatContext viewStat() throws RecognitionException {
		ViewStatContext _localctx = new ViewStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(321);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(322);
				viewFor();
				}
				break;
			case 3:
				{
				setState(323);
				placeDef();
				}
				break;
			case 4:
				{
				setState(324);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(325);
				transitionLabelAlterWithComma();
				}
				break;
			case 6:
				{
				setState(326);
				gridDef();
				}
				break;
			case 7:
				{
				setState(327);
				viewIf();
				}
				break;
			case 8:
				{
				setState(328);
				viewWhile();
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
		public List<ViewStatContext> viewStat() {
			return getRuleContexts(ViewStatContext.class);
		}
		public ViewStatContext viewStat(int i) {
			return getRuleContext(ViewStatContext.class,i);
		}
		public ViewForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewFor; }
	}

	public final ViewForContext viewFor() throws RecognitionException {
		ViewForContext _localctx = new ViewForContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_viewFor);
		int _la;
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__12);
				setState(332);
				match(ID);
				setState(333);
				match(T__13);
				setState(334);
				expr(0);
				setState(335);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(T__12);
				setState(338);
				match(ID);
				setState(339);
				match(T__13);
				setState(340);
				expr(0);
				setState(341);
				match(T__8);
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(342);
					viewStat();
					}
					}
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(347);
				match(T__9);
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

	public static class ViewWhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ViewStatContext> viewStat() {
			return getRuleContexts(ViewStatContext.class);
		}
		public ViewStatContext viewStat(int i) {
			return getRuleContext(ViewStatContext.class,i);
		}
		public ViewWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewWhile; }
	}

	public final ViewWhileContext viewWhile() throws RecognitionException {
		ViewWhileContext _localctx = new ViewWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_viewWhile);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__14);
				setState(352);
				expr(0);
				setState(353);
				match(T__15);
				setState(354);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(T__14);
				setState(357);
				expr(0);
				setState(358);
				match(T__15);
				setState(359);
				match(T__8);
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					viewStat();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(365);
				match(T__9);
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

	public static class ViewIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ViewStatContext> viewStat() {
			return getRuleContexts(ViewStatContext.class);
		}
		public ViewStatContext viewStat(int i) {
			return getRuleContext(ViewStatContext.class,i);
		}
		public ViewIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewIf; }
	}

	public final ViewIfContext viewIf() throws RecognitionException {
		ViewIfContext _localctx = new ViewIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_viewIf);
		int _la;
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(T__16);
				setState(370);
				expr(0);
				setState(371);
				match(T__15);
				setState(372);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(T__16);
				setState(375);
				expr(0);
				setState(376);
				match(T__15);
				setState(377);
				match(T__8);
				setState(379); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(378);
					viewStat();
					}
					}
					setState(381); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(383);
				match(T__9);
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
		public TransitionRedefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionRedefine; }
	}

	public final TransitionRedefineContext transitionRedefine() throws RecognitionException {
		TransitionRedefineContext _localctx = new TransitionRedefineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_transitionRedefine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			transition();
			setState(388);
			match(T__25);
			setState(389);
			transitionPoint();
			setState(390);
			match(T__26);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(391);
					transitionPoint();
					setState(392);
					match(T__26);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(399);
			transitionPoint();
			setState(400);
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
		enterRule(_localctx, 46, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			expr(0);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(403);
				propertyElement();
				}
				}
				setState(408);
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
		enterRule(_localctx, 48, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			transition();
			setState(410);
			match(T__27);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(411);
				propertyElement();
				}
				}
				setState(416);
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

	public static class TransitionLabelAlterWithCommaContext extends ParserRuleContext {
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public TransitionLabelAlterWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionLabelAlterWithComma; }
	}

	public final TransitionLabelAlterWithCommaContext transitionLabelAlterWithComma() throws RecognitionException {
		TransitionLabelAlterWithCommaContext _localctx = new TransitionLabelAlterWithCommaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_transitionLabelAlterWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			transitionLabelAlter();
			setState(418);
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
		enterRule(_localctx, 52, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(T__28);
			setState(421);
			match(ID);
			setState(422);
			match(T__4);
			setState(423);
			match(ID);
			setState(424);
			match(T__29);
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
		enterRule(_localctx, 54, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__30);
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(427);
					placeElement();
					setState(428);
					match(T__4);
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(435);
			placeElement();
			setState(436);
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
		public PlaceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeElement; }
	 
		public PlaceElementContext() { }
		public void copyFrom(PlaceElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransitionplaceElementContext extends PlaceElementContext {
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TransitionplaceElementContext(PlaceElementContext ctx) { copyFrom(ctx); }
	}
	public static class IDplaceElementContext extends PlaceElementContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IDplaceElementContext(PlaceElementContext ctx) { copyFrom(ctx); }
	}

	public final PlaceElementContext placeElement() throws RecognitionException {
		PlaceElementContext _localctx = new PlaceElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_placeElement);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IDplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(ID);
				setState(439);
				match(T__31);
				setState(440);
				expr(0);
				}
				break;
			case T__28:
				_localctx = new TransitionplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(441);
				transitionLabelAlter();
				setState(442);
				match(T__31);
				setState(443);
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
		enterRule(_localctx, 58, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__32);
			setState(448);
			match(ID);
			setState(449);
			expr(0);
			setState(450);
			match(T__18);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					gridOptions();
					setState(452);
					match(T__4);
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(459);
			gridOptions();
			setState(460);
			match(T__20);
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

	public static class GridOptionsContext extends ParserRuleContext {
		public GridPropertiesContext gridProperties() {
			return getRuleContext(GridPropertiesContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			gridProperties();
			setState(464);
			match(T__19);
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(465);
					match(ID);
					}
					}
					setState(468); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(470);
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
		enterRule(_localctx, 62, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(T__33);
			setState(474);
			match(ID);
			setState(475);
			match(T__8);
			setState(478); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(478);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(476);
					viewportDef();
					}
					break;
				case T__36:
					{
					setState(477);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 || _la==T__36 );
			setState(482);
			match(T__9);
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
		enterRule(_localctx, 64, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__34);
			setState(485);
			match(ID);
			setState(486);
			match(T__12);
			setState(487);
			match(ID);
			setState(488);
			match(T__31);
			setState(489);
			expr(0);
			setState(490);
			match(T__26);
			setState(491);
			match(T__35);
			setState(492);
			expr(0);
			setState(493);
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
		enterRule(_localctx, 66, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__36);
			setState(496);
			match(ID);
			setState(497);
			match(T__8);
			setState(499); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(498);
				viewportStat();
				}
				}
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
			setState(503);
			match(T__9);
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
		public ViewportIfContext viewportIf() {
			return getRuleContext(ViewportIfContext.class,0);
		}
		public ViewportWhileContext viewportWhile() {
			return getRuleContext(ViewportWhileContext.class,0);
		}
		public ViewportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStat; }
	}

	public final ViewportStatContext viewportStat() throws RecognitionException {
		ViewportStatContext _localctx = new ViewportStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(505);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(506);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(507);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(508);
				algebricOP();
				}
				break;
			case 5:
				{
				setState(509);
				viewportIf();
				}
				break;
			case 6:
				{
				setState(510);
				viewportWhile();
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

	public static class ViewportWhileContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ViewportStatContext> viewportStat() {
			return getRuleContexts(ViewportStatContext.class);
		}
		public ViewportStatContext viewportStat(int i) {
			return getRuleContext(ViewportStatContext.class,i);
		}
		public ViewportWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportWhile; }
	}

	public final ViewportWhileContext viewportWhile() throws RecognitionException {
		ViewportWhileContext _localctx = new ViewportWhileContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_viewportWhile);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(T__14);
				setState(514);
				expr(0);
				setState(515);
				match(T__15);
				setState(516);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(T__14);
				setState(519);
				expr(0);
				setState(520);
				match(T__15);
				setState(521);
				match(T__8);
				setState(523); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(522);
					viewportStat();
					}
					}
					setState(525); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(527);
				match(T__9);
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

	public static class ViewportIfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ViewportStatContext> viewportStat() {
			return getRuleContexts(ViewportStatContext.class);
		}
		public ViewportStatContext viewportStat(int i) {
			return getRuleContext(ViewportStatContext.class,i);
		}
		public ViewportIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportIf; }
	}

	public final ViewportIfContext viewportIf() throws RecognitionException {
		ViewportIfContext _localctx = new ViewportIfContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_viewportIf);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(T__16);
				setState(532);
				expr(0);
				setState(533);
				match(T__15);
				setState(534);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				match(T__16);
				setState(537);
				expr(0);
				setState(538);
				match(T__15);
				setState(539);
				match(T__8);
				setState(541); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(540);
					viewportStat();
					}
					}
					setState(543); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(545);
				match(T__9);
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

	public static class ViewportForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ViewportStatContext> viewportStat() {
			return getRuleContexts(ViewportStatContext.class);
		}
		public ViewportStatContext viewportStat(int i) {
			return getRuleContext(ViewportStatContext.class,i);
		}
		public ViewportForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportFor; }
	}

	public final ViewportForContext viewportFor() throws RecognitionException {
		ViewportForContext _localctx = new ViewportForContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_viewportFor);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(T__12);
				setState(550);
				match(ID);
				setState(551);
				match(T__13);
				setState(552);
				expr(0);
				setState(553);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(T__12);
				setState(556);
				match(ID);
				setState(557);
				match(T__13);
				setState(558);
				expr(0);
				setState(559);
				match(T__8);
				setState(561); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(560);
					viewportStat();
					}
					}
					setState(563); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__51) | (1L << T__53) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || _la==Number || _la==ID );
				setState(565);
				match(T__9);
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
		enterRule(_localctx, 76, RULE_viewportInstructions);
		try {
			int _alt;
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(T__37);
				setState(575);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(570);
						viewportInstructionsShowElement();
						setState(571);
						match(T__4);
						}
						} 
					}
					setState(577);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(578);
				viewportInstructionsShowElement();
				setState(579);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(T__37);
				setState(582);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(583);
				match(T__38);
				setState(584);
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
		enterRule(_localctx, 78, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				match(ID);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(588);
					propertyElement();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
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
		enterRule(_localctx, 80, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(T__39);
			setState(598);
			match(ID);
			setState(599);
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
		enterRule(_localctx, 82, RULE_decl);
		try {
			int _alt;
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601);
				type();
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(602);
						assign();
						setState(603);
						match(T__4);
						}
						} 
					}
					setState(609);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				setState(610);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				type();
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(ID);
						setState(614);
						match(T__4);
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(620);
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
		enterRule(_localctx, 84, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(624);
				expr(0);
				}
				break;
			case 2:
				{
				setState(625);
				decl();
				}
				break;
			case 3:
				{
				setState(626);
				assign();
				}
				break;
			}
			setState(629);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class IDExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public IDExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PointExprContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PointExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParanthesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParanthesisIDExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ParanthesisIDExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumberExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(advParser.Number, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ReadExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(advParser.STRING, 0); }
		public ReadExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CompareExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ListExprContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(632);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__40) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(633);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(T__41);
				setState(635);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new ParanthesisIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(T__51);
				setState(637);
				match(ID);
				setState(638);
				match(T__52);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				match(T__51);
				setState(640);
				expr(0);
				setState(641);
				match(T__52);
				}
				break;
			case 5:
				{
				_localctx = new PointExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				list();
				}
				break;
			case 7:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(645);
				match(Number);
				}
				break;
			case 8:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(646);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(647);
				match(T__53);
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(648);
					match(T__54);
					setState(649);
					match(STRING);
					setState(650);
					match(T__20);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(673);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(655);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(656);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(657);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(658);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(659);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__40) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(660);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(661);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(662);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__45) | (1L << T__46))) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(663);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(664);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(665);
						((EqualsExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
							((EqualsExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(666);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(667);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(668);
						match(T__49);
						setState(669);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(670);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(671);
						match(T__50);
						setState(672);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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
		enterRule(_localctx, 88, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(ID);
			setState(679);
			match(T__19);
			setState(680);
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
		enterRule(_localctx, 90, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__55);
			setState(687);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(683);
					match(ID);
					setState(684);
					match(T__4);
					}
					} 
				}
				setState(689);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(690);
			match(ID);
			setState(691);
			match(T__56);
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
		enterRule(_localctx, 92, RULE_point);
		try {
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointRectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointRect; }
	}

	public final PointRectContext pointRect() throws RecognitionException {
		PointRectContext _localctx = new PointRectContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(T__51);
			setState(698);
			expr(0);
			setState(699);
			match(T__4);
			setState(700);
			expr(0);
			setState(701);
			match(T__52);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PointPolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointPol; }
	}

	public final PointPolContext pointPol() throws RecognitionException {
		PointPolContext _localctx = new PointPolContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__51);
			setState(704);
			expr(0);
			setState(705);
			match(T__57);
			setState(706);
			expr(0);
			setState(707);
			match(T__52);
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
		public Token t;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
				((TypeContext)_localctx).t = (Token)_errHandler.recoverInline(this);
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

	public static class GridPropertiesContext extends ParserRuleContext {
		public Token prop;
		public GridPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridProperties; }
	}

	public final GridPropertiesContext gridProperties() throws RecognitionException {
		GridPropertiesContext _localctx = new GridPropertiesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			((GridPropertiesContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)))) != 0)) ) {
				((GridPropertiesContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
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

	public static class PropertiesKeysContext extends ParserRuleContext {
		public Token prop;
		public PropertiesKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesKeys; }
	}

	public final PropertiesKeysContext propertiesKeys() throws RecognitionException {
		PropertiesKeysContext _localctx = new PropertiesKeysContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			((PropertiesKeysContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__69 - 68)) | (1L << (T__70 - 68)) | (1L << (T__71 - 68)))) != 0)) ) {
				((PropertiesKeysContext)_localctx).prop = (Token)_errHandler.recoverInline(this);
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
		case 43:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u02ce\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\7\2m\n\2\f\2\16\2p\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3y\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16"+
		"\5\u0087\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3\6\3"+
		"\6\5\6\u0096\n\6\3\7\3\7\5\7\u009a\n\7\3\b\3\b\3\b\3\b\6\b\u00a0\n\b\r"+
		"\b\16\b\u00a1\3\b\6\b\u00a5\n\b\r\b\16\b\u00a6\3\b\3\b\3\b\3\t\5\t\u00ad"+
		"\n\t\3\t\3\t\3\t\3\t\6\t\u00b3\n\t\r\t\16\t\u00b4\3\t\6\t\u00b8\n\t\r"+
		"\t\16\t\u00b9\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00d2\n\13\r\13"+
		"\16\13\u00d3\3\13\3\13\5\13\u00d8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\6\f\u00e4\n\f\r\f\16\f\u00e5\3\f\3\f\5\f\u00ea\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00f6\n\r\r\r\16\r\u00f7\3\r\3\r\5"+
		"\r\u00fc\n\r\3\16\3\16\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13\16\3\16"+
		"\3\16\3\16\3\17\3\17\6\17\u010b\n\17\r\17\16\17\u010c\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\6\20\u0115\n\20\r\20\16\20\u0116\3\20\5\20\u011a\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\7\21\u0122\n\21\f\21\16\21\u0125\13\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u012e\n\22\f\22\16\22\u0131\13"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u013d\n\23"+
		"\f\23\16\23\u0140\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u014c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\6\25\u015a\n\25\r\25\16\25\u015b\3\25\3\25\5\25\u0160\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u016c\n\26\r\26"+
		"\16\26\u016d\3\26\3\26\5\26\u0172\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\6\27\u017e\n\27\r\27\16\27\u017f\3\27\3\27\5\27\u0184"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u018d\n\30\f\30\16\30\u0190"+
		"\13\30\3\30\3\30\3\30\3\31\3\31\7\31\u0197\n\31\f\31\16\31\u019a\13\31"+
		"\3\32\3\32\3\32\7\32\u019f\n\32\f\32\16\32\u01a2\13\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u01b1\n\35\f\35"+
		"\16\35\u01b4\13\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5"+
		"\36\u01c0\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01c9\n\37\f\37"+
		"\16\37\u01cc\13\37\3\37\3\37\3\37\3\37\3 \3 \3 \6 \u01d5\n \r \16 \u01d6"+
		"\3 \5 \u01da\n \3!\3!\3!\3!\3!\6!\u01e1\n!\r!\16!\u01e2\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\6#\u01f6\n#\r#\16#\u01f7"+
		"\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0202\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%"+
		"\u020e\n%\r%\16%\u020f\3%\3%\5%\u0214\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\6&\u0220\n&\r&\16&\u0221\3&\3&\5&\u0226\n&\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\6\'\u0234\n\'\r\'\16\'\u0235\3\'\3\'\5\'\u023a"+
		"\n\'\3(\3(\3(\3(\7(\u0240\n(\f(\16(\u0243\13(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u024c\n(\3)\3)\7)\u0250\n)\f)\16)\u0253\13)\3)\5)\u0256\n)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\7+\u0260\n+\f+\16+\u0263\13+\3+\3+\3+\3+\3+\7+\u026a\n+"+
		"\f+\16+\u026d\13+\3+\3+\5+\u0271\n+\3,\3,\3,\5,\u0276\n,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u028e\n-\5-\u0290"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u02a4\n-"+
		"\f-\16-\u02a7\13-\3.\3.\3.\3.\3/\3/\3/\7/\u02b0\n/\f/\16/\u02b3\13/\3"+
		"/\3/\3/\3\60\3\60\5\60\u02ba\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\2\3X\66\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfh\2\t\4\2\t\t++\3\2-/\4\2\37 \60\61\3\2\62\63\4\2\24\24=A"+
		"\3\2BE\3\2FJ\2\u02f6\2j\3\2\2\2\4x\3\2\2\2\6z\3\2\2\2\b\u008f\3\2\2\2"+
		"\n\u0095\3\2\2\2\f\u0099\3\2\2\2\16\u009b\3\2\2\2\20\u00ac\3\2\2\2\22"+
		"\u00c3\3\2\2\2\24\u00d7\3\2\2\2\26\u00e9\3\2\2\2\30\u00fb\3\2\2\2\32\u00fd"+
		"\3\2\2\2\34\u0108\3\2\2\2\36\u0110\3\2\2\2 \u011d\3\2\2\2\"\u0129\3\2"+
		"\2\2$\u0136\3\2\2\2&\u014b\3\2\2\2(\u015f\3\2\2\2*\u0171\3\2\2\2,\u0183"+
		"\3\2\2\2.\u0185\3\2\2\2\60\u0194\3\2\2\2\62\u019b\3\2\2\2\64\u01a3\3\2"+
		"\2\2\66\u01a6\3\2\2\28\u01ac\3\2\2\2:\u01bf\3\2\2\2<\u01c1\3\2\2\2>\u01d1"+
		"\3\2\2\2@\u01db\3\2\2\2B\u01e6\3\2\2\2D\u01f1\3\2\2\2F\u0201\3\2\2\2H"+
		"\u0213\3\2\2\2J\u0225\3\2\2\2L\u0239\3\2\2\2N\u024b\3\2\2\2P\u0255\3\2"+
		"\2\2R\u0257\3\2\2\2T\u0270\3\2\2\2V\u0275\3\2\2\2X\u028f\3\2\2\2Z\u02a8"+
		"\3\2\2\2\\\u02ac\3\2\2\2^\u02b9\3\2\2\2`\u02bb\3\2\2\2b\u02c1\3\2\2\2"+
		"d\u02c7\3\2\2\2f\u02c9\3\2\2\2h\u02cb\3\2\2\2jn\5\b\5\2km\5\4\3\2lk\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\2\2\3r\3"+
		"\3\2\2\2sy\5\6\4\2ty\5\f\7\2uy\5$\23\2vy\5@!\2wy\5R*\2xs\3\2\2\2xt\3\2"+
		"\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\5\3\2\2\2z{\7\3\2\2{|\7L\2\2|}\7\4"+
		"\2\2}\7\3\2\2\2~\177\7\5\2\2\177\u0085\7\6\2\2\u0080\u0081\5\n\6\2\u0081"+
		"\u0082\7\7\2\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\b\2\2\u008a\u0090\3\2"+
		"\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7L\2\2\u008d\u008e\7\t\2\2\u008e"+
		"\u0090\7L\2\2\u008f~\3\2\2\2\u008f\u008b\3\2\2\2\u0090\t\3\2\2\2\u0091"+
		"\u0092\7M\2\2\u0092\u0093\7\t\2\2\u0093\u0096\7M\2\2\u0094\u0096\7M\2"+
		"\2\u0095\u0091\3\2\2\2\u0095\u0094\3\2\2\2\u0096\13\3\2\2\2\u0097\u009a"+
		"\5\16\b\2\u0098\u009a\5\20\t\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2"+
		"\u009a\r\3\2\2\2\u009b\u009c\7\n\2\2\u009c\u009d\7L\2\2\u009d\u009f\7"+
		"\13\2\2\u009e\u00a0\5\32\16\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5"+
		"\5\22\n\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa"+
		"\7\f\2\2\u00aa\17\3\2\2\2\u00ab\u00ad\7\r\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\7"+
		"L\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00b3\5\32\16\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b8\5\22\n\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5 "+
		"\21\2\u00bc\u00bd\7\f\2\2\u00bd\21\3\2\2\2\u00be\u00c4\5\24\13\2\u00bf"+
		"\u00c4\5\30\r\2\u00c0\u00c4\5\26\f\2\u00c1\u00c4\5\34\17\2\u00c2\u00c4"+
		"\5V,\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\7\17\2"+
		"\2\u00c6\u00c7\7L\2\2\u00c7\u00c8\7\20\2\2\u00c8\u00c9\5X-\2\u00c9\u00ca"+
		"\5\22\n\2\u00ca\u00d8\3\2\2\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\7L\2\2"+
		"\u00cd\u00ce\7\20\2\2\u00ce\u00cf\5X-\2\u00cf\u00d1\7\13\2\2\u00d0\u00d2"+
		"\5\22\n\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2"+
		"\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00c5\3\2\2\2\u00d7\u00cb\3\2\2\2\u00d8\25\3\2\2\2\u00d9"+
		"\u00da\7\21\2\2\u00da\u00db\5X-\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\5\22"+
		"\n\2\u00dd\u00ea\3\2\2\2\u00de\u00df\7\21\2\2\u00df\u00e0\5X-\2\u00e0"+
		"\u00e1\7\22\2\2\u00e1\u00e3\7\13\2\2\u00e2\u00e4\5\22\n\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00d9\3\2"+
		"\2\2\u00e9\u00de\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed"+
		"\5X-\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5\22\n\2\u00ef\u00fc\3\2\2\2\u00f0"+
		"\u00f1\7\23\2\2\u00f1\u00f2\5X-\2\u00f2\u00f3\7\22\2\2\u00f3\u00f5\7\13"+
		"\2\2\u00f4\u00f6\5\22\n\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\f"+
		"\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fc"+
		"\31\3\2\2\2\u00fd\u0102\7\24\2\2\u00fe\u00ff\7L\2\2\u00ff\u0101\7\7\2"+
		"\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7L\2\2\u0106"+
		"\u0107\7\4\2\2\u0107\33\3\2\2\2\u0108\u010a\7L\2\2\u0109\u010b\5\36\20"+
		"\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\4\2\2\u010f\35\3\2\2\2\u0110"+
		"\u0111\7\25\2\2\u0111\u0112\5h\65\2\u0112\u0119\7\26\2\2\u0113\u0115\7"+
		"L\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u011a\7K\2\2\u0119\u0114\3\2"+
		"\2\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\27\2\2\u011c"+
		"\37\3\2\2\2\u011d\u0123\7\30\2\2\u011e\u011f\5\"\22\2\u011f\u0120\7\7"+
		"\2\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\5\"\22\2\u0127\u0128\7\4\2\2\u0128!\3\2\2\2\u0129\u012a"+
		"\7L\2\2\u012a\u012f\7\31\2\2\u012b\u012c\7M\2\2\u012c\u012e\7\7\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7M\2\2\u0133"+
		"\u0134\7\31\2\2\u0134\u0135\7L\2\2\u0135#\3\2\2\2\u0136\u0137\7\32\2\2"+
		"\u0137\u0138\7L\2\2\u0138\u0139\7\33\2\2\u0139\u013a\7L\2\2\u013a\u013e"+
		"\7\13\2\2\u013b\u013d\5&\24\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\7\f\2\2\u0142%\3\2\2\2\u0143\u014c\5V,\2\u0144\u014c"+
		"\5(\25\2\u0145\u014c\58\35\2\u0146\u014c\5.\30\2\u0147\u014c\5\64\33\2"+
		"\u0148\u014c\5<\37\2\u0149\u014c\5,\27\2\u014a\u014c\5*\26\2\u014b\u0143"+
		"\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b"+
		"\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\'\3\2\2\2\u014d\u014e\7\17\2\2\u014e\u014f\7L\2\2\u014f\u0150"+
		"\7\20\2\2\u0150\u0151\5X-\2\u0151\u0152\5&\24\2\u0152\u0160\3\2\2\2\u0153"+
		"\u0154\7\17\2\2\u0154\u0155\7L\2\2\u0155\u0156\7\20\2\2\u0156\u0157\5"+
		"X-\2\u0157\u0159\7\13\2\2\u0158\u015a\5&\24\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\7\f\2\2\u015e\u0160\3\2\2\2\u015f\u014d\3\2\2\2\u015f"+
		"\u0153\3\2\2\2\u0160)\3\2\2\2\u0161\u0162\7\21\2\2\u0162\u0163\5X-\2\u0163"+
		"\u0164\7\22\2\2\u0164\u0165\5&\24\2\u0165\u0172\3\2\2\2\u0166\u0167\7"+
		"\21\2\2\u0167\u0168\5X-\2\u0168\u0169\7\22\2\2\u0169\u016b\7\13\2\2\u016a"+
		"\u016c\5&\24\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\f\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0161\3\2\2\2\u0171\u0166\3\2\2\2\u0172+\3\2\2\2"+
		"\u0173\u0174\7\23\2\2\u0174\u0175\5X-\2\u0175\u0176\7\22\2\2\u0176\u0177"+
		"\5&\24\2\u0177\u0184\3\2\2\2\u0178\u0179\7\23\2\2\u0179\u017a\5X-\2\u017a"+
		"\u017b\7\22\2\2\u017b\u017d\7\13\2\2\u017c\u017e\5&\24\2\u017d\u017c\3"+
		"\2\2\2\u017e\u017f\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\7\f\2\2\u0182\u0184\3\2\2\2\u0183\u0173\3\2"+
		"\2\2\u0183\u0178\3\2\2\2\u0184-\3\2\2\2\u0185\u0186\5\66\34\2\u0186\u0187"+
		"\7\34\2\2\u0187\u0188\5\60\31\2\u0188\u018e\7\35\2\2\u0189\u018a\5\60"+
		"\31\2\u018a\u018b\7\35\2\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0192\5\60\31\2\u0192\u0193\7\4\2\2\u0193"+
		"/\3\2\2\2\u0194\u0198\5X-\2\u0195\u0197\5\36\20\2\u0196\u0195\3\2\2\2"+
		"\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\61"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\5\66\34\2\u019c\u01a0\7\36\2"+
		"\2\u019d\u019f\5\36\20\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\63\3\2\2\2\u01a2\u01a0\3\2\2"+
		"\2\u01a3\u01a4\5\62\32\2\u01a4\u01a5\7\4\2\2\u01a5\65\3\2\2\2\u01a6\u01a7"+
		"\7\37\2\2\u01a7\u01a8\7L\2\2\u01a8\u01a9\7\7\2\2\u01a9\u01aa\7L\2\2\u01aa"+
		"\u01ab\7 \2\2\u01ab\67\3\2\2\2\u01ac\u01b2\7!\2\2\u01ad\u01ae\5:\36\2"+
		"\u01ae\u01af\7\7\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b1\u01b4"+
		"\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b5\u01b6\5:\36\2\u01b6\u01b7\7\4\2\2\u01b79\3\2\2\2"+
		"\u01b8\u01b9\7L\2\2\u01b9\u01ba\7\"\2\2\u01ba\u01c0\5X-\2\u01bb\u01bc"+
		"\5\62\32\2\u01bc\u01bd\7\"\2\2\u01bd\u01be\5X-\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01b8\3\2\2\2\u01bf\u01bb\3\2\2\2\u01c0;\3\2\2\2\u01c1\u01c2\7#\2\2\u01c2"+
		"\u01c3\7L\2\2\u01c3\u01c4\5X-\2\u01c4\u01ca\7\25\2\2\u01c5\u01c6\5> \2"+
		"\u01c6\u01c7\7\7\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c9\u01cc"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\5> \2\u01ce\u01cf\7\27\2\2\u01cf\u01d0\7\4"+
		"\2\2\u01d0=\3\2\2\2\u01d1\u01d2\5f\64\2\u01d2\u01d9\7\26\2\2\u01d3\u01d5"+
		"\7L\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01da\7K\2\2\u01d9\u01d4\3\2"+
		"\2\2\u01d9\u01d8\3\2\2\2\u01da?\3\2\2\2\u01db\u01dc\7$\2\2\u01dc\u01dd"+
		"\7L\2\2\u01dd\u01e0\7\13\2\2\u01de\u01e1\5B\"\2\u01df\u01e1\5D#\2\u01e0"+
		"\u01de\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\f\2\2\u01e5"+
		"A\3\2\2\2\u01e6\u01e7\7%\2\2\u01e7\u01e8\7L\2\2\u01e8\u01e9\7\17\2\2\u01e9"+
		"\u01ea\7L\2\2\u01ea\u01eb\7\"\2\2\u01eb\u01ec\5X-\2\u01ec\u01ed\7\35\2"+
		"\2\u01ed\u01ee\7&\2\2\u01ee\u01ef\5X-\2\u01ef\u01f0\7\4\2\2\u01f0C\3\2"+
		"\2\2\u01f1\u01f2\7\'\2\2\u01f2\u01f3\7L\2\2\u01f3\u01f5\7\13\2\2\u01f4"+
		"\u01f6\5F$\2\u01f5\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f5\3\2\2"+
		"\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\7\f\2\2\u01faE"+
		"\3\2\2\2\u01fb\u0202\5\34\17\2\u01fc\u0202\5L\'\2\u01fd\u0202\5N(\2\u01fe"+
		"\u0202\5V,\2\u01ff\u0202\5J&\2\u0200\u0202\5H%\2\u0201\u01fb\3\2\2\2\u0201"+
		"\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0201\u0200\3\2\2\2\u0202G\3\2\2\2\u0203\u0204\7\21\2\2\u0204\u0205"+
		"\5X-\2\u0205\u0206\7\22\2\2\u0206\u0207\5F$\2\u0207\u0214\3\2\2\2\u0208"+
		"\u0209\7\21\2\2\u0209\u020a\5X-\2\u020a\u020b\7\22\2\2\u020b\u020d\7\13"+
		"\2\2\u020c\u020e\5F$\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\f\2\2\u0212"+
		"\u0214\3\2\2\2\u0213\u0203\3\2\2\2\u0213\u0208\3\2\2\2\u0214I\3\2\2\2"+
		"\u0215\u0216\7\23\2\2\u0216\u0217\5X-\2\u0217\u0218\7\22\2\2\u0218\u0219"+
		"\5F$\2\u0219\u0226\3\2\2\2\u021a\u021b\7\23\2\2\u021b\u021c\5X-\2\u021c"+
		"\u021d\7\22\2\2\u021d\u021f\7\13\2\2\u021e\u0220\5F$\2\u021f\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\7\f\2\2\u0224\u0226\3\2\2\2\u0225\u0215\3\2"+
		"\2\2\u0225\u021a\3\2\2\2\u0226K\3\2\2\2\u0227\u0228\7\17\2\2\u0228\u0229"+
		"\7L\2\2\u0229\u022a\7\20\2\2\u022a\u022b\5X-\2\u022b\u022c\5F$\2\u022c"+
		"\u023a\3\2\2\2\u022d\u022e\7\17\2\2\u022e\u022f\7L\2\2\u022f\u0230\7\20"+
		"\2\2\u0230\u0231\5X-\2\u0231\u0233\7\13\2\2\u0232\u0234\5F$\2\u0233\u0232"+
		"\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0238\7\f\2\2\u0238\u023a\3\2\2\2\u0239\u0227\3\2"+
		"\2\2\u0239\u022d\3\2\2\2\u023aM\3\2\2\2\u023b\u0241\7(\2\2\u023c\u023d"+
		"\5P)\2\u023d\u023e\7\7\2\2\u023e\u0240\3\2\2\2\u023f\u023c\3\2\2\2\u0240"+
		"\u0243\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0244\u0245\5P)\2\u0245\u0246\7\4\2\2\u0246\u024c"+
		"\3\2\2\2\u0247\u0248\7(\2\2\u0248\u024c\7\4\2\2\u0249\u024a\7)\2\2\u024a"+
		"\u024c\7\4\2\2\u024b\u023b\3\2\2\2\u024b\u0247\3\2\2\2\u024b\u0249\3\2"+
		"\2\2\u024cO\3\2\2\2\u024d\u0251\7L\2\2\u024e\u0250\5\36\20\2\u024f\u024e"+
		"\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0256\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\5\66\34\2\u0255\u024d\3"+
		"\2\2\2\u0255\u0254\3\2\2\2\u0256Q\3\2\2\2\u0257\u0258\7*\2\2\u0258\u0259"+
		"\7L\2\2\u0259\u025a\7\4\2\2\u025aS\3\2\2\2\u025b\u0261\5d\63\2\u025c\u025d"+
		"\5Z.\2\u025d\u025e\7\7\2\2\u025e\u0260\3\2\2\2\u025f\u025c\3\2\2\2\u0260"+
		"\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2"+
		"\2\2\u0263\u0261\3\2\2\2\u0264\u0265\5Z.\2\u0265\u0271\3\2\2\2\u0266\u026b"+
		"\5d\63\2\u0267\u0268\7L\2\2\u0268\u026a\7\7\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2"+
		"\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7L\2\2\u026f\u0271\3\2\2\2\u0270"+
		"\u025b\3\2\2\2\u0270\u0266\3\2\2\2\u0271U\3\2\2\2\u0272\u0276\5X-\2\u0273"+
		"\u0276\5T+\2\u0274\u0276\5Z.\2\u0275\u0272\3\2\2\2\u0275\u0273\3\2\2\2"+
		"\u0275\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\7\4\2\2\u0278W\3"+
		"\2\2\2\u0279\u027a\b-\1\2\u027a\u027b\t\2\2\2\u027b\u0290\5X-\21\u027c"+
		"\u027d\7,\2\2\u027d\u0290\5X-\20\u027e\u027f\7\66\2\2\u027f\u0280\7L\2"+
		"\2\u0280\u0290\7\67\2\2\u0281\u0282\7\66\2\2\u0282\u0283\5X-\2\u0283\u0284"+
		"\7\67\2\2\u0284\u0290\3\2\2\2\u0285\u0290\5^\60\2\u0286\u0290\5\\/\2\u0287"+
		"\u0290\7K\2\2\u0288\u0290\7L\2\2\u0289\u028d\78\2\2\u028a\u028b\79\2\2"+
		"\u028b\u028c\7N\2\2\u028c\u028e\7\27\2\2\u028d\u028a\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u0290\3\2\2\2\u028f\u0279\3\2\2\2\u028f\u027c\3\2\2\2\u028f"+
		"\u027e\3\2\2\2\u028f\u0281\3\2\2\2\u028f\u0285\3\2\2\2\u028f\u0286\3\2"+
		"\2\2\u028f\u0287\3\2\2\2\u028f\u0288\3\2\2\2\u028f\u0289\3\2\2\2\u0290"+
		"\u02a5\3\2\2\2\u0291\u0292\f\17\2\2\u0292\u0293\t\3\2\2\u0293\u02a4\5"+
		"X-\20\u0294\u0295\f\16\2\2\u0295\u0296\t\2\2\2\u0296\u02a4\5X-\17\u0297"+
		"\u0298\f\r\2\2\u0298\u0299\t\4\2\2\u0299\u02a4\5X-\16\u029a\u029b\f\f"+
		"\2\2\u029b\u029c\t\5\2\2\u029c\u02a4\5X-\r\u029d\u029e\f\13\2\2\u029e"+
		"\u029f\7\64\2\2\u029f\u02a4\5X-\f\u02a0\u02a1\f\n\2\2\u02a1\u02a2\7\65"+
		"\2\2\u02a2\u02a4\5X-\13\u02a3\u0291\3\2\2\2\u02a3\u0294\3\2\2\2\u02a3"+
		"\u0297\3\2\2\2\u02a3\u029a\3\2\2\2\u02a3\u029d\3\2\2\2\u02a3\u02a0\3\2"+
		"\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"Y\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7L\2\2\u02a9\u02aa\7\26\2\2"+
		"\u02aa\u02ab\5X-\2\u02ab[\3\2\2\2\u02ac\u02b1\7:\2\2\u02ad\u02ae\7L\2"+
		"\2\u02ae\u02b0\7\7\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4"+
		"\u02b5\7L\2\2\u02b5\u02b6\7;\2\2\u02b6]\3\2\2\2\u02b7\u02ba\5`\61\2\u02b8"+
		"\u02ba\5b\62\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba_\3\2\2\2"+
		"\u02bb\u02bc\7\66\2\2\u02bc\u02bd\5X-\2\u02bd\u02be\7\7\2\2\u02be\u02bf"+
		"\5X-\2\u02bf\u02c0\7\67\2\2\u02c0a\3\2\2\2\u02c1\u02c2\7\66\2\2\u02c2"+
		"\u02c3\5X-\2\u02c3\u02c4\7<\2\2\u02c4\u02c5\5X-\2\u02c5\u02c6\7\67\2\2"+
		"\u02c6c\3\2\2\2\u02c7\u02c8\t\6\2\2\u02c8e\3\2\2\2\u02c9\u02ca\t\7\2\2"+
		"\u02cag\3\2\2\2\u02cb\u02cc\t\b\2\2\u02cci\3\2\2\2Bnx\u0085\u008f\u0095"+
		"\u0099\u00a1\u00a6\u00ac\u00b4\u00b9\u00c3\u00d3\u00d7\u00e5\u00e9\u00f7"+
		"\u00fb\u0102\u010c\u0116\u0119\u0123\u012f\u013e\u014b\u015b\u015f\u016d"+
		"\u0171\u017f\u0183\u018e\u0198\u01a0\u01b2\u01bf\u01ca\u01d6\u01d9\u01e0"+
		"\u01e2\u01f7\u0201\u020f\u0213\u0221\u0225\u0235\u0239\u0241\u024b\u0251"+
		"\u0255\u0261\u026b\u0270\u0275\u028d\u028f\u02a3\u02a5\u02b1\u02b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}