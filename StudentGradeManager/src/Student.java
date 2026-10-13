// Aisha Kabir
// ITDEV-110

//package kabir_;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private String grade = "U";
    private double[] assignments = new double[10];

    public void setFirstName(String firstName){
      this.firstName = firstName;
    }

    public void setLastName(String lastName){
      this.lastName = lastName;
    }

    public void setId(int id){
      this.id = id;
    }

    public int getId(){
      return id;
    }

    public String getGrade(){
      return grade;
    }

    public void setGrade(String grade){
      this.grade = grade;
    }

    public String getFirstName(){
      return firstName;
    }

    public String getLastName(){
      return lastName;
    }

    public double[] getAssignments(){
      return assignments;
    }

    public void setAssignments(int index, int score){
      this.assignments[index] = score;
    }

    public double getGradeScore(){
      double grade = 0.0;
      for (double num: assignments){
        grade = grade + num;
      }
      return grade / assignments.length;
    }

    // public void addAssignments(String assignments){
    //   String[] strArray = assignments.split("");
    //   int[] intArray = new int[strArray.length];
    //   for(int i = 0; i < strArray.length; i++) {
    //       intArray[i] = Integer.parseInt(strArray[i]);
    //   }
    // }

}
