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
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		DefImport=74, Number=75, ID=76, SYMBOL=77, STRING=78, WS=79, NEWLINE=80, 
		SingleLineComment=81, BlockComment=82, ERROR=83;
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_importStat = 2, RULE_alphabetDef = 3, 
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
		RULE_viewportOn = 35, RULE_viewportStat = 36, RULE_viewportWhile = 37, 
		RULE_viewportIf = 38, RULE_viewportElse = 39, RULE_viewportFor = 40, RULE_viewportInstructions = 41, 
		RULE_viewportInstructionsShowElement = 42, RULE_playDef = 43, RULE_decl = 44, 
		RULE_algebricOP = 45, RULE_expr = 46, RULE_assign = 47, RULE_list = 48, 
		RULE_point = 49, RULE_pointRect = 50, RULE_pointPol = 51, RULE_type = 52, 
		RULE_gridProperties = 53, RULE_propertiesKeys = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stat", "importStat", "alphabetDef", "alphabetElement", "automatonDef", 
			"automatonNFADef", "automatonDFADef", "automatonStat", "automatonFor", 
			"automatonWhile", "automatonIf", "automatonElse", "stateDef", "propertiesDef", 
			"propertyElement", "transitionDef", "transitionElement", "viewDef", "viewStat", 
			"viewFor", "viewWhile", "viewIf", "viewElse", "transitionRedefine", "transitionPoint", 
			"transitionLabelAlter", "transitionLabelAlterWithComma", "transition", 
			"placeDef", "placeElement", "gridDef", "gridOptions", "animationDef", 
			"viewportDef", "viewportOn", "viewportStat", "viewportWhile", "viewportIf", 
			"viewportElse", "viewportFor", "viewportInstructions", "viewportInstructionsShowElement", 
			"playDef", "decl", "algebricOP", "expr", "assign", "list", "point", "pointRect", 
			"pointPol", "type", "gridProperties", "propertiesKeys"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'alphabet'", "'{'", "','", "'}'", "'-'", "'NFA'", 
			"'<<<'", "'>>>'", "'complete'", "'DFA'", "'for'", "'in'", "'while'", 
			"'do'", "'if'", "'else'", "'state'", "';'", "'['", "'='", "']'", "'transition'", 
			"'->'", "'view'", "'of'", "'as'", "'--'", "'#label'", "'<'", "'>'", "'place'", 
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
			null, null, "DefImport", "Number", "ID", "SYMBOL", "STRING", "WS", "NEWLINE", 
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
			setState(110);
			alphabetDef();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2233416551554L) != 0) || _la==DefImport) {
				{
				{
				setState(111);
				stat();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		public ImportStatContext importStat() {
			return getRuleContext(ImportStatContext.class,0);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case DefImport:
				{
				setState(119);
				importStat();
				}
				break;
			case T__6:
			case T__9:
			case T__10:
				{
				setState(120);
				automatonDef();
				}
				break;
			case T__24:
				{
				setState(121);
				viewDef();
				}
				break;
			case T__34:
				{
				setState(122);
				animationDef();
				}
				break;
			case T__40:
				{
				setState(123);
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
	public static class ImportStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(advParser.ID, 0); }
		public TerminalNode DefImport() { return getToken(advParser.DefImport, 0); }
		public ImportStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterImportStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitImportStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitImportStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatContext importStat() throws RecognitionException {
		ImportStatContext _localctx = new ImportStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStat);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(126);
				match(T__0);
				setState(127);
				match(ID);
				}
				}
				break;
			case DefImport:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(DefImport);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__1);
				setState(132);
				match(T__2);
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						alphabetElement();
						setState(134);
						match(T__3);
						}
						} 
					}
					setState(140);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(141);
				alphabetElement();
				setState(142);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__1);
				setState(145);
				match(ID);
				setState(146);
				match(T__5);
				setState(147);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(SYMBOL);
				setState(151);
				match(T__5);
				setState(152);
				match(SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				automatonNFADef();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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
			setState(160);
			match(T__6);
			setState(161);
			match(ID);
			setState(162);
			match(T__7);
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(163);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				automatonStat();
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
			setState(173);
			transitionDef();
			setState(174);
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(176);
				((AutomatonDFADefContext)_localctx).complete = match(T__9);
				}
			}

			setState(179);
			match(T__10);
			setState(180);
			match(ID);
			setState(181);
			match(T__7);
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182);
					stateDef();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				automatonStat();
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
			setState(192);
			transitionDef();
			setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(195);
				automatonFor();
				}
				break;
			case 2:
				{
				setState(196);
				automatonIf();
				}
				break;
			case 3:
				{
				setState(197);
				automatonWhile();
				}
				break;
			case 4:
				{
				setState(198);
				propertiesDef();
				}
				break;
			case 5:
				{
				setState(199);
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
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__11);
				setState(203);
				match(ID);
				setState(204);
				match(T__12);
				setState(205);
				expr(0);
				setState(206);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__11);
				setState(209);
				match(ID);
				setState(210);
				match(T__12);
				setState(211);
				expr(0);
				setState(212);
				match(T__7);
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					automatonStat();
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(218);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__13);
				setState(223);
				expr(0);
				setState(224);
				match(T__14);
				setState(225);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__13);
				setState(228);
				expr(0);
				setState(229);
				match(T__14);
				setState(230);
				match(T__7);
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(231);
					automatonStat();
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(236);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(T__15);
				setState(241);
				expr(0);
				setState(242);
				match(T__14);
				setState(243);
				automatonStat();
				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(244);
					automatonElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(T__15);
				setState(248);
				expr(0);
				setState(249);
				match(T__14);
				setState(250);
				match(T__7);
				setState(252); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(251);
					automatonStat();
					}
					}
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(256);
				match(T__8);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(257);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterAutomatonElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitAutomatonElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitAutomatonElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonElseContext automatonElse() throws RecognitionException {
		AutomatonElseContext _localctx = new AutomatonElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_automatonElse);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__16);
				setState(263);
				automatonStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__16);
				setState(265);
				match(T__7);
				setState(267); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(266);
					automatonStat();
					}
					}
					setState(269); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757126117404608L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(271);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitStateDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__17);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(276);
					match(ID);
					setState(277);
					match(T__3);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(283);
			match(ID);
			setState(284);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_propertiesDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			setState(288); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(287);
				propertyElement();
				}
				}
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(292);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_propertyElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__19);
			setState(295);
			propertiesKeys();
			setState(296);
			match(T__20);
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297);
					match(ID);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(302);
				match(Number);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(305);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_transitionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__22);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					transitionElement();
					setState(309);
					match(T__3);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(316);
			transitionElement();
			setState(317);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_transitionElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(320);
			match(T__23);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					match(SYMBOL);
					setState(322);
					match(T__3);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(328);
			match(SYMBOL);
			setState(329);
			match(T__23);
			setState(330);
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
		enterRule(_localctx, 36, RULE_viewDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__24);
			setState(333);
			match(ID);
			setState(334);
			match(T__25);
			setState(335);
			match(ID);
			setState(336);
			match(T__7);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -963757103568826304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0)) {
				{
				{
				setState(337);
				viewStat();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
		enterRule(_localctx, 38, RULE_viewStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(345);
				algebricOP();
				}
				break;
			case 2:
				{
				setState(346);
				viewFor();
				}
				break;
			case 3:
				{
				setState(347);
				placeDef();
				}
				break;
			case 4:
				{
				setState(348);
				transitionRedefine();
				}
				break;
			case 5:
				{
				setState(349);
				transitionLabelAlterWithComma();
				}
				break;
			case 6:
				{
				setState(350);
				gridDef();
				}
				break;
			case 7:
				{
				setState(351);
				viewIf();
				}
				break;
			case 8:
				{
				setState(352);
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
		enterRule(_localctx, 40, RULE_viewFor);
		int _la;
		try {
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__11);
				setState(356);
				match(ID);
				setState(357);
				match(T__12);
				setState(358);
				expr(0);
				setState(359);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(T__11);
				setState(362);
				match(ID);
				setState(363);
				match(T__12);
				setState(364);
				expr(0);
				setState(365);
				match(T__7);
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366);
					viewStat();
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757103568826304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(371);
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
		enterRule(_localctx, 42, RULE_viewWhile);
		int _la;
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__13);
				setState(376);
				expr(0);
				setState(377);
				match(T__14);
				setState(378);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(T__13);
				setState(381);
				expr(0);
				setState(382);
				match(T__14);
				setState(383);
				match(T__7);
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(384);
					viewStat();
					}
					}
					setState(387); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757103568826304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(389);
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
		enterRule(_localctx, 44, RULE_viewIf);
		int _la;
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(T__15);
				setState(394);
				expr(0);
				setState(395);
				match(T__14);
				setState(396);
				viewStat();
				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(397);
					viewElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				match(T__15);
				setState(401);
				expr(0);
				setState(402);
				match(T__14);
				setState(403);
				match(T__7);
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					viewStat();
					}
					}
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757103568826304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(409);
				match(T__8);
				setState(411);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(410);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewElseContext viewElse() throws RecognitionException {
		ViewElseContext _localctx = new ViewElseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_viewElse);
		int _la;
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				match(T__16);
				setState(416);
				viewStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				match(T__16);
				setState(418);
				match(T__7);
				setState(420); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(419);
					viewStat();
					}
					}
					setState(422); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963757103568826304L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(424);
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
		enterRule(_localctx, 48, RULE_transitionRedefine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			transition();
			setState(429);
			match(T__26);
			setState(430);
			transitionPoint();
			setState(431);
			match(T__27);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(432);
					transitionPoint();
					setState(433);
					match(T__27);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(440);
			transitionPoint();
			setState(441);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 50, RULE_transitionPoint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			expr(0);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(444);
				propertyElement();
				}
				}
				setState(449);
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
		enterRule(_localctx, 52, RULE_transitionLabelAlter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			transition();
			setState(451);
			match(T__28);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(452);
				propertyElement();
				}
				}
				setState(457);
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
		enterRule(_localctx, 54, RULE_transitionLabelAlterWithComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			transitionLabelAlter();
			setState(459);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 56, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__29);
			setState(462);
			match(ID);
			setState(463);
			match(T__3);
			setState(464);
			match(ID);
			setState(465);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 58, RULE_placeDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__31);
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					placeElement();
					setState(469);
					match(T__3);
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(476);
			placeElement();
			setState(477);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 60, RULE_placeElement);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IDplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				match(ID);
				setState(480);
				match(T__32);
				setState(481);
				expr(0);
				}
				break;
			case T__29:
				_localctx = new TransitionplaceElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				transitionLabelAlter();
				setState(483);
				match(T__32);
				setState(484);
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
		enterRule(_localctx, 62, RULE_gridDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__33);
			setState(489);
			match(ID);
			setState(490);
			expr(0);
			setState(491);
			match(T__19);
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					gridOptions();
					setState(493);
					match(T__3);
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(500);
			gridOptions();
			setState(501);
			match(T__21);
			setState(502);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 64, RULE_gridOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			gridProperties();
			setState(505);
			match(T__20);
			setState(512);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(506);
					match(ID);
					}
					}
					setState(509); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case Number:
				{
				setState(511);
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
		enterRule(_localctx, 66, RULE_animationDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(T__34);
			setState(515);
			match(ID);
			setState(516);
			match(T__7);
			setState(519); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(519);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(517);
					viewportDef();
					}
					break;
				case T__37:
					{
					setState(518);
					viewportOn();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(521); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__35 || _la==T__37 );
			setState(523);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportDefContext viewportDef() throws RecognitionException {
		ViewportDefContext _localctx = new ViewportDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_viewportDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(T__35);
			setState(526);
			match(ID);
			setState(527);
			match(T__11);
			setState(528);
			match(ID);
			setState(529);
			match(T__32);
			setState(530);
			expr(0);
			setState(531);
			match(T__27);
			setState(532);
			match(T__36);
			setState(533);
			expr(0);
			setState(534);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 70, RULE_viewportOn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__37);
			setState(537);
			match(ID);
			setState(538);
			match(T__7);
			setState(540); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(539);
				viewportStat();
				}
				}
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963755476849962944L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
			setState(544);
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
		enterRule(_localctx, 72, RULE_viewportStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(546);
				propertiesDef();
				}
				break;
			case 2:
				{
				setState(547);
				viewportFor();
				}
				break;
			case 3:
				{
				setState(548);
				viewportInstructions();
				}
				break;
			case 4:
				{
				setState(549);
				algebricOP();
				}
				break;
			case 5:
				{
				setState(550);
				viewportIf();
				}
				break;
			case 6:
				{
				setState(551);
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
		enterRule(_localctx, 74, RULE_viewportWhile);
		int _la;
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				match(T__13);
				setState(555);
				expr(0);
				setState(556);
				match(T__14);
				setState(557);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				match(T__13);
				setState(560);
				expr(0);
				setState(561);
				match(T__14);
				setState(562);
				match(T__7);
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563);
					viewportStat();
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963755476849962944L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(568);
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
		enterRule(_localctx, 76, RULE_viewportIf);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(T__15);
				setState(573);
				expr(0);
				setState(574);
				match(T__14);
				setState(575);
				viewportStat();
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(576);
					viewportElse();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(T__15);
				setState(580);
				expr(0);
				setState(581);
				match(T__14);
				setState(582);
				match(T__7);
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(583);
					viewportStat();
					}
					}
					setState(586); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963755476849962944L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(588);
				match(T__8);
				setState(589);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterViewportElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitViewportElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitViewportElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportElseContext viewportElse() throws RecognitionException {
		ViewportElseContext _localctx = new ViewportElseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_viewportElse);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(593);
				match(T__16);
				setState(594);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(T__16);
				setState(596);
				match(T__7);
				setState(598); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(597);
					viewportStat();
					}
					}
					setState(600); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963755476849962944L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(602);
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
		enterRule(_localctx, 80, RULE_viewportFor);
		int _la;
		try {
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(T__11);
				setState(607);
				match(ID);
				setState(608);
				match(T__12);
				setState(609);
				expr(0);
				setState(610);
				viewportStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(T__11);
				setState(613);
				match(ID);
				setState(614);
				match(T__12);
				setState(615);
				expr(0);
				setState(616);
				match(T__7);
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(617);
					viewportStat();
					}
					}
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -963755476849962944L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6145L) != 0) );
				setState(622);
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
		public ViewportInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewportInstructions; }
	 
		public ViewportInstructionsContext() { }
		public void copyFrom(ViewportInstructionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleContext extends ViewportInstructionsContext {
		public Token op;
		public SimpleContext(ViewportInstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundContext extends ViewportInstructionsContext {
		public List<ViewportInstructionsShowElementContext> viewportInstructionsShowElement() {
			return getRuleContexts(ViewportInstructionsShowElementContext.class);
		}
		public ViewportInstructionsShowElementContext viewportInstructionsShowElement(int i) {
			return getRuleContext(ViewportInstructionsShowElementContext.class,i);
		}
		public CompoundContext(ViewportInstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).enterCompound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof advListener ) ((advListener)listener).exitCompound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof advVisitor ) return ((advVisitor<? extends T>)visitor).visitCompound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportInstructionsContext viewportInstructions() throws RecognitionException {
		ViewportInstructionsContext _localctx = new ViewportInstructionsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_viewportInstructions);
		int _la;
		try {
			int _alt;
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				_localctx = new CompoundContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				match(T__38);
				setState(632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(627);
						viewportInstructionsShowElement();
						setState(628);
						match(T__3);
						}
						} 
					}
					setState(634);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				setState(635);
				viewportInstructionsShowElement();
				setState(636);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new SimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				((SimpleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__38 || _la==T__39) ) {
					((SimpleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
				match(T__18);
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
		enterRule(_localctx, 84, RULE_viewportInstructionsShowElement);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				match(ID);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__19) {
					{
					{
					setState(643);
					propertyElement();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
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
		enterRule(_localctx, 86, RULE_playDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(T__40);
			setState(653);
			match(ID);
			setState(654);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_decl);
		try {
			int _alt;
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				type();
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(657);
						assign();
						setState(658);
						match(T__3);
						}
						} 
					}
					setState(664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
				}
				setState(665);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				type();
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(668);
						match(ID);
						setState(669);
						match(T__3);
						}
						} 
					}
					setState(674);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(675);
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
		enterRule(_localctx, 90, RULE_algebricOP);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(679);
				expr(0);
				}
				break;
			case 2:
				{
				setState(680);
				decl();
				}
				break;
			case 3:
				{
				setState(681);
				assign();
				}
				break;
			}
			setState(684);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(687);
				((UnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__5 || _la==T__41) ) {
					((UnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(689);
				match(T__42);
				setState(690);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new ParanthesisIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(691);
				match(T__52);
				setState(692);
				match(ID);
				setState(693);
				match(T__53);
				}
				break;
			case 4:
				{
				_localctx = new ParanthesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(694);
				match(T__52);
				setState(695);
				expr(0);
				setState(696);
				match(T__53);
				}
				break;
			case 5:
				{
				_localctx = new PointExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				point();
				}
				break;
			case 6:
				{
				_localctx = new ListExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				list();
				}
				break;
			case 7:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(700);
				match(Number);
				}
				break;
			case 8:
				{
				_localctx = new IDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ReadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(702);
				match(T__54);
				setState(706);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(703);
					match(T__55);
					setState(704);
					match(STRING);
					setState(705);
					match(T__21);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(710);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(711);
						((MultDivExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 123145302310912L) != 0)) ) {
							((MultDivExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(712);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(713);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(714);
						((AddSubExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__41) ) {
							((AddSubExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(715);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(716);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(717);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 422215686291456L) != 0)) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(718);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new EqualsExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(719);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(720);
						((EqualsExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__49) ) {
							((EqualsExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(721);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(722);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(723);
						match(T__50);
						setState(724);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(725);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(726);
						match(T__51);
						setState(727);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		enterRule(_localctx, 94, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			match(ID);
			setState(734);
			match(T__20);
			setState(735);
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
		enterRule(_localctx, 96, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(T__56);
			setState(742);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(738);
					match(ID);
					setState(739);
					match(T__3);
					}
					} 
				}
				setState(744);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(745);
			match(ID);
			setState(746);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_point);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				pointRect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
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
		enterRule(_localctx, 100, RULE_pointRect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(T__52);
			setState(753);
			expr(0);
			setState(754);
			match(T__3);
			setState(755);
			expr(0);
			setState(756);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 102, RULE_pointPol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__52);
			setState(759);
			expr(0);
			setState(760);
			match(T__58);
			setState(761);
			expr(0);
			setState(762);
			match(T__53);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & 136339441844225L) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_gridProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			((GridPropertiesContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 15L) != 0)) ) {
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
		enterRule(_localctx, 108, RULE_propertiesKeys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			((PropertiesKeysContext)_localctx).prop = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 31L) != 0)) ) {
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
		case 46:
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
		"\u0004\u0001S\u0303\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0005\u0000q\b\u0000\n\u0000\f\u0000t\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001}\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0082\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003\u0089\b\u0003\n\u0003\f\u0003\u008c\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0095\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u009b\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u009f\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00a5"+
		"\b\u0006\u000b\u0006\f\u0006\u00a6\u0001\u0006\u0004\u0006\u00aa\b\u0006"+
		"\u000b\u0006\f\u0006\u00ab\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u00b2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u00b8\b\u0007\u000b\u0007\f\u0007\u00b9\u0001\u0007\u0004"+
		"\u0007\u00bd\b\u0007\u000b\u0007\f\u0007\u00be\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00c9\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\t\u00d7\b\t\u000b\t\f\t\u00d8\u0001\t"+
		"\u0001\t\u0003\t\u00dd\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00e9\b\n\u000b\n\f\n\u00ea"+
		"\u0001\n\u0001\n\u0003\n\u00ef\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00f6\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00fd\b\u000b\u000b\u000b"+
		"\f\u000b\u00fe\u0001\u000b\u0001\u000b\u0003\u000b\u0103\b\u000b\u0003"+
		"\u000b\u0105\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u010c"+
		"\b\f\u000b\f\f\f\u010d\u0001\f\u0001\f\u0003\f\u0112\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0117\b\r\n\r\f\r\u011a\t\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0004\u000e\u0121\b\u000e\u000b\u000e\f\u000e"+
		"\u0122\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u012b\b\u000f\u000b\u000f\f\u000f\u012c\u0001\u000f"+
		"\u0003\u000f\u0130\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0138\b\u0010\n\u0010\f\u0010\u013b"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0144\b\u0011\n\u0011\f\u0011\u0147\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0153\b\u0012"+
		"\n\u0012\f\u0012\u0156\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u0162\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0004\u0014\u0170\b\u0014\u000b\u0014\f"+
		"\u0014\u0171\u0001\u0014\u0001\u0014\u0003\u0014\u0176\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0182\b\u0015\u000b\u0015"+
		"\f\u0015\u0183\u0001\u0015\u0001\u0015\u0003\u0015\u0188\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u018f"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004"+
		"\u0016\u0196\b\u0016\u000b\u0016\f\u0016\u0197\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u019c\b\u0016\u0003\u0016\u019e\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u01a5\b\u0017\u000b"+
		"\u0017\f\u0017\u01a6\u0001\u0017\u0001\u0017\u0003\u0017\u01ab\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01b4\b\u0018\n\u0018\f\u0018\u01b7\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u01be"+
		"\b\u0019\n\u0019\f\u0019\u01c1\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01c6\b\u001a\n\u001a\f\u001a\u01c9\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005"+
		"\u001d\u01d8\b\u001d\n\u001d\f\u001d\u01db\t\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01e7\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u01f0\b\u001f\n\u001f\f\u001f\u01f3\t\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0004 \u01fc\b \u000b \f \u01fd"+
		"\u0001 \u0003 \u0201\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0004!\u0208"+
		"\b!\u000b!\f!\u0209\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0004#\u021d\b#\u000b#\f#\u021e\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0229\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0004%\u0235\b%\u000b%\f%\u0236\u0001"+
		"%\u0001%\u0003%\u023b\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0242"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0004&\u0249\b&\u000b&\f&\u024a"+
		"\u0001&\u0001&\u0001&\u0003&\u0250\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0004\'\u0257\b\'\u000b\'\f\'\u0258\u0001\'\u0001\'\u0003\'\u025d"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0004(\u026b\b(\u000b(\f(\u026c\u0001(\u0001(\u0003(\u0271"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u0277\b)\n)\f)\u027a\t)\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0003)\u0281\b)\u0001*\u0001*\u0005*\u0285"+
		"\b*\n*\f*\u0288\t*\u0001*\u0003*\u028b\b*\u0001+\u0001+\u0001+\u0001+"+
		"\u0001,\u0001,\u0001,\u0001,\u0005,\u0295\b,\n,\f,\u0298\t,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u029f\b,\n,\f,\u02a2\t,\u0001,\u0001,\u0003"+
		",\u02a6\b,\u0001-\u0001-\u0001-\u0003-\u02ab\b-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02c3"+
		"\b.\u0003.\u02c5\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0005.\u02d9\b.\n.\f.\u02dc\t.\u0001/\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00050\u02e5\b0\n0\f0\u02e8\t0\u00010\u00010\u00010\u00011\u0001"+
		"1\u00031\u02ef\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u0001"+
		"6\u00016\u0000\u0001\\7\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjl\u0000\b\u0001\u0000\'(\u0002\u0000\u0006\u0006**\u0001\u0000"+
		",.\u0002\u0000\u001e\u001f/0\u0001\u000012\u0002\u0000\u0012\u0012<@\u0001"+
		"\u0000AD\u0001\u0000EI\u0333\u0000n\u0001\u0000\u0000\u0000\u0002|\u0001"+
		"\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0094\u0001"+
		"\u0000\u0000\u0000\b\u009a\u0001\u0000\u0000\u0000\n\u009e\u0001\u0000"+
		"\u0000\u0000\f\u00a0\u0001\u0000\u0000\u0000\u000e\u00b1\u0001\u0000\u0000"+
		"\u0000\u0010\u00c8\u0001\u0000\u0000\u0000\u0012\u00dc\u0001\u0000\u0000"+
		"\u0000\u0014\u00ee\u0001\u0000\u0000\u0000\u0016\u0104\u0001\u0000\u0000"+
		"\u0000\u0018\u0111\u0001\u0000\u0000\u0000\u001a\u0113\u0001\u0000\u0000"+
		"\u0000\u001c\u011e\u0001\u0000\u0000\u0000\u001e\u0126\u0001\u0000\u0000"+
		"\u0000 \u0133\u0001\u0000\u0000\u0000\"\u013f\u0001\u0000\u0000\u0000"+
		"$\u014c\u0001\u0000\u0000\u0000&\u0161\u0001\u0000\u0000\u0000(\u0175"+
		"\u0001\u0000\u0000\u0000*\u0187\u0001\u0000\u0000\u0000,\u019d\u0001\u0000"+
		"\u0000\u0000.\u01aa\u0001\u0000\u0000\u00000\u01ac\u0001\u0000\u0000\u0000"+
		"2\u01bb\u0001\u0000\u0000\u00004\u01c2\u0001\u0000\u0000\u00006\u01ca"+
		"\u0001\u0000\u0000\u00008\u01cd\u0001\u0000\u0000\u0000:\u01d3\u0001\u0000"+
		"\u0000\u0000<\u01e6\u0001\u0000\u0000\u0000>\u01e8\u0001\u0000\u0000\u0000"+
		"@\u01f8\u0001\u0000\u0000\u0000B\u0202\u0001\u0000\u0000\u0000D\u020d"+
		"\u0001\u0000\u0000\u0000F\u0218\u0001\u0000\u0000\u0000H\u0228\u0001\u0000"+
		"\u0000\u0000J\u023a\u0001\u0000\u0000\u0000L\u024f\u0001\u0000\u0000\u0000"+
		"N\u025c\u0001\u0000\u0000\u0000P\u0270\u0001\u0000\u0000\u0000R\u0280"+
		"\u0001\u0000\u0000\u0000T\u028a\u0001\u0000\u0000\u0000V\u028c\u0001\u0000"+
		"\u0000\u0000X\u02a5\u0001\u0000\u0000\u0000Z\u02aa\u0001\u0000\u0000\u0000"+
		"\\\u02c4\u0001\u0000\u0000\u0000^\u02dd\u0001\u0000\u0000\u0000`\u02e1"+
		"\u0001\u0000\u0000\u0000b\u02ee\u0001\u0000\u0000\u0000d\u02f0\u0001\u0000"+
		"\u0000\u0000f\u02f6\u0001\u0000\u0000\u0000h\u02fc\u0001\u0000\u0000\u0000"+
		"j\u02fe\u0001\u0000\u0000\u0000l\u0300\u0001\u0000\u0000\u0000nr\u0003"+
		"\u0006\u0003\u0000oq\u0003\u0002\u0001\u0000po\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0000"+
		"\u0000\u0001v\u0001\u0001\u0000\u0000\u0000w}\u0003\u0004\u0002\u0000"+
		"x}\u0003\n\u0005\u0000y}\u0003$\u0012\u0000z}\u0003B!\u0000{}\u0003V+"+
		"\u0000|w\u0001\u0000\u0000\u0000|x\u0001\u0000\u0000\u0000|y\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0003"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u0001\u0000\u0000\u007f\u0082\u0005"+
		"L\u0000\u0000\u0080\u0082\u0005J\u0000\u0000\u0081~\u0001\u0000\u0000"+
		"\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0005\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0002\u0000\u0000\u0084\u008a\u0005\u0003\u0000"+
		"\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005\u0004\u0000\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0085\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003\b\u0004\u0000\u008e"+
		"\u008f\u0005\u0005\u0000\u0000\u008f\u0095\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005\u0002\u0000\u0000\u0091\u0092\u0005L\u0000\u0000\u0092\u0093"+
		"\u0005\u0006\u0000\u0000\u0093\u0095\u0005L\u0000\u0000\u0094\u0083\u0001"+
		"\u0000\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u0007\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005M\u0000\u0000\u0097\u0098\u0005\u0006"+
		"\u0000\u0000\u0098\u009b\u0005M\u0000\u0000\u0099\u009b\u0005M\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\t\u0001\u0000\u0000\u0000\u009c\u009f\u0003\f\u0006\u0000\u009d"+
		"\u009f\u0003\u000e\u0007\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u000b\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a2\u0005L\u0000\u0000\u00a2\u00a4"+
		"\u0005\b\u0000\u0000\u00a3\u00a5\u0003\u001a\r\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0003 \u0010\u0000\u00ae\u00af\u0005\t\u0000"+
		"\u0000\u00af\r\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\n\u0000\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000"+
		"\u00b4\u00b5\u0005L\u0000\u0000\u00b5\u00b7\u0005\b\u0000\u0000\u00b6"+
		"\u00b8\u0003\u001a\r\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0003\u0010\b\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0003"+
		" \u0010\u0000\u00c1\u00c2\u0005\t\u0000\u0000\u00c2\u000f\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c9\u0003\u0012\t\u0000\u00c4\u00c9\u0003\u0016\u000b"+
		"\u0000\u00c5\u00c9\u0003\u0014\n\u0000\u00c6\u00c9\u0003\u001c\u000e\u0000"+
		"\u00c7\u00c9\u0003Z-\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0011"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\f\u0000\u0000\u00cb\u00cc\u0005"+
		"L\u0000\u0000\u00cc\u00cd\u0005\r\u0000\u0000\u00cd\u00ce\u0003\\.\u0000"+
		"\u00ce\u00cf\u0003\u0010\b\u0000\u00cf\u00dd\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0005\f\u0000\u0000\u00d1\u00d2\u0005L\u0000\u0000\u00d2\u00d3"+
		"\u0005\r\u0000\u0000\u00d3\u00d4\u0003\\.\u0000\u00d4\u00d6\u0005\b\u0000"+
		"\u0000\u00d5\u00d7\u0003\u0010\b\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0005\t\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00dc\u00d0\u0001\u0000\u0000\u0000\u00dd"+
		"\u0013\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df"+
		"\u00e0\u0003\\.\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1\u00e2"+
		"\u0003\u0010\b\u0000\u00e2\u00ef\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"\u000e\u0000\u0000\u00e4\u00e5\u0003\\.\u0000\u00e5\u00e6\u0005\u000f"+
		"\u0000\u0000\u00e6\u00e8\u0005\b\u0000\u0000\u00e7\u00e9\u0003\u0010\b"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\t\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00de\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e3\u0001\u0000\u0000\u0000\u00ef\u0015\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1\u00f2\u0003\\.\u0000\u00f2"+
		"\u00f3\u0005\u000f\u0000\u0000\u00f3\u00f5\u0003\u0010\b\u0000\u00f4\u00f6"+
		"\u0003\u0018\f\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f6\u0105\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005"+
		"\u0010\u0000\u0000\u00f8\u00f9\u0003\\.\u0000\u00f9\u00fa\u0005\u000f"+
		"\u0000\u0000\u00fa\u00fc\u0005\b\u0000\u0000\u00fb\u00fd\u0003\u0010\b"+
		"\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000"+
		"\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0005\t\u0000\u0000"+
		"\u0101\u0103\u0003\u0018\f\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104"+
		"\u00f0\u0001\u0000\u0000\u0000\u0104\u00f7\u0001\u0000\u0000\u0000\u0105"+
		"\u0017\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0011\u0000\u0000\u0107"+
		"\u0112\u0003\u0010\b\u0000\u0108\u0109\u0005\u0011\u0000\u0000\u0109\u010b"+
		"\u0005\b\u0000\u0000\u010a\u010c\u0003\u0010\b\u0000\u010b\u010a\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\t\u0000\u0000\u0110\u0112\u0001\u0000"+
		"\u0000\u0000\u0111\u0106\u0001\u0000\u0000\u0000\u0111\u0108\u0001\u0000"+
		"\u0000\u0000\u0112\u0019\u0001\u0000\u0000\u0000\u0113\u0118\u0005\u0012"+
		"\u0000\u0000\u0114\u0115\u0005L\u0000\u0000\u0115\u0117\u0005\u0004\u0000"+
		"\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005L\u0000\u0000\u011c\u011d\u0005\u0013\u0000\u0000"+
		"\u011d\u001b\u0001\u0000\u0000\u0000\u011e\u0120\u0005L\u0000\u0000\u011f"+
		"\u0121\u0003\u001e\u000f\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0125\u0005\u0013\u0000\u0000\u0125\u001d\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u0014\u0000\u0000\u0127\u0128\u0003l6\u0000\u0128\u012f\u0005"+
		"\u0015\u0000\u0000\u0129\u012b\u0005L\u0000\u0000\u012a\u0129\u0001\u0000"+
		"\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0130\u0001\u0000"+
		"\u0000\u0000\u012e\u0130\u0005K\u0000\u0000\u012f\u012a\u0001\u0000\u0000"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0016\u0000\u0000\u0132\u001f\u0001\u0000\u0000"+
		"\u0000\u0133\u0139\u0005\u0017\u0000\u0000\u0134\u0135\u0003\"\u0011\u0000"+
		"\u0135\u0136\u0005\u0004\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000"+
		"\u0137\u0134\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0003\"\u0011\u0000\u013d\u013e\u0005\u0013\u0000\u0000\u013e"+
		"!\u0001\u0000\u0000\u0000\u013f\u0140\u0005L\u0000\u0000\u0140\u0145\u0005"+
		"\u0018\u0000\u0000\u0141\u0142\u0005M\u0000\u0000\u0142\u0144\u0005\u0004"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0148\u0149\u0005M\u0000\u0000\u0149\u014a\u0005\u0018\u0000"+
		"\u0000\u014a\u014b\u0005L\u0000\u0000\u014b#\u0001\u0000\u0000\u0000\u014c"+
		"\u014d\u0005\u0019\u0000\u0000\u014d\u014e\u0005L\u0000\u0000\u014e\u014f"+
		"\u0005\u001a\u0000\u0000\u014f\u0150\u0005L\u0000\u0000\u0150\u0154\u0005"+
		"\b\u0000\u0000\u0151\u0153\u0003&\u0013\u0000\u0152\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u0158\u0005\t\u0000"+
		"\u0000\u0158%\u0001\u0000\u0000\u0000\u0159\u0162\u0003Z-\u0000\u015a"+
		"\u0162\u0003(\u0014\u0000\u015b\u0162\u0003:\u001d\u0000\u015c\u0162\u0003"+
		"0\u0018\u0000\u015d\u0162\u00036\u001b\u0000\u015e\u0162\u0003>\u001f"+
		"\u0000\u015f\u0162\u0003,\u0016\u0000\u0160\u0162\u0003*\u0015\u0000\u0161"+
		"\u0159\u0001\u0000\u0000\u0000\u0161\u015a\u0001\u0000\u0000\u0000\u0161"+
		"\u015b\u0001\u0000\u0000\u0000\u0161\u015c\u0001\u0000\u0000\u0000\u0161"+
		"\u015d\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162"+
		"\'\u0001\u0000\u0000\u0000\u0163\u0164\u0005\f\u0000\u0000\u0164\u0165"+
		"\u0005L\u0000\u0000\u0165\u0166\u0005\r\u0000\u0000\u0166\u0167\u0003"+
		"\\.\u0000\u0167\u0168\u0003&\u0013\u0000\u0168\u0176\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0005\f\u0000\u0000\u016a\u016b\u0005L\u0000\u0000"+
		"\u016b\u016c\u0005\r\u0000\u0000\u016c\u016d\u0003\\.\u0000\u016d\u016f"+
		"\u0005\b\u0000\u0000\u016e\u0170\u0003&\u0013\u0000\u016f\u016e\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0005\t\u0000\u0000\u0174\u0176\u0001\u0000"+
		"\u0000\u0000\u0175\u0163\u0001\u0000\u0000\u0000\u0175\u0169\u0001\u0000"+
		"\u0000\u0000\u0176)\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u000e\u0000"+
		"\u0000\u0178\u0179\u0003\\.\u0000\u0179\u017a\u0005\u000f\u0000\u0000"+
		"\u017a\u017b\u0003&\u0013\u0000\u017b\u0188\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0005\u000e\u0000\u0000\u017d\u017e\u0003\\.\u0000\u017e\u017f"+
		"\u0005\u000f\u0000\u0000\u017f\u0181\u0005\b\u0000\u0000\u0180\u0182\u0003"+
		"&\u0013\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000"+
		"\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005\t\u0000"+
		"\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0177\u0001\u0000\u0000"+
		"\u0000\u0187\u017c\u0001\u0000\u0000\u0000\u0188+\u0001\u0000\u0000\u0000"+
		"\u0189\u018a\u0005\u0010\u0000\u0000\u018a\u018b\u0003\\.\u0000\u018b"+
		"\u018c\u0005\u000f\u0000\u0000\u018c\u018e\u0003&\u0013\u0000\u018d\u018f"+
		"\u0003.\u0017\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u019e\u0001\u0000\u0000\u0000\u0190\u0191\u0005"+
		"\u0010\u0000\u0000\u0191\u0192\u0003\\.\u0000\u0192\u0193\u0005\u000f"+
		"\u0000\u0000\u0193\u0195\u0005\b\u0000\u0000\u0194\u0196\u0003&\u0013"+
		"\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000"+
		"\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0005\t\u0000\u0000"+
		"\u019a\u019c\u0003.\u0017\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d"+
		"\u0189\u0001\u0000\u0000\u0000\u019d\u0190\u0001\u0000\u0000\u0000\u019e"+
		"-\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0011\u0000\u0000\u01a0\u01ab"+
		"\u0003&\u0013\u0000\u01a1\u01a2\u0005\u0011\u0000\u0000\u01a2\u01a4\u0005"+
		"\b\u0000\u0000\u01a3\u01a5\u0003&\u0013\u0000\u01a4\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005\t\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000"+
		"\u0000\u01aa\u019f\u0001\u0000\u0000\u0000\u01aa\u01a1\u0001\u0000\u0000"+
		"\u0000\u01ab/\u0001\u0000\u0000\u0000\u01ac\u01ad\u00038\u001c\u0000\u01ad"+
		"\u01ae\u0005\u001b\u0000\u0000\u01ae\u01af\u00032\u0019\u0000\u01af\u01b5"+
		"\u0005\u001c\u0000\u0000\u01b0\u01b1\u00032\u0019\u0000\u01b1\u01b2\u0005"+
		"\u001c\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003"+
		"2\u0019\u0000\u01b9\u01ba\u0005\u0013\u0000\u0000\u01ba1\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bf\u0003\\.\u0000\u01bc\u01be\u0003\u001e\u000f\u0000"+
		"\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c03\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c3\u00038\u001c\u0000\u01c3\u01c7\u0005\u001d\u0000\u0000\u01c4\u01c6"+
		"\u0003\u001e\u000f\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c85\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u00034\u001a\u0000\u01cb\u01cc\u0005\u0013"+
		"\u0000\u0000\u01cc7\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u001e\u0000"+
		"\u0000\u01ce\u01cf\u0005L\u0000\u0000\u01cf\u01d0\u0005\u0004\u0000\u0000"+
		"\u01d0\u01d1\u0005L\u0000\u0000\u01d1\u01d2\u0005\u001f\u0000\u0000\u01d2"+
		"9\u0001\u0000\u0000\u0000\u01d3\u01d9\u0005 \u0000\u0000\u01d4\u01d5\u0003"+
		"<\u001e\u0000\u01d5\u01d6\u0005\u0004\u0000\u0000\u01d6\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000"+
		"\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000"+
		"\u0000\u0000\u01da\u01dc\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0003<\u001e\u0000\u01dd\u01de\u0005\u0013\u0000"+
		"\u0000\u01de;\u0001\u0000\u0000\u0000\u01df\u01e0\u0005L\u0000\u0000\u01e0"+
		"\u01e1\u0005!\u0000\u0000\u01e1\u01e7\u0003\\.\u0000\u01e2\u01e3\u0003"+
		"4\u001a\u0000\u01e3\u01e4\u0005!\u0000\u0000\u01e4\u01e5\u0003\\.\u0000"+
		"\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01df\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e7=\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0005\"\u0000\u0000\u01e9\u01ea\u0005L\u0000\u0000\u01ea\u01eb"+
		"\u0003\\.\u0000\u01eb\u01f1\u0005\u0014\u0000\u0000\u01ec\u01ed\u0003"+
		"@ \u0000\u01ed\u01ee\u0005\u0004\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ec\u0001\u0000\u0000\u0000\u01f0\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0003@ \u0000\u01f5\u01f6\u0005\u0016\u0000\u0000\u01f6"+
		"\u01f7\u0005\u0013\u0000\u0000\u01f7?\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0003j5\u0000\u01f9\u0200\u0005\u0015\u0000\u0000\u01fa\u01fc\u0005L"+
		"\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u0201\u0005K\u0000"+
		"\u0000\u0200\u01fb\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000\u0000"+
		"\u0000\u0201A\u0001\u0000\u0000\u0000\u0202\u0203\u0005#\u0000\u0000\u0203"+
		"\u0204\u0005L\u0000\u0000\u0204\u0207\u0005\b\u0000\u0000\u0205\u0208"+
		"\u0003D\"\u0000\u0206\u0208\u0003F#\u0000\u0207\u0205\u0001\u0000\u0000"+
		"\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020c\u0005\t\u0000\u0000"+
		"\u020cC\u0001\u0000\u0000\u0000\u020d\u020e\u0005$\u0000\u0000\u020e\u020f"+
		"\u0005L\u0000\u0000\u020f\u0210\u0005\f\u0000\u0000\u0210\u0211\u0005"+
		"L\u0000\u0000\u0211\u0212\u0005!\u0000\u0000\u0212\u0213\u0003\\.\u0000"+
		"\u0213\u0214\u0005\u001c\u0000\u0000\u0214\u0215\u0005%\u0000\u0000\u0215"+
		"\u0216\u0003\\.\u0000\u0216\u0217\u0005\u0013\u0000\u0000\u0217E\u0001"+
		"\u0000\u0000\u0000\u0218\u0219\u0005&\u0000\u0000\u0219\u021a\u0005L\u0000"+
		"\u0000\u021a\u021c\u0005\b\u0000\u0000\u021b\u021d\u0003H$\u0000\u021c"+
		"\u021b\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e"+
		"\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f"+
		"\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0005\t\u0000\u0000\u0221G"+
		"\u0001\u0000\u0000\u0000\u0222\u0229\u0003\u001c\u000e\u0000\u0223\u0229"+
		"\u0003P(\u0000\u0224\u0229\u0003R)\u0000\u0225\u0229\u0003Z-\u0000\u0226"+
		"\u0229\u0003L&\u0000\u0227\u0229\u0003J%\u0000\u0228\u0222\u0001\u0000"+
		"\u0000\u0000\u0228\u0223\u0001\u0000\u0000\u0000\u0228\u0224\u0001\u0000"+
		"\u0000\u0000\u0228\u0225\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0229I\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0005\u000e\u0000\u0000\u022b\u022c\u0003\\.\u0000"+
		"\u022c\u022d\u0005\u000f\u0000\u0000\u022d\u022e\u0003H$\u0000\u022e\u023b"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0005\u000e\u0000\u0000\u0230\u0231"+
		"\u0003\\.\u0000\u0231\u0232\u0005\u000f\u0000\u0000\u0232\u0234\u0005"+
		"\b\u0000\u0000\u0233\u0235\u0003H$\u0000\u0234\u0233\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0005\t\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000"+
		"\u023a\u022a\u0001\u0000\u0000\u0000\u023a\u022f\u0001\u0000\u0000\u0000"+
		"\u023bK\u0001\u0000\u0000\u0000\u023c\u023d\u0005\u0010\u0000\u0000\u023d"+
		"\u023e\u0003\\.\u0000\u023e\u023f\u0005\u000f\u0000\u0000\u023f\u0241"+
		"\u0003H$\u0000\u0240\u0242\u0003N\'\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0250\u0001\u0000\u0000"+
		"\u0000\u0243\u0244\u0005\u0010\u0000\u0000\u0244\u0245\u0003\\.\u0000"+
		"\u0245\u0246\u0005\u000f\u0000\u0000\u0246\u0248\u0005\b\u0000\u0000\u0247"+
		"\u0249\u0003H$\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0249\u024a\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0005"+
		"\t\u0000\u0000\u024d\u024e\u0003N\'\u0000\u024e\u0250\u0001\u0000\u0000"+
		"\u0000\u024f\u023c\u0001\u0000\u0000\u0000\u024f\u0243\u0001\u0000\u0000"+
		"\u0000\u0250M\u0001\u0000\u0000\u0000\u0251\u0252\u0005\u0011\u0000\u0000"+
		"\u0252\u025d\u0003H$\u0000\u0253\u0254\u0005\u0011\u0000\u0000\u0254\u0256"+
		"\u0005\b\u0000\u0000\u0255\u0257\u0003H$\u0000\u0256\u0255\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0005\t\u0000\u0000\u025b\u025d\u0001\u0000\u0000"+
		"\u0000\u025c\u0251\u0001\u0000\u0000\u0000\u025c\u0253\u0001\u0000\u0000"+
		"\u0000\u025dO\u0001\u0000\u0000\u0000\u025e\u025f\u0005\f\u0000\u0000"+
		"\u025f\u0260\u0005L\u0000\u0000\u0260\u0261\u0005\r\u0000\u0000\u0261"+
		"\u0262\u0003\\.\u0000\u0262\u0263\u0003H$\u0000\u0263\u0271\u0001\u0000"+
		"\u0000\u0000\u0264\u0265\u0005\f\u0000\u0000\u0265\u0266\u0005L\u0000"+
		"\u0000\u0266\u0267\u0005\r\u0000\u0000\u0267\u0268\u0003\\.\u0000\u0268"+
		"\u026a\u0005\b\u0000\u0000\u0269\u026b\u0003H$\u0000\u026a\u0269\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026a\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\u0005\t\u0000\u0000\u026f\u0271\u0001\u0000"+
		"\u0000\u0000\u0270\u025e\u0001\u0000\u0000\u0000\u0270\u0264\u0001\u0000"+
		"\u0000\u0000\u0271Q\u0001\u0000\u0000\u0000\u0272\u0278\u0005\'\u0000"+
		"\u0000\u0273\u0274\u0003T*\u0000\u0274\u0275\u0005\u0004\u0000\u0000\u0275"+
		"\u0277\u0001\u0000\u0000\u0000\u0276\u0273\u0001\u0000\u0000\u0000\u0277"+
		"\u027a\u0001\u0000\u0000\u0000\u0278\u0276\u0001\u0000\u0000\u0000\u0278"+
		"\u0279\u0001\u0000\u0000\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a"+
		"\u0278\u0001\u0000\u0000\u0000\u027b\u027c\u0003T*\u0000\u027c\u027d\u0005"+
		"\u0013\u0000\u0000\u027d\u0281\u0001\u0000\u0000\u0000\u027e\u027f\u0007"+
		"\u0000\u0000\u0000\u027f\u0281\u0005\u0013\u0000\u0000\u0280\u0272\u0001"+
		"\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0281S\u0001\u0000"+
		"\u0000\u0000\u0282\u0286\u0005L\u0000\u0000\u0283\u0285\u0003\u001e\u000f"+
		"\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000"+
		"\u0000\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000"+
		"\u0000\u0287\u028b\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000"+
		"\u0000\u0289\u028b\u00038\u001c\u0000\u028a\u0282\u0001\u0000\u0000\u0000"+
		"\u028a\u0289\u0001\u0000\u0000\u0000\u028bU\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0005)\u0000\u0000\u028d\u028e\u0005L\u0000\u0000\u028e\u028f\u0005"+
		"\u0013\u0000\u0000\u028fW\u0001\u0000\u0000\u0000\u0290\u0296\u0003h4"+
		"\u0000\u0291\u0292\u0003^/\u0000\u0292\u0293\u0005\u0004\u0000\u0000\u0293"+
		"\u0295\u0001\u0000\u0000\u0000\u0294\u0291\u0001\u0000\u0000\u0000\u0295"+
		"\u0298\u0001\u0000\u0000\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296"+
		"\u0297\u0001\u0000\u0000\u0000\u0297\u0299\u0001\u0000\u0000\u0000\u0298"+
		"\u0296\u0001\u0000\u0000\u0000\u0299\u029a\u0003^/\u0000\u029a\u02a6\u0001"+
		"\u0000\u0000\u0000\u029b\u02a0\u0003h4\u0000\u029c\u029d\u0005L\u0000"+
		"\u0000\u029d\u029f\u0005\u0004\u0000\u0000\u029e\u029c\u0001\u0000\u0000"+
		"\u0000\u029f\u02a2\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005L\u0000\u0000"+
		"\u02a4\u02a6\u0001\u0000\u0000\u0000\u02a5\u0290\u0001\u0000\u0000\u0000"+
		"\u02a5\u029b\u0001\u0000\u0000\u0000\u02a6Y\u0001\u0000\u0000\u0000\u02a7"+
		"\u02ab\u0003\\.\u0000\u02a8\u02ab\u0003X,\u0000\u02a9\u02ab\u0003^/\u0000"+
		"\u02aa\u02a7\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000"+
		"\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000"+
		"\u02ac\u02ad\u0005\u0013\u0000\u0000\u02ad[\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0006.\uffff\uffff\u0000\u02af\u02b0\u0007\u0001\u0000\u0000\u02b0"+
		"\u02c5\u0003\\.\u000f\u02b1\u02b2\u0005+\u0000\u0000\u02b2\u02c5\u0003"+
		"\\.\u000e\u02b3\u02b4\u00055\u0000\u0000\u02b4\u02b5\u0005L\u0000\u0000"+
		"\u02b5\u02c5\u00056\u0000\u0000\u02b6\u02b7\u00055\u0000\u0000\u02b7\u02b8"+
		"\u0003\\.\u0000\u02b8\u02b9\u00056\u0000\u0000\u02b9\u02c5\u0001\u0000"+
		"\u0000\u0000\u02ba\u02c5\u0003b1\u0000\u02bb\u02c5\u0003`0\u0000\u02bc"+
		"\u02c5\u0005K\u0000\u0000\u02bd\u02c5\u0005L\u0000\u0000\u02be\u02c2\u0005"+
		"7\u0000\u0000\u02bf\u02c0\u00058\u0000\u0000\u02c0\u02c1\u0005N\u0000"+
		"\u0000\u02c1\u02c3\u0005\u0016\u0000\u0000\u02c2\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c4\u02ae\u0001\u0000\u0000\u0000\u02c4\u02b1\u0001\u0000\u0000"+
		"\u0000\u02c4\u02b3\u0001\u0000\u0000\u0000\u02c4\u02b6\u0001\u0000\u0000"+
		"\u0000\u02c4\u02ba\u0001\u0000\u0000\u0000\u02c4\u02bb\u0001\u0000\u0000"+
		"\u0000\u02c4\u02bc\u0001\u0000\u0000\u0000\u02c4\u02bd\u0001\u0000\u0000"+
		"\u0000\u02c4\u02be\u0001\u0000\u0000\u0000\u02c5\u02da\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c7\n\r\u0000\u0000\u02c7\u02c8\u0007\u0002\u0000\u0000"+
		"\u02c8\u02d9\u0003\\.\u000e\u02c9\u02ca\n\f\u0000\u0000\u02ca\u02cb\u0007"+
		"\u0001\u0000\u0000\u02cb\u02d9\u0003\\.\r\u02cc\u02cd\n\u000b\u0000\u0000"+
		"\u02cd\u02ce\u0007\u0003\u0000\u0000\u02ce\u02d9\u0003\\.\f\u02cf\u02d0"+
		"\n\n\u0000\u0000\u02d0\u02d1\u0007\u0004\u0000\u0000\u02d1\u02d9\u0003"+
		"\\.\u000b\u02d2\u02d3\n\t\u0000\u0000\u02d3\u02d4\u00053\u0000\u0000\u02d4"+
		"\u02d9\u0003\\.\n\u02d5\u02d6\n\b\u0000\u0000\u02d6\u02d7\u00054\u0000"+
		"\u0000\u02d7\u02d9\u0003\\.\t\u02d8\u02c6\u0001\u0000\u0000\u0000\u02d8"+
		"\u02c9\u0001\u0000\u0000\u0000\u02d8\u02cc\u0001\u0000\u0000\u0000\u02d8"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d8\u02d2\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d9\u02dc\u0001\u0000\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db"+
		"]\u0001\u0000\u0000\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0005L\u0000\u0000\u02de\u02df\u0005\u0015\u0000\u0000\u02df\u02e0\u0003"+
		"\\.\u0000\u02e0_\u0001\u0000\u0000\u0000\u02e1\u02e6\u00059\u0000\u0000"+
		"\u02e2\u02e3\u0005L\u0000\u0000\u02e3\u02e5\u0005\u0004\u0000\u0000\u02e4"+
		"\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e9\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ea\u0005L\u0000\u0000\u02ea\u02eb\u0005:\u0000\u0000\u02eba\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ef\u0003d2\u0000\u02ed\u02ef\u0003f3\u0000"+
		"\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000\u0000\u0000"+
		"\u02efc\u0001\u0000\u0000\u0000\u02f0\u02f1\u00055\u0000\u0000\u02f1\u02f2"+
		"\u0003\\.\u0000\u02f2\u02f3\u0005\u0004\u0000\u0000\u02f3\u02f4\u0003"+
		"\\.\u0000\u02f4\u02f5\u00056\u0000\u0000\u02f5e\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f7\u00055\u0000\u0000\u02f7\u02f8\u0003\\.\u0000\u02f8\u02f9"+
		"\u0005;\u0000\u0000\u02f9\u02fa\u0003\\.\u0000\u02fa\u02fb\u00056\u0000"+
		"\u0000\u02fbg\u0001\u0000\u0000\u0000\u02fc\u02fd\u0007\u0005\u0000\u0000"+
		"\u02fdi\u0001\u0000\u0000\u0000\u02fe\u02ff\u0007\u0006\u0000\u0000\u02ff"+
		"k\u0001\u0000\u0000\u0000\u0300\u0301\u0007\u0007\u0000\u0000\u0301m\u0001"+
		"\u0000\u0000\u0000Lr|\u0081\u008a\u0094\u009a\u009e\u00a6\u00ab\u00b1"+
		"\u00b9\u00be\u00c8\u00d8\u00dc\u00ea\u00ee\u00f5\u00fe\u0102\u0104\u010d"+
		"\u0111\u0118\u0122\u012c\u012f\u0139\u0145\u0154\u0161\u0171\u0175\u0183"+
		"\u0187\u018e\u0197\u019b\u019d\u01a6\u01aa\u01b5\u01bf\u01c7\u01d9\u01e6"+
		"\u01f1\u01fd\u0200\u0207\u0209\u021e\u0228\u0236\u023a\u0241\u024a\u024f"+
		"\u0258\u025c\u026c\u0270\u0278\u0280\u0286\u028a\u0296\u02a0\u02a5\u02aa"+
		"\u02c2\u02c4\u02d8\u02da\u02e6\u02ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}