// Aisha Kabir
// ITDEV-110

package dicegame;

public class Player {
    private Dice dice = new Dice();
    private String name; //differentiates between computer or user playing

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int rollDice(){
        return dice.rollDice();
    }
    public int getScore(){
        return dice.getScore();
    }
}
