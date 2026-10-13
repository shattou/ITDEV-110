// Aisha Kabir
// ITDEV-110

package dicegame;
import java.util.Random;

public class Dice {
    private int dMin = 1;
    private int dMax = 6;
    private int score;
    private Random random = new Random();

    public int rollDice(){
        score = random.nextInt(dMax)+dMin;
        return score;
    }

    public int getScore(){
        return score;
    }
}
