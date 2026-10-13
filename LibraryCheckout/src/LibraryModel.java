// Aisha Kabir
// ITDEV-110

package librarycheckout;
import java.util.Calendar;

public class LibraryModel {

    private Calendar returnDate = Calendar.getInstance(); //stores today's date
    private String bookTitle;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Calendar getReturnDate() {
        returnDate.add(Calendar.DATE, 14); //adds 2 weeks to the current date
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }

}
