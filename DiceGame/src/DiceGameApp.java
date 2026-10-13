// Aisha Kabir
// ITDEV-110

package dicegame;

public class DiceGameApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin admin = new Admin();
        Controller controller = new Controller();
        admin.setup();
        admin.intro();
        controller.playGame();
        admin.goodbye();
    }

}
