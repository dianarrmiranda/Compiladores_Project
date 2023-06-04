// Generated from /home/tiago/UA/2 Ano/2 Semestre/C/PFinal/c2023-adv-02/src/adv.g4 by ANTLR 4.9.2
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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, Number=76, ID=77, SYMBOL=78, STRING=79, WS=80, NEWLINE=81, 
		SingleLineComment=82, BlockComment=83, ERROR=84;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_importstat = 2, RULE_alphabetDef = 3, 
		RULE_alphabetElement = 4, RULE_automatonDef = 5, RULE_automatonNFADef = 6, 
		RULE_automatonDFADef = 7, RULE_automatonStat = 8, RULE_automatonFor = 9, 
		RULE_automatonWhile = 10, RULE_automatonIf = 11, RULE_automatonElse = 12, 
		RULE_stateDef = 13, RULE_propertiesDef = 14, RULE_propertyElement = 15, 
		RULE_transitionDef = 16, RULE_transitionElement = 17, RULE_viewDef = 18, 
		RULE_viewStat = 19, RULE_viewFor = 20, RULE_viewWhile = 21, RULE_viewIf = 22, 
		RULE_viewElse = 23, RULE_transitionRedefine = 24, RULE_transitionPoint = 25, 
		RULE_transitionLabelAlter = 26, RULE_transitionLabelAlterWithComma = 27, 
		RULE_transition = 28, RULE_placeDef = 29, RULE_placeElement = 30, RULE_gridDef = 31, 
		RULE_gridOptions = 32, RULE_animationDef = 33, RULE_viewportDef = 34, 
		RULE_viewportOn = 35, RULE_viewportStat = 36, RULE_path = 37, RULE_viewportWhile = 38, 
		RULE_viewportIf = 39, RULE_viewportElse = 40, RULE_viewportFor = 41, RULE_viewportInstructions = 42, 
		RULE_viewportInstructionsShowElement = 43, RULE_playDef = 44, RULE_decl = 45, 
		RULE_algebricOP = 46, RULE_expr = 47, RULE_assign = 48, RULE_list = 49, 
		RULE_point = 50, RULE_pointRect = 51, RULE_pointPol = 52, RULE_type = 53, 
		RULE_gridProperties = 54, RULE_propertiesKeys = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "importstat", "alphabetDef", "alphabetElement", "automatonDef", 
			"automatonNFADef", "automatonDFADef", "automatonStat", "automatonFor", 
			"automatonWhile", "automatonIf", "automatonElse", "stateDef", "propertiesDef", 
			"propertyElement", "transitionDef", "transitionElement", "viewDef", "viewStat", 
			"viewFor", "viewWhile", "viewIf", "viewElse", "transitionRedefine", "transitionPoint", 
			"transitionLabelAlter", "transitionLabelAlterWithComma", "transition", 
			"placeDef", "placeElement", "gridDef", "gridOptions", "animationDef", 
			"viewportDef", "viewportOn", "viewportStat", "path", "viewportWhile", 
			"viewportIf", "viewportElse", "viewportFor", "viewportInstructions", 
			"viewportInstructionsShowElement", "playDef", "decl", "algebricOP", "expr", 
			"assign", "list", "point", "pointRect", "pointPol", "type", "gridProperties", 
			"propertiesKeys"
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
			setState(112);
			alphabetDef();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__25) | (1L << T__35) | (1L << T__42))) != 0)) {
				{
				{
				setState(113);
				stat();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(121);
				importstat();
				}
				break;
			case T__7:
			case T__10:
			case T__11:
				{
				setState(122);
				automatonDef();
				}
				break;
			case T__25:
				{
				setState(123);
				viewDef();
				}
				break;
			case T__35:
				{
				setState(124);
				animationDef();
				}
				break;
			case T__42:
				{
				setState(125);
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
			setState(128);
			match(T__0);
			setState(129);
			match(ID);
			setState(130);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__2);
				setState(133);
				match(T__3);
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(134);
						alphabetElement();
						setState(135);
						match(T__4);
						}
						} 
					}
					setState(141);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(142);
				alphabetElement();
				setState(143);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__2);
				setState(146);
				match(ID);
				setState(147);
				match(T__6);
				setState(148);
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
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(SYMBOL);
				setState(152);
				match(T__6);
				setState(153);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				automatonNFADef();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
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
			setState(161);
			match(T__7);
			setState(162);
			match(ID);
			setState(163);
			match(T__8);
			setState(165); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(164);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				automatonStat();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
			setState(174);
			transitionDef();
			setState(175);
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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(177);
				((AutomatonDFADefContext)_localctx).complete = match(T__10);
				}
			}

			setState(180);
			match(T__11);
			setState(181);
			match(ID);
			setState(182);
			match(T__8);
			setState(184); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(183);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(186); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				automatonStat();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
			setState(193);
			transitionDef();
			setState(194);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(196);
				automatonFor();
				}
				break;
			case 2:
				{
				setState(197);
				automatonIf();
				}
				break;
			case 3:
				{
				setState(198);
				automatonWhile();
				}
				break;
			case 4:
				{
				setState(199);
				propertiesDef();
				}
				break;
			case 5:
				{
				setState(200);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__12);
				setState(204);
				match(ID);
				setState(205);
				match(T__13);
				setState(206);
				expr(0);
				setState(207);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__12);
				setState(210);
				match(ID);
				setState(211);
				match(T__13);
				setState(212);
				expr(0);
				setState(213);
				match(T__8);
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(214);
					automatonStat();
					}
					}
					setState(217); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(219);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__14);
				setState(224);
				expr(0);
				setState(225);
				match(T__15);
				setState(226);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__14);
				setState(229);
				expr(0);
				setState(230);
				match(T__15);
				setState(231);
				match(T__8);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					automatonStat();
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(237);
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
		public AutomatonElseContext automatonElse() {
			return getRuleContext(AutomatonElseContext.class,0);
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
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__16);
				setState(242);
				expr(0);
				setState(243);
				match(T__15);
				setState(244);
				automatonStat();
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(245);
					automatonElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__16);
				setState(249);
				expr(0);
				setState(250);
				match(T__15);
				setState(251);
				match(T__8);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					automatonStat();
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(257);
				match(T__9);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(258);
					automatonElse();
					}
					break;
				}
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

	public static class AutomatonElseContext extends ParserRuleContext {
		public List<AutomatonStatContext> automatonStat() {
			return getRuleContexts(AutomatonStatContext.class);
		}
		public AutomatonStatContext automatonStat(int i) {
			return getRuleContext(AutomatonStatContext.class,i);
		}
		public AutomatonElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonElse; }
	}

	public final AutomatonElseContext automatonElse() throws RecognitionException {
		AutomatonElseContext _localctx = new AutomatonElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_automatonElse);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(T__17);
				setState(264);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(T__17);
				setState(266);
				match(T__8);
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(267);
					automatonStat();
					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(272);
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
		enterRule(_localctx, 26, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__18);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(277);
					match(ID);
					setState(278);
					match(T__4);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(284);
			match(ID);
			setState(285);
			match(T__19);
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
		enterRule(_localctx, 28, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ID);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				propertyElement();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(293);
			match(T__19);
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
		enterRule(_localctx, 30, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__20);
			setState(296);
			propertiesKeys();
			setState(297);
			match(T__21);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298);
					match(ID);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(303);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(306);
			match(T__22);
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
		enterRule(_localctx, 32, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__23);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					transitionElement();
					setState(310);
					match(T__4);
					}
					} 
				}
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(317);
			transitionElement();
			setState(318);
			match(T__19);
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
		enterRule(_localctx, 34, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ID);
			setState(321);
			match(T__24);
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					match(SYMBOL);
					setState(323);
					match(T__4);
					}
					} 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(329);
			match(SYMBOL);
			setState(330);
			match(T__24);
			setState(331);
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
		enterRule(_localctx, 36, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__25);
			setState(334);
			match(ID);
			setState(335);
			match(T__26);
			setState(336);
			match(ID);
			setState(337);
			match(T__8);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(338);
				viewStat();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
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
		enterRule(_localctx, 38, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(346);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(347);
				viewFor();
				}
				break;
			case 3:
				{
				setState(348);
				placeDef();
				}
				break;
			case 4:
				{
				setState(349);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(350);
				transitionLabelAlterWithComma();
				}
				break;
			case 6:
				{
				setState(351);
				gridDef();
				}
				break;
			case 7:
				{
				setState(352);
				viewIf();
				}
				break;
			case 8:
				{
				setState(353);
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
		enterRule(_localctx, 40, RULE_viewFor);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__12);
				setState(357);
				match(ID);
				setState(358);
				match(T__13);
				setState(359);
				expr(0);
				setState(360);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(T__12);
				setState(363);
				match(ID);
				setState(364);
				match(T__13);
				setState(365);
				expr(0);
				setState(366);
				match(T__8);
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					viewStat();
					}
					}
					setState(370); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(372);
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
		enterRule(_localctx, 42, RULE_viewWhile);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(T__14);
				setState(377);
				expr(0);
				setState(378);
				match(T__15);
				setState(379);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(T__14);
				setState(382);
				expr(0);
				setState(383);
				match(T__15);
				setState(384);
				match(T__8);
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(385);
					viewStat();
					}
					}
					setState(388); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(390);
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
		public ViewElseContext viewElse() {
			return getRuleContext(ViewElseContext.class,0);
		}
		public ViewIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewIf; }
	}

	public final ViewIfContext viewIf() throws RecognitionException {
		ViewIfContext _localctx = new ViewIfContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_viewIf);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(T__16);
				setState(395);
				expr(0);
				setState(396);
				match(T__15);
				setState(397);
				viewStat();
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(398);
					viewElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__16);
				setState(402);
				expr(0);
				setState(403);
				match(T__15);
				setState(404);
				match(T__8);
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					viewStat();
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(410);
				match(T__9);
				setState(412);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(411);
					viewElse();
					}
					break;
				}
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

	public static class ViewElseContext extends ParserRuleContext {
		public List<ViewStatContext> viewStat() {
			return getRuleContexts(ViewStatContext.class);
		}
		public ViewStatContext viewStat(int i) {
			return getRuleContext(ViewStatContext.class,i);
		}
		public ViewElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewElse; }
	}

	public final ViewElseContext viewElse() throws RecognitionException {
		ViewElseContext _localctx = new ViewElseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_viewElse);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(T__17);
				setState(417);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				match(T__17);
				setState(419);
				match(T__8);
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(420);
					viewStat();
					}
					}
					setState(423); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(425);
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
		enterRule(_localctx, 48, RULE_transitionRedefine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			transition();
			setState(430);
			match(T__27);
			setState(431);
			transitionPoint();
			setState(432);
			match(T__28);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					transitionPoint();
					setState(434);
					match(T__28);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(441);
			transitionPoint();
			setState(442);
			match(T__19);
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
		enterRule(_localctx, 50, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			expr(0);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(445);
				propertyElement();
				}
				}
				setState(450);
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
		enterRule(_localctx, 52, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			transition();
			setState(452);
			match(T__29);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(453);
				propertyElement();
				}
				}
				setState(458);
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
		enterRule(_localctx, 54, RULE_transitionLabelAlterWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			transitionLabelAlter();
			setState(460);
			match(T__19);
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
		enterRule(_localctx, 56, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__30);
			setState(463);
			match(ID);
			setState(464);
			match(T__4);
			setState(465);
			match(ID);
			setState(466);
			match(T__31);
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
		enterRule(_localctx, 58, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__32);
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					placeElement();
					setState(470);
					match(T__4);
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			setState(477);
			placeElement();
			setState(478);
			match(T__19);
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
		enterRule(_localctx, 60, RULE_placeElement);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IDplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				match(ID);
				setState(481);
				match(T__33);
				setState(482);
				expr(0);
				}
				break;
			case T__30:
				_localctx = new TransitionplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				transitionLabelAlter();
				setState(484);
				match(T__33);
				setState(485);
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
		enterRule(_localctx, 62, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(T__34);
			setState(490);
			match(ID);
			setState(491);
			expr(0);
			setState(492);
			match(T__20);
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					gridOptions();
					setState(494);
					match(T__4);
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(501);
			gridOptions();
			setState(502);
			match(T__22);
			setState(503);
			match(T__19);
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
		enterRule(_localctx, 64, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			gridProperties();
			setState(506);
			match(T__21);
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(507);
					match(ID);
					}
					}
					setState(510); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(512);
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
		enterRule(_localctx, 66, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__35);
			setState(516);
			match(ID);
			setState(517);
			match(T__8);
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(520);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__36:
					{
					setState(518);
					viewportDef();
					}
					break;
				case T__38:
					{
					setState(519);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__36 || _la==T__38 );
			setState(524);
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
		enterRule(_localctx, 68, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(T__36);
			setState(527);
			match(ID);
			setState(528);
			match(T__12);
			setState(529);
			match(ID);
			setState(530);
			match(T__33);
			setState(531);
			expr(0);
			setState(532);
			match(T__28);
			setState(533);
			match(T__37);
			setState(534);
			expr(0);
			setState(535);
			match(T__19);
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
		enterRule(_localctx, 70, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(T__38);
			setState(538);
			match(ID);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
			setState(545);
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
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public ViewportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStat; }
	}

	public final ViewportStatContext viewportStat() throws RecognitionException {
		ViewportStatContext _localctx = new ViewportStatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(547);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(548);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(549);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(550);
				algebricOP();
				}
				break;
			case 5:
				{
				setState(551);
				viewportIf();
				}
				break;
			case 6:
				{
				setState(552);
				viewportWhile();
				}
				break;
			case 7:
				{
				setState(553);
				path();
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

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(T__39);
			setState(557);
			match(T__19);
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
		enterRule(_localctx, 76, RULE_viewportWhile);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(T__14);
				setState(560);
				expr(0);
				setState(561);
				match(T__15);
				setState(562);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(T__14);
				setState(565);
				expr(0);
				setState(566);
				match(T__15);
				setState(567);
				match(T__8);
				setState(569); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(568);
					viewportStat();
					}
					}
					setState(571); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(573);
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
		public ViewportElseContext viewportElse() {
			return getRuleContext(ViewportElseContext.class,0);
		}
		public ViewportIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportIf; }
	}

	public final ViewportIfContext viewportIf() throws RecognitionException {
		ViewportIfContext _localctx = new ViewportIfContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_viewportIf);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577);
				match(T__16);
				setState(578);
				expr(0);
				setState(579);
				match(T__15);
				setState(580);
				viewportStat();
				setState(582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(581);
					viewportElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(T__16);
				setState(585);
				expr(0);
				setState(586);
				match(T__15);
				setState(587);
				match(T__8);
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(588);
					viewportStat();
					}
					}
					setState(591); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(593);
				match(T__9);
				setState(594);
				viewportElse();
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

	public static class ViewportElseContext extends ParserRuleContext {
		public List<ViewportStatContext> viewportStat() {
			return getRuleContexts(ViewportStatContext.class);
		}
		public ViewportStatContext viewportStat(int i) {
			return getRuleContext(ViewportStatContext.class,i);
		}
		public ViewportElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportElse; }
	}

	public final ViewportElseContext viewportElse() throws RecognitionException {
		ViewportElseContext _localctx = new ViewportElseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_viewportElse);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(T__17);
				setState(599);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(T__17);
				setState(601);
				match(T__8);
				setState(603); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(602);
					viewportStat();
					}
					}
					setState(605); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(607);
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
		enterRule(_localctx, 82, RULE_viewportFor);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				match(T__12);
				setState(612);
				match(ID);
				setState(613);
				match(T__13);
				setState(614);
				expr(0);
				setState(615);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(T__12);
				setState(618);
				match(ID);
				setState(619);
				match(T__13);
				setState(620);
				expr(0);
				setState(621);
				match(T__8);
				setState(623); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(622);
					viewportStat();
					}
					}
					setState(625); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (ID - 64)))) != 0) );
				setState(627);
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
		public ViewportInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportInstructions; }
	 
		public ViewportInstructionsContext() { }
		public void copyFrom(ViewportInstructionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleContext extends ViewportInstructionsContext {
		public Token op;
		public SimpleContext(ViewportInstructionsContext ctx) { copyFrom(ctx); }
	}
	public static class CompoundContext extends ViewportInstructionsContext {
		public List<ViewportInstructionsShowElementContext> viewportInstructionsShowElement() {
			return getRuleContexts(ViewportInstructionsShowElementContext.class);
		}
		public ViewportInstructionsShowElementContext viewportInstructionsShowElement(int i) {
			return getRuleContext(ViewportInstructionsShowElementContext.class,i);
		}
		public CompoundContext(ViewportInstructionsContext ctx) { copyFrom(ctx); }
	}

	public final ViewportInstructionsContext viewportInstructions() throws RecognitionException {
		ViewportInstructionsContext _localctx = new ViewportInstructionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_viewportInstructions);
		int _la;
		try {
			int _alt;
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new CompoundContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				match(T__40);
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(632);
						viewportInstructionsShowElement();
						setState(633);
						match(T__4);
						}
						} 
					}
					setState(639);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(640);
				viewportInstructionsShowElement();
				setState(641);
				match(T__19);
				}
				break;
			case 2:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				((SimpleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__40 || _la==T__41) ) {
					((SimpleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				match(T__19);
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
		enterRule(_localctx, 86, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(ID);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(648);
					propertyElement();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
		enterRule(_localctx, 88, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(T__42);
			setState(658);
			match(ID);
			setState(659);
			match(T__19);
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
		enterRule(_localctx, 90, RULE_decl);
		try {
			int _alt;
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				type();
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(662);
						assign();
						setState(663);
						match(T__4);
						}
						} 
					}
					setState(669);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				setState(670);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				type();
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(673);
						match(ID);
						setState(674);
						match(T__4);
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(680);
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
		enterRule(_localctx, 92, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				{
				setState(684);
				decl();
				}
				break;
			case ID:
				{
				setState(685);
				assign();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(688);
			match(T__19);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(691);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__43) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(692);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(693);
				match(T__44);
				setState(694);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new ParanthesisIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				match(T__54);
				setState(696);
				match(ID);
				setState(697);
				match(T__55);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				match(T__54);
				setState(699);
				expr(0);
				setState(700);
				match(T__55);
				}
				break;
			case 5:
				{
				_localctx = new PointExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(702);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(703);
				list();
				}
				break;
			case 7:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(704);
				match(Number);
				}
				break;
			case 8:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(705);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(706);
				match(T__56);
				setState(710);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(707);
					match(T__57);
					setState(708);
					match(STRING);
					setState(709);
					match(T__22);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(734);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(732);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(714);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(715);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(716);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(717);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(718);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__43) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(719);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(720);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(721);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__48) | (1L << T__49))) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(722);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(723);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(724);
						((EqualsExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__50 || _la==T__51) ) {
							((EqualsExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(725);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(726);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(727);
						match(T__52);
						setState(728);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(729);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(730);
						match(T__53);
						setState(731);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 96, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(ID);
			setState(738);
			match(T__21);
			setState(739);
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
		enterRule(_localctx, 98, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(T__58);
			setState(746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(742);
					match(ID);
					setState(743);
					match(T__4);
					}
					} 
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(749);
			match(ID);
			setState(750);
			match(T__59);
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
		enterRule(_localctx, 100, RULE_point);
		try {
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
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
		enterRule(_localctx, 102, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(T__54);
			setState(757);
			expr(0);
			setState(758);
			match(T__4);
			setState(759);
			expr(0);
			setState(760);
			match(T__55);
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
		enterRule(_localctx, 104, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(T__54);
			setState(763);
			expr(0);
			setState(764);
			match(T__60);
			setState(765);
			expr(0);
			setState(766);
			match(T__55);
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
		enterRule(_localctx, 106, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 19)) & ~0x3f) == 0 && ((1L << (_la - 19)) & ((1L << (T__18 - 19)) | (1L << (T__61 - 19)) | (1L << (T__62 - 19)) | (1L << (T__63 - 19)) | (1L << (T__64 - 19)) | (1L << (T__65 - 19)))) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			((GridPropertiesContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)))) != 0)) ) {
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
		enterRule(_localctx, 110, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			((PropertiesKeysContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (T__70 - 71)) | (1L << (T__71 - 71)) | (1L << (T__72 - 71)) | (1L << (T__73 - 71)) | (1L << (T__74 - 71)))) != 0)) ) {
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
		case 47:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u0309\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\7\2u\n\2\f\2\16"+
		"\2x\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0098\n\5\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\5\7\u00a2"+
		"\n\7\3\b\3\b\3\b\3\b\6\b\u00a8\n\b\r\b\16\b\u00a9\3\b\6\b\u00ad\n\b\r"+
		"\b\16\b\u00ae\3\b\3\b\3\b\3\t\5\t\u00b5\n\t\3\t\3\t\3\t\3\t\6\t\u00bb"+
		"\n\t\r\t\16\t\u00bc\3\t\6\t\u00c0\n\t\r\t\16\t\u00c1\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00cc\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\6\13\u00da\n\13\r\13\16\13\u00db\3\13\3\13\5\13\u00e0"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00ec\n\f\r\f\16\f\u00ed"+
		"\3\f\3\f\5\f\u00f2\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00f9\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\6\r\u0100\n\r\r\r\16\r\u0101\3\r\3\r\5\r\u0106\n\r\5\r\u0108\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\6\16\u010f\n\16\r\16\16\16\u0110\3\16\3\16"+
		"\5\16\u0115\n\16\3\17\3\17\3\17\7\17\u011a\n\17\f\17\16\17\u011d\13\17"+
		"\3\17\3\17\3\17\3\20\3\20\6\20\u0124\n\20\r\20\16\20\u0125\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\6\21\u012e\n\21\r\21\16\21\u012f\3\21\5\21\u0133\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u013b\n\22\f\22\16\22\u013e\13"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16\23\u014a"+
		"\13\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0156\n"+
		"\24\f\24\16\24\u0159\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0165\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\6\26\u0173\n\26\r\26\16\26\u0174\3\26\3\26\5\26\u0179\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0185\n\27\r\27"+
		"\16\27\u0186\3\27\3\27\5\27\u018b\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0192"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\6\30\u0199\n\30\r\30\16\30\u019a\3\30\3"+
		"\30\5\30\u019f\n\30\5\30\u01a1\n\30\3\31\3\31\3\31\3\31\3\31\6\31\u01a8"+
		"\n\31\r\31\16\31\u01a9\3\31\3\31\5\31\u01ae\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u01b7\n\32\f\32\16\32\u01ba\13\32\3\32\3\32\3\32\3"+
		"\33\3\33\7\33\u01c1\n\33\f\33\16\33\u01c4\13\33\3\34\3\34\3\34\7\34\u01c9"+
		"\n\34\f\34\16\34\u01cc\13\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\7\37\u01db\n\37\f\37\16\37\u01de\13\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u01ea\n \3!\3!\3!\3!\3!\3!\3!\7!\u01f3"+
		"\n!\f!\16!\u01f6\13!\3!\3!\3!\3!\3\"\3\"\3\"\6\"\u01ff\n\"\r\"\16\"\u0200"+
		"\3\"\5\"\u0204\n\"\3#\3#\3#\3#\3#\6#\u020b\n#\r#\16#\u020c\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\6%\u0220\n%\r%\16%\u0221\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\5&\u022d\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\6(\u023c\n(\r(\16(\u023d\3(\3(\5(\u0242\n(\3)\3)\3)\3)\3)\5)\u0249"+
		"\n)\3)\3)\3)\3)\3)\6)\u0250\n)\r)\16)\u0251\3)\3)\3)\5)\u0257\n)\3*\3"+
		"*\3*\3*\3*\6*\u025e\n*\r*\16*\u025f\3*\3*\5*\u0264\n*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\6+\u0272\n+\r+\16+\u0273\3+\3+\5+\u0278\n+\3,\3,\3"+
		",\3,\7,\u027e\n,\f,\16,\u0281\13,\3,\3,\3,\3,\3,\5,\u0288\n,\3-\3-\7-"+
		"\u028c\n-\f-\16-\u028f\13-\3-\5-\u0292\n-\3.\3.\3.\3.\3/\3/\3/\3/\7/\u029c"+
		"\n/\f/\16/\u029f\13/\3/\3/\3/\3/\3/\7/\u02a6\n/\f/\16/\u02a9\13/\3/\3"+
		"/\5/\u02ad\n/\3\60\3\60\5\60\u02b1\n\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u02c9\n\61\5\61\u02cb\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02df"+
		"\n\61\f\61\16\61\u02e2\13\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u02eb"+
		"\n\63\f\63\16\63\u02ee\13\63\3\63\3\63\3\63\3\64\3\64\5\64\u02f5\n\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\39\2\3`:\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\2\n\3\2+,\4\2\t\t..\3\2\60"+
		"\62\4\2!\"\63\64\3\2\65\66\4\2\25\25@D\3\2EH\3\2IM\2\u0337\2r\3\2\2\2"+
		"\4\u0080\3\2\2\2\6\u0082\3\2\2\2\b\u0097\3\2\2\2\n\u009d\3\2\2\2\f\u00a1"+
		"\3\2\2\2\16\u00a3\3\2\2\2\20\u00b4\3\2\2\2\22\u00cb\3\2\2\2\24\u00df\3"+
		"\2\2\2\26\u00f1\3\2\2\2\30\u0107\3\2\2\2\32\u0114\3\2\2\2\34\u0116\3\2"+
		"\2\2\36\u0121\3\2\2\2 \u0129\3\2\2\2\"\u0136\3\2\2\2$\u0142\3\2\2\2&\u014f"+
		"\3\2\2\2(\u0164\3\2\2\2*\u0178\3\2\2\2,\u018a\3\2\2\2.\u01a0\3\2\2\2\60"+
		"\u01ad\3\2\2\2\62\u01af\3\2\2\2\64\u01be\3\2\2\2\66\u01c5\3\2\2\28\u01cd"+
		"\3\2\2\2:\u01d0\3\2\2\2<\u01d6\3\2\2\2>\u01e9\3\2\2\2@\u01eb\3\2\2\2B"+
		"\u01fb\3\2\2\2D\u0205\3\2\2\2F\u0210\3\2\2\2H\u021b\3\2\2\2J\u022c\3\2"+
		"\2\2L\u022e\3\2\2\2N\u0241\3\2\2\2P\u0256\3\2\2\2R\u0263\3\2\2\2T\u0277"+
		"\3\2\2\2V\u0287\3\2\2\2X\u0291\3\2\2\2Z\u0293\3\2\2\2\\\u02ac\3\2\2\2"+
		"^\u02b0\3\2\2\2`\u02ca\3\2\2\2b\u02e3\3\2\2\2d\u02e7\3\2\2\2f\u02f4\3"+
		"\2\2\2h\u02f6\3\2\2\2j\u02fc\3\2\2\2l\u0302\3\2\2\2n\u0304\3\2\2\2p\u0306"+
		"\3\2\2\2rv\5\b\5\2su\5\4\3\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w"+
		"y\3\2\2\2xv\3\2\2\2yz\7\2\2\3z\3\3\2\2\2{\u0081\5\6\4\2|\u0081\5\f\7\2"+
		"}\u0081\5&\24\2~\u0081\5D#\2\177\u0081\5Z.\2\u0080{\3\2\2\2\u0080|\3\2"+
		"\2\2\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\5\3\2\2\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\7O\2\2\u0084\u0085\7\4\2\2\u0085\7\3\2\2\2"+
		"\u0086\u0087\7\5\2\2\u0087\u008d\7\6\2\2\u0088\u0089\5\n\6\2\u0089\u008a"+
		"\7\7\2\2\u008a\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0091\5\n\6\2\u0091\u0092\7\b\2\2\u0092\u0098\3\2\2\2\u0093"+
		"\u0094\7\5\2\2\u0094\u0095\7O\2\2\u0095\u0096\7\t\2\2\u0096\u0098\7O\2"+
		"\2\u0097\u0086\3\2\2\2\u0097\u0093\3\2\2\2\u0098\t\3\2\2\2\u0099\u009a"+
		"\7P\2\2\u009a\u009b\7\t\2\2\u009b\u009e\7P\2\2\u009c\u009e\7P\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e\13\3\2\2\2\u009f\u00a2\5\16\b"+
		"\2\u00a0\u00a2\5\20\t\2\u00a1\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\r\3\2\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a7\7\13\2\2"+
		"\u00a6\u00a8\5\34\17\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\5\22\n\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\f\2\2"+
		"\u00b2\17\3\2\2\2\u00b3\u00b5\7\r\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\7O\2\2\u00b8"+
		"\u00ba\7\13\2\2\u00b9\u00bb\5\34\17\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00c0\5\22\n\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5\"\22\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\21\3\2\2\2\u00c6\u00cc\5\24\13\2\u00c7\u00cc\5\30"+
		"\r\2\u00c8\u00cc\5\26\f\2\u00c9\u00cc\5\36\20\2\u00ca\u00cc\5^\60\2\u00cb"+
		"\u00c6\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00ca\3\2\2\2\u00cc\23\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf"+
		"\7O\2\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1\5`\61\2\u00d1\u00d2\5\22\n\2"+
		"\u00d2\u00e0\3\2\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7O\2\2\u00d5\u00d6"+
		"\7\20\2\2\u00d6\u00d7\5`\61\2\u00d7\u00d9\7\13\2\2\u00d8\u00da\5\22\n"+
		"\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\f\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00cd\3\2\2\2\u00df\u00d3\3\2\2\2\u00e0\25\3\2\2\2\u00e1\u00e2\7\21\2"+
		"\2\u00e2\u00e3\5`\61\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\5\22\n\2\u00e5"+
		"\u00f2\3\2\2\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\5`\61\2\u00e8\u00e9\7"+
		"\22\2\2\u00e9\u00eb\7\13\2\2\u00ea\u00ec\5\22\n\2\u00eb\u00ea\3\2\2\2"+
		"\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00f0\7\f\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1"+
		"\u00e6\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5\5`\61"+
		"\2\u00f5\u00f6\7\22\2\2\u00f6\u00f8\5\22\n\2\u00f7\u00f9\5\32\16\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0108\3\2\2\2\u00fa\u00fb\7\23"+
		"\2\2\u00fb\u00fc\5`\61\2\u00fc\u00fd\7\22\2\2\u00fd\u00ff\7\13\2\2\u00fe"+
		"\u0100\5\22\n\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3"+
		"\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\7\f\2\2\u0104"+
		"\u0106\5\32\16\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3"+
		"\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00fa\3\2\2\2\u0108\31\3\2\2\2\u0109"+
		"\u010a\7\24\2\2\u010a\u0115\5\22\n\2\u010b\u010c\7\24\2\2\u010c\u010e"+
		"\7\13\2\2\u010d\u010f\5\22\n\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\7\f\2\2\u0113\u0115\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u010b\3\2\2\2\u0115"+
		"\33\3\2\2\2\u0116\u011b\7\25\2\2\u0117\u0118\7O\2\2\u0118\u011a\7\7\2"+
		"\2\u0119\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7O\2\2\u011f"+
		"\u0120\7\26\2\2\u0120\35\3\2\2\2\u0121\u0123\7O\2\2\u0122\u0124\5 \21"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\26\2\2\u0128\37\3\2\2\2\u0129"+
		"\u012a\7\27\2\2\u012a\u012b\5p9\2\u012b\u0132\7\30\2\2\u012c\u012e\7O"+
		"\2\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u0133\7N\2\2\u0132\u012d\3\2"+
		"\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7\31\2\2\u0135"+
		"!\3\2\2\2\u0136\u013c\7\32\2\2\u0137\u0138\5$\23\2\u0138\u0139\7\7\2\2"+
		"\u0139\u013b\3\2\2\2\u013a\u0137\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0140\5$\23\2\u0140\u0141\7\26\2\2\u0141#\3\2\2\2\u0142\u0143\7O\2\2"+
		"\u0143\u0148\7\33\2\2\u0144\u0145\7P\2\2\u0145\u0147\7\7\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7P\2\2\u014c\u014d\7\33"+
		"\2\2\u014d\u014e\7O\2\2\u014e%\3\2\2\2\u014f\u0150\7\34\2\2\u0150\u0151"+
		"\7O\2\2\u0151\u0152\7\35\2\2\u0152\u0153\7O\2\2\u0153\u0157\7\13\2\2\u0154"+
		"\u0156\5(\25\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a"+
		"\u015b\7\f\2\2\u015b\'\3\2\2\2\u015c\u0165\5^\60\2\u015d\u0165\5*\26\2"+
		"\u015e\u0165\5<\37\2\u015f\u0165\5\62\32\2\u0160\u0165\58\35\2\u0161\u0165"+
		"\5@!\2\u0162\u0165\5.\30\2\u0163\u0165\5,\27\2\u0164\u015c\3\2\2\2\u0164"+
		"\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164\u0160\3\2"+
		"\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165"+
		")\3\2\2\2\u0166\u0167\7\17\2\2\u0167\u0168\7O\2\2\u0168\u0169\7\20\2\2"+
		"\u0169\u016a\5`\61\2\u016a\u016b\5(\25\2\u016b\u0179\3\2\2\2\u016c\u016d"+
		"\7\17\2\2\u016d\u016e\7O\2\2\u016e\u016f\7\20\2\2\u016f\u0170\5`\61\2"+
		"\u0170\u0172\7\13\2\2\u0171\u0173\5(\25\2\u0172\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\7\f\2\2\u0177\u0179\3\2\2\2\u0178\u0166\3\2\2\2\u0178\u016c\3\2"+
		"\2\2\u0179+\3\2\2\2\u017a\u017b\7\21\2\2\u017b\u017c\5`\61\2\u017c\u017d"+
		"\7\22\2\2\u017d\u017e\5(\25\2\u017e\u018b\3\2\2\2\u017f\u0180\7\21\2\2"+
		"\u0180\u0181\5`\61\2\u0181\u0182\7\22\2\2\u0182\u0184\7\13\2\2\u0183\u0185"+
		"\5(\25\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\f\2\2\u0189\u018b\3\2"+
		"\2\2\u018a\u017a\3\2\2\2\u018a\u017f\3\2\2\2\u018b-\3\2\2\2\u018c\u018d"+
		"\7\23\2\2\u018d\u018e\5`\61\2\u018e\u018f\7\22\2\2\u018f\u0191\5(\25\2"+
		"\u0190\u0192\5\60\31\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u01a1"+
		"\3\2\2\2\u0193\u0194\7\23\2\2\u0194\u0195\5`\61\2\u0195\u0196\7\22\2\2"+
		"\u0196\u0198\7\13\2\2\u0197\u0199\5(\25\2\u0198\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019e\7\f\2\2\u019d\u019f\5\60\31\2\u019e\u019d\3\2\2\2\u019e\u019f\3"+
		"\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u018c\3\2\2\2\u01a0\u0193\3\2\2\2\u01a1"+
		"/\3\2\2\2\u01a2\u01a3\7\24\2\2\u01a3\u01ae\5(\25\2\u01a4\u01a5\7\24\2"+
		"\2\u01a5\u01a7\7\13\2\2\u01a6\u01a8\5(\25\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\7\f\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01a2\3\2\2\2\u01ad"+
		"\u01a4\3\2\2\2\u01ae\61\3\2\2\2\u01af\u01b0\5:\36\2\u01b0\u01b1\7\36\2"+
		"\2\u01b1\u01b2\5\64\33\2\u01b2\u01b8\7\37\2\2\u01b3\u01b4\5\64\33\2\u01b4"+
		"\u01b5\7\37\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b7\u01ba\3"+
		"\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01bc\5\64\33\2\u01bc\u01bd\7\26\2\2\u01bd\63\3\2"+
		"\2\2\u01be\u01c2\5`\61\2\u01bf\u01c1\5 \21\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\65\3\2\2"+
		"\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\5:\36\2\u01c6\u01ca\7 \2\2\u01c7\u01c9"+
		"\5 \21\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\67\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\5\66\34"+
		"\2\u01ce\u01cf\7\26\2\2\u01cf9\3\2\2\2\u01d0\u01d1\7!\2\2\u01d1\u01d2"+
		"\7O\2\2\u01d2\u01d3\7\7\2\2\u01d3\u01d4\7O\2\2\u01d4\u01d5\7\"\2\2\u01d5"+
		";\3\2\2\2\u01d6\u01dc\7#\2\2\u01d7\u01d8\5> \2\u01d8\u01d9\7\7\2\2\u01d9"+
		"\u01db\3\2\2\2\u01da\u01d7\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2"+
		"\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\5> \2\u01e0\u01e1\7\26\2\2\u01e1=\3\2\2\2\u01e2\u01e3\7O\2\2\u01e3"+
		"\u01e4\7$\2\2\u01e4\u01ea\5`\61\2\u01e5\u01e6\5\66\34\2\u01e6\u01e7\7"+
		"$\2\2\u01e7\u01e8\5`\61\2\u01e8\u01ea\3\2\2\2\u01e9\u01e2\3\2\2\2\u01e9"+
		"\u01e5\3\2\2\2\u01ea?\3\2\2\2\u01eb\u01ec\7%\2\2\u01ec\u01ed\7O\2\2\u01ed"+
		"\u01ee\5`\61\2\u01ee\u01f4\7\27\2\2\u01ef\u01f0\5B\"\2\u01f0\u01f1\7\7"+
		"\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u01f8\5B\"\2\u01f8\u01f9\7\31\2\2\u01f9\u01fa\7\26\2\2\u01fa"+
		"A\3\2\2\2\u01fb\u01fc\5n8\2\u01fc\u0203\7\30\2\2\u01fd\u01ff\7O\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2"+
		"\2\2\u0201\u0204\3\2\2\2\u0202\u0204\7N\2\2\u0203\u01fe\3\2\2\2\u0203"+
		"\u0202\3\2\2\2\u0204C\3\2\2\2\u0205\u0206\7&\2\2\u0206\u0207\7O\2\2\u0207"+
		"\u020a\7\13\2\2\u0208\u020b\5F$\2\u0209\u020b\5H%\2\u020a\u0208\3\2\2"+
		"\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7\f\2\2\u020fE\3\2\2\2\u0210"+
		"\u0211\7\'\2\2\u0211\u0212\7O\2\2\u0212\u0213\7\17\2\2\u0213\u0214\7O"+
		"\2\2\u0214\u0215\7$\2\2\u0215\u0216\5`\61\2\u0216\u0217\7\37\2\2\u0217"+
		"\u0218\7(\2\2\u0218\u0219\5`\61\2\u0219\u021a\7\26\2\2\u021aG\3\2\2\2"+
		"\u021b\u021c\7)\2\2\u021c\u021d\7O\2\2\u021d\u021f\7\13\2\2\u021e\u0220"+
		"\5J&\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\f\2\2\u0224I\3\2\2\2"+
		"\u0225\u022d\5\36\20\2\u0226\u022d\5T+\2\u0227\u022d\5V,\2\u0228\u022d"+
		"\5^\60\2\u0229\u022d\5P)\2\u022a\u022d\5N(\2\u022b\u022d\5L\'\2\u022c"+
		"\u0225\3\2\2\2\u022c\u0226\3\2\2\2\u022c\u0227\3\2\2\2\u022c\u0228\3\2"+
		"\2\2\u022c\u0229\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022b\3\2\2\2\u022d"+
		"K\3\2\2\2\u022e\u022f\7*\2\2\u022f\u0230\7\26\2\2\u0230M\3\2\2\2\u0231"+
		"\u0232\7\21\2\2\u0232\u0233\5`\61\2\u0233\u0234\7\22\2\2\u0234\u0235\5"+
		"J&\2\u0235\u0242\3\2\2\2\u0236\u0237\7\21\2\2\u0237\u0238\5`\61\2\u0238"+
		"\u0239\7\22\2\2\u0239\u023b\7\13\2\2\u023a\u023c\5J&\2\u023b\u023a\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0240\7\f\2\2\u0240\u0242\3\2\2\2\u0241\u0231\3\2"+
		"\2\2\u0241\u0236\3\2\2\2\u0242O\3\2\2\2\u0243\u0244\7\23\2\2\u0244\u0245"+
		"\5`\61\2\u0245\u0246\7\22\2\2\u0246\u0248\5J&\2\u0247\u0249\5R*\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0257\3\2\2\2\u024a\u024b\7\23"+
		"\2\2\u024b\u024c\5`\61\2\u024c\u024d\7\22\2\2\u024d\u024f\7\13\2\2\u024e"+
		"\u0250\5J&\2\u024f\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2"+
		"\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7\f\2\2\u0254\u0255"+
		"\5R*\2\u0255\u0257\3\2\2\2\u0256\u0243\3\2\2\2\u0256\u024a\3\2\2\2\u0257"+
		"Q\3\2\2\2\u0258\u0259\7\24\2\2\u0259\u0264\5J&\2\u025a\u025b\7\24\2\2"+
		"\u025b\u025d\7\13\2\2\u025c\u025e\5J&\2\u025d\u025c\3\2\2\2\u025e\u025f"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0262\7\f\2\2\u0262\u0264\3\2\2\2\u0263\u0258\3\2\2\2\u0263\u025a\3\2"+
		"\2\2\u0264S\3\2\2\2\u0265\u0266\7\17\2\2\u0266\u0267\7O\2\2\u0267\u0268"+
		"\7\20\2\2\u0268\u0269\5`\61\2\u0269\u026a\5J&\2\u026a\u0278\3\2\2\2\u026b"+
		"\u026c\7\17\2\2\u026c\u026d\7O\2\2\u026d\u026e\7\20\2\2\u026e\u026f\5"+
		"`\61\2\u026f\u0271\7\13\2\2\u0270\u0272\5J&\2\u0271\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\7\f\2\2\u0276\u0278\3\2\2\2\u0277\u0265\3\2\2\2\u0277"+
		"\u026b\3\2\2\2\u0278U\3\2\2\2\u0279\u027f\7+\2\2\u027a\u027b\5X-\2\u027b"+
		"\u027c\7\7\2\2\u027c\u027e\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0281\3\2"+
		"\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0282\u0283\5X-\2\u0283\u0284\7\26\2\2\u0284\u0288\3\2"+
		"\2\2\u0285\u0286\t\2\2\2\u0286\u0288\7\26\2\2\u0287\u0279\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288W\3\2\2\2\u0289\u028d\7O\2\2\u028a\u028c\5 \21\2\u028b"+
		"\u028a\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0292\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0292\5:\36\2\u0291"+
		"\u0289\3\2\2\2\u0291\u0290\3\2\2\2\u0292Y\3\2\2\2\u0293\u0294\7-\2\2\u0294"+
		"\u0295\7O\2\2\u0295\u0296\7\26\2\2\u0296[\3\2\2\2\u0297\u029d\5l\67\2"+
		"\u0298\u0299\5b\62\2\u0299\u029a\7\7\2\2\u029a\u029c\3\2\2\2\u029b\u0298"+
		"\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\5b\62\2\u02a1\u02ad\3\2"+
		"\2\2\u02a2\u02a7\5l\67\2\u02a3\u02a4\7O\2\2\u02a4\u02a6\7\7\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2"+
		"\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02ab\7O\2\2\u02ab"+
		"\u02ad\3\2\2\2\u02ac\u0297\3\2\2\2\u02ac\u02a2\3\2\2\2\u02ad]\3\2\2\2"+
		"\u02ae\u02b1\5\\/\2\u02af\u02b1\5b\62\2\u02b0\u02ae\3\2\2\2\u02b0\u02af"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\26\2\2\u02b3_\3\2\2\2\u02b4"+
		"\u02b5\b\61\1\2\u02b5\u02b6\t\3\2\2\u02b6\u02cb\5`\61\21\u02b7\u02b8\7"+
		"/\2\2\u02b8\u02cb\5`\61\20\u02b9\u02ba\79\2\2\u02ba\u02bb\7O\2\2\u02bb"+
		"\u02cb\7:\2\2\u02bc\u02bd\79\2\2\u02bd\u02be\5`\61\2\u02be\u02bf\7:\2"+
		"\2\u02bf\u02cb\3\2\2\2\u02c0\u02cb\5f\64\2\u02c1\u02cb\5d\63\2\u02c2\u02cb"+
		"\7N\2\2\u02c3\u02cb\7O\2\2\u02c4\u02c8\7;\2\2\u02c5\u02c6\7<\2\2\u02c6"+
		"\u02c7\7Q\2\2\u02c7\u02c9\7\31\2\2\u02c8\u02c5\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02b4\3\2\2\2\u02ca\u02b7\3\2\2\2\u02ca"+
		"\u02b9\3\2\2\2\u02ca\u02bc\3\2\2\2\u02ca\u02c0\3\2\2\2\u02ca\u02c1\3\2"+
		"\2\2\u02ca\u02c2\3\2\2\2\u02ca\u02c3\3\2\2\2\u02ca\u02c4\3\2\2\2\u02cb"+
		"\u02e0\3\2\2\2\u02cc\u02cd\f\17\2\2\u02cd\u02ce\t\4\2\2\u02ce\u02df\5"+
		"`\61\20\u02cf\u02d0\f\16\2\2\u02d0\u02d1\t\3\2\2\u02d1\u02df\5`\61\17"+
		"\u02d2\u02d3\f\r\2\2\u02d3\u02d4\t\5\2\2\u02d4\u02df\5`\61\16\u02d5\u02d6"+
		"\f\f\2\2\u02d6\u02d7\t\6\2\2\u02d7\u02df\5`\61\r\u02d8\u02d9\f\13\2\2"+
		"\u02d9\u02da\7\67\2\2\u02da\u02df\5`\61\f\u02db\u02dc\f\n\2\2\u02dc\u02dd"+
		"\78\2\2\u02dd\u02df\5`\61\13\u02de\u02cc\3\2\2\2\u02de\u02cf\3\2\2\2\u02de"+
		"\u02d2\3\2\2\2\u02de\u02d5\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02db\3\2"+
		"\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"a\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7O\2\2\u02e4\u02e5\7\30\2\2"+
		"\u02e5\u02e6\5`\61\2\u02e6c\3\2\2\2\u02e7\u02ec\7=\2\2\u02e8\u02e9\7O"+
		"\2\2\u02e9\u02eb\7\7\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ee\3\2\2\2\u02ec"+
		"\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ef\u02f0\7O\2\2\u02f0\u02f1\7>\2\2\u02f1e\3\2\2\2\u02f2\u02f5"+
		"\5h\65\2\u02f3\u02f5\5j\66\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"g\3\2\2\2\u02f6\u02f7\79\2\2\u02f7\u02f8\5`\61\2\u02f8\u02f9\7\7\2\2\u02f9"+
		"\u02fa\5`\61\2\u02fa\u02fb\7:\2\2\u02fbi\3\2\2\2\u02fc\u02fd\79\2\2\u02fd"+
		"\u02fe\5`\61\2\u02fe\u02ff\7?\2\2\u02ff\u0300\5`\61\2\u0300\u0301\7:\2"+
		"\2\u0301k\3\2\2\2\u0302\u0303\t\7\2\2\u0303m\3\2\2\2\u0304\u0305\t\b\2"+
		"\2\u0305o\3\2\2\2\u0306\u0307\t\t\2\2\u0307q\3\2\2\2Mv\u0080\u008d\u0097"+
		"\u009d\u00a1\u00a9\u00ae\u00b4\u00bc\u00c1\u00cb\u00db\u00df\u00ed\u00f1"+
		"\u00f8\u0101\u0105\u0107\u0110\u0114\u011b\u0125\u012f\u0132\u013c\u0148"+
		"\u0157\u0164\u0174\u0178\u0186\u018a\u0191\u019a\u019e\u01a0\u01a9\u01ad"+
		"\u01b8\u01c2\u01ca\u01dc\u01e9\u01f4\u0200\u0203\u020a\u020c\u0221\u022c"+
		"\u023d\u0241\u0248\u0251\u0256\u025f\u0263\u0273\u0277\u027f\u0287\u028d"+
		"\u0291\u029d\u02a7\u02ac\u02b0\u02c8\u02ca\u02de\u02e0\u02ec\u02f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}