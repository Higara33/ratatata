
import org.antlr.v4.runtime.CommonTokenStream;

import org.antlr.v4.runtime.CharStream;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args){
        try{
            String source = "test2.txt";
            CharStream cs = fromFileName(source);
            benqLexer lexer = new benqLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            benqParser parser = new benqParser(token);
            ParseTree tree = parser.start();
            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);



        }catch(IOException e){
            e.printStackTrace();
        }
    }




}
