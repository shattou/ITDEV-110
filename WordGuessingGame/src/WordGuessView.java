// Aisha Kabir
// ITDEV-110

package wordguessinggame;

import java.io.PrintStream;
import java.util.Scanner;

public class WordGuessView {
    private final Scanner input;
    private final PrintStream output;

    public WordGuessView() { this(new Scanner(System.in), System.out); }

    public WordGuessView(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }

    public void introduction() {
        output.println("Welcome to Word Guessing Game!");
        output.println("Guess one letter at a time. You have 10 incorrect guesses.");
    }

    public void showRound(WordGuessModel model) {
        output.println("Word: " + model.getMaskedWord());
        output.println("Guessed letters: " + model.getGuesses());
        output.println("Incorrect guesses remaining: "
                + (WordGuessModel.MAX_MISTAKES - model.getGuessCounter()));
    }

    public String playerGuess() {
        output.print("Enter a letter: ");
        return input.hasNextLine() ? input.nextLine() : null;
    }

    public void showResult(WordGuessModel.GuessResult result) {
        switch (result) {
            case CORRECT: output.println("Correct!"); break;
            case INCORRECT: output.println("That letter is not in the word."); break;
            case REPEATED: output.println("You already guessed that letter. Try another."); break;
            case INVALID: output.println("Please enter a single letter from A to Z."); break;
        }
    }

    public void endRound(WordGuessModel model) {
        output.println(model.isWon() ? "You won!" : "Out of guesses!");
        output.println("The word was: " + model.getSelectedWord());
    }

    public boolean playAgain() {
        while (true) {
            output.print("Play again? Enter Y or N: ");
            if (!input.hasNextLine()) return false;
            String choice = input.nextLine().trim();
            if (choice.equalsIgnoreCase("y")) return true;
            if (choice.equalsIgnoreCase("n")) return false;
            output.println("Enter Y or N.");
        }
    }

    public void goodbye() { output.println("Goodbye! Thanks for playing."); }
}
