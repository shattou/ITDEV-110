// Aisha Kabir
// ITDEV-110

package bankingmenu;

public class Menu {

    public Menu(){
    displayMenu();
}

    public void displayMenu(){
        System.out.println("Welcome, what would you like to do?\n");
        System.out.println("1)\tCreate new account");
        System.out.println("2)\tShow account transaction history");
        System.out.println("3)\tWithdrawal");
        System.out.println("4)\tDeposit");
        System.out.println("5)\tTransfer");
        System.out.println("6)\tQuit\n");
        System.out.println("Enter Choice:");
    }
}
