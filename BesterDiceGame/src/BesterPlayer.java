// Aisha Kabir
// ITDEV-110

package besterdicegame;

import java.util.Random;
public class BesterPlayer {

    BesterDice dice = new BesterDice();
    private String name;
    private int counter;

    public void setName(String name){
      this.name = name;
    }

    public String getName(){
      return name;
    }

    public int[] rollDice(){
      counter++;
      return dice.rollDice();
    }

    public int getScore(){
      return dice.getScore();
    }

    public int getCounter(){
      return counter;
    }

    public void setCounter(int counter){
      this.counter = counter;
    }

}
