package wordguessinggame;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/** Dependency-free behavior tests. Run with assertions enabled (-ea). */
public class WordGuessingGameTest {
    public static void main(String[] args) {
        WordGuessModel model = new WordGuessModel();
        model.startRound("bottle");
        assert model.getMaskedWord().equals("______") : "The answer must start hidden";
        assert model.guess(" T ") == WordGuessModel.GuessResult.CORRECT;
        assert model.getMaskedWord().equals("__tt__") : "Reveal all matching letters";
        assert model.getGuessCounter() == 0 : "Correct letters cost no mistakes";
        assert model.guess("t") == WordGuessModel.GuessResult.REPEATED;
        for (String invalid : new String[]{"", "12", "ab", "!", "é", "K"}) {
            assert model.guess(invalid) == WordGuessModel.GuessResult.INVALID;
        }
        assert model.getGuessCounter() == 0 : "Invalid/repeated input costs no mistakes";
        assert model.guess("x") == WordGuessModel.GuessResult.INCORRECT;
        assert model.guess("X") == WordGuessModel.GuessResult.REPEATED;
        assert model.getGuessCounter() == 1;
        for (String letter : new String[]{"b", "o", "l", "e"}) model.guess(letter);
        assert model.isWon() : "Last correct letter wins immediately";
        assert model.getMaskedWord().equals("bottle");
        model.startRound("table");
        assert model.getGuessCounter() == 0 && model.getGuesses().isEmpty();
        assert model.getMaskedWord().equals("_____") && !model.isWon();
        for (String letter : new String[]{"c", "d", "f", "g", "h", "i", "j", "k", "m"}) model.guess(letter);
        assert !model.isLost() : "Nine misses must not end the round";
        model.guess("n");
        assert model.isLost() && model.getGuessCounter() == 10;

        String win = play("\n1\nt\nt\na\nb\nl\ne\nn\n");
        assert win.contains("You won!") && !win.contains("Out of guesses");
        assert win.contains("already guessed") && win.contains("single letter");
        assert win.indexOf("table") > win.indexOf("You won!") : "Do not leak the answer early";
        String lose = play("c\nd\nf\ng\nh\ni\nj\nk\nm\no\nn\n");
        assert lose.contains("Out of guesses") && lose.contains("table");
        String replay = play("t\na\nb\nl\ne\nmaybe\nY\nt\na\nb\nl\ne\nn\n");
        assert replay.split("You won!", -1).length - 1 == 2 : "Replay must reset round state";
        assert replay.contains("Enter Y or N");
        String afterLoss = play("c\nd\nf\ng\nh\ni\nj\nk\nm\no\ny\nt\na\nb\nl\ne\nn\n");
        assert afterLoss.contains("Out of guesses") && afterLoss.contains("You won!");
        assert play("").contains("Goodbye") : "EOF should exit cleanly";
        assert play("t\na\nb\nl\ne\n").contains("Goodbye") : "EOF at replay should exit";
        System.out.println("All WordGuessingGame behavior tests passed.");
    }

    private static String play(String input) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        WordGuessView view = new WordGuessView(new Scanner(input), new PrintStream(output));
        new WordGuessController(view, new WordGuessModel(), new String[]{"table"}).playGame();
        return output.toString();
    }
}
