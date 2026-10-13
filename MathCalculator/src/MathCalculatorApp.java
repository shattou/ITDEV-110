// Aisha Kabir
// ITDEV-110

package mathcalculator;
import java.util.Scanner;

public class MathCalculatorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       Admin getReady = new Admin();
       System.out.println("Calculator");

       MathFun calc1 = new MathFun();
       MathFun calc2 = new MathFun();
       double Number1,Number2;

       System.out.println("Please enter first number");
       Number1 = input.nextDouble();
       System.out.println("Enter second Number");
       Number2 = input.nextDouble();

       calc1.setNumber1(Number1);
       calc2.setNumber2(Number2);

       System.out.println("The first number is"
               +calc1.getNumber1());
       System.out.println("The second number is"
               +calc2.getNumber2());
       System.out.println("The product of the 2 numbers is"
               +calc1.multiplyThem());
       System.out.println("The sum of the 2 numbers is"
               +calc2.addThem());

    }

}
