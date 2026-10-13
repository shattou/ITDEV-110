// Aisha Kabir
// ITDEV-110

package besterdicegame;

public class BesterController {
    private BesterView view = new BesterView();
    private BesterPlayer computer = new BesterPlayer();
    private BesterPlayer player = new BesterPlayer();

    String[] names = new String[2];
    int[] scores = new int[2];
    boolean endgame = false;

    public void playGame(){

        view.Introduction();
        player.setName(view.playersName());
        computer.setName("Computer");
        names[0] = computer.getName();
        names[1] = player.getName();
        view.showRoll(computer.getName(), computer.rollDice(), computer.getCounter(), computer.getScore());
        showScoreBoard();
        view.playersInitialTurn();

        do {
          compareScores();

          int choice = compareScores();
          if (choice == 1){
            view.showRoll(player.getName(), player.rollDice(), player.getCounter(), player.getScore());
            showScoreBoard();

          } else {
            view.showRoll(computer.getName(), computer.rollDice(), computer.getCounter(), computer.getScore());
            showScoreBoard();
          }

        } while (endgame);
        showScoreBoard();
        view.Outro();
    }

    public int compareScores(){
      if (computer.getScore() > player.getScore()){
          view.computerPassTurn();
          view.showRoll(player.getName(), player.rollDice(), player.getCounter(), player.getScore());
          showScoreBoard();
      }

      if (player.getScore() > computer.getScore()){
          view.computersTurn();
          view.showRoll(computer.getName(), computer.rollDice(), computer.getCounter(), computer.getScore());
          showScoreBoard();

      }

      return view.playerRollOrpass();

    }

    public void showScoreBoard(){
      scores[0] = computer.getScore();
      scores[1] = player.getScore();
      view.showScore(names, scores);
    }

    // public int endGame(){
    //     if (player.getCounter() == 5 || computer.getCounter() == 5){

    //     return view.playAgain();
    // }

    // public void restartGame(){

    // }

}
