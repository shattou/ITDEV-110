// Aisha Kabir
// ITDEV-110

package dicegame;
import java.util.Scanner;

public class View {

    private Scanner input = new Scanner(System.in);

    public String playersTurn(){
        System.out.println("Press enter to roll dice");
        return input.nextLine();
    }

    public void showRoll(String name, int score){
        System.out.println("\n\n"+name+"\t...................."+score+"\n\n");

    }

    public boolean runAgain(){
        int selection;
        boolean again = false;
        System.out.println("(0) to exit\n(1)to roll again");
        selection = input.nextInt();
        input.nextLine();

        if (selection == 1){
            again = true;
        }
        return again;
    }

    public void winner(String name){
        System.out.println(name+ " is the winner!");
    }
}
