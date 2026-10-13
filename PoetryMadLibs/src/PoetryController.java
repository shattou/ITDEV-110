// Aisha Kabir
// ITDEV-110

package poetrymadlibs;

public class PoetryController {

    PoetryModel model = new PoetryModel();
    PoetryView view = new PoetryView();
    Admin admin = new Admin();
    String exit;
    String color;
    String plural;
    String name;

    public void StartGame_Controller(){
    admin.Introduction();

    do {

      color = view.enterColor();
      plural = view.enterPluralNoun();
      name = view.enterName();

      putTogetherThePoem(color, plural, name);

      view.displayPoem(model.getPoem());

      exit = view.RestartGame();

    } while (!"e".equals(exit));
    admin.Shutdown();
  }

  public void putTogetherThePoem(String color, String plural, String name){
      model.setPluralNoun(plural);
      model.setColor(color);
      model.setName(name);
  }
}
