// Aisha Kabir
// ITDEV-110

package wordguessinggame;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class WordGuessModel {
    public enum GuessResult { CORRECT, INCORRECT, REPEATED, INVALID }

    public static final int MAX_MISTAKES = 10;
    private final Random random = new Random();
    private final ArrayList<String> guesses = new ArrayList<String>();
    private String selectedWord;
    private int guessCounter;

    public void startRound(String word) {
        selectedWord = word.toLowerCase(Locale.ROOT);
        guesses.clear();
        guessCounter = 0;
    }

    public String selectRandomWord(String[] words) {
        return words[random.nextInt(words.length)];
    }

    public GuessResult guess(String input) {
        String trimmed = input.trim();
        if (!trimmed.matches("[A-Za-z]")) return GuessResult.INVALID;
        String letter = trimmed.toLowerCase(Locale.ROOT);
        if (guesses.contains(letter)) return GuessResult.REPEATED;
        guesses.add(letter);
        if (selectedWord.contains(letter)) return GuessResult.CORRECT;
        guessCounter++;
        return GuessResult.INCORRECT;
    }

    public String getMaskedWord() {
        StringBuilder masked = new StringBuilder();
        for (char letter : selectedWord.toCharArray()) {
            masked.append(guesses.contains(String.valueOf(letter)) ? letter : '_');
        }
        return masked.toString();
    }

    public boolean isWon() { return getMaskedWord().equals(selectedWord); }
    public boolean isLost() { return guessCounter >= MAX_MISTAKES; }
    public int getGuessCounter() { return guessCounter; }
    public String getSelectedWord() { return selectedWord; }
    public ArrayList<String> getGuesses() { return new ArrayList<String>(guesses); }
}
