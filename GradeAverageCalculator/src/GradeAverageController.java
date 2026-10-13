// Aisha Kabir
// ITDEV-110

package gradeaverage;

public class GradeAverageController {
    Average average =new Average();
    Display display =new Display();

   public void StartGradeAverageController(){
        display.introduction();
        setModel();
        do{
            average.setNextNum(display.inputNumber());
            average.calc();
            displayResults();
            resetModel();
        } while (display.getExit() !=0);

    }

   public void setModel(){
       average.setSum(0);
       average.setAverage(0);
       average.setCounter(0);
   }

   public void resetModel(){
    if (average.getNextNum() == display.getEnd()){
      display.endNumber(average.getAverage(), average.getCounter());
      if (display.restartCalc()) {
          average.setAverage(0);
          average.setCounter(0);
          average.setSum(0);
        } else {
          display.setExit(0);
        }
      }
   }

   public void displayResults(){
     if (average.getNextNum() == 0){
      display.setExit(0);
    } else {
      display.displayFinal(average.getAverage(), average.getCounter());
    }
   }
}
