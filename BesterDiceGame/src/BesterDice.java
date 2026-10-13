// Aisha Kabir
// ITDEV-110

package besterdicegame;

import java.util.Random;
public class BesterDice {

  Random random = new Random();
  int dMin=1, dMax=6;
  private int[] rolls = new int[6];

  public int[] rollDice(){
      //set each element of array to a random number
    for (int index=0; index < rolls.length; index++){
            rolls[index] = random.nextInt(dMax)+dMin;
        }
    return rolls;
  }

  public int getScore(){
    int score = 0;
    for (int i = 0; i < rolls.length; i++){
      score += rolls[i];
    }
    return score;
  }
}
