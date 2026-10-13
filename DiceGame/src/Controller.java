// Aisha Kabir
// ITDEV-110

package dicegame;

public class Controller {

    private View view = new View();
    private Player computer = new Player();
    private Player user = new Player();

    public void playGame(){
//        String n;
//        int s;

        computer.setName("computer");
        user.setName("user");
//        n = computer.getName();
//        s = computer.getScore();
//        view.showRoll(n, s);
        do {
            view.showRoll(computer.getName(), computer.rollDice());
            view.playersTurn();
            view.showRoll(user.getName(), user.rollDice());
            if (computer.getScore() > user.getScore()){
                view.winner(computer.getName());
            } else {
                view.winner(user.getName());
            }
        } while (view.runAgain());
//        will run again if user selects 1. That is if runAgain = true
    }
}
