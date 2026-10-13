// Aisha Kabir
// ITDEV-110

package gradeaverage;

// package kabir_midterm;

import java.util.Scanner;

public class Display {
    Scanner input = new Scanner(System.in);

    private int exit=1;
    private int end=-1;

    public void setExit(int e){
        exit=e;
    }

    public int getExit(){
        return(exit);
    }
    public void setEnd(int e){
        end=e;
    }
    public int getEnd(){
        return(end);
    }

    public void introduction(){
        System.out.println("This application will calculate and display a running avaerage of "
                + "all student grade scores as well as the number of score entried entered by the user");
        System.out.println("Begin by entering all scores one at a time to calculate the average of scores."
                + "  When you have completed entering all scores"
                + " enter -1 to calculate and output the final average "
                + "and the final number of score entries entered.");
    }

    public int inputNumber(){
        System.out.println("");
        System.out.println("Enter next score to add to the average: ");
        return(input.nextInt());
    }

    public void endNumber(int average, int counter){
        System.out.println("Final Average is: "+average);
        System.out.println("Final number of scores: "+(counter-1));
    }

    public boolean restartCalc(){
      System.out.println("");
      System.out.println("Would you like to enter another set of scores? Enter '1' to continue or '0' to exit: ");

      if ((input.nextInt() != 1)) {
        return(false);
      } else {
        return(true);
      }
    }

    public void displayFinal(int average,  int counter){
        System.out.println("Number of scores entered: " +counter);
        System.out.println("Average of all scores entered: "+average);
    }
}
