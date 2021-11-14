import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Final{

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        System.out.println("Write your numbers and add/sub/div/mult function");

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);


       Numbers request = new Numbers(in.nextInt(), in.nextInt(),in.next());

        chainCalc1.calculate(request);
    }
}
