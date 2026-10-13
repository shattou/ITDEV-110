// Aisha Kabir
// ITDEV-110

package hilowgame;

import java.util.Random;

public class HiLowModel {

    private Random random = new Random();

    private int counter = 0;
    private int guess;
    private int gameLevel;
    private int randSelected;
    private int lowRange = 1;
    private int highRange;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setGuess(int guess) {
       this.guess = guess;
       counter++;
    }

    public int getGuess() {
        return guess;
    }

    public void setLowRange(int lowRange) {
        this.lowRange = lowRange;
    }

    public int getLowRange() {
        return lowRange;
    }

    public void setHighRange(int highRange) {
        this.highRange = highRange;
    }

    public int getHighRange() {
        return highRange;
    }

    public int getGameLevel(){
        return gameLevel;
    }

    public void setGameLevel(int gameLevel){
      this.gameLevel = gameLevel;
    }

    public int getRandSelected(){
      return randSelected;
    }

    public int randomSelector(){
        if (gameLevel == 1){
          setHighRange(20);
        }
        if (gameLevel == 2){
          setHighRange(50);
        }
        if (gameLevel == 3){
          setHighRange(100);
        }
        randSelected = random.nextInt(highRange)+lowRange;
        return randSelected;
    }

}
