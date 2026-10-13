// Aisha Kabir
// ITDEV-110

package librarycheckout;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class LibraryView {

    private Scanner input = new Scanner(System.in);

    public void Introduction(ArrayList<String> bookList) {
        System.out.println("Welcome to Aisha's Library");
        System.out.println("Here are the list of books available to borrow: ");
        System.out.println("");

        //Listing out the all the items in the array list 'books'
        for (String book : bookList) {
            System.out.println(book);
        }
    }

    //Takes user's name
    public String Name() {
        System.out.println("");
        System.out.println("Enter your name: ");
        return input.nextLine();
    }

    //Takes user's book choice
    public String BookTitle() {
        System.out.println("");
        System.out.println("Enter book title to borrow: ");
        return input.nextLine();
    }

    //Printing the return date of a book
    public void returnDate(String book, Calendar date) {
        System.out.println("");
        System.out.println("The return date for '" + book + "' is: " + (date.get(Calendar.MONTH) + 1) + "-" + date.get(Calendar.DATE) + "-" + date.get(Calendar.YEAR));
    }

    //Takes in Yes/No option from the user
    public String checkAnotherBook() {
        System.out.println("");
        System.out.println("Would you like to check the return date of another book? Enter (Y) or (N) ");
        return input.nextLine();
    }

    //
    public void endProgram(String name) {
        System.out.println("");
        System.out.println(name + ", thank you for visiting Aisha's library, Goodbye!");
    }

    public void incorrectEntry() {
        System.out.println("");
        System.out.println("We do not have the book you entered, please try again");
    }

}
