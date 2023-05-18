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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, Number=70, ID=71, SYMBOL=72, STRING=73, 
		WS=74, NEWLINE=75, SingleLineComment=76, BlockComment=77, ERROR=78;
	public static final int
		RULE_program = 0, RULE_importstat = 1, RULE_alphabetDef = 2, RULE_alphabetElement = 3, 
		RULE_automatonNFADef = 4, RULE_automatonDFADef = 5, RULE_automatonStat = 6, 
		RULE_automatonFor = 7, RULE_automatonWhile = 8, RULE_automatonIf = 9, 
		RULE_stateDef = 10, RULE_propertiesDef = 11, RULE_propertyElement = 12, 
		RULE_transitionDef = 13, RULE_transitionElement = 14, RULE_viewDef = 15, 
		RULE_viewStat = 16, RULE_viewFor = 17, RULE_transitionRedefine = 18, RULE_transitionPoint = 19, 
		RULE_transitionLabelAlter = 20, RULE_transition = 21, RULE_placeDef = 22, 
		RULE_placeElement = 23, RULE_gridDef = 24, RULE_gridOptions = 25, RULE_animationDef = 26, 
		RULE_viewportDef = 27, RULE_viewportOn = 28, RULE_viewportStat = 29, RULE_viewportWhile = 30, 
		RULE_viewportIf = 31, RULE_viewportFor = 32, RULE_viewportInstructions = 33, 
		RULE_viewportInstructionsShowElement = 34, RULE_playDef = 35, RULE_decl = 36, 
		RULE_algebricOP = 37, RULE_expr = 38, RULE_assign = 39, RULE_list = 40, 
		RULE_point = 41, RULE_pointRect = 42, RULE_pointPol = 43, RULE_type = 44, 
		RULE_gridProperties = 45, RULE_propertiesKeys = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importstat", "alphabetDef", "alphabetElement", "automatonNFADef", 
			"automatonDFADef", "automatonStat", "automatonFor", "automatonWhile", 
			"automatonIf", "stateDef", "propertiesDef", "propertyElement", "transitionDef", 
			"transitionElement", "viewDef", "viewStat", "viewFor", "transitionRedefine", 
			"transitionPoint", "transitionLabelAlter", "transition", "placeDef", 
			"placeElement", "gridDef", "gridOptions", "animationDef", "viewportDef", 
			"viewportOn", "viewportStat", "viewportWhile", "viewportIf", "viewportFor", 
			"viewportInstructions", "viewportInstructionsShowElement", "playDef", 
			"decl", "algebricOP", "expr", "assign", "list", "point", "pointRect", 
			"pointPol", "type", "gridProperties", "propertiesKeys"
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
			"'pause'", "'play'", "'not'", "'and'", "'or'", "'=='", "'>='", "'<='", 
			"'+'", "'*'", "'/'", "'('", "')'", "'read'", "'[prompt='", "'{{'", "'}}'", 
			"':'", "'number'", "'point'", "'list'", "'string'", "'step'", "'margin'", 
			"'color'", "'line'", "'initial'", "'accepting'", "'align'", "'slope'", 
			"'highlighted'"
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
			null, null, null, null, null, null, null, null, null, null, "Number", 
			"ID", "SYMBOL", "STRING", "WS", "NEWLINE", "SingleLineComment", "BlockComment", 
			"ERROR"
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
		public List<AutomatonNFADefContext> automatonNFADef() {
			return getRuleContexts(AutomatonNFADefContext.class);
		}
		public AutomatonNFADefContext automatonNFADef(int i) {
			return getRuleContext(AutomatonNFADefContext.class,i);
		}
		public List<AutomatonDFADefContext> automatonDFADef() {
			return getRuleContexts(AutomatonDFADefContext.class);
		}
		public AutomatonDFADefContext automatonDFADef(int i) {
			return getRuleContext(AutomatonDFADefContext.class,i);
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
			setState(94);
			alphabetDef();
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(95);
					importstat();
					}
					break;
				case T__7:
					{
					setState(96);
					automatonNFADef();
					}
					break;
				case T__10:
				case T__11:
					{
					setState(97);
					automatonDFADef();
					}
					break;
				case T__23:
					{
					setState(98);
					viewDef();
					}
					break;
				case T__33:
					{
					setState(99);
					animationDef();
					}
					break;
				case T__39:
					{
					setState(100);
					playDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__23) | (1L << T__33) | (1L << T__39))) != 0) );
			setState(105);
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
			setState(107);
			match(T__0);
			setState(108);
			match(ID);
			setState(109);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__2);
				setState(112);
				match(T__3);
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(113);
						alphabetElement();
						setState(114);
						match(T__4);
						}
						} 
					}
					setState(120);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(121);
				alphabetElement();
				setState(122);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__2);
				setState(125);
				match(ID);
				setState(126);
				match(T__6);
				setState(127);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(SYMBOL);
				setState(131);
				match(T__6);
				setState(132);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
		enterRule(_localctx, 8, RULE_automatonNFADef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__7);
			setState(137);
			match(ID);
			setState(138);
			match(T__8);
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				stateDef();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				automatonStat();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__16 - 13)) | (1L << (ID - 13)))) != 0) );
			setState(149);
			transitionDef();
			setState(150);
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
		enterRule(_localctx, 10, RULE_automatonDFADef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(152);
				((AutomatonDFADefContext)_localctx).complete = match(T__10);
				}
			}

			setState(155);
			match(T__11);
			setState(156);
			match(ID);
			setState(157);
			match(T__8);
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(158);
				stateDef();
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				automatonStat();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__16 - 13)) | (1L << (ID - 13)))) != 0) );
			setState(168);
			transitionDef();
			setState(169);
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
		public AutomatonStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automatonStat; }
	}

	public final AutomatonStatContext automatonStat() throws RecognitionException {
		AutomatonStatContext _localctx = new AutomatonStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(171);
				automatonFor();
				}
				break;
			case T__16:
				{
				setState(172);
				automatonIf();
				}
				break;
			case T__14:
				{
				setState(173);
				automatonWhile();
				}
				break;
			case ID:
				{
				setState(174);
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
		enterRule(_localctx, 14, RULE_automatonFor);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__12);
				setState(178);
				match(ID);
				setState(179);
				match(T__13);
				setState(180);
				expr(0);
				setState(181);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__12);
				setState(184);
				match(ID);
				setState(185);
				match(T__13);
				setState(186);
				expr(0);
				setState(187);
				match(T__8);
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
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__16 - 13)) | (1L << (ID - 13)))) != 0) );
				setState(193);
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
		enterRule(_localctx, 16, RULE_automatonWhile);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__14);
				setState(198);
				expr(0);
				setState(199);
				match(T__15);
				setState(200);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__14);
				setState(203);
				expr(0);
				setState(204);
				match(T__15);
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
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__16 - 13)) | (1L << (ID - 13)))) != 0) );
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
		enterRule(_localctx, 18, RULE_automatonIf);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__16);
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
				match(T__16);
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
				} while ( ((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__14 - 13)) | (1L << (T__16 - 13)) | (1L << (ID - 13)))) != 0) );
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
		enterRule(_localctx, 20, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__17);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(234);
					match(ID);
					setState(235);
					match(T__4);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(241);
			match(ID);
			setState(242);
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
		enterRule(_localctx, 22, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ID);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				propertyElement();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(250);
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
		enterRule(_localctx, 24, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__18);
			setState(253);
			propertiesKeys();
			setState(254);
			match(T__19);
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					match(ID);
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(260);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
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
		enterRule(_localctx, 26, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__21);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					transitionElement();
					setState(267);
					match(T__4);
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(274);
			transitionElement();
			setState(275);
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
		enterRule(_localctx, 28, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ID);
			setState(278);
			match(T__22);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(SYMBOL);
					setState(280);
					match(T__4);
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(286);
			match(SYMBOL);
			setState(287);
			match(T__22);
			setState(288);
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
		enterRule(_localctx, 30, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__23);
			setState(291);
			match(ID);
			setState(292);
			match(T__24);
			setState(293);
			match(ID);
			setState(294);
			match(T__8);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID) {
				{
				{
				setState(295);
				viewStat();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		enterRule(_localctx, 32, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(303);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(304);
				viewFor();
				}
				break;
			case 3:
				{
				setState(305);
				placeDef();
				}
				break;
			case 4:
				{
				setState(306);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(307);
				propertiesDef();
				}
				break;
			case 6:
				{
				setState(308);
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
		enterRule(_localctx, 34, RULE_viewFor);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(T__12);
				setState(312);
				match(ID);
				setState(313);
				match(T__13);
				setState(314);
				expr(0);
				setState(315);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__12);
				setState(318);
				match(ID);
				setState(319);
				match(T__13);
				setState(320);
				expr(0);
				setState(321);
				match(T__8);
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(322);
					viewStat();
					}
					}
					setState(325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__28) | (1L << T__30) | (1L << T__32) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID );
				setState(327);
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
		enterRule(_localctx, 36, RULE_transitionRedefine);
		try {
			int _alt;
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				transition();
				setState(332);
				match(T__25);
				setState(333);
				transitionPoint();
				setState(334);
				match(T__26);
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(335);
						transitionPoint();
						setState(336);
						match(T__26);
						}
						} 
					}
					setState(342);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(343);
				transitionPoint();
				setState(344);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				transitionLabelAlter();
				setState(347);
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
		enterRule(_localctx, 38, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			expr(0);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(352);
				propertyElement();
				}
				}
				setState(357);
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
		enterRule(_localctx, 40, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			transition();
			setState(359);
			match(T__27);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(360);
				propertyElement();
				}
				}
				setState(365);
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
		enterRule(_localctx, 42, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__28);
			setState(367);
			match(ID);
			setState(368);
			match(T__4);
			setState(369);
			match(ID);
			setState(370);
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
		enterRule(_localctx, 44, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__30);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					placeElement();
					setState(374);
					match(T__4);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(381);
			placeElement();
			setState(382);
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
		enterRule(_localctx, 46, RULE_placeElement);
		try {
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(ID);
				setState(385);
				match(T__31);
				setState(386);
				expr(0);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				transitionLabelAlter();
				setState(388);
				match(T__31);
				setState(389);
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
		enterRule(_localctx, 48, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(T__32);
			setState(394);
			match(ID);
			setState(395);
			expr(0);
			setState(396);
			match(T__18);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					gridOptions();
					setState(398);
					match(T__4);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(405);
			gridOptions();
			setState(406);
			match(T__20);
			setState(407);
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
		enterRule(_localctx, 50, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			gridProperties();
			setState(410);
			match(T__19);
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					match(ID);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(416);
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
		enterRule(_localctx, 52, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__33);
			setState(420);
			match(ID);
			setState(421);
			match(T__8);
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(424);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(422);
					viewportDef();
					}
					break;
				case T__36:
					{
					setState(423);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 || _la==T__36 );
			setState(428);
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
		enterRule(_localctx, 54, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__34);
			setState(431);
			match(ID);
			setState(432);
			match(T__12);
			setState(433);
			match(ID);
			setState(434);
			match(T__31);
			setState(435);
			expr(0);
			setState(436);
			match(T__26);
			setState(437);
			match(T__35);
			setState(438);
			expr(0);
			setState(439);
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
		enterRule(_localctx, 56, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(T__36);
			setState(442);
			match(ID);
			setState(443);
			match(T__8);
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(444);
				viewportStat();
				}
				}
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID );
			setState(449);
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
		public ViewportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportStat; }
	}

	public final ViewportStatContext viewportStat() throws RecognitionException {
		ViewportStatContext _localctx = new ViewportStatContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(451);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(452);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(453);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(454);
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
		enterRule(_localctx, 60, RULE_viewportWhile);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(T__14);
				setState(458);
				expr(0);
				setState(459);
				match(T__15);
				setState(460);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(T__14);
				setState(463);
				expr(0);
				setState(464);
				match(T__15);
				setState(465);
				match(T__8);
				setState(467); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(466);
					viewportStat();
					}
					}
					setState(469); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID );
				setState(471);
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
		enterRule(_localctx, 62, RULE_viewportIf);
		int _la;
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				match(T__16);
				setState(476);
				expr(0);
				setState(477);
				match(T__15);
				setState(478);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T__16);
				setState(481);
				expr(0);
				setState(482);
				match(T__15);
				setState(483);
				match(T__8);
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(484);
					viewportStat();
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID );
				setState(489);
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
		enterRule(_localctx, 64, RULE_viewportFor);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__12);
				setState(494);
				match(ID);
				setState(495);
				match(T__13);
				setState(496);
				expr(0);
				setState(497);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(T__12);
				setState(500);
				match(ID);
				setState(501);
				match(T__13);
				setState(502);
				expr(0);
				setState(503);
				match(T__8);
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(504);
					viewportStat();
					}
					}
					setState(507); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__12) | (1L << T__17) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__46) | (1L << T__49) | (1L << T__51) | (1L << T__53) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0) || _la==Number || _la==ID );
				setState(509);
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
		enterRule(_localctx, 66, RULE_viewportInstructions);
		try {
			int _alt;
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(T__37);
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(514);
						viewportInstructionsShowElement();
						setState(515);
						match(T__4);
						}
						} 
					}
					setState(521);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(522);
				viewportInstructionsShowElement();
				setState(523);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(T__37);
				setState(526);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(T__38);
				setState(528);
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
		enterRule(_localctx, 68, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(ID);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(532);
					propertyElement();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
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
		enterRule(_localctx, 70, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T__39);
			setState(542);
			match(ID);
			setState(543);
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
		enterRule(_localctx, 72, RULE_decl);
		try {
			int _alt;
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				type();
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(546);
						assign();
						setState(547);
						match(T__4);
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(554);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				type();
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(557);
						match(ID);
						setState(558);
						match(T__4);
						}
						} 
					}
					setState(563);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(564);
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
		enterRule(_localctx, 74, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(568);
				expr(0);
				}
				break;
			case 2:
				{
				setState(569);
				decl();
				}
				break;
			case 3:
				{
				setState(570);
				assign();
				}
				break;
			}
			setState(573);
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
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class BiggerOrEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerOrEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SmallerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SmallerExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class EqualsExprContext extends ExprContext {
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
	public static class BiggerExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BiggerExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SmallerOrEqualExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SmallerOrEqualExprContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(576);
				match(T__40);
				setState(577);
				expr(18);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(578);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__46) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				expr(10);
				}
				break;
			case 3:
				{
				_localctx = new ParanthesisIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(580);
				match(T__49);
				setState(581);
				match(ID);
				setState(582);
				match(T__50);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(583);
				match(T__49);
				setState(584);
				expr(0);
				setState(585);
				match(T__50);
				}
				break;
			case 5:
				{
				_localctx = new PointExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(587);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				list();
				}
				break;
			case 7:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(589);
				match(Number);
				}
				break;
			case 8:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(590);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(591);
				match(T__51);
				setState(595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(592);
					match(T__52);
					setState(593);
					match(STRING);
					setState(594);
					match(T__20);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(626);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(599);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(600);
						match(T__41);
						setState(601);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(602);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(603);
						match(T__42);
						setState(604);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new BiggerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(605);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(606);
						match(T__29);
						setState(607);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new SmallerExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(608);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(609);
						match(T__28);
						setState(610);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(611);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(612);
						match(T__43);
						setState(613);
						expr(14);
						}
						break;
					case 6:
						{
						_localctx = new BiggerOrEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(614);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(615);
						match(T__44);
						setState(616);
						expr(13);
						}
						break;
					case 7:
						{
						_localctx = new SmallerOrEqualExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(617);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(618);
						match(T__45);
						setState(619);
						expr(12);
						}
						break;
					case 8:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(620);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(621);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__46) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(622);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(623);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(624);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__48) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(625);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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
		enterRule(_localctx, 78, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(ID);
			setState(632);
			match(T__19);
			setState(633);
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
		enterRule(_localctx, 80, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(T__53);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(636);
					match(ID);
					setState(637);
					match(T__4);
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(643);
			match(ID);
			setState(644);
			match(T__54);
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
		enterRule(_localctx, 82, RULE_point);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
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
		enterRule(_localctx, 84, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T__49);
			setState(651);
			match(Number);
			setState(652);
			match(T__4);
			setState(653);
			match(Number);
			setState(654);
			match(T__50);
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
		enterRule(_localctx, 86, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(T__49);
			setState(657);
			match(Number);
			setState(658);
			match(T__55);
			setState(659);
			match(Number);
			setState(660);
			match(T__50);
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
		enterRule(_localctx, 88, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
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

	public static class GridPropertiesContext extends ParserRuleContext {
		public GridPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridProperties; }
	}

	public final GridPropertiesContext gridProperties() throws RecognitionException {
		GridPropertiesContext _localctx = new GridPropertiesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_la = _input.LA(1);
			if ( !(((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & ((1L << (T__60 - 61)) | (1L << (T__61 - 61)) | (1L << (T__62 - 61)) | (1L << (T__63 - 61)))) != 0)) ) {
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

	public static class PropertiesKeysContext extends ParserRuleContext {
		public PropertiesKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesKeys; }
	}

	public final PropertiesKeysContext propertiesKeys() throws RecognitionException {
		PropertiesKeysContext _localctx = new PropertiesKeysContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__66 - 65)) | (1L << (T__67 - 65)) | (1L << (T__68 - 65)))) != 0)) ) {
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
		case 38:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u029f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2h\n\2"+
		"\r\2\16\2i\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4w\n\4\f\4\16"+
		"\4z\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\3\5\3\5\5\5"+
		"\u0089\n\5\3\6\3\6\3\6\3\6\6\6\u008f\n\6\r\6\16\6\u0090\3\6\6\6\u0094"+
		"\n\6\r\6\16\6\u0095\3\6\3\6\3\6\3\7\5\7\u009c\n\7\3\7\3\7\3\7\3\7\6\7"+
		"\u00a2\n\7\r\7\16\7\u00a3\3\7\6\7\u00a7\n\7\r\7\16\7\u00a8\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\6\t\u00c0\n\t\r\t\16\t\u00c1\3\t\3\t\5\t\u00c6\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00d2\n\n\r\n\16\n\u00d3\3\n\3\n\5"+
		"\n\u00d8\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00e4"+
		"\n\13\r\13\16\13\u00e5\3\13\3\13\5\13\u00ea\n\13\3\f\3\f\3\f\7\f\u00ef"+
		"\n\f\f\f\16\f\u00f2\13\f\3\f\3\f\3\f\3\r\3\r\6\r\u00f9\n\r\r\r\16\r\u00fa"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\6\16\u0103\n\16\r\16\16\16\u0104\3\16\5\16"+
		"\u0108\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0110\n\17\f\17\16\17\u0113"+
		"\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u011c\n\20\f\20\16\20\u011f"+
		"\13\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u012b\n"+
		"\21\f\21\16\21\u012e\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u0138\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\6\23\u0146\n\23\r\23\16\23\u0147\3\23\3\23\5\23\u014c\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0155\n\24\f\24\16\24\u0158\13\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0160\n\24\3\25\3\25\7\25\u0164\n\25\f"+
		"\25\16\25\u0167\13\25\3\26\3\26\3\26\7\26\u016c\n\26\f\26\16\26\u016f"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u017b\n"+
		"\30\f\30\16\30\u017e\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u018a\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0193\n"+
		"\32\f\32\16\32\u0196\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\6\33\u019f"+
		"\n\33\r\33\16\33\u01a0\3\33\5\33\u01a4\n\33\3\34\3\34\3\34\3\34\3\34\6"+
		"\34\u01ab\n\34\r\34\16\34\u01ac\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\6\36\u01c0\n\36\r\36\16"+
		"\36\u01c1\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01ca\n\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \6 \u01d6\n \r \16 \u01d7\3 \3 \5 \u01dc\n \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\6!\u01e8\n!\r!\16!\u01e9\3!\3!\5!\u01ee\n!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u01fc\n\"\r\"\16\"\u01fd"+
		"\3\"\3\"\5\"\u0202\n\"\3#\3#\3#\3#\7#\u0208\n#\f#\16#\u020b\13#\3#\3#"+
		"\3#\3#\3#\3#\3#\5#\u0214\n#\3$\3$\7$\u0218\n$\f$\16$\u021b\13$\3$\5$\u021e"+
		"\n$\3%\3%\3%\3%\3&\3&\3&\3&\7&\u0228\n&\f&\16&\u022b\13&\3&\3&\3&\3&\3"+
		"&\7&\u0232\n&\f&\16&\u0235\13&\3&\3&\5&\u0239\n&\3\'\3\'\3\'\5\'\u023e"+
		"\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\5(\u0256\n(\5(\u0258\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0275\n(\f(\16(\u0278\13(\3"+
		")\3)\3)\3)\3*\3*\3*\7*\u0281\n*\f*\16*\u0284\13*\3*\3*\3*\3+\3+\5+\u028b"+
		"\n+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\2\3"+
		"N\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^\2\7\4\2\t\t\61\61\3\2\62\63\4\2\24\24;>\3\2?B\3\2CG\2"+
		"\u02c7\2`\3\2\2\2\4m\3\2\2\2\6\u0082\3\2\2\2\b\u0088\3\2\2\2\n\u008a\3"+
		"\2\2\2\f\u009b\3\2\2\2\16\u00b1\3\2\2\2\20\u00c5\3\2\2\2\22\u00d7\3\2"+
		"\2\2\24\u00e9\3\2\2\2\26\u00eb\3\2\2\2\30\u00f6\3\2\2\2\32\u00fe\3\2\2"+
		"\2\34\u010b\3\2\2\2\36\u0117\3\2\2\2 \u0124\3\2\2\2\"\u0137\3\2\2\2$\u014b"+
		"\3\2\2\2&\u015f\3\2\2\2(\u0161\3\2\2\2*\u0168\3\2\2\2,\u0170\3\2\2\2."+
		"\u0176\3\2\2\2\60\u0189\3\2\2\2\62\u018b\3\2\2\2\64\u019b\3\2\2\2\66\u01a5"+
		"\3\2\2\28\u01b0\3\2\2\2:\u01bb\3\2\2\2<\u01c9\3\2\2\2>\u01db\3\2\2\2@"+
		"\u01ed\3\2\2\2B\u0201\3\2\2\2D\u0213\3\2\2\2F\u021d\3\2\2\2H\u021f\3\2"+
		"\2\2J\u0238\3\2\2\2L\u023d\3\2\2\2N\u0257\3\2\2\2P\u0279\3\2\2\2R\u027d"+
		"\3\2\2\2T\u028a\3\2\2\2V\u028c\3\2\2\2X\u0292\3\2\2\2Z\u0298\3\2\2\2\\"+
		"\u029a\3\2\2\2^\u029c\3\2\2\2`g\5\6\4\2ah\5\4\3\2bh\5\n\6\2ch\5\f\7\2"+
		"dh\5 \21\2eh\5\66\34\2fh\5H%\2ga\3\2\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2"+
		"ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\2\2\3"+
		"l\3\3\2\2\2mn\7\3\2\2no\7I\2\2op\7\4\2\2p\5\3\2\2\2qr\7\5\2\2rx\7\6\2"+
		"\2st\5\b\5\2tu\7\7\2\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y{\3\2\2\2zx\3\2\2\2{|\5\b\5\2|}\7\b\2\2}\u0083\3\2\2\2~\177\7\5\2\2"+
		"\177\u0080\7I\2\2\u0080\u0081\7\t\2\2\u0081\u0083\7I\2\2\u0082q\3\2\2"+
		"\2\u0082~\3\2\2\2\u0083\7\3\2\2\2\u0084\u0085\7J\2\2\u0085\u0086\7\t\2"+
		"\2\u0086\u0089\7J\2\2\u0087\u0089\7J\2\2\u0088\u0084\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\t\3\2\2\2\u008a\u008b\7\n\2\2\u008b\u008c\7I\2\2\u008c"+
		"\u008e\7\13\2\2\u008d\u008f\5\26\f\2\u008e\u008d\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0094\5\16\b\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\5\34\17\2\u0098"+
		"\u0099\7\f\2\2\u0099\13\3\2\2\2\u009a\u009c\7\r\2\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\16\2\2\u009e"+
		"\u009f\7I\2\2\u009f\u00a1\7\13\2\2\u00a0\u00a2\5\26\f\2\u00a1\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a7\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\5\34\17\2\u00ab\u00ac\7\f\2\2\u00ac\r\3\2\2\2\u00ad\u00b2\5\20"+
		"\t\2\u00ae\u00b2\5\24\13\2\u00af\u00b2\5\22\n\2\u00b0\u00b2\5\30\r\2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\17\3\2\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7I\2\2\u00b5\u00b6"+
		"\7\20\2\2\u00b6\u00b7\5N(\2\u00b7\u00b8\5\16\b\2\u00b8\u00c6\3\2\2\2\u00b9"+
		"\u00ba\7\17\2\2\u00ba\u00bb\7I\2\2\u00bb\u00bc\7\20\2\2\u00bc\u00bd\5"+
		"N(\2\u00bd\u00bf\7\13\2\2\u00be\u00c0\5\16\b\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b3\3\2\2\2\u00c5"+
		"\u00b9\3\2\2\2\u00c6\21\3\2\2\2\u00c7\u00c8\7\21\2\2\u00c8\u00c9\5N(\2"+
		"\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00d8\3\2\2\2\u00cc\u00cd"+
		"\7\21\2\2\u00cd\u00ce\5N(\2\u00ce\u00cf\7\22\2\2\u00cf\u00d1\7\13\2\2"+
		"\u00d0\u00d2\5\16\b\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00c7\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d8\23\3\2\2"+
		"\2\u00d9\u00da\7\23\2\2\u00da\u00db\5N(\2\u00db\u00dc\7\22\2\2\u00dc\u00dd"+
		"\5\16\b\2\u00dd\u00ea\3\2\2\2\u00de\u00df\7\23\2\2\u00df\u00e0\5N(\2\u00e0"+
		"\u00e1\7\22\2\2\u00e1\u00e3\7\13\2\2\u00e2\u00e4\5\16\b\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00d9\3\2"+
		"\2\2\u00e9\u00de\3\2\2\2\u00ea\25\3\2\2\2\u00eb\u00f0\7\24\2\2\u00ec\u00ed"+
		"\7I\2\2\u00ed\u00ef\7\7\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u00f4\7I\2\2\u00f4\u00f5\7\4\2\2\u00f5\27\3\2\2\2\u00f6\u00f8"+
		"\7I\2\2\u00f7\u00f9\5\32\16\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd"+
		"\7\4\2\2\u00fd\31\3\2\2\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\5^\60\2\u0100"+
		"\u0107\7\26\2\2\u0101\u0103\7I\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0108\7H\2\2\u0107\u0102\3\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010a\7\27\2\2\u010a\33\3\2\2\2\u010b\u0111\7\30\2\2\u010c"+
		"\u010d\5\36\20\2\u010d\u010e\7\7\2\2\u010e\u0110\3\2\2\2\u010f\u010c\3"+
		"\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7"+
		"\4\2\2\u0116\35\3\2\2\2\u0117\u0118\7I\2\2\u0118\u011d\7\31\2\2\u0119"+
		"\u011a\7J\2\2\u011a\u011c\7\7\2\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0121\7J\2\2\u0121\u0122\7\31\2\2\u0122\u0123\7I"+
		"\2\2\u0123\37\3\2\2\2\u0124\u0125\7\32\2\2\u0125\u0126\7I\2\2\u0126\u0127"+
		"\7\33\2\2\u0127\u0128\7I\2\2\u0128\u012c\7\13\2\2\u0129\u012b\5\"\22\2"+
		"\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\f\2\2\u0130"+
		"!\3\2\2\2\u0131\u0138\5L\'\2\u0132\u0138\5$\23\2\u0133\u0138\5.\30\2\u0134"+
		"\u0138\5&\24\2\u0135\u0138\5\30\r\2\u0136\u0138\5\62\32\2\u0137\u0131"+
		"\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138#\3\2\2\2\u0139\u013a\7\17\2\2"+
		"\u013a\u013b\7I\2\2\u013b\u013c\7\20\2\2\u013c\u013d\5N(\2\u013d\u013e"+
		"\5\"\22\2\u013e\u014c\3\2\2\2\u013f\u0140\7\17\2\2\u0140\u0141\7I\2\2"+
		"\u0141\u0142\7\20\2\2\u0142\u0143\5N(\2\u0143\u0145\7\13\2\2\u0144\u0146"+
		"\5\"\22\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\f\2\2\u014a\u014c"+
		"\3\2\2\2\u014b\u0139\3\2\2\2\u014b\u013f\3\2\2\2\u014c%\3\2\2\2\u014d"+
		"\u014e\5,\27\2\u014e\u014f\7\34\2\2\u014f\u0150\5(\25\2\u0150\u0156\7"+
		"\35\2\2\u0151\u0152\5(\25\2\u0152\u0153\7\35\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0151\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\5(\25\2\u015a"+
		"\u015b\7\4\2\2\u015b\u0160\3\2\2\2\u015c\u015d\5*\26\2\u015d\u015e\7\4"+
		"\2\2\u015e\u0160\3\2\2\2\u015f\u014d\3\2\2\2\u015f\u015c\3\2\2\2\u0160"+
		"\'\3\2\2\2\u0161\u0165\5N(\2\u0162\u0164\5\32\16\2\u0163\u0162\3\2\2\2"+
		"\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166)\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\5,\27\2\u0169\u016d\7\36\2\2\u016a"+
		"\u016c\5\32\16\2\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016e\3\2\2\2\u016e+\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171"+
		"\7\37\2\2\u0171\u0172\7I\2\2\u0172\u0173\7\7\2\2\u0173\u0174\7I\2\2\u0174"+
		"\u0175\7 \2\2\u0175-\3\2\2\2\u0176\u017c\7!\2\2\u0177\u0178\5\60\31\2"+
		"\u0178\u0179\7\7\2\2\u0179\u017b\3\2\2\2\u017a\u0177\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\5\60\31\2\u0180\u0181\7\4\2\2\u0181/\3\2\2"+
		"\2\u0182\u0183\7I\2\2\u0183\u0184\7\"\2\2\u0184\u018a\5N(\2\u0185\u0186"+
		"\5*\26\2\u0186\u0187\7\"\2\2\u0187\u0188\5N(\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0182\3\2\2\2\u0189\u0185\3\2\2\2\u018a\61\3\2\2\2\u018b\u018c\7#\2\2"+
		"\u018c\u018d\7I\2\2\u018d\u018e\5N(\2\u018e\u0194\7\25\2\2\u018f\u0190"+
		"\5\64\33\2\u0190\u0191\7\7\2\2\u0191\u0193\3\2\2\2\u0192\u018f\3\2\2\2"+
		"\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197"+
		"\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0198\5\64\33\2\u0198\u0199\7\27\2"+
		"\2\u0199\u019a\7\4\2\2\u019a\63\3\2\2\2\u019b\u019c\5\\/\2\u019c\u01a3"+
		"\7\26\2\2\u019d\u019f\7I\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4\7H"+
		"\2\2\u01a3\u019e\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\65\3\2\2\2\u01a5\u01a6"+
		"\7$\2\2\u01a6\u01a7\7I\2\2\u01a7\u01aa\7\13\2\2\u01a8\u01ab\58\35\2\u01a9"+
		"\u01ab\5:\36\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\7\f\2\2\u01af\67\3\2\2\2\u01b0\u01b1\7%\2\2\u01b1\u01b2\7I\2\2"+
		"\u01b2\u01b3\7\17\2\2\u01b3\u01b4\7I\2\2\u01b4\u01b5\7\"\2\2\u01b5\u01b6"+
		"\5N(\2\u01b6\u01b7\7\35\2\2\u01b7\u01b8\7&\2\2\u01b8\u01b9\5N(\2\u01b9"+
		"\u01ba\7\4\2\2\u01ba9\3\2\2\2\u01bb\u01bc\7\'\2\2\u01bc\u01bd\7I\2\2\u01bd"+
		"\u01bf\7\13\2\2\u01be\u01c0\5<\37\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3"+
		"\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\7\f\2\2\u01c4;\3\2\2\2\u01c5\u01ca\5\30\r\2\u01c6\u01ca\5B\"\2"+
		"\u01c7\u01ca\5D#\2\u01c8\u01ca\5L\'\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca=\3\2\2\2\u01cb"+
		"\u01cc\7\21\2\2\u01cc\u01cd\5N(\2\u01cd\u01ce\7\22\2\2\u01ce\u01cf\5<"+
		"\37\2\u01cf\u01dc\3\2\2\2\u01d0\u01d1\7\21\2\2\u01d1\u01d2\5N(\2\u01d2"+
		"\u01d3\7\22\2\2\u01d3\u01d5\7\13\2\2\u01d4\u01d6\5<\37\2\u01d5\u01d4\3"+
		"\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\7\f\2\2\u01da\u01dc\3\2\2\2\u01db\u01cb\3\2"+
		"\2\2\u01db\u01d0\3\2\2\2\u01dc?\3\2\2\2\u01dd\u01de\7\23\2\2\u01de\u01df"+
		"\5N(\2\u01df\u01e0\7\22\2\2\u01e0\u01e1\5<\37\2\u01e1\u01ee\3\2\2\2\u01e2"+
		"\u01e3\7\23\2\2\u01e3\u01e4\5N(\2\u01e4\u01e5\7\22\2\2\u01e5\u01e7\7\13"+
		"\2\2\u01e6\u01e8\5<\37\2\u01e7\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\7\f"+
		"\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01dd\3\2\2\2\u01ed\u01e2\3\2\2\2\u01ee"+
		"A\3\2\2\2\u01ef\u01f0\7\17\2\2\u01f0\u01f1\7I\2\2\u01f1\u01f2\7\20\2\2"+
		"\u01f2\u01f3\5N(\2\u01f3\u01f4\5<\37\2\u01f4\u0202\3\2\2\2\u01f5\u01f6"+
		"\7\17\2\2\u01f6\u01f7\7I\2\2\u01f7\u01f8\7\20\2\2\u01f8\u01f9\5N(\2\u01f9"+
		"\u01fb\7\13\2\2\u01fa\u01fc\5<\37\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3"+
		"\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0200\7\f\2\2\u0200\u0202\3\2\2\2\u0201\u01ef\3\2\2\2\u0201\u01f5\3\2"+
		"\2\2\u0202C\3\2\2\2\u0203\u0209\7(\2\2\u0204\u0205\5F$\2\u0205\u0206\7"+
		"\7\2\2\u0206\u0208\3\2\2\2\u0207\u0204\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u020d\5F$\2\u020d\u020e\7\4\2\2\u020e\u0214\3\2\2\2\u020f\u0210"+
		"\7(\2\2\u0210\u0214\7\4\2\2\u0211\u0212\7)\2\2\u0212\u0214\7\4\2\2\u0213"+
		"\u0203\3\2\2\2\u0213\u020f\3\2\2\2\u0213\u0211\3\2\2\2\u0214E\3\2\2\2"+
		"\u0215\u0219\7I\2\2\u0216\u0218\5\32\16\2\u0217\u0216\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021e\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u021e\5,\27\2\u021d\u0215\3\2\2\2\u021d\u021c\3\2"+
		"\2\2\u021eG\3\2\2\2\u021f\u0220\7*\2\2\u0220\u0221\7I\2\2\u0221\u0222"+
		"\7\4\2\2\u0222I\3\2\2\2\u0223\u0229\5Z.\2\u0224\u0225\5P)\2\u0225\u0226"+
		"\7\7\2\2\u0226\u0228\3\2\2\2\u0227\u0224\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022c\u022d\5P)\2\u022d\u0239\3\2\2\2\u022e\u0233\5Z.\2\u022f\u0230"+
		"\7I\2\2\u0230\u0232\7\7\2\2\u0231\u022f\3\2\2\2\u0232\u0235\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0236\u0237\7I\2\2\u0237\u0239\3\2\2\2\u0238\u0223\3\2\2\2\u0238"+
		"\u022e\3\2\2\2\u0239K\3\2\2\2\u023a\u023e\5N(\2\u023b\u023e\5J&\2\u023c"+
		"\u023e\5P)\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0240\7\4\2\2\u0240M\3\2\2\2\u0241\u0242"+
		"\b(\1\2\u0242\u0243\7+\2\2\u0243\u0258\5N(\24\u0244\u0245\t\2\2\2\u0245"+
		"\u0258\5N(\f\u0246\u0247\7\64\2\2\u0247\u0248\7I\2\2\u0248\u0258\7\65"+
		"\2\2\u0249\u024a\7\64\2\2\u024a\u024b\5N(\2\u024b\u024c\7\65\2\2\u024c"+
		"\u0258\3\2\2\2\u024d\u0258\5T+\2\u024e\u0258\5R*\2\u024f\u0258\7H\2\2"+
		"\u0250\u0258\7I\2\2\u0251\u0255\7\66\2\2\u0252\u0253\7\67\2\2\u0253\u0254"+
		"\7K\2\2\u0254\u0256\7\27\2\2\u0255\u0252\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0241\3\2\2\2\u0257\u0244\3\2\2\2\u0257\u0246\3\2"+
		"\2\2\u0257\u0249\3\2\2\2\u0257\u024d\3\2\2\2\u0257\u024e\3\2\2\2\u0257"+
		"\u024f\3\2\2\2\u0257\u0250\3\2\2\2\u0257\u0251\3\2\2\2\u0258\u0276\3\2"+
		"\2\2\u0259\u025a\f\23\2\2\u025a\u025b\7,\2\2\u025b\u0275\5N(\24\u025c"+
		"\u025d\f\22\2\2\u025d\u025e\7-\2\2\u025e\u0275\5N(\23\u025f\u0260\f\21"+
		"\2\2\u0260\u0261\7 \2\2\u0261\u0275\5N(\22\u0262\u0263\f\20\2\2\u0263"+
		"\u0264\7\37\2\2\u0264\u0275\5N(\21\u0265\u0266\f\17\2\2\u0266\u0267\7"+
		".\2\2\u0267\u0275\5N(\20\u0268\u0269\f\16\2\2\u0269\u026a\7/\2\2\u026a"+
		"\u0275\5N(\17\u026b\u026c\f\r\2\2\u026c\u026d\7\60\2\2\u026d\u0275\5N"+
		"(\16\u026e\u026f\f\13\2\2\u026f\u0270\t\2\2\2\u0270\u0275\5N(\f\u0271"+
		"\u0272\f\n\2\2\u0272\u0273\t\3\2\2\u0273\u0275\5N(\13\u0274\u0259\3\2"+
		"\2\2\u0274\u025c\3\2\2\2\u0274\u025f\3\2\2\2\u0274\u0262\3\2\2\2\u0274"+
		"\u0265\3\2\2\2\u0274\u0268\3\2\2\2\u0274\u026b\3\2\2\2\u0274\u026e\3\2"+
		"\2\2\u0274\u0271\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277O\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\7I\2\2\u027a"+
		"\u027b\7\26\2\2\u027b\u027c\5N(\2\u027cQ\3\2\2\2\u027d\u0282\78\2\2\u027e"+
		"\u027f\7I\2\2\u027f\u0281\7\7\2\2\u0280\u027e\3\2\2\2\u0281\u0284\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0286\7I\2\2\u0286\u0287\79\2\2\u0287S\3\2\2\2\u0288"+
		"\u028b\5V,\2\u0289\u028b\5X-\2\u028a\u0288\3\2\2\2\u028a\u0289\3\2\2\2"+
		"\u028bU\3\2\2\2\u028c\u028d\7\64\2\2\u028d\u028e\7H\2\2\u028e\u028f\7"+
		"\7\2\2\u028f\u0290\7H\2\2\u0290\u0291\7\65\2\2\u0291W\3\2\2\2\u0292\u0293"+
		"\7\64\2\2\u0293\u0294\7H\2\2\u0294\u0295\7:\2\2\u0295\u0296\7H\2\2\u0296"+
		"\u0297\7\65\2\2\u0297Y\3\2\2\2\u0298\u0299\t\4\2\2\u0299[\3\2\2\2\u029a"+
		"\u029b\t\5\2\2\u029b]\3\2\2\2\u029c\u029d\t\6\2\2\u029d_\3\2\2\2>gix\u0082"+
		"\u0088\u0090\u0095\u009b\u00a3\u00a8\u00b1\u00c1\u00c5\u00d3\u00d7\u00e5"+
		"\u00e9\u00f0\u00fa\u0104\u0107\u0111\u011d\u012c\u0137\u0147\u014b\u0156"+
		"\u015f\u0165\u016d\u017c\u0189\u0194\u01a0\u01a3\u01aa\u01ac\u01c1\u01c9"+
		"\u01d7\u01db\u01e9\u01ed\u01fd\u0201\u0209\u0213\u0219\u021d\u0229\u0233"+
		"\u0238\u023d\u0255\u0257\u0274\u0276\u0282\u028a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}