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
			setState(104);
			alphabetDef();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1116708280578L) != 0)) {
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878563058442112L) != 0) || _la==Number || _la==ID );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878563058442112L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878563058442112L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878563058442112L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878563058442112L) != 0) || _la==Number || _la==ID );
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -481878551784152960L) != 0) || _la==Number || _la==ID) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878551784152960L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878551784152960L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481878551784152960L) != 0) || _la==Number || _la==ID );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransitionLabelAlterWithCommaContext extends ParserRuleContext {
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public TransitionLabelAlterWithCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionLabelAlterWithComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionLabelAlterWithComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionLabelAlterWithComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionLabelAlterWithComma(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class TransitionplaceElementContext extends PlaceElementContext {
		public TransitionLabelAlterContext transitionLabelAlter() {
			return getRuleContext(TransitionLabelAlterContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TransitionplaceElementContext(PlaceElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterTransitionplaceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitTransitionplaceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitTransitionplaceElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDplaceElementContext extends PlaceElementContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IDplaceElementContext(PlaceElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterIDplaceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitIDplaceElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitIDplaceElement(this);
			else return visitor.visitChildren(this);
		}
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481877738424721280L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481877738424721280L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481877738424721280L) != 0) || _la==Number || _la==ID );
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481877738424721280L) != 0) || _la==Number || _la==ID );
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61572651155456L) != 0)) ) {
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
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 211107843145728L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 98, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -576460752303161344L) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			((GridPropertiesContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) ) {
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
		enterRule(_localctx, 102, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			((PropertiesKeysContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 31L) != 0)) ) {
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
		"\u0004\u0001Q\u02cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0005\u0000k\b\u0000\n"+
		"\u0000\f\u0000n\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u008e\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0098\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006\u009e\b\u0006\u000b\u0006\f\u0006\u009f\u0001\u0006\u0004\u0006"+
		"\u00a3\b\u0006\u000b\u0006\f\u0006\u00a4\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0003\u0007\u00ab\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0004\u0007\u00b1\b\u0007\u000b\u0007\f\u0007\u00b2"+
		"\u0001\u0007\u0004\u0007\u00b6\b\u0007\u000b\u0007\f\u0007\u00b7\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00d0\b\t\u000b\t\f"+
		"\t\u00d1\u0001\t\u0001\t\u0003\t\u00d6\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e2\b\n\u000b"+
		"\n\f\n\u00e3\u0001\n\u0001\n\u0003\n\u00e8\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u00f4\b\u000b\u000b\u000b\f\u000b"+
		"\u00f5\u0001\u000b\u0001\u000b\u0003\u000b\u00fa\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ff\b\f\n\f\f\f\u0102\t\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0004\r\u0109\b\r\u000b\r\f\r\u010a\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u0113\b\u000e\u000b"+
		"\u000e\f\u000e\u0114\u0001\u000e\u0003\u000e\u0118\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0120\b\u000f\n\u000f\f\u000f\u0123\t\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u012c"+
		"\b\u0010\n\u0010\f\u0010\u012f\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u013b\b\u0011\n\u0011\f\u0011\u013e\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014a\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004"+
		"\u0013\u0158\b\u0013\u000b\u0013\f\u0013\u0159\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u015e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u016a\b\u0014\u000b\u0014\f\u0014\u016b\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0170\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0004\u0015\u017c\b\u0015\u000b\u0015\f\u0015\u017d\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0182\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u018b\b\u0016"+
		"\n\u0016\f\u0016\u018e\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u0195\b\u0017\n\u0017\f\u0017\u0198\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u019d\b\u0018\n\u0018"+
		"\f\u0018\u01a0\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01af\b\u001b\n\u001b"+
		"\f\u001b\u01b2\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01be\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u01c7\b\u001d\n\u001d"+
		"\f\u001d\u01ca\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u01d3\b\u001e\u000b\u001e"+
		"\f\u001e\u01d4\u0001\u001e\u0003\u001e\u01d8\b\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f\u01df\b\u001f\u000b"+
		"\u001f\f\u001f\u01e0\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0004!\u01f4\b!\u000b!\f!\u01f5\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0200\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0004#\u020c\b#\u000b"+
		"#\f#\u020d\u0001#\u0001#\u0003#\u0212\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0004$\u021e\b$\u000b$\f$\u021f\u0001"+
		"$\u0001$\u0003$\u0224\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004%\u0232\b%\u000b%\f%\u0233\u0001"+
		"%\u0001%\u0003%\u0238\b%\u0001&\u0001&\u0001&\u0001&\u0005&\u023e\b&\n"+
		"&\f&\u0241\t&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&"+
		"\u024a\b&\u0001\'\u0001\'\u0005\'\u024e\b\'\n\'\f\'\u0251\t\'\u0001\'"+
		"\u0003\'\u0254\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u025e\b)\n)\f)\u0261\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u0268\b)\n)\f)\u026b\t)\u0001)\u0001)\u0003)\u026f\b)\u0001*\u0001*"+
		"\u0001*\u0003*\u0274\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u028c\b+\u0003+\u028e\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u02a2\b+\n+"+
		"\f+\u02a5\t+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u02ae"+
		"\b-\n-\f-\u02b1\t-\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u02b8\b."+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u0000"+
		"\u0001V4\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0007\u0002"+
		"\u0000\u0007\u0007))\u0001\u0000+-\u0002\u0000\u001d\u001e./\u0001\u0000"+
		"01\u0002\u0000\u0012\u0012;?\u0001\u0000@C\u0001\u0000DH\u02f4\u0000h"+
		"\u0001\u0000\u0000\u0000\u0002v\u0001\u0000\u0000\u0000\u0004x\u0001\u0000"+
		"\u0000\u0000\u0006\u008d\u0001\u0000\u0000\u0000\b\u0093\u0001\u0000\u0000"+
		"\u0000\n\u0097\u0001\u0000\u0000\u0000\f\u0099\u0001\u0000\u0000\u0000"+
		"\u000e\u00aa\u0001\u0000\u0000\u0000\u0010\u00c1\u0001\u0000\u0000\u0000"+
		"\u0012\u00d5\u0001\u0000\u0000\u0000\u0014\u00e7\u0001\u0000\u0000\u0000"+
		"\u0016\u00f9\u0001\u0000\u0000\u0000\u0018\u00fb\u0001\u0000\u0000\u0000"+
		"\u001a\u0106\u0001\u0000\u0000\u0000\u001c\u010e\u0001\u0000\u0000\u0000"+
		"\u001e\u011b\u0001\u0000\u0000\u0000 \u0127\u0001\u0000\u0000\u0000\""+
		"\u0134\u0001\u0000\u0000\u0000$\u0149\u0001\u0000\u0000\u0000&\u015d\u0001"+
		"\u0000\u0000\u0000(\u016f\u0001\u0000\u0000\u0000*\u0181\u0001\u0000\u0000"+
		"\u0000,\u0183\u0001\u0000\u0000\u0000.\u0192\u0001\u0000\u0000\u00000"+
		"\u0199\u0001\u0000\u0000\u00002\u01a1\u0001\u0000\u0000\u00004\u01a4\u0001"+
		"\u0000\u0000\u00006\u01aa\u0001\u0000\u0000\u00008\u01bd\u0001\u0000\u0000"+
		"\u0000:\u01bf\u0001\u0000\u0000\u0000<\u01cf\u0001\u0000\u0000\u0000>"+
		"\u01d9\u0001\u0000\u0000\u0000@\u01e4\u0001\u0000\u0000\u0000B\u01ef\u0001"+
		"\u0000\u0000\u0000D\u01ff\u0001\u0000\u0000\u0000F\u0211\u0001\u0000\u0000"+
		"\u0000H\u0223\u0001\u0000\u0000\u0000J\u0237\u0001\u0000\u0000\u0000L"+
		"\u0249\u0001\u0000\u0000\u0000N\u0253\u0001\u0000\u0000\u0000P\u0255\u0001"+
		"\u0000\u0000\u0000R\u026e\u0001\u0000\u0000\u0000T\u0273\u0001\u0000\u0000"+
		"\u0000V\u028d\u0001\u0000\u0000\u0000X\u02a6\u0001\u0000\u0000\u0000Z"+
		"\u02aa\u0001\u0000\u0000\u0000\\\u02b7\u0001\u0000\u0000\u0000^\u02b9"+
		"\u0001\u0000\u0000\u0000`\u02bf\u0001\u0000\u0000\u0000b\u02c5\u0001\u0000"+
		"\u0000\u0000d\u02c7\u0001\u0000\u0000\u0000f\u02c9\u0001\u0000\u0000\u0000"+
		"hl\u0003\u0006\u0003\u0000ik\u0003\u0002\u0001\u0000ji\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005"+
		"\u0000\u0000\u0001p\u0001\u0001\u0000\u0000\u0000qw\u0003\u0004\u0002"+
		"\u0000rw\u0003\n\u0005\u0000sw\u0003\"\u0011\u0000tw\u0003>\u001f\u0000"+
		"uw\u0003P(\u0000vq\u0001\u0000\u0000\u0000vr\u0001\u0000\u0000\u0000v"+
		"s\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vu\u0001\u0000\u0000"+
		"\u0000w\u0003\u0001\u0000\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0005"+
		"J\u0000\u0000z{\u0005\u0002\u0000\u0000{\u0005\u0001\u0000\u0000\u0000"+
		"|}\u0005\u0003\u0000\u0000}\u0083\u0005\u0004\u0000\u0000~\u007f\u0003"+
		"\b\u0004\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0082\u0001\u0000"+
		"\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0003\b\u0004\u0000\u0087\u0088\u0005\u0006\u0000\u0000"+
		"\u0088\u008e\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0003\u0000\u0000"+
		"\u008a\u008b\u0005J\u0000\u0000\u008b\u008c\u0005\u0007\u0000\u0000\u008c"+
		"\u008e\u0005J\u0000\u0000\u008d|\u0001\u0000\u0000\u0000\u008d\u0089\u0001"+
		"\u0000\u0000\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"K\u0000\u0000\u0090\u0091\u0005\u0007\u0000\u0000\u0091\u0094\u0005K\u0000"+
		"\u0000\u0092\u0094\u0005K\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000"+
		"\u0093\u0092\u0001\u0000\u0000\u0000\u0094\t\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0003\f\u0006\u0000\u0096\u0098\u0003\u000e\u0007\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u000b"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0005\b\u0000\u0000\u009a\u009b\u0005"+
		"J\u0000\u0000\u009b\u009d\u0005\t\u0000\u0000\u009c\u009e\u0003\u0018"+
		"\f\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u00a3\u0003\u0010\b\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u001e\u000f\u0000"+
		"\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0005\u000b\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005\f\u0000\u0000\u00ad\u00ae\u0005J\u0000\u0000\u00ae\u00b0"+
		"\u0005\t\u0000\u0000\u00af\u00b1\u0003\u0018\f\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0003\u0010\b\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0003\u001e\u000f\u0000\u00ba\u00bb\u0005\n\u0000"+
		"\u0000\u00bb\u000f\u0001\u0000\u0000\u0000\u00bc\u00c2\u0003\u0012\t\u0000"+
		"\u00bd\u00c2\u0003\u0016\u000b\u0000\u00be\u00c2\u0003\u0014\n\u0000\u00bf"+
		"\u00c2\u0003\u001a\r\u0000\u00c0\u00c2\u0003T*\u0000\u00c1\u00bc\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"\r\u0000\u0000\u00c4\u00c5\u0005J\u0000\u0000\u00c5\u00c6\u0005\u000e"+
		"\u0000\u0000\u00c6\u00c7\u0003V+\u0000\u00c7\u00c8\u0003\u0010\b\u0000"+
		"\u00c8\u00d6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca"+
		"\u00cb\u0005J\u0000\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc\u00cd"+
		"\u0003V+\u0000\u00cd\u00cf\u0005\t\u0000\u0000\u00ce\u00d0\u0003\u0010"+
		"\b\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\n\u0000\u0000"+
		"\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00c9\u0001\u0000\u0000\u0000\u00d6\u0013\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u000f\u0000\u0000\u00d8\u00d9\u0003V+\u0000\u00d9\u00da"+
		"\u0005\u0010\u0000\u0000\u00da\u00db\u0003\u0010\b\u0000\u00db\u00e8\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000\u00dd\u00de\u0003"+
		"V+\u0000\u00de\u00df\u0005\u0010\u0000\u0000\u00df\u00e1\u0005\t\u0000"+
		"\u0000\u00e0\u00e2\u0003\u0010\b\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0005\n\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e7\u00dc\u0001\u0000\u0000\u0000\u00e8"+
		"\u0015\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0011\u0000\u0000\u00ea"+
		"\u00eb\u0003V+\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00ed\u0003"+
		"\u0010\b\u0000\u00ed\u00fa\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0011"+
		"\u0000\u0000\u00ef\u00f0\u0003V+\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000"+
		"\u00f1\u00f3\u0005\t\u0000\u0000\u00f2\u00f4\u0003\u0010\b\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u00fa"+
		"\u0001\u0000\u0000\u0000\u00f9\u00e9\u0001\u0000\u0000\u0000\u00f9\u00ee"+
		"\u0001\u0000\u0000\u0000\u00fa\u0017\u0001\u0000\u0000\u0000\u00fb\u0100"+
		"\u0005\u0012\u0000\u0000\u00fc\u00fd\u0005J\u0000\u0000\u00fd\u00ff\u0005"+
		"\u0005\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001"+
		"\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u0100\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005J\u0000\u0000\u0104\u0105\u0005\u0002"+
		"\u0000\u0000\u0105\u0019\u0001\u0000\u0000\u0000\u0106\u0108\u0005J\u0000"+
		"\u0000\u0107\u0109\u0003\u001c\u000e\u0000\u0108\u0107\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005\u0002\u0000\u0000\u010d\u001b\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0005\u0013\u0000\u0000\u010f\u0110\u0003f3\u0000\u0110"+
		"\u0117\u0005\u0014\u0000\u0000\u0111\u0113\u0005J\u0000\u0000\u0112\u0111"+
		"\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0118"+
		"\u0001\u0000\u0000\u0000\u0116\u0118\u0005I\u0000\u0000\u0117\u0112\u0001"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\u0015\u0000\u0000\u011a\u001d\u0001"+
		"\u0000\u0000\u0000\u011b\u0121\u0005\u0016\u0000\u0000\u011c\u011d\u0003"+
		" \u0010\u0000\u011d\u011e\u0005\u0005\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120\u0123\u0001\u0000"+
		"\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0003 \u0010\u0000\u0125\u0126\u0005\u0002\u0000"+
		"\u0000\u0126\u001f\u0001\u0000\u0000\u0000\u0127\u0128\u0005J\u0000\u0000"+
		"\u0128\u012d\u0005\u0017\u0000\u0000\u0129\u012a\u0005K\u0000\u0000\u012a"+
		"\u012c\u0005\u0005\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0005K\u0000\u0000\u0131\u0132"+
		"\u0005\u0017\u0000\u0000\u0132\u0133\u0005J\u0000\u0000\u0133!\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005\u0018\u0000\u0000\u0135\u0136\u0005J\u0000"+
		"\u0000\u0136\u0137\u0005\u0019\u0000\u0000\u0137\u0138\u0005J\u0000\u0000"+
		"\u0138\u013c\u0005\t\u0000\u0000\u0139\u013b\u0003$\u0012\u0000\u013a"+
		"\u0139\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013f\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f"+
		"\u0140\u0005\n\u0000\u0000\u0140#\u0001\u0000\u0000\u0000\u0141\u014a"+
		"\u0003T*\u0000\u0142\u014a\u0003&\u0013\u0000\u0143\u014a\u00036\u001b"+
		"\u0000\u0144\u014a\u0003,\u0016\u0000\u0145\u014a\u00032\u0019\u0000\u0146"+
		"\u014a\u0003:\u001d\u0000\u0147\u014a\u0003*\u0015\u0000\u0148\u014a\u0003"+
		"(\u0014\u0000\u0149\u0141\u0001\u0000\u0000\u0000\u0149\u0142\u0001\u0000"+
		"\u0000\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u0149\u0144\u0001\u0000"+
		"\u0000\u0000\u0149\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000"+
		"\u0000\u0000\u014a%\u0001\u0000\u0000\u0000\u014b\u014c\u0005\r\u0000"+
		"\u0000\u014c\u014d\u0005J\u0000\u0000\u014d\u014e\u0005\u000e\u0000\u0000"+
		"\u014e\u014f\u0003V+\u0000\u014f\u0150\u0003$\u0012\u0000\u0150\u015e"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0005\r\u0000\u0000\u0152\u0153\u0005"+
		"J\u0000\u0000\u0153\u0154\u0005\u000e\u0000\u0000\u0154\u0155\u0003V+"+
		"\u0000\u0155\u0157\u0005\t\u0000\u0000\u0156\u0158\u0003$\u0012\u0000"+
		"\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000"+
		"\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0005\n\u0000\u0000\u015c"+
		"\u015e\u0001\u0000\u0000\u0000\u015d\u014b\u0001\u0000\u0000\u0000\u015d"+
		"\u0151\u0001\u0000\u0000\u0000\u015e\'\u0001\u0000\u0000\u0000\u015f\u0160"+
		"\u0005\u000f\u0000\u0000\u0160\u0161\u0003V+\u0000\u0161\u0162\u0005\u0010"+
		"\u0000\u0000\u0162\u0163\u0003$\u0012\u0000\u0163\u0170\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005\u000f\u0000\u0000\u0165\u0166\u0003V+\u0000\u0166"+
		"\u0167\u0005\u0010\u0000\u0000\u0167\u0169\u0005\t\u0000\u0000\u0168\u016a"+
		"\u0003$\u0012\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005"+
		"\n\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u015f\u0001\u0000"+
		"\u0000\u0000\u016f\u0164\u0001\u0000\u0000\u0000\u0170)\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0005\u0011\u0000\u0000\u0172\u0173\u0003V+\u0000\u0173"+
		"\u0174\u0005\u0010\u0000\u0000\u0174\u0175\u0003$\u0012\u0000\u0175\u0182"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0011\u0000\u0000\u0177\u0178"+
		"\u0003V+\u0000\u0178\u0179\u0005\u0010\u0000\u0000\u0179\u017b\u0005\t"+
		"\u0000\u0000\u017a\u017c\u0003$\u0012\u0000\u017b\u017a\u0001\u0000\u0000"+
		"\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\n\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000"+
		"\u0181\u0171\u0001\u0000\u0000\u0000\u0181\u0176\u0001\u0000\u0000\u0000"+
		"\u0182+\u0001\u0000\u0000\u0000\u0183\u0184\u00034\u001a\u0000\u0184\u0185"+
		"\u0005\u001a\u0000\u0000\u0185\u0186\u0003.\u0017\u0000\u0186\u018c\u0005"+
		"\u001b\u0000\u0000\u0187\u0188\u0003.\u0017\u0000\u0188\u0189\u0005\u001b"+
		"\u0000\u0000\u0189\u018b\u0001\u0000\u0000\u0000\u018a\u0187\u0001\u0000"+
		"\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000"+
		"\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0190\u0003.\u0017"+
		"\u0000\u0190\u0191\u0005\u0002\u0000\u0000\u0191-\u0001\u0000\u0000\u0000"+
		"\u0192\u0196\u0003V+\u0000\u0193\u0195\u0003\u001c\u000e\u0000\u0194\u0193"+
		"\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000\u0196\u0194"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197/\u0001"+
		"\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0199\u019a\u0003"+
		"4\u001a\u0000\u019a\u019e\u0005\u001c\u0000\u0000\u019b\u019d\u0003\u001c"+
		"\u000e\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000"+
		"\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000"+
		"\u0000\u0000\u019f1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u00030\u0018\u0000\u01a2\u01a3\u0005\u0002\u0000\u0000"+
		"\u01a33\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u001d\u0000\u0000\u01a5"+
		"\u01a6\u0005J\u0000\u0000\u01a6\u01a7\u0005\u0005\u0000\u0000\u01a7\u01a8"+
		"\u0005J\u0000\u0000\u01a8\u01a9\u0005\u001e\u0000\u0000\u01a95\u0001\u0000"+
		"\u0000\u0000\u01aa\u01b0\u0005\u001f\u0000\u0000\u01ab\u01ac\u00038\u001c"+
		"\u0000\u01ac\u01ad\u0005\u0005\u0000\u0000\u01ad\u01af\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ab\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u00038\u001c\u0000\u01b4\u01b5\u0005\u0002\u0000\u0000"+
		"\u01b57\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005J\u0000\u0000\u01b7\u01b8"+
		"\u0005 \u0000\u0000\u01b8\u01be\u0003V+\u0000\u01b9\u01ba\u00030\u0018"+
		"\u0000\u01ba\u01bb\u0005 \u0000\u0000\u01bb\u01bc\u0003V+\u0000\u01bc"+
		"\u01be\u0001\u0000\u0000\u0000\u01bd\u01b6\u0001\u0000\u0000\u0000\u01bd"+
		"\u01b9\u0001\u0000\u0000\u0000\u01be9\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0005!\u0000\u0000\u01c0\u01c1\u0005J\u0000\u0000\u01c1\u01c2\u0003V"+
		"+\u0000\u01c2\u01c8\u0005\u0013\u0000\u0000\u01c3\u01c4\u0003<\u001e\u0000"+
		"\u01c4\u01c5\u0005\u0005\u0000\u0000\u01c5\u01c7\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c3\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0003<\u001e\u0000\u01cc\u01cd\u0005\u0015\u0000\u0000\u01cd"+
		"\u01ce\u0005\u0002\u0000\u0000\u01ce;\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0003d2\u0000\u01d0\u01d7\u0005\u0014\u0000\u0000\u01d1\u01d3\u0005J"+
		"\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005I\u0000"+
		"\u0000\u01d7\u01d2\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000"+
		"\u0000\u01d8=\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\"\u0000\u0000"+
		"\u01da\u01db\u0005J\u0000\u0000\u01db\u01de\u0005\t\u0000\u0000\u01dc"+
		"\u01df\u0003@ \u0000\u01dd\u01df\u0003B!\u0000\u01de\u01dc\u0001\u0000"+
		"\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\n\u0000"+
		"\u0000\u01e3?\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005#\u0000\u0000\u01e5"+
		"\u01e6\u0005J\u0000\u0000\u01e6\u01e7\u0005\r\u0000\u0000\u01e7\u01e8"+
		"\u0005J\u0000\u0000\u01e8\u01e9\u0005 \u0000\u0000\u01e9\u01ea\u0003V"+
		"+\u0000\u01ea\u01eb\u0005\u001b\u0000\u0000\u01eb\u01ec\u0005$\u0000\u0000"+
		"\u01ec\u01ed\u0003V+\u0000\u01ed\u01ee\u0005\u0002\u0000\u0000\u01eeA"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005%\u0000\u0000\u01f0\u01f1\u0005"+
		"J\u0000\u0000\u01f1\u01f3\u0005\t\u0000\u0000\u01f2\u01f4\u0003D\"\u0000"+
		"\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\n\u0000\u0000\u01f8"+
		"C\u0001\u0000\u0000\u0000\u01f9\u0200\u0003\u001a\r\u0000\u01fa\u0200"+
		"\u0003J%\u0000\u01fb\u0200\u0003L&\u0000\u01fc\u0200\u0003T*\u0000\u01fd"+
		"\u0200\u0003H$\u0000\u01fe\u0200\u0003F#\u0000\u01ff\u01f9\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fa\u0001\u0000\u0000\u0000\u01ff\u01fb\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200E\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0005\u000f\u0000\u0000\u0202\u0203\u0003V+\u0000\u0203"+
		"\u0204\u0005\u0010\u0000\u0000\u0204\u0205\u0003D\"\u0000\u0205\u0212"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0005\u000f\u0000\u0000\u0207\u0208"+
		"\u0003V+\u0000\u0208\u0209\u0005\u0010\u0000\u0000\u0209\u020b\u0005\t"+
		"\u0000\u0000\u020a\u020c\u0003D\"\u0000\u020b\u020a\u0001\u0000\u0000"+
		"\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0005\n\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000"+
		"\u0211\u0201\u0001\u0000\u0000\u0000\u0211\u0206\u0001\u0000\u0000\u0000"+
		"\u0212G\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0011\u0000\u0000\u0214"+
		"\u0215\u0003V+\u0000\u0215\u0216\u0005\u0010\u0000\u0000\u0216\u0217\u0003"+
		"D\"\u0000\u0217\u0224\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u0011"+
		"\u0000\u0000\u0219\u021a\u0003V+\u0000\u021a\u021b\u0005\u0010\u0000\u0000"+
		"\u021b\u021d\u0005\t\u0000\u0000\u021c\u021e\u0003D\"\u0000\u021d\u021c"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u021d"+
		"\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0005\n\u0000\u0000\u0222\u0224\u0001"+
		"\u0000\u0000\u0000\u0223\u0213\u0001\u0000\u0000\u0000\u0223\u0218\u0001"+
		"\u0000\u0000\u0000\u0224I\u0001\u0000\u0000\u0000\u0225\u0226\u0005\r"+
		"\u0000\u0000\u0226\u0227\u0005J\u0000\u0000\u0227\u0228\u0005\u000e\u0000"+
		"\u0000\u0228\u0229\u0003V+\u0000\u0229\u022a\u0003D\"\u0000\u022a\u0238"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0005\r\u0000\u0000\u022c\u022d\u0005"+
		"J\u0000\u0000\u022d\u022e\u0005\u000e\u0000\u0000\u022e\u022f\u0003V+"+
		"\u0000\u022f\u0231\u0005\t\u0000\u0000\u0230\u0232\u0003D\"\u0000\u0231"+
		"\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0005\n\u0000\u0000\u0236\u0238"+
		"\u0001\u0000\u0000\u0000\u0237\u0225\u0001\u0000\u0000\u0000\u0237\u022b"+
		"\u0001\u0000\u0000\u0000\u0238K\u0001\u0000\u0000\u0000\u0239\u023f\u0005"+
		"&\u0000\u0000\u023a\u023b\u0003N\'\u0000\u023b\u023c\u0005\u0005\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023a\u0001\u0000\u0000"+
		"\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000"+
		"\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0242\u0001\u0000\u0000"+
		"\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0243\u0003N\'\u0000"+
		"\u0243\u0244\u0005\u0002\u0000\u0000\u0244\u024a\u0001\u0000\u0000\u0000"+
		"\u0245\u0246\u0005&\u0000\u0000\u0246\u024a\u0005\u0002\u0000\u0000\u0247"+
		"\u0248\u0005\'\u0000\u0000\u0248\u024a\u0005\u0002\u0000\u0000\u0249\u0239"+
		"\u0001\u0000\u0000\u0000\u0249\u0245\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u024aM\u0001\u0000\u0000\u0000\u024b\u024f\u0005"+
		"J\u0000\u0000\u024c\u024e\u0003\u001c\u000e\u0000\u024d\u024c\u0001\u0000"+
		"\u0000\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0254\u0001\u0000"+
		"\u0000\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u0254\u00034\u001a"+
		"\u0000\u0253\u024b\u0001\u0000\u0000\u0000\u0253\u0252\u0001\u0000\u0000"+
		"\u0000\u0254O\u0001\u0000\u0000\u0000\u0255\u0256\u0005(\u0000\u0000\u0256"+
		"\u0257\u0005J\u0000\u0000\u0257\u0258\u0005\u0002\u0000\u0000\u0258Q\u0001"+
		"\u0000\u0000\u0000\u0259\u025f\u0003b1\u0000\u025a\u025b\u0003X,\u0000"+
		"\u025b\u025c\u0005\u0005\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000"+
		"\u025d\u025a\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000\u0000"+
		"\u025f\u025d\u0001\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000"+
		"\u0260\u0262\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0262\u0263\u0003X,\u0000\u0263\u026f\u0001\u0000\u0000\u0000\u0264\u0269"+
		"\u0003b1\u0000\u0265\u0266\u0005J\u0000\u0000\u0266\u0268\u0005\u0005"+
		"\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000"+
		"\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000"+
		"\u0000\u0000\u026a\u026c\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0005J\u0000\u0000\u026d\u026f\u0001\u0000\u0000"+
		"\u0000\u026e\u0259\u0001\u0000\u0000\u0000\u026e\u0264\u0001\u0000\u0000"+
		"\u0000\u026fS\u0001\u0000\u0000\u0000\u0270\u0274\u0003V+\u0000\u0271"+
		"\u0274\u0003R)\u0000\u0272\u0274\u0003X,\u0000\u0273\u0270\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0272\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0002"+
		"\u0000\u0000\u0276U\u0001\u0000\u0000\u0000\u0277\u0278\u0006+\uffff\uffff"+
		"\u0000\u0278\u0279\u0007\u0000\u0000\u0000\u0279\u028e\u0003V+\u000f\u027a"+
		"\u027b\u0005*\u0000\u0000\u027b\u028e\u0003V+\u000e\u027c\u027d\u0005"+
		"4\u0000\u0000\u027d\u027e\u0005J\u0000\u0000\u027e\u028e\u00055\u0000"+
		"\u0000\u027f\u0280\u00054\u0000\u0000\u0280\u0281\u0003V+\u0000\u0281"+
		"\u0282\u00055\u0000\u0000\u0282\u028e\u0001\u0000\u0000\u0000\u0283\u028e"+
		"\u0003\\.\u0000\u0284\u028e\u0003Z-\u0000\u0285\u028e\u0005I\u0000\u0000"+
		"\u0286\u028e\u0005J\u0000\u0000\u0287\u028b\u00056\u0000\u0000\u0288\u0289"+
		"\u00057\u0000\u0000\u0289\u028a\u0005L\u0000\u0000\u028a\u028c\u0005\u0015"+
		"\u0000\u0000\u028b\u0288\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u0277\u0001\u0000"+
		"\u0000\u0000\u028d\u027a\u0001\u0000\u0000\u0000\u028d\u027c\u0001\u0000"+
		"\u0000\u0000\u028d\u027f\u0001\u0000\u0000\u0000\u028d\u0283\u0001\u0000"+
		"\u0000\u0000\u028d\u0284\u0001\u0000\u0000\u0000\u028d\u0285\u0001\u0000"+
		"\u0000\u0000\u028d\u0286\u0001\u0000\u0000\u0000\u028d\u0287\u0001\u0000"+
		"\u0000\u0000\u028e\u02a3\u0001\u0000\u0000\u0000\u028f\u0290\n\r\u0000"+
		"\u0000\u0290\u0291\u0007\u0001\u0000\u0000\u0291\u02a2\u0003V+\u000e\u0292"+
		"\u0293\n\f\u0000\u0000\u0293\u0294\u0007\u0000\u0000\u0000\u0294\u02a2"+
		"\u0003V+\r\u0295\u0296\n\u000b\u0000\u0000\u0296\u0297\u0007\u0002\u0000"+
		"\u0000\u0297\u02a2\u0003V+\f\u0298\u0299\n\n\u0000\u0000\u0299\u029a\u0007"+
		"\u0003\u0000\u0000\u029a\u02a2\u0003V+\u000b\u029b\u029c\n\t\u0000\u0000"+
		"\u029c\u029d\u00052\u0000\u0000\u029d\u02a2\u0003V+\n\u029e\u029f\n\b"+
		"\u0000\u0000\u029f\u02a0\u00053\u0000\u0000\u02a0\u02a2\u0003V+\t\u02a1"+
		"\u028f\u0001\u0000\u0000\u0000\u02a1\u0292\u0001\u0000\u0000\u0000\u02a1"+
		"\u0295\u0001\u0000\u0000\u0000\u02a1\u0298\u0001\u0000\u0000\u0000\u02a1"+
		"\u029b\u0001\u0000\u0000\u0000\u02a1\u029e\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a4W\u0001\u0000\u0000\u0000\u02a5\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005J\u0000\u0000\u02a7\u02a8\u0005"+
		"\u0014\u0000\u0000\u02a8\u02a9\u0003V+\u0000\u02a9Y\u0001\u0000\u0000"+
		"\u0000\u02aa\u02af\u00058\u0000\u0000\u02ab\u02ac\u0005J\u0000\u0000\u02ac"+
		"\u02ae\u0005\u0005\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02ae"+
		"\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b2\u0001\u0000\u0000\u0000\u02b1"+
		"\u02af\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005J\u0000\u0000\u02b3\u02b4"+
		"\u00059\u0000\u0000\u02b4[\u0001\u0000\u0000\u0000\u02b5\u02b8\u0003^"+
		"/\u0000\u02b6\u02b8\u0003`0\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8]\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u00054\u0000\u0000\u02ba\u02bb\u0003V+\u0000\u02bb\u02bc\u0005"+
		"\u0005\u0000\u0000\u02bc\u02bd\u0003V+\u0000\u02bd\u02be\u00055\u0000"+
		"\u0000\u02be_\u0001\u0000\u0000\u0000\u02bf\u02c0\u00054\u0000\u0000\u02c0"+
		"\u02c1\u0003V+\u0000\u02c1\u02c2\u0005:\u0000\u0000\u02c2\u02c3\u0003"+
		"V+\u0000\u02c3\u02c4\u00055\u0000\u0000\u02c4a\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0007\u0004\u0000\u0000\u02c6c\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c8\u0007\u0005\u0000\u0000\u02c8e\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0007\u0006\u0000\u0000\u02cag\u0001\u0000\u0000\u0000@lv\u0083\u008d"+
		"\u0093\u0097\u009f\u00a4\u00aa\u00b2\u00b7\u00c1\u00d1\u00d5\u00e3\u00e7"+
		"\u00f5\u00f9\u0100\u010a\u0114\u0117\u0121\u012d\u013c\u0149\u0159\u015d"+
		"\u016b\u016f\u017d\u0181\u018c\u0196\u019e\u01b0\u01bd\u01c8\u01d4\u01d7"+
		"\u01de\u01e0\u01f5\u01ff\u020d\u0211\u021f\u0223\u0233\u0237\u023f\u0249"+
		"\u024f\u0253\u025f\u0269\u026e\u0273\u028b\u028d\u02a1\u02a3\u02af\u02b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}