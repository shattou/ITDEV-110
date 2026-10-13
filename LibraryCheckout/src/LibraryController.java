// Aisha Kabir
// ITDEV-110

package librarycheckout;

import java.util.ArrayList;
import java.util.Calendar;

public class LibraryController {

    private LibraryView view = new LibraryView();
    private LibraryModel model = new LibraryModel();
    private boolean continueProgram = true; //keeps the program in a loop
    String[] books = {"1984", "Narnia", "Harry Potter", "Things Fall Apart", "Twilight", "Percy Jackson"};
    ArrayList<String> bookList = new ArrayList<String>();

    public void startProgram() {
        initializeProgram();
        String name = view.Name();
        model.setBookTitle(view.BookTitle());
        do {
            if (bookList.contains(model.getBookTitle())) { //compares the book title to the array list items
                view.returnDate(model.getBookTitle(), model.getReturnDate()); //displays booktitle and return date
                String choice = view.checkAnotherBook(); //asks the user if they would like to check another book
                endProgram(choice); //passes to the end program method
            } else {
                view.incorrectEntry(); //displays error message
                model.setBookTitle(view.BookTitle()); //asks the user to enter another book title
            }

        } while (continueProgram);
        view.endProgram(name);
    }

    public void initializeProgram() {
        for (String book : books) {
            bookList.add(book); //copying the array into the arraylist
        }
        view.Introduction(bookList);
    }

    public void endProgram(String choice) {
        if (choice.equalsIgnoreCase("n")) {
            continueProgram = false;
        }
        if (choice.equalsIgnoreCase("y")) {
            model.setReturnDate(Calendar.getInstance()); //reset the date
            model.setBookTitle(view.BookTitle()); //asking the user to provide a book title
        }
    }
}
