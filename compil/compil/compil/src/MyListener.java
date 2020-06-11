import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class MyListener extends benqBaseListener {
    private Map<String,Value> variables;
    public MyListener()
    {
        variables = new HashMap<>();
    }







    @Override
    public void exitAssign(benqParser.AssignContext context)
    {
        String variableName = context.ident().getText();
        String value = context.expression().getText();
    }

    public void exitPrintmess(benqParser.PrintmessContext context) {


    }





    public static void main(String[] args)
    {
        try
        {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("test2.txt");
            benqLexer lexer = new benqLexer((input));
            benqParser parser = new benqParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}