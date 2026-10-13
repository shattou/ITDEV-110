// Aisha Kabir
// ITDEV-110

package wordguessinggame;

public class WordGuessController {
    private final WordGuessView view;
    private final WordGuessModel model;
    private final String[] words;

    public WordGuessController() {
        this(new WordGuessView(), new WordGuessModel(),
                new String[]{"table", "bottle", "computer", "kitchen"});
    }

    public WordGuessController(WordGuessView view, WordGuessModel model, String[] words) {
        this.view = view;
        this.model = model;
        this.words = words.clone();
    }

    public void playGame() {
        view.introduction();
        do {
            model.startRound(model.selectRandomWord(words));
            while (!model.isWon() && !model.isLost()) {
                view.showRound(model);
                String guess = view.playerGuess();
                if (guess == null) {
                    view.goodbye();
                    return;
                }
                view.showResult(model.guess(guess));
            }
            view.endRound(model);
        } while (view.playAgain());
        view.goodbye();
    }
}
