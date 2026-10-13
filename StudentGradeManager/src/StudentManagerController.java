// Aisha Kabir
// ITDEV-110

//package kabir_;

import java.util.ArrayList;

public class StudentManagerController {
  private StudentManagerView view = new StudentManagerView();
  private StudentManager studentManager = new StudentManager();
  private boolean continueProgram = true;

  Student student = new Student();

  public void runProgram(){
    view.Introduction();
    do {
      handleMenu(view.displayMenu());

    } while(continueProgram);
  }

  public void handleMenu(int option){

    switch (option) {
        case 1: addStudents();
                  break;
        case 2: handleAddGrades();
                  break;
        case 3: calculateClassGrade();
                  //break;
        case 4: view.displayStudentList(studentManager.getStudentList());
                  break;
        case 5: continueProgram = false;
                  break;
    }

  }

    public void addStudents() {
      ArrayList<Student> studentList = new ArrayList<Student>();
      int numberOfEntries = view.numberOfEntries();
      for (int i=0; i < numberOfEntries; i++){
        Student student = new Student();
        student.setFirstName(view.getFirstName());
        student.setLastName(view.getLastName());
        student.setId(view.getId());
        studentList.add(student);
      }
      studentManager.setStudentList(studentList);
    }

    public void calculateClassGrade(){
      for (Student student: studentManager.getStudentList()){
        if (student.getGradeScore() > 40.0){
          student.setGrade("A");
        }
        else if (student.getGradeScore() > 30.0 && student.getGradeScore() <= 40.0){
          student.setGrade("B");
        }
        else if (student.getGradeScore() > 20.0 && student.getGradeScore() <= 30.0){
          student.setGrade("C");
        }
        else if (student.getGradeScore() > 10.0 && student.getGradeScore() <= 20.0){
          student.setGrade("D");
        }
         else if (student.getGradeScore() <= 10.0){
          student.setGrade("F");
        }
      }
    }

  public void handleAddGrades(){
    int option = view.searchOptions();
    int[] gradeEntry = new int[2];
    for (Student student: studentManager.getStudentList()){
      String name = student.getFirstName()+student.getLastName();
      int id = student.getId();
      if (option == 1) {
        String input = view.getFirstName() + view.getLastName();
        if (name.equals(input)){
          gradeEntry = view.addStudentGrades(student);
          student.setAssignments(gradeEntry[0], gradeEntry[1]);
        }
      }
      if (option == 2) {
        int input = view.getId();
        if (id == input){
          gradeEntry = view.addStudentGrades(student);
          student.setAssignments(gradeEntry[0], gradeEntry[1]);
        }
      } else {
        view.studentNotFound();
      }
    }
  }
}
