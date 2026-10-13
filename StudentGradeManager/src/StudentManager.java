// Aisha Kabir
// ITDEV-110

//package kabir_;

import java.util.ArrayList;
public class StudentManager {
    // private Student student = new Student();
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public void setStudentList(ArrayList<Student> studentList){
      this.studentList = studentList;
    }

    public void addStudentGrades(int[] studentGrades){

    }

    public ArrayList<Student> getStudentList(){
      return studentList;
    }

}
