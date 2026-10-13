// Aisha Kabir
// ITDEV-110

package poetrymadlibs;

import java.util.Scanner;

public class PoetryView {
   Scanner input = new Scanner(System.in);

//    public void Introduction(){
//        System.out.println("Welcome to the poetry mad lib game!"
//                + " If you type in words, we'll give you a short poem.");
//    }

    public String enterColor(){
        System.out.println("Start by entering in a color");
        return(input.nextLine());
    }

   public String enterPluralNoun(){
       System.out.println("Enter a plural noun");
       return(input.nextLine());
   }

   public String enterName(){
       System.out.println("Enter a name");
       return(input.nextLine());
   }

   public void displayPoem(String poem){
       System.out.println(poem);
   }

  public String RestartGame(){
       System.out.println("If you would like to play again, press c to continue or press e to exit the game.");
       return(input.nextLine());
   }
}
