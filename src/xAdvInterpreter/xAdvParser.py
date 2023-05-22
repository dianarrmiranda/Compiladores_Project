# Generated from xAdv.g4 by ANTLR 4.12.0
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,17,76,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,4,
        0,14,8,0,11,0,12,0,15,1,0,1,0,1,1,1,1,3,1,22,8,1,1,2,1,2,1,2,1,3,
        1,3,1,3,3,3,30,8,3,1,4,1,4,1,4,1,4,1,4,4,4,37,8,4,11,4,12,4,38,1,
        4,1,4,1,4,1,4,1,4,1,4,4,4,47,8,4,11,4,12,4,48,1,4,3,4,52,8,4,1,5,
        1,5,1,5,1,5,1,5,4,5,59,8,5,11,5,12,5,60,1,5,1,5,1,5,1,5,1,5,1,5,
        4,5,69,8,5,11,5,12,5,70,1,5,3,5,74,8,5,1,5,0,0,6,0,2,4,6,8,10,0,
        0,78,0,13,1,0,0,0,2,21,1,0,0,0,4,23,1,0,0,0,6,26,1,0,0,0,8,51,1,
        0,0,0,10,73,1,0,0,0,12,14,3,2,1,0,13,12,1,0,0,0,14,15,1,0,0,0,15,
        13,1,0,0,0,15,16,1,0,0,0,16,17,1,0,0,0,17,18,5,0,0,1,18,1,1,0,0,
        0,19,22,3,4,2,0,20,22,3,6,3,0,21,19,1,0,0,0,21,20,1,0,0,0,22,3,1,
        0,0,0,23,24,5,1,0,0,24,25,5,12,0,0,25,5,1,0,0,0,26,29,5,2,0,0,27,
        30,3,8,4,0,28,30,3,10,5,0,29,27,1,0,0,0,29,28,1,0,0,0,30,7,1,0,0,
        0,31,32,5,3,0,0,32,36,5,4,0,0,33,34,5,8,0,0,34,35,5,5,0,0,35,37,
        5,12,0,0,36,33,1,0,0,0,37,38,1,0,0,0,38,36,1,0,0,0,38,39,1,0,0,0,
        39,40,1,0,0,0,40,52,5,6,0,0,41,42,5,12,0,0,42,46,5,4,0,0,43,44,5,
        8,0,0,44,45,5,5,0,0,45,47,5,12,0,0,46,43,1,0,0,0,47,48,1,0,0,0,48,
        46,1,0,0,0,48,49,1,0,0,0,49,50,1,0,0,0,50,52,5,6,0,0,51,31,1,0,0,
        0,51,41,1,0,0,0,52,9,1,0,0,0,53,54,5,7,0,0,54,58,5,4,0,0,55,56,5,
        9,0,0,56,57,5,5,0,0,57,59,5,12,0,0,58,55,1,0,0,0,59,60,1,0,0,0,60,
        58,1,0,0,0,60,61,1,0,0,0,61,62,1,0,0,0,62,74,5,6,0,0,63,64,5,12,
        0,0,64,68,5,4,0,0,65,66,5,9,0,0,66,67,5,5,0,0,67,69,5,12,0,0,68,
        65,1,0,0,0,69,70,1,0,0,0,70,68,1,0,0,0,70,71,1,0,0,0,71,72,1,0,0,
        0,72,74,5,6,0,0,73,53,1,0,0,0,73,63,1,0,0,0,74,11,1,0,0,0,9,15,21,
        29,38,48,51,60,70,73
    ]

class xAdvParser ( Parser ):

    grammarFileName = "xAdv.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'import'", "'define'", "'automaton'", 
                     "'{'", "':'", "'}'", "'viewport'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "AutomatonProperty", "ViewportProperty", "WS", "Ignore", 
                      "Value", "INT", "ID", "NEWLINE", "SingleLineComment", 
                      "BlockComment" ]

    RULE_program = 0
    RULE_definitions = 1
    RULE_importDef = 2
    RULE_concreteDefinition = 3
    RULE_automatonStyle = 4
    RULE_viewportStyle = 5

    ruleNames =  [ "program", "definitions", "importDef", "concreteDefinition", 
                   "automatonStyle", "viewportStyle" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    AutomatonProperty=8
    ViewportProperty=9
    WS=10
    Ignore=11
    Value=12
    INT=13
    ID=14
    NEWLINE=15
    SingleLineComment=16
    BlockComment=17

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.12.0")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(xAdvParser.EOF, 0)

        def definitions(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(xAdvParser.DefinitionsContext)
            else:
                return self.getTypedRuleContext(xAdvParser.DefinitionsContext,i)


        def getRuleIndex(self):
            return xAdvParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = xAdvParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 12
                self.definitions()
                self.state = 15 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1 or _la==2):
                    break

            self.state = 17
            self.match(xAdvParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DefinitionsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def importDef(self):
            return self.getTypedRuleContext(xAdvParser.ImportDefContext,0)


        def concreteDefinition(self):
            return self.getTypedRuleContext(xAdvParser.ConcreteDefinitionContext,0)


        def getRuleIndex(self):
            return xAdvParser.RULE_definitions

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDefinitions" ):
                listener.enterDefinitions(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDefinitions" ):
                listener.exitDefinitions(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDefinitions" ):
                return visitor.visitDefinitions(self)
            else:
                return visitor.visitChildren(self)




    def definitions(self):

        localctx = xAdvParser.DefinitionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_definitions)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 21
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                self.state = 19
                self.importDef()
                pass
            elif token in [2]:
                self.state = 20
                self.concreteDefinition()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ImportDefContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def Value(self):
            return self.getToken(xAdvParser.Value, 0)

        def getRuleIndex(self):
            return xAdvParser.RULE_importDef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterImportDef" ):
                listener.enterImportDef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitImportDef" ):
                listener.exitImportDef(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitImportDef" ):
                return visitor.visitImportDef(self)
            else:
                return visitor.visitChildren(self)




    def importDef(self):

        localctx = xAdvParser.ImportDefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_importDef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 23
            self.match(xAdvParser.T__0)
            self.state = 24
            self.match(xAdvParser.Value)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConcreteDefinitionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def automatonStyle(self):
            return self.getTypedRuleContext(xAdvParser.AutomatonStyleContext,0)


        def viewportStyle(self):
            return self.getTypedRuleContext(xAdvParser.ViewportStyleContext,0)


        def getRuleIndex(self):
            return xAdvParser.RULE_concreteDefinition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConcreteDefinition" ):
                listener.enterConcreteDefinition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConcreteDefinition" ):
                listener.exitConcreteDefinition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConcreteDefinition" ):
                return visitor.visitConcreteDefinition(self)
            else:
                return visitor.visitChildren(self)




    def concreteDefinition(self):

        localctx = xAdvParser.ConcreteDefinitionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_concreteDefinition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(xAdvParser.T__1)
            self.state = 29
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 27
                self.automatonStyle()
                pass

            elif la_ == 2:
                self.state = 28
                self.viewportStyle()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AutomatonStyleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AutomatonProperty(self, i:int=None):
            if i is None:
                return self.getTokens(xAdvParser.AutomatonProperty)
            else:
                return self.getToken(xAdvParser.AutomatonProperty, i)

        def Value(self, i:int=None):
            if i is None:
                return self.getTokens(xAdvParser.Value)
            else:
                return self.getToken(xAdvParser.Value, i)

        def getRuleIndex(self):
            return xAdvParser.RULE_automatonStyle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAutomatonStyle" ):
                listener.enterAutomatonStyle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAutomatonStyle" ):
                listener.exitAutomatonStyle(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAutomatonStyle" ):
                return visitor.visitAutomatonStyle(self)
            else:
                return visitor.visitChildren(self)




    def automatonStyle(self):

        localctx = xAdvParser.AutomatonStyleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_automatonStyle)
        self._la = 0 # Token type
        try:
            self.state = 51
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [3]:
                self.enterOuterAlt(localctx, 1)
                self.state = 31
                self.match(xAdvParser.T__2)
                self.state = 32
                self.match(xAdvParser.T__3)
                self.state = 36 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 33
                    self.match(xAdvParser.AutomatonProperty)
                    self.state = 34
                    self.match(xAdvParser.T__4)
                    self.state = 35
                    self.match(xAdvParser.Value)
                    self.state = 38 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==8):
                        break

                self.state = 40
                self.match(xAdvParser.T__5)
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 2)
                self.state = 41
                self.match(xAdvParser.Value)
                self.state = 42
                self.match(xAdvParser.T__3)
                self.state = 46 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 43
                    self.match(xAdvParser.AutomatonProperty)
                    self.state = 44
                    self.match(xAdvParser.T__4)
                    self.state = 45
                    self.match(xAdvParser.Value)
                    self.state = 48 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==8):
                        break

                self.state = 50
                self.match(xAdvParser.T__5)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ViewportStyleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ViewportProperty(self, i:int=None):
            if i is None:
                return self.getTokens(xAdvParser.ViewportProperty)
            else:
                return self.getToken(xAdvParser.ViewportProperty, i)

        def Value(self, i:int=None):
            if i is None:
                return self.getTokens(xAdvParser.Value)
            else:
                return self.getToken(xAdvParser.Value, i)

        def getRuleIndex(self):
            return xAdvParser.RULE_viewportStyle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterViewportStyle" ):
                listener.enterViewportStyle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitViewportStyle" ):
                listener.exitViewportStyle(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitViewportStyle" ):
                return visitor.visitViewportStyle(self)
            else:
                return visitor.visitChildren(self)




    def viewportStyle(self):

        localctx = xAdvParser.ViewportStyleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_viewportStyle)
        self._la = 0 # Token type
        try:
            self.state = 73
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 53
                self.match(xAdvParser.T__6)
                self.state = 54
                self.match(xAdvParser.T__3)
                self.state = 58 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 55
                    self.match(xAdvParser.ViewportProperty)
                    self.state = 56
                    self.match(xAdvParser.T__4)
                    self.state = 57
                    self.match(xAdvParser.Value)
                    self.state = 60 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==9):
                        break

                self.state = 62
                self.match(xAdvParser.T__5)
                pass
            elif token in [12]:
                self.enterOuterAlt(localctx, 2)
                self.state = 63
                self.match(xAdvParser.Value)
                self.state = 64
                self.match(xAdvParser.T__3)
                self.state = 68 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 65
                    self.match(xAdvParser.ViewportProperty)
                    self.state = 66
                    self.match(xAdvParser.T__4)
                    self.state = 67
                    self.match(xAdvParser.Value)
                    self.state = 70 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==9):
                        break

                self.state = 72
                self.match(xAdvParser.T__5)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





