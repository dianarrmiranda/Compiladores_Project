import sys
from antlr4 import *
from xAdvLexer import xAdvLexer
from xAdvParser import xAdvParser
from xAdvInterpreter import xAdvInterpreter

def main(argv):
   visitor0 = xAdvInterpreter()
   input_stream = StdinStream()
   lexer = xAdvLexer(input_stream)
   stream = CommonTokenStream(lexer)
   parser = xAdvParser(stream)
   tree = parser.program()
   if parser.getNumberOfSyntaxErrors() == 0:
      visitor0.visit(tree)

if __name__ == '__main__':
   main(sys.argv)
