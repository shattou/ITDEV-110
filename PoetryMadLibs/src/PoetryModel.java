// Aisha Kabir
// ITDEV-110

package poetrymadlibs;

public class PoetryModel {

   String color;
   String pluralNoun;
   String name;
   String poem;

  public String getColor(){
      return color;
  }
  public void setColor(String c){
      this.color=c;
  }

  public String getPluralNoun(){
      return pluralNoun;
  }
  public void setPluralNoun(String p){
      this.pluralNoun=p;
  }

  public String getName(){
      return name;
  }
  public void setName(String n){
      this.name=n;
  }

  public String getPoem(){
      this.poem = "Roses are "+ this.color+ ". " +this.pluralNoun+ " are blue. I love "+this.name;
      return poem;
  }
  public void setPoem(String newPoem){
      this.poem = newPoem;
  }

}
