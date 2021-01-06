import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        ANTLRInputStream ais = new ANTLRInputStream(s);
        GramLexer l = new GramLexer(ais);
        TokenStream ts = new CommonTokenStream(l);
        GramParser parser = new GramParser(ts);
        Parent p = parser.exp().expr;
        System.out.println(p.buildTree());
    }
}