// Aisha Kabir
// ITDEV-110

package hilowgame;

public class Player {

  private int credits = 100;
  private int bet;

  public void loseBet(){
    credits -= bet;
  }

  public void winBet(){
    credits += bet;
  }

  public void setBet(int bet){
    this.bet = bet;
  }

  public int getBet(){
   return bet;
  }

  public void setCredits(int credits){
    this.credits = credits;
  }

  public int getCredits(){
    return credits;
  }

}
