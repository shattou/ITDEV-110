// Aisha Kabir
// ITDEV-110

package besterdicegame;
import java.util.Scanner;

public class BesterView {

    private Scanner input = new Scanner(System.in);

    public void Introduction(){
        System.out.println("Welcome to the dice game. You will be playing against the computer in a game of dice.");
        System.out.println("Each time you enter (1) a new round will play.");
        System.out.println("The computer will roll first. Let's begin.");
    }

    public String playersName(){
        System.out.println("Please enter your name: ");
        return input.nextLine();

    }

    public String playersInitialTurn(){
       System.out.println("Press enter to roll: ");
       return input.nextLine();
    }

    public void showRoll(String name, int[] rolls, int counter, int score){
      for (int i = 0; i < rolls.length; i++){
        System.out.println(name+"\t...................."+rolls[i]);
      }
      System.out.println(name+"'s Roll: #"+counter);
    }

    public void showScore(String[] name, int[] score){
      System.out.println("");
      for (int i = 0; i < name.length; i++){
        System.out.println("     " + name[i]+"'s Score: "+score[i]+ "     ");
      }

    }

    public int playerRollOrpass(){
        System.out.println("(1) to Roll");
        System.out.println("(2) to Pass");
        return input.nextInt();
    }

    public void Outro(){
      System.out.println("Thanks for playing the dice game");
    }

    public void computerPassTurn(){
      System.out.println("THE COMPUTER WILL PASS.");
      System.out.println("");
    }

     public void computersTurn(){
      System.out.println("");
      System.out.println("THE COMPUTER WILL ROLL.");
      System.out.println("");
    }

    public void endGame(String name, int score){
      System.out.println("The winner is "+ name+ " with "+ score);
      System.out.println("(0) to exit");
      System.out.println("(1) to roll again");
    }
}
