// Aisha Kabir
// ITDEV-110

package mathcalculator;

public class MathFun {

    private double Number1;
    private double Number2;

    public void setNumber1(double userinput){
       Number1 = userinput;
    }
    public double getNumber1(){
        return Number1;
    }
    public void setNumber2(double userinput){
       Number2 = userinput;
    }
    public double getNumber2(){
        return Number2;
    }

    public double multiplyThem(){
        return Number1*Number2;
    }
    public double addThem(){
        return Number1+Number2;
    }
}
