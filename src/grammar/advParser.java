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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, Number=72, ID=73, SYMBOL=74, 
		STRING=75, WS=76, NEWLINE=77, SingleLineComment=78, BlockComment=79, ERROR=80;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_importstat = 2, RULE_alphabetDef = 3, 
		RULE_alphabetElement = 4, RULE_automatonDef = 5, RULE_automatonNFADef = 6, 
		RULE_automatonDFADef = 7, RULE_automatonStat = 8, RULE_automatonFor = 9, 
		RULE_automatonWhile = 10, RULE_automatonIf = 11, RULE_stateDef = 12, RULE_propertiesDef = 13, 
		RULE_propertyElement = 14, RULE_transitionDef = 15, RULE_transitionElement = 16, 
		RULE_viewDef = 17, RULE_viewStat = 18, RULE_viewFor = 19, RULE_viewWhile = 20, 
		RULE_viewIf = 21, RULE_transitionRedefine = 22, RULE_transitionPoint = 23, 
		RULE_transitionLabelAlter = 24, RULE_transition = 25, RULE_placeDef = 26, 
		RULE_placeElement = 27, RULE_gridDef = 28, RULE_gridOptions = 29, RULE_animationDef = 30, 
		RULE_viewportDef = 31, RULE_viewportOn = 32, RULE_viewportStat = 33, RULE_viewportWhile = 34, 
		RULE_viewportIf = 35, RULE_viewportFor = 36, RULE_viewportInstructions = 37, 
		RULE_viewportInstructionsShowElement = 38, RULE_playDef = 39, RULE_decl = 40, 
		RULE_algebricOP = 41, RULE_expr = 42, RULE_assign = 43, RULE_list = 44, 
		RULE_point = 45, RULE_pointRect = 46, RULE_pointPol = 47, RULE_type = 48, 
		RULE_gridProperties = 49, RULE_propertiesKeys = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "importstat", "alphabetDef", "alphabetElement", "automatonDef", 
			"automatonNFADef", "automatonDFADef", "automatonStat", "automatonFor", 
			"automatonWhile", "automatonIf", "stateDef", "propertiesDef", "propertyElement", 
			"transitionDef", "transitionElement", "viewDef", "viewStat", "viewFor", 
			"viewWhile", "viewIf", "transitionRedefine", "transitionPoint", "transitionLabelAlter", 
			"transition", "placeDef", "placeElement", "gridDef", "gridOptions", "animationDef", 
			"viewportDef", "viewportOn", "viewportStat", "viewportWhile", "viewportIf", 
			"viewportFor", "viewportInstructions", "viewportInstructionsShowElement", 
			"playDef", "decl", "algebricOP", "expr", "assign", "list", "point", "pointRect", 
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
			"'pause'", "'play'", "'+'", "'not'", "'*'", "'/'", "'>='", "'<='", "'=='", 
			"'!='", "'and'", "'or'", "'('", "')'", "'read'", "'[prompt='", "'{{'", 
			"'}}'", "':'", "'number'", "'point'", "'list'", "'string'", "'boolean'", 
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
			"Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", "SingleLineComment", 
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			alphabetDef();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116708280578L) != 0)) {
				{
				{
				setState(103);
				stat();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(111);
				importstat();
				}
				break;
			case T__7:
			case T__10:
			case T__11:
				{
				setState(112);
				automatonDef();
				}
				break;
			case T__23:
				{
				setState(113);
				viewDef();
				}
				break;
			case T__33:
				{
				setState(114);
				animationDef();
				}
				break;
			case T__39:
				{
				setState(115);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitImportstat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportstatContext importstat() throws RecognitionException {
		ImportstatContext _localctx = new ImportstatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__0);
			setState(119);
			match(ID);
			setState(120);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAlphabetDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphabetDefContext alphabetDef() throws RecognitionException {
		AlphabetDefContext _localctx = new AlphabetDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alphabetDef);
		try {
			int _alt;
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__2);
				setState(123);
				match(T__3);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						alphabetElement();
						setState(125);
						match(T__4);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(132);
				alphabetElement();
				setState(133);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__2);
				setState(136);
				match(ID);
				setState(137);
				match(T__6);
				setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAlphabetElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphabetElementContext alphabetElement() throws RecognitionException {
		AlphabetElementContext _localctx = new AlphabetElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alphabetElement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(SYMBOL);
				setState(142);
				match(T__6);
				setState(143);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonDefContext automatonDef() throws RecognitionException {
		AutomatonDefContext _localctx = new AutomatonDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_automatonDef);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				automatonNFADef();
				}
				break;
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonNFADef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonNFADef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonNFADef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonNFADefContext automatonNFADef() throws RecognitionException {
		AutomatonNFADefContext _localctx = new AutomatonNFADefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_automatonNFADef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__7);
			setState(152);
			match(ID);
			setState(153);
			match(T__8);
			setState(155); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(154);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(157); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				automatonStat();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436053860655232L) != 0) || _la==Number || _la==ID );
			setState(164);
			transitionDef();
			setState(165);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonDFADef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonDFADef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonDFADef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonDFADefContext automatonDFADef() throws RecognitionException {
		AutomatonDFADefContext _localctx = new AutomatonDFADefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_automatonDFADef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(167);
				((AutomatonDFADefContext)_localctx).complete = match(T__10);
				}
			}

			setState(170);
			match(T__11);
			setState(171);
			match(ID);
			setState(172);
			match(T__8);
			setState(174); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(173);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(176); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				automatonStat();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436053860655232L) != 0) || _la==Number || _la==ID );
			setState(183);
			transitionDef();
			setState(184);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonStatContext automatonStat() throws RecognitionException {
		AutomatonStatContext _localctx = new AutomatonStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_automatonStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(186);
				automatonFor();
				}
				break;
			case 2:
				{
				setState(187);
				automatonIf();
				}
				break;
			case 3:
				{
				setState(188);
				automatonWhile();
				}
				break;
			case 4:
				{
				setState(189);
				propertiesDef();
				}
				break;
			case 5:
				{
				setState(190);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonForContext automatonFor() throws RecognitionException {
		AutomatonForContext _localctx = new AutomatonForContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_automatonFor);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__12);
				setState(194);
				match(ID);
				setState(195);
				match(T__13);
				setState(196);
				expr(0);
				setState(197);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__12);
				setState(200);
				match(ID);
				setState(201);
				match(T__13);
				setState(202);
				expr(0);
				setState(203);
				match(T__8);
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(204);
					automatonStat();
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436053860655232L) != 0) || _la==Number || _la==ID );
				setState(209);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonWhileContext automatonWhile() throws RecognitionException {
		AutomatonWhileContext _localctx = new AutomatonWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_automatonWhile);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__14);
				setState(214);
				expr(0);
				setState(215);
				match(T__15);
				setState(216);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__14);
				setState(219);
				expr(0);
				setState(220);
				match(T__15);
				setState(221);
				match(T__8);
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(222);
					automatonStat();
					}
					}
					setState(225); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436053860655232L) != 0) || _la==Number || _la==ID );
				setState(227);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonIfContext automatonIf() throws RecognitionException {
		AutomatonIfContext _localctx = new AutomatonIfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_automatonIf);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__16);
				setState(232);
				expr(0);
				setState(233);
				match(T__15);
				setState(234);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(T__16);
				setState(237);
				expr(0);
				setState(238);
				match(T__15);
				setState(239);
				match(T__8);
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(240);
					automatonStat();
					}
					}
					setState(243); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436053860655232L) != 0) || _la==Number || _la==ID );
				setState(245);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitStateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__17);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(ID);
					setState(251);
					match(T__4);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(257);
			match(ID);
			setState(258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPropertiesDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesDefContext propertiesDef() throws RecognitionException {
		PropertiesDefContext _localctx = new PropertiesDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ID);
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				propertyElement();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(266);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPropertyElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPropertyElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPropertyElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyElementContext propertyElement() throws RecognitionException {
		PropertyElementContext _localctx = new PropertyElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__18);
			setState(269);
			propertiesKeys();
			setState(270);
			match(T__19);
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271);
					match(ID);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(276);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(279);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionDefContext transitionDef() throws RecognitionException {
		TransitionDefContext _localctx = new TransitionDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__21);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					transitionElement();
					setState(283);
					match(T__4);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(290);
			transitionElement();
			setState(291);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionElementContext transitionElement() throws RecognitionException {
		TransitionElementContext _localctx = new TransitionElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(ID);
			setState(294);
			match(T__22);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(SYMBOL);
					setState(296);
					match(T__4);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(302);
			match(SYMBOL);
			setState(303);
			match(T__22);
			setState(304);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewDefContext viewDef() throws RecognitionException {
		ViewDefContext _localctx = new ViewDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__23);
			setState(307);
			match(ID);
			setState(308);
			match(T__24);
			setState(309);
			match(ID);
			setState(310);
			match(T__8);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436065134944384L) != 0) || _la==Number || _la==ID) {
				{
				{
				setState(311);
				viewStat();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewStatContext viewStat() throws RecognitionException {
		ViewStatContext _localctx = new ViewStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(319);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(320);
				viewFor();
				}
				break;
			case 3:
				{
				setState(321);
				placeDef();
				}
				break;
			case 4:
				{
				setState(322);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(323);
				propertiesDef();
				}
				break;
			case 6:
				{
				setState(324);
				gridDef();
				}
				break;
			case 7:
				{
				setState(325);
				viewIf();
				}
				break;
			case 8:
				{
				setState(326);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewForContext viewFor() throws RecognitionException {
		ViewForContext _localctx = new ViewForContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_viewFor);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__12);
				setState(330);
				match(ID);
				setState(331);
				match(T__13);
				setState(332);
				expr(0);
				setState(333);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(T__12);
				setState(336);
				match(ID);
				setState(337);
				match(T__13);
				setState(338);
				expr(0);
				setState(339);
				match(T__8);
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(340);
					viewStat();
					}
					}
					setState(343); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436065134944384L) != 0) || _la==Number || _la==ID );
				setState(345);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewWhileContext viewWhile() throws RecognitionException {
		ViewWhileContext _localctx = new ViewWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_viewWhile);
		int _la;
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(T__14);
				setState(350);
				expr(0);
				setState(351);
				match(T__15);
				setState(352);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__14);
				setState(355);
				expr(0);
				setState(356);
				match(T__15);
				setState(357);
				match(T__8);
				setState(359); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(358);
					viewStat();
					}
					}
					setState(361); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436065134944384L) != 0) || _la==Number || _la==ID );
				setState(363);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewIfContext viewIf() throws RecognitionException {
		ViewIfContext _localctx = new ViewIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_viewIf);
		int _la;
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(T__16);
				setState(368);
				expr(0);
				setState(369);
				match(T__15);
				setState(370);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(T__16);
				setState(373);
				expr(0);
				setState(374);
				match(T__15);
				setState(375);
				match(T__8);
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(376);
					viewStat();
					}
					}
					setState(379); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436065134944384L) != 0) || _la==Number || _la==ID );
				setState(381);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionRedefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionRedefineContext transitionRedefine() throws RecognitionException {
		TransitionRedefineContext _localctx = new TransitionRedefineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_transitionRedefine);
		try {
			int _alt;
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				transition();
				setState(386);
				match(T__25);
				setState(387);
				transitionPoint();
				setState(388);
				match(T__26);
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						transitionPoint();
						setState(390);
						match(T__26);
						}
						} 
					}
					setState(396);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(397);
				transitionPoint();
				setState(398);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				transitionLabelAlter();
				setState(401);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionPointContext transitionPoint() throws RecognitionException {
		TransitionPointContext _localctx = new TransitionPointContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			expr(0);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(406);
				propertyElement();
				}
				}
				setState(411);
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
		public PropertyElementContext propertyElement() {
			return getRuleContext(PropertyElementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionLabelAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionLabelAlterContext transitionLabelAlter() throws RecognitionException {
		TransitionLabelAlterContext _localctx = new TransitionLabelAlterContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			transition();
			setState(413);
			match(T__27);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(414);
				propertyElement();
				}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__28);
			setState(418);
			match(ID);
			setState(419);
			match(T__4);
			setState(420);
			match(ID);
			setState(421);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPlaceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceDefContext placeDef() throws RecognitionException {
		PlaceDefContext _localctx = new PlaceDefContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__30);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					placeElement();
					setState(425);
					match(T__4);
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(432);
			placeElement();
			setState(433);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPlaceElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlaceElementContext placeElement() throws RecognitionException {
		PlaceElementContext _localctx = new PlaceElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_placeElement);
		try {
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				match(ID);
				setState(436);
				match(T__31);
				setState(437);
				expr(0);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				transitionLabelAlter();
				setState(439);
				match(T__31);
				setState(440);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitGridDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GridDefContext gridDef() throws RecognitionException {
		GridDefContext _localctx = new GridDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__32);
			setState(445);
			match(ID);
			setState(446);
			expr(0);
			setState(447);
			match(T__18);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					gridOptions();
					setState(449);
					match(T__4);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(456);
			gridOptions();
			setState(457);
			match(T__20);
			setState(458);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterGridOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitGridOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitGridOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GridOptionsContext gridOptions() throws RecognitionException {
		GridOptionsContext _localctx = new GridOptionsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			gridProperties();
			setState(461);
			match(T__19);
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(463); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(462);
					match(ID);
					}
					}
					setState(465); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(467);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAnimationDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnimationDefContext animationDef() throws RecognitionException {
		AnimationDefContext _localctx = new AnimationDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__33);
			setState(471);
			match(ID);
			setState(472);
			match(T__8);
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(475);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__34:
					{
					setState(473);
					viewportDef();
					}
					break;
				case T__36:
					{
					setState(474);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 || _la==T__36 );
			setState(479);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportDefContext viewportDef() throws RecognitionException {
		ViewportDefContext _localctx = new ViewportDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__34);
			setState(482);
			match(ID);
			setState(483);
			match(T__12);
			setState(484);
			match(ID);
			setState(485);
			match(T__31);
			setState(486);
			expr(0);
			setState(487);
			match(T__26);
			setState(488);
			match(T__35);
			setState(489);
			expr(0);
			setState(490);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportOn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportOnContext viewportOn() throws RecognitionException {
		ViewportOnContext _localctx = new ViewportOnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(T__36);
			setState(493);
			match(ID);
			setState(494);
			match(T__8);
			setState(496); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(495);
				viewportStat();
				}
				}
				setState(498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436878494376064L) != 0) || _la==Number || _la==ID );
			setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportStatContext viewportStat() throws RecognitionException {
		ViewportStatContext _localctx = new ViewportStatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(502);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(503);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(504);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(505);
				algebricOP();
				}
				break;
			case 5:
				{
				setState(506);
				viewportIf();
				}
				break;
			case 6:
				{
				setState(507);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportWhileContext viewportWhile() throws RecognitionException {
		ViewportWhileContext _localctx = new ViewportWhileContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_viewportWhile);
		int _la;
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(T__14);
				setState(511);
				expr(0);
				setState(512);
				match(T__15);
				setState(513);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(T__14);
				setState(516);
				expr(0);
				setState(517);
				match(T__15);
				setState(518);
				match(T__8);
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(519);
					viewportStat();
					}
					}
					setState(522); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436878494376064L) != 0) || _la==Number || _la==ID );
				setState(524);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportIfContext viewportIf() throws RecognitionException {
		ViewportIfContext _localctx = new ViewportIfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_viewportIf);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(T__16);
				setState(529);
				expr(0);
				setState(530);
				match(T__15);
				setState(531);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(T__16);
				setState(534);
				expr(0);
				setState(535);
				match(T__15);
				setState(536);
				match(T__8);
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(537);
					viewportStat();
					}
					}
					setState(540); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436878494376064L) != 0) || _la==Number || _la==ID );
				setState(542);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportForContext viewportFor() throws RecognitionException {
		ViewportForContext _localctx = new ViewportForContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_viewportFor);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(T__12);
				setState(547);
				match(ID);
				setState(548);
				match(T__13);
				setState(549);
				expr(0);
				setState(550);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(T__12);
				setState(553);
				match(ID);
				setState(554);
				match(T__13);
				setState(555);
				expr(0);
				setState(556);
				match(T__8);
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(557);
					viewportStat();
					}
					}
					setState(560); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8982436878494376064L) != 0) || _la==Number || _la==ID );
				setState(562);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportInstructionsContext viewportInstructions() throws RecognitionException {
		ViewportInstructionsContext _localctx = new ViewportInstructionsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_viewportInstructions);
		try {
			int _alt;
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(566);
				match(T__37);
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						viewportInstructionsShowElement();
						setState(568);
						match(T__4);
						}
						} 
					}
					setState(574);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				setState(575);
				viewportInstructionsShowElement();
				setState(576);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(T__37);
				setState(579);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(580);
				match(T__38);
				setState(581);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportInstructionsShowElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportInstructionsShowElementContext viewportInstructionsShowElement() throws RecognitionException {
		ViewportInstructionsShowElementContext _localctx = new ViewportInstructionsShowElementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(ID);
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(585);
					propertyElement();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPlayDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayDefContext playDef() throws RecognitionException {
		PlayDefContext _localctx = new PlayDefContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(T__39);
			setState(595);
			match(ID);
			setState(596);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_decl);
		try {
			int _alt;
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				type();
				setState(604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(599);
						assign();
						setState(600);
						match(T__4);
						}
						} 
					}
					setState(606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(607);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				type();
				setState(614);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(610);
						match(ID);
						setState(611);
						match(T__4);
						}
						} 
					}
					setState(616);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(617);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAlgebricOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlgebricOPContext algebricOP() throws RecognitionException {
		AlgebricOPContext _localctx = new AlgebricOPContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(621);
				expr(0);
				}
				break;
			case 2:
				{
				setState(622);
				decl();
				}
				break;
			case 3:
				{
				setState(623);
				assign();
				}
				break;
			}
			setState(626);
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
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterMultDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitMultDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitMultDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public IDExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterIDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitIDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointExprContext extends ExprContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public PointExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPointExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPointExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPointExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanthesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterParanthesisExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitParanthesisExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitParanthesisExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterEqualsExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitEqualsExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitEqualsExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParanthesisIDExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ParanthesisIDExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterParanthesisIDExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitParanthesisIDExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitParanthesisIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(advParser.Number, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(advParser.STRING, 0); }
		public ReadExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitReadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompareExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExprContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ListExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAddSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(629);
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
				setState(630);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(T__41);
				setState(632);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new ParanthesisIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				match(T__50);
				setState(634);
				match(ID);
				setState(635);
				match(T__51);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				match(T__50);
				setState(637);
				expr(0);
				setState(638);
				match(T__51);
				}
				break;
			case 5:
				{
				_localctx = new PointExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(641);
				list();
				}
				break;
			case 7:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(642);
				match(Number);
				}
				break;
			case 8:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(644);
				match(T__52);
				setState(648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(645);
					match(T__53);
					setState(646);
					match(STRING);
					setState(647);
					match(T__20);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(652);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(653);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__42 || _la==T__43) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(654);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(655);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(656);
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
						setState(657);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(658);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(659);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 105554726879232L) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(660);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(661);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(662);
						((EqualsExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((EqualsExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(663);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(664);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(665);
						match(T__48);
						setState(666);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(667);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(668);
						match(T__49);
						setState(669);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(ID);
			setState(676);
			match(T__19);
			setState(677);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__54);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					match(ID);
					setState(681);
					match(T__4);
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(687);
			match(ID);
			setState(688);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_point);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPointRect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointRectContext pointRect() throws RecognitionException {
		PointRectContext _localctx = new PointRectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(T__50);
			setState(695);
			match(Number);
			setState(696);
			match(T__4);
			setState(697);
			match(Number);
			setState(698);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPointPol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointPolContext pointPol() throws RecognitionException {
		PointPolContext _localctx = new PointPolContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T__50);
			setState(701);
			match(Number);
			setState(702);
			match(T__56);
			setState(703);
			match(Number);
			setState(704);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
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
		public Token t;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8935141660703326208L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class GridPropertiesContext extends ParserRuleContext {
		public Token prop;
		public GridPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gridProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterGridProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitGridProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitGridProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GridPropertiesContext gridProperties() throws RecognitionException {
		GridPropertiesContext _localctx = new GridPropertiesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			((GridPropertiesContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertiesKeysContext extends ParserRuleContext {
		public Token prop;
		public PropertiesKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertiesKeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterPropertiesKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitPropertiesKeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitPropertiesKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesKeysContext propertiesKeys() throws RecognitionException {
		PropertiesKeysContext _localctx = new PropertiesKeysContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			((PropertiesKeysContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 31L) != 0)) ) {
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
		case 42:
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
		"\u0004\u0001P\u02c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0005\u0000i\b\u0000\n\u0000\f\u0000"+
		"l\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001u\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u0080\b\u0003\n\u0003\f\u0003\u0083\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008c\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u0096"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u009c"+
		"\b\u0006\u000b\u0006\f\u0006\u009d\u0001\u0006\u0004\u0006\u00a1\b\u0006"+
		"\u000b\u0006\f\u0006\u00a2\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u00a9\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u00af\b\u0007\u000b\u0007\f\u0007\u00b0\u0001\u0007\u0004"+
		"\u0007\u00b4\b\u0007\u000b\u0007\f\u0007\u00b5\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c0\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\t\u00ce\b\t\u000b\t\f\t\u00cf\u0001\t"+
		"\u0001\t\u0003\t\u00d4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e0\b\n\u000b\n\f\n\u00e1"+
		"\u0001\n\u0001\n\u0003\n\u00e6\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00f2\b\u000b\u000b\u000b\f\u000b\u00f3\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00f8\b\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00fd\b\f\n\f\f\f\u0100\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0004\r\u0107\b\r\u000b\r\f\r\u0108\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0111\b\u000e\u000b\u000e\f"+
		"\u000e\u0112\u0001\u000e\u0003\u000e\u0116\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u011e\b\u000f"+
		"\n\u000f\f\u000f\u0121\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u012a\b\u0010\n"+
		"\u0010\f\u0010\u012d\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0139\b\u0011\n\u0011\f\u0011\u013c\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0148\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u0156\b\u0013\u000b\u0013\f\u0013\u0157\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u015c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u0168\b\u0014\u000b\u0014\f\u0014\u0169\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u016e\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u017a\b\u0015\u000b\u0015\f\u0015\u017b\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0180\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0189\b\u0016\n"+
		"\u0016\f\u0016\u018c\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0194\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0198\b\u0017\n\u0017\f\u0017\u019b\t\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01a0\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u01ac\b\u001a\n\u001a\f\u001a\u01af"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01bb"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u01c4\b\u001c\n\u001c\f\u001c\u01c7\t\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0004\u001d\u01d0\b\u001d\u000b\u001d\f\u001d\u01d1\u0001"+
		"\u001d\u0003\u001d\u01d5\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0004\u001e\u01dc\b\u001e\u000b\u001e\f\u001e\u01dd"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0004 \u01f1\b \u000b \f \u01f2"+
		"\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u01fd"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0004\"\u0209\b\"\u000b\"\f\"\u020a\u0001\"\u0001\"\u0003\""+
		"\u020f\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0004#\u021b\b#\u000b#\f#\u021c\u0001#\u0001#\u0003#\u0221\b"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0004$\u022f\b$\u000b$\f$\u0230\u0001$\u0001$\u0003$\u0235"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0005%\u023b\b%\n%\f%\u023e\t%\u0001%"+
		"\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0247\b%\u0001&\u0001"+
		"&\u0005&\u024b\b&\n&\f&\u024e\t&\u0001&\u0003&\u0251\b&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0005(\u025b\b(\n(\f(\u025e"+
		"\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0265\b(\n(\f(\u0268\t("+
		"\u0001(\u0001(\u0003(\u026c\b(\u0001)\u0001)\u0001)\u0003)\u0271\b)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0289\b*\u0003*\u028b\b*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u029f\b*\n*\f*\u02a2\t*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0005,\u02ab\b,\n,\f,\u02ae\t,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u02b5\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00012\u00012\u00012\u0000\u0001T3\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0007\u0002\u0000\u0007\u0007))\u0001"+
		"\u0000+,\u0002\u0000\u001d\u001e-.\u0001\u0000/0\u0002\u0000\u0012\u0012"+
		":>\u0001\u0000?B\u0001\u0000CG\u02f3\u0000f\u0001\u0000\u0000\u0000\u0002"+
		"t\u0001\u0000\u0000\u0000\u0004v\u0001\u0000\u0000\u0000\u0006\u008b\u0001"+
		"\u0000\u0000\u0000\b\u0091\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000"+
		"\u0000\u0000\f\u0097\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000\u0000"+
		"\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00d3\u0001\u0000\u0000"+
		"\u0000\u0014\u00e5\u0001\u0000\u0000\u0000\u0016\u00f7\u0001\u0000\u0000"+
		"\u0000\u0018\u00f9\u0001\u0000\u0000\u0000\u001a\u0104\u0001\u0000\u0000"+
		"\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e\u0119\u0001\u0000\u0000"+
		"\u0000 \u0125\u0001\u0000\u0000\u0000\"\u0132\u0001\u0000\u0000\u0000"+
		"$\u0147\u0001\u0000\u0000\u0000&\u015b\u0001\u0000\u0000\u0000(\u016d"+
		"\u0001\u0000\u0000\u0000*\u017f\u0001\u0000\u0000\u0000,\u0193\u0001\u0000"+
		"\u0000\u0000.\u0195\u0001\u0000\u0000\u00000\u019c\u0001\u0000\u0000\u0000"+
		"2\u01a1\u0001\u0000\u0000\u00004\u01a7\u0001\u0000\u0000\u00006\u01ba"+
		"\u0001\u0000\u0000\u00008\u01bc\u0001\u0000\u0000\u0000:\u01cc\u0001\u0000"+
		"\u0000\u0000<\u01d6\u0001\u0000\u0000\u0000>\u01e1\u0001\u0000\u0000\u0000"+
		"@\u01ec\u0001\u0000\u0000\u0000B\u01fc\u0001\u0000\u0000\u0000D\u020e"+
		"\u0001\u0000\u0000\u0000F\u0220\u0001\u0000\u0000\u0000H\u0234\u0001\u0000"+
		"\u0000\u0000J\u0246\u0001\u0000\u0000\u0000L\u0250\u0001\u0000\u0000\u0000"+
		"N\u0252\u0001\u0000\u0000\u0000P\u026b\u0001\u0000\u0000\u0000R\u0270"+
		"\u0001\u0000\u0000\u0000T\u028a\u0001\u0000\u0000\u0000V\u02a3\u0001\u0000"+
		"\u0000\u0000X\u02a7\u0001\u0000\u0000\u0000Z\u02b4\u0001\u0000\u0000\u0000"+
		"\\\u02b6\u0001\u0000\u0000\u0000^\u02bc\u0001\u0000\u0000\u0000`\u02c2"+
		"\u0001\u0000\u0000\u0000b\u02c4\u0001\u0000\u0000\u0000d\u02c6\u0001\u0000"+
		"\u0000\u0000fj\u0003\u0006\u0003\u0000gi\u0003\u0002\u0001\u0000hg\u0001"+
		"\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mn\u0005\u0000\u0000\u0001n\u0001\u0001\u0000\u0000\u0000ou\u0003"+
		"\u0004\u0002\u0000pu\u0003\n\u0005\u0000qu\u0003\"\u0011\u0000ru\u0003"+
		"<\u001e\u0000su\u0003N\'\u0000to\u0001\u0000\u0000\u0000tp\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000u\u0003\u0001\u0000\u0000\u0000vw\u0005\u0001\u0000"+
		"\u0000wx\u0005I\u0000\u0000xy\u0005\u0002\u0000\u0000y\u0005\u0001\u0000"+
		"\u0000\u0000z{\u0005\u0003\u0000\u0000{\u0081\u0005\u0004\u0000\u0000"+
		"|}\u0003\b\u0004\u0000}~\u0005\u0005\u0000\u0000~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f|\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003\b\u0004\u0000\u0085\u0086\u0005\u0006\u0000\u0000\u0086"+
		"\u008c\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088"+
		"\u0089\u0005I\u0000\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008c"+
		"\u0005I\u0000\u0000\u008bz\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000"+
		"\u0000\u0000\u008c\u0007\u0001\u0000\u0000\u0000\u008d\u008e\u0005J\u0000"+
		"\u0000\u008e\u008f\u0005\u0007\u0000\u0000\u008f\u0092\u0005J\u0000\u0000"+
		"\u0090\u0092\u0005J\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0096"+
		"\u0003\f\u0006\u0000\u0094\u0096\u0003\u000e\u0007\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u000b\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\b\u0000\u0000\u0098\u0099\u0005I"+
		"\u0000\u0000\u0099\u009b\u0005\t\u0000\u0000\u009a\u009c\u0003\u0018\f"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0010\b\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003\u001e\u000f\u0000"+
		"\u00a5\u00a6\u0005\n\u0000\u0000\u00a6\r\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0005\u000b\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005\f\u0000\u0000\u00ab\u00ac\u0005I\u0000\u0000\u00ac\u00ae"+
		"\u0005\t\u0000\u0000\u00ad\u00af\u0003\u0018\f\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0003\u0010\b\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0003\u001e\u000f\u0000\u00b8\u00b9\u0005\n\u0000"+
		"\u0000\u00b9\u000f\u0001\u0000\u0000\u0000\u00ba\u00c0\u0003\u0012\t\u0000"+
		"\u00bb\u00c0\u0003\u0016\u000b\u0000\u00bc\u00c0\u0003\u0014\n\u0000\u00bd"+
		"\u00c0\u0003\u001a\r\u0000\u00be\u00c0\u0003R)\u0000\u00bf\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000\u0000\u00bf\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u0011\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005"+
		"\r\u0000\u0000\u00c2\u00c3\u0005I\u0000\u0000\u00c3\u00c4\u0005\u000e"+
		"\u0000\u0000\u00c4\u00c5\u0003T*\u0000\u00c5\u00c6\u0003\u0010\b\u0000"+
		"\u00c6\u00d4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\r\u0000\u0000\u00c8"+
		"\u00c9\u0005I\u0000\u0000\u00c9\u00ca\u0005\u000e\u0000\u0000\u00ca\u00cb"+
		"\u0003T*\u0000\u00cb\u00cd\u0005\t\u0000\u0000\u00cc\u00ce\u0003\u0010"+
		"\b\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\n\u0000\u0000"+
		"\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00c7\u0001\u0000\u0000\u0000\u00d4\u0013\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u000f\u0000\u0000\u00d6\u00d7\u0003T*\u0000\u00d7\u00d8"+
		"\u0005\u0010\u0000\u0000\u00d8\u00d9\u0003\u0010\b\u0000\u00d9\u00e6\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u000f\u0000\u0000\u00db\u00dc\u0003"+
		"T*\u0000\u00dc\u00dd\u0005\u0010\u0000\u0000\u00dd\u00df\u0005\t\u0000"+
		"\u0000\u00de\u00e0\u0003\u0010\b\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\n\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000\u00e5"+
		"\u00d5\u0001\u0000\u0000\u0000\u00e5\u00da\u0001\u0000\u0000\u0000\u00e6"+
		"\u0015\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0011\u0000\u0000\u00e8"+
		"\u00e9\u0003T*\u0000\u00e9\u00ea\u0005\u0010\u0000\u0000\u00ea\u00eb\u0003"+
		"\u0010\b\u0000\u00eb\u00f8\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\u0011"+
		"\u0000\u0000\u00ed\u00ee\u0003T*\u0000\u00ee\u00ef\u0005\u0010\u0000\u0000"+
		"\u00ef\u00f1\u0005\t\u0000\u0000\u00f0\u00f2\u0003\u0010\b\u0000\u00f1"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\n\u0000\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00e7\u0001\u0000\u0000\u0000\u00f7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f8\u0017\u0001\u0000\u0000\u0000\u00f9\u00fe"+
		"\u0005\u0012\u0000\u0000\u00fa\u00fb\u0005I\u0000\u0000\u00fb\u00fd\u0005"+
		"\u0005\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0005I\u0000\u0000\u0102\u0103\u0005\u0002"+
		"\u0000\u0000\u0103\u0019\u0001\u0000\u0000\u0000\u0104\u0106\u0005I\u0000"+
		"\u0000\u0105\u0107\u0003\u001c\u000e\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0005\u0002\u0000\u0000\u010b\u001b\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0013\u0000\u0000\u010d\u010e\u0003d2\u0000\u010e"+
		"\u0115\u0005\u0014\u0000\u0000\u010f\u0111\u0005I\u0000\u0000\u0110\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0110"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0116"+
		"\u0001\u0000\u0000\u0000\u0114\u0116\u0005H\u0000\u0000\u0115\u0110\u0001"+
		"\u0000\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0005\u0015\u0000\u0000\u0118\u001d\u0001"+
		"\u0000\u0000\u0000\u0119\u011f\u0005\u0016\u0000\u0000\u011a\u011b\u0003"+
		" \u0010\u0000\u011b\u011c\u0005\u0005\u0000\u0000\u011c\u011e\u0001\u0000"+
		"\u0000\u0000\u011d\u011a\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0003 \u0010\u0000\u0123\u0124\u0005\u0002\u0000"+
		"\u0000\u0124\u001f\u0001\u0000\u0000\u0000\u0125\u0126\u0005I\u0000\u0000"+
		"\u0126\u012b\u0005\u0017\u0000\u0000\u0127\u0128\u0005J\u0000\u0000\u0128"+
		"\u012a\u0005\u0005\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012e\u012f\u0005J\u0000\u0000\u012f\u0130"+
		"\u0005\u0017\u0000\u0000\u0130\u0131\u0005I\u0000\u0000\u0131!\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0005\u0018\u0000\u0000\u0133\u0134\u0005I\u0000"+
		"\u0000\u0134\u0135\u0005\u0019\u0000\u0000\u0135\u0136\u0005I\u0000\u0000"+
		"\u0136\u013a\u0005\t\u0000\u0000\u0137\u0139\u0003$\u0012\u0000\u0138"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\n\u0000\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u0148"+
		"\u0003R)\u0000\u0140\u0148\u0003&\u0013\u0000\u0141\u0148\u00034\u001a"+
		"\u0000\u0142\u0148\u0003,\u0016\u0000\u0143\u0148\u0003\u001a\r\u0000"+
		"\u0144\u0148\u00038\u001c\u0000\u0145\u0148\u0003*\u0015\u0000\u0146\u0148"+
		"\u0003(\u0014\u0000\u0147\u013f\u0001\u0000\u0000\u0000\u0147\u0140\u0001"+
		"\u0000\u0000\u0000\u0147\u0141\u0001\u0000\u0000\u0000\u0147\u0142\u0001"+
		"\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000\u0147\u0144\u0001"+
		"\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148%\u0001\u0000\u0000\u0000\u0149\u014a\u0005\r"+
		"\u0000\u0000\u014a\u014b\u0005I\u0000\u0000\u014b\u014c\u0005\u000e\u0000"+
		"\u0000\u014c\u014d\u0003T*\u0000\u014d\u014e\u0003$\u0012\u0000\u014e"+
		"\u015c\u0001\u0000\u0000\u0000\u014f\u0150\u0005\r\u0000\u0000\u0150\u0151"+
		"\u0005I\u0000\u0000\u0151\u0152\u0005\u000e\u0000\u0000\u0152\u0153\u0003"+
		"T*\u0000\u0153\u0155\u0005\t\u0000\u0000\u0154\u0156\u0003$\u0012\u0000"+
		"\u0155\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005\n\u0000\u0000\u015a"+
		"\u015c\u0001\u0000\u0000\u0000\u015b\u0149\u0001\u0000\u0000\u0000\u015b"+
		"\u014f\u0001\u0000\u0000\u0000\u015c\'\u0001\u0000\u0000\u0000\u015d\u015e"+
		"\u0005\u000f\u0000\u0000\u015e\u015f\u0003T*\u0000\u015f\u0160\u0005\u0010"+
		"\u0000\u0000\u0160\u0161\u0003$\u0012\u0000\u0161\u016e\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005\u000f\u0000\u0000\u0163\u0164\u0003T*\u0000\u0164"+
		"\u0165\u0005\u0010\u0000\u0000\u0165\u0167\u0005\t\u0000\u0000\u0166\u0168"+
		"\u0003$\u0012\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"\n\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u015d\u0001\u0000"+
		"\u0000\u0000\u016d\u0162\u0001\u0000\u0000\u0000\u016e)\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005\u0011\u0000\u0000\u0170\u0171\u0003T*\u0000\u0171"+
		"\u0172\u0005\u0010\u0000\u0000\u0172\u0173\u0003$\u0012\u0000\u0173\u0180"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0011\u0000\u0000\u0175\u0176"+
		"\u0003T*\u0000\u0176\u0177\u0005\u0010\u0000\u0000\u0177\u0179\u0005\t"+
		"\u0000\u0000\u0178\u017a\u0003$\u0012\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000"+
		"\u017f\u016f\u0001\u0000\u0000\u0000\u017f\u0174\u0001\u0000\u0000\u0000"+
		"\u0180+\u0001\u0000\u0000\u0000\u0181\u0182\u00032\u0019\u0000\u0182\u0183"+
		"\u0005\u001a\u0000\u0000\u0183\u0184\u0003.\u0017\u0000\u0184\u018a\u0005"+
		"\u001b\u0000\u0000\u0185\u0186\u0003.\u0017\u0000\u0186\u0187\u0005\u001b"+
		"\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0185\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000"+
		"\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0003.\u0017"+
		"\u0000\u018e\u018f\u0005\u0002\u0000\u0000\u018f\u0194\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u00030\u0018\u0000\u0191\u0192\u0005\u0002\u0000\u0000"+
		"\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0181\u0001\u0000\u0000\u0000"+
		"\u0193\u0190\u0001\u0000\u0000\u0000\u0194-\u0001\u0000\u0000\u0000\u0195"+
		"\u0199\u0003T*\u0000\u0196\u0198\u0003\u001c\u000e\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a/\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u00032\u0019"+
		"\u0000\u019d\u019f\u0005\u001c\u0000\u0000\u019e\u01a0\u0003\u001c\u000e"+
		"\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a01\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u001d\u0000\u0000"+
		"\u01a2\u01a3\u0005I\u0000\u0000\u01a3\u01a4\u0005\u0005\u0000\u0000\u01a4"+
		"\u01a5\u0005I\u0000\u0000\u01a5\u01a6\u0005\u001e\u0000\u0000\u01a63\u0001"+
		"\u0000\u0000\u0000\u01a7\u01ad\u0005\u001f\u0000\u0000\u01a8\u01a9\u0003"+
		"6\u001b\u0000\u01a9\u01aa\u0005\u0005\u0000\u0000\u01aa\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a8\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u00036\u001b\u0000\u01b1\u01b2\u0005\u0002\u0000"+
		"\u0000\u01b25\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005I\u0000\u0000\u01b4"+
		"\u01b5\u0005 \u0000\u0000\u01b5\u01bb\u0003T*\u0000\u01b6\u01b7\u0003"+
		"0\u0018\u0000\u01b7\u01b8\u0005 \u0000\u0000\u01b8\u01b9\u0003T*\u0000"+
		"\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01b3\u0001\u0000\u0000\u0000"+
		"\u01ba\u01b6\u0001\u0000\u0000\u0000\u01bb7\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005!\u0000\u0000\u01bd\u01be\u0005I\u0000\u0000\u01be\u01bf\u0003"+
		"T*\u0000\u01bf\u01c5\u0005\u0013\u0000\u0000\u01c0\u01c1\u0003:\u001d"+
		"\u0000\u01c1\u01c2\u0005\u0005\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0003:\u001d\u0000\u01c9\u01ca\u0005\u0015\u0000\u0000"+
		"\u01ca\u01cb\u0005\u0002\u0000\u0000\u01cb9\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0003b1\u0000\u01cd\u01d4\u0005\u0014\u0000\u0000\u01ce\u01d0\u0005"+
		"I\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005H\u0000"+
		"\u0000\u01d4\u01cf\u0001\u0000\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d5;\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\"\u0000\u0000"+
		"\u01d7\u01d8\u0005I\u0000\u0000\u01d8\u01db\u0005\t\u0000\u0000\u01d9"+
		"\u01dc\u0003>\u001f\u0000\u01da\u01dc\u0003@ \u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"+
		"\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01de\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0005"+
		"\n\u0000\u0000\u01e0=\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005#\u0000"+
		"\u0000\u01e2\u01e3\u0005I\u0000\u0000\u01e3\u01e4\u0005\r\u0000\u0000"+
		"\u01e4\u01e5\u0005I\u0000\u0000\u01e5\u01e6\u0005 \u0000\u0000\u01e6\u01e7"+
		"\u0003T*\u0000\u01e7\u01e8\u0005\u001b\u0000\u0000\u01e8\u01e9\u0005$"+
		"\u0000\u0000\u01e9\u01ea\u0003T*\u0000\u01ea\u01eb\u0005\u0002\u0000\u0000"+
		"\u01eb?\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005%\u0000\u0000\u01ed\u01ee"+
		"\u0005I\u0000\u0000\u01ee\u01f0\u0005\t\u0000\u0000\u01ef\u01f1\u0003"+
		"B!\u0000\u01f0\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\n\u0000\u0000"+
		"\u01f5A\u0001\u0000\u0000\u0000\u01f6\u01fd\u0003\u001a\r\u0000\u01f7"+
		"\u01fd\u0003H$\u0000\u01f8\u01fd\u0003J%\u0000\u01f9\u01fd\u0003R)\u0000"+
		"\u01fa\u01fd\u0003F#\u0000\u01fb\u01fd\u0003D\"\u0000\u01fc\u01f6\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f7\u0001\u0000\u0000\u0000\u01fc\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fdC\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005\u000f\u0000\u0000\u01ff\u0200\u0003T*\u0000"+
		"\u0200\u0201\u0005\u0010\u0000\u0000\u0201\u0202\u0003B!\u0000\u0202\u020f"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u000f\u0000\u0000\u0204\u0205"+
		"\u0003T*\u0000\u0205\u0206\u0005\u0010\u0000\u0000\u0206\u0208\u0005\t"+
		"\u0000\u0000\u0207\u0209\u0003B!\u0000\u0208\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020a\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000\u0000"+
		"\u020c\u020d\u0005\n\u0000\u0000\u020d\u020f\u0001\u0000\u0000\u0000\u020e"+
		"\u01fe\u0001\u0000\u0000\u0000\u020e\u0203\u0001\u0000\u0000\u0000\u020f"+
		"E\u0001\u0000\u0000\u0000\u0210\u0211\u0005\u0011\u0000\u0000\u0211\u0212"+
		"\u0003T*\u0000\u0212\u0213\u0005\u0010\u0000\u0000\u0213\u0214\u0003B"+
		"!\u0000\u0214\u0221\u0001\u0000\u0000\u0000\u0215\u0216\u0005\u0011\u0000"+
		"\u0000\u0216\u0217\u0003T*\u0000\u0217\u0218\u0005\u0010\u0000\u0000\u0218"+
		"\u021a\u0005\t\u0000\u0000\u0219\u021b\u0003B!\u0000\u021a\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0005\n\u0000\u0000\u021f\u0221\u0001\u0000"+
		"\u0000\u0000\u0220\u0210\u0001\u0000\u0000\u0000\u0220\u0215\u0001\u0000"+
		"\u0000\u0000\u0221G\u0001\u0000\u0000\u0000\u0222\u0223\u0005\r\u0000"+
		"\u0000\u0223\u0224\u0005I\u0000\u0000\u0224\u0225\u0005\u000e\u0000\u0000"+
		"\u0225\u0226\u0003T*\u0000\u0226\u0227\u0003B!\u0000\u0227\u0235\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0005\r\u0000\u0000\u0229\u022a\u0005I"+
		"\u0000\u0000\u022a\u022b\u0005\u000e\u0000\u0000\u022b\u022c\u0003T*\u0000"+
		"\u022c\u022e\u0005\t\u0000\u0000\u022d\u022f\u0003B!\u0000\u022e\u022d"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0001\u0000\u0000\u0000\u0232\u0233\u0005\n\u0000\u0000\u0233\u0235\u0001"+
		"\u0000\u0000\u0000\u0234\u0222\u0001\u0000\u0000\u0000\u0234\u0228\u0001"+
		"\u0000\u0000\u0000\u0235I\u0001\u0000\u0000\u0000\u0236\u023c\u0005&\u0000"+
		"\u0000\u0237\u0238\u0003L&\u0000\u0238\u0239\u0005\u0005\u0000\u0000\u0239"+
		"\u023b\u0001\u0000\u0000\u0000\u023a\u0237\u0001\u0000\u0000\u0000\u023b"+
		"\u023e\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u0001\u0000\u0000\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e"+
		"\u023c\u0001\u0000\u0000\u0000\u023f\u0240\u0003L&\u0000\u0240\u0241\u0005"+
		"\u0002\u0000\u0000\u0241\u0247\u0001\u0000\u0000\u0000\u0242\u0243\u0005"+
		"&\u0000\u0000\u0243\u0247\u0005\u0002\u0000\u0000\u0244\u0245\u0005\'"+
		"\u0000\u0000\u0245\u0247\u0005\u0002\u0000\u0000\u0246\u0236\u0001\u0000"+
		"\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000"+
		"\u0000\u0000\u0247K\u0001\u0000\u0000\u0000\u0248\u024c\u0005I\u0000\u0000"+
		"\u0249\u024b\u0003\u001c\u000e\u0000\u024a\u0249\u0001\u0000\u0000\u0000"+
		"\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u0251\u0001\u0000\u0000\u0000"+
		"\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0251\u00032\u0019\u0000\u0250"+
		"\u0248\u0001\u0000\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0251"+
		"M\u0001\u0000\u0000\u0000\u0252\u0253\u0005(\u0000\u0000\u0253\u0254\u0005"+
		"I\u0000\u0000\u0254\u0255\u0005\u0002\u0000\u0000\u0255O\u0001\u0000\u0000"+
		"\u0000\u0256\u025c\u0003`0\u0000\u0257\u0258\u0003V+\u0000\u0258\u0259"+
		"\u0005\u0005\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000\u025a\u0257"+
		"\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025a"+
		"\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f"+
		"\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025f\u0260"+
		"\u0003V+\u0000\u0260\u026c\u0001\u0000\u0000\u0000\u0261\u0266\u0003`"+
		"0\u0000\u0262\u0263\u0005I\u0000\u0000\u0263\u0265\u0005\u0005\u0000\u0000"+
		"\u0264\u0262\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000"+
		"\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0005I\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b"+
		"\u0256\u0001\u0000\u0000\u0000\u026b\u0261\u0001\u0000\u0000\u0000\u026c"+
		"Q\u0001\u0000\u0000\u0000\u026d\u0271\u0003T*\u0000\u026e\u0271\u0003"+
		"P(\u0000\u026f\u0271\u0003V+\u0000\u0270\u026d\u0001\u0000\u0000\u0000"+
		"\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0005\u0002\u0000\u0000"+
		"\u0273S\u0001\u0000\u0000\u0000\u0274\u0275\u0006*\uffff\uffff\u0000\u0275"+
		"\u0276\u0007\u0000\u0000\u0000\u0276\u028b\u0003T*\u000f\u0277\u0278\u0005"+
		"*\u0000\u0000\u0278\u028b\u0003T*\u000e\u0279\u027a\u00053\u0000\u0000"+
		"\u027a\u027b\u0005I\u0000\u0000\u027b\u028b\u00054\u0000\u0000\u027c\u027d"+
		"\u00053\u0000\u0000\u027d\u027e\u0003T*\u0000\u027e\u027f\u00054\u0000"+
		"\u0000\u027f\u028b\u0001\u0000\u0000\u0000\u0280\u028b\u0003Z-\u0000\u0281"+
		"\u028b\u0003X,\u0000\u0282\u028b\u0005H\u0000\u0000\u0283\u028b\u0005"+
		"I\u0000\u0000\u0284\u0288\u00055\u0000\u0000\u0285\u0286\u00056\u0000"+
		"\u0000\u0286\u0287\u0005K\u0000\u0000\u0287\u0289\u0005\u0015\u0000\u0000"+
		"\u0288\u0285\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000"+
		"\u0289\u028b\u0001\u0000\u0000\u0000\u028a\u0274\u0001\u0000\u0000\u0000"+
		"\u028a\u0277\u0001\u0000\u0000\u0000\u028a\u0279\u0001\u0000\u0000\u0000"+
		"\u028a\u027c\u0001\u0000\u0000\u0000\u028a\u0280\u0001\u0000\u0000\u0000"+
		"\u028a\u0281\u0001\u0000\u0000\u0000\u028a\u0282\u0001\u0000\u0000\u0000"+
		"\u028a\u0283\u0001\u0000\u0000\u0000\u028a\u0284\u0001\u0000\u0000\u0000"+
		"\u028b\u02a0\u0001\u0000\u0000\u0000\u028c\u028d\n\r\u0000\u0000\u028d"+
		"\u028e\u0007\u0001\u0000\u0000\u028e\u029f\u0003T*\u000e\u028f\u0290\n"+
		"\f\u0000\u0000\u0290\u0291\u0007\u0000\u0000\u0000\u0291\u029f\u0003T"+
		"*\r\u0292\u0293\n\u000b\u0000\u0000\u0293\u0294\u0007\u0002\u0000\u0000"+
		"\u0294\u029f\u0003T*\f\u0295\u0296\n\n\u0000\u0000\u0296\u0297\u0007\u0003"+
		"\u0000\u0000\u0297\u029f\u0003T*\u000b\u0298\u0299\n\t\u0000\u0000\u0299"+
		"\u029a\u00051\u0000\u0000\u029a\u029f\u0003T*\n\u029b\u029c\n\b\u0000"+
		"\u0000\u029c\u029d\u00052\u0000\u0000\u029d\u029f\u0003T*\t\u029e\u028c"+
		"\u0001\u0000\u0000\u0000\u029e\u028f\u0001\u0000\u0000\u0000\u029e\u0292"+
		"\u0001\u0000\u0000\u0000\u029e\u0295\u0001\u0000\u0000\u0000\u029e\u0298"+
		"\u0001\u0000\u0000\u0000\u029e\u029b\u0001\u0000\u0000\u0000\u029f\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a1U\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a3\u02a4\u0005I\u0000\u0000\u02a4\u02a5\u0005\u0014"+
		"\u0000\u0000\u02a5\u02a6\u0003T*\u0000\u02a6W\u0001\u0000\u0000\u0000"+
		"\u02a7\u02ac\u00057\u0000\u0000\u02a8\u02a9\u0005I\u0000\u0000\u02a9\u02ab"+
		"\u0005\u0005\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ad"+
		"\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0005I\u0000\u0000\u02b0\u02b1\u0005"+
		"8\u0000\u0000\u02b1Y\u0001\u0000\u0000\u0000\u02b2\u02b5\u0003\\.\u0000"+
		"\u02b3\u02b5\u0003^/\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b5[\u0001\u0000\u0000\u0000\u02b6\u02b7\u0005"+
		"3\u0000\u0000\u02b7\u02b8\u0005H\u0000\u0000\u02b8\u02b9\u0005\u0005\u0000"+
		"\u0000\u02b9\u02ba\u0005H\u0000\u0000\u02ba\u02bb\u00054\u0000\u0000\u02bb"+
		"]\u0001\u0000\u0000\u0000\u02bc\u02bd\u00053\u0000\u0000\u02bd\u02be\u0005"+
		"H\u0000\u0000\u02be\u02bf\u00059\u0000\u0000\u02bf\u02c0\u0005H\u0000"+
		"\u0000\u02c0\u02c1\u00054\u0000\u0000\u02c1_\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0007\u0004\u0000\u0000\u02c3a\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0007\u0005\u0000\u0000\u02c5c\u0001\u0000\u0000\u0000\u02c6\u02c7\u0007"+
		"\u0006\u0000\u0000\u02c7e\u0001\u0000\u0000\u0000Ajt\u0081\u008b\u0091"+
		"\u0095\u009d\u00a2\u00a8\u00b0\u00b5\u00bf\u00cf\u00d3\u00e1\u00e5\u00f3"+
		"\u00f7\u00fe\u0108\u0112\u0115\u011f\u012b\u013a\u0147\u0157\u015b\u0169"+
		"\u016d\u017b\u017f\u018a\u0193\u0199\u019f\u01ad\u01ba\u01c5\u01d1\u01d4"+
		"\u01db\u01dd\u01f2\u01fc\u020a\u020e\u021c\u0220\u0230\u0234\u023c\u0246"+
		"\u024c\u0250\u025c\u0266\u026b\u0270\u0288\u028a\u029e\u02a0\u02ac\u02b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}