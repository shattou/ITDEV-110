// Aisha Kabir
// ITDEV-110

package hilowgame;

public class HiLowController {

    private HiLowView view = new HiLowView();
    private HiLowModel model = new HiLowModel();
    private Player player = new Player();
    private boolean exit = true;
    public void runGame() {

        view.Intro();
        setModel();
        do {
            startGuessGame();
            if (player.getCredits() <= 0){
                  exit = false;
                  view.playerCreditLow();
              }
        } while (exit);
        view.displayPlayerCredits(player.getCredits());
        view.endGame();
    }

    public void setModel(){
      model.setGameLevel(view.gameLevel());
      view.displayPlayerCredits(player.getCredits());
      player.setBet(view.wagerAmount());
      model.randomSelector();
      model.setGuess(view.enterGuess()); //Stores the guess value.
    }

    public void restartGame(){
      view.displayPlayerCredits(player.getCredits());
      player.setBet(view.wagerAmount());
      model.setCounter(0);
      model.randomSelector();
      model.setGuess(view.enterGuess()); //Stores the guess value.
    }

    public void startGuessGame(){
      int newGuess;

      if (model.getGuess() > model.getRandSelected()) {
          newGuess = view.tooHigh(model.getCounter(), model.getGuess());
          player.loseBet();
          view.displayPlayerCredits(player.getCredits());
          model.setGuess(newGuess);

      } else if (model.getGuess() < model.getRandSelected()) {
          view.displayPlayerCredits(player.getCredits());
          newGuess = view.tooLow(model.getCounter(), model.getGuess());
          player.loseBet();
          view.displayPlayerCredits(player.getCredits());
          model.setGuess(newGuess);

      } else {
          view.correct();
          if (model.getGameLevel() == 1){
            player.setBet(20);
            player.winBet();

          }
          if (model.getGameLevel() == 2){
            player.setBet(20);
            player.winBet();
          }

          if (model.getGameLevel() == 3){
            player.setBet(20);
            player.winBet();
          }

          view.displayPlayerCredits(player.getCredits());
          exit = view.playAgain();
          if (exit) {
            restartGame();
          }
        }
    }
}
