// Aisha Kabir
// ITDEV-110

package hilowgame;

import java.util.Scanner;

public class HiLowView {

    private Scanner input = new Scanner(System.in);

    public void Intro() {
        System.out.println("This game will select a number that you will guess."
                + " The game will tell you if the guess is too high, too low, or correct and keep track of the number of guesses. "
                + "Once the range is set, enter (0) at any point to exit the game.");
        System.out.println("Start by selecting the game level you would like to play. Good luck!");
    }

    public int gameLevel() {
        System.out.println("");
        System.out.println("Enter (1) for Easy, "
         + "(2) for Medium, (3) for Hard: ");
        return input.nextInt();
    }

    public int wagerAmount() {
        System.out.println("");
        System.out.println("How much would you like to bet: ");
        return input.nextInt();
    }

    public int enterGuess() {
        System.out.println("A number has been selected.");
        System.out.println("Enter your guess: ");
        return input.nextInt();

    }

    public int tooHigh(int counter, int guess) {
        System.out.println("You guessed: " + guess);
        System.out.println("Your guess was too high");
        System.out.println("Guess Number: " + counter);
        System.out.println("Enter your guess: ");
        return input.nextInt();
    }

    public int tooLow(int counter, int guess) {
        System.out.println("You guessed: " + guess);
        System.out.println("Your guess was too low");
        System.out.println("Guess Number: " + counter);
        System.out.println("Enter your guess: ");
        return input.nextInt();
    }

    public void correct(){
        System.out.println("Your guess was correct!");
    }

    public boolean playAgain() {
        int choice;
        boolean again = false;
        System.out.println("Enter (0) to exit game\n Or (1) to play again");
        choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            again = true;
        }
        return again;
    }

    public void displayPlayerCredits(int credits){
      System.out.println("Player credits: "+ credits);
    }

    public void endGame(){
      System.out.println("Thanks for playing!");
    }

    public void playerCreditLow(){
      System.out.println("Your credits are low, game will exit now");
    }
}
