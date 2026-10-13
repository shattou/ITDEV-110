// Aisha Kabir
// ITDEV-110

//package kabir_;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentManagerView {
  private Scanner input = new Scanner(System.in);

  public void Introduction(){
    System.out.println("Welcome to the Student Registration App.");
    System.out.println("Please enter students to register, up to 35 students.");
    System.out.println("When you are finished entering the student enter (0) for Student ID to exit at any time.");
  }

  public String getFirstName(){
    input.nextLine();
    String firstName;
    System.out.println("");
    System.out.println("Enter the student's first name: ");
    firstName = input.nextLine();
    return firstName;
  }

  public String getLastName(){
    String lastName;
    System.out.println("");
    System.out.println("Enter the student's last name: ");
    lastName = input.nextLine();
    return lastName;
  }

  public int getId(){
    System.out.println("");
    System.out.println("Enter the student Id: ");
    int id = input.nextInt();
    return id;

  }

  public int numberOfEntries(){
    System.out.println("");
    System.out.println("How many would you like to enter? ");
    return input.nextInt();
  }

  public int[] addStudentGrades(Student student){
    input.nextLine();
    int[] assignmentEntry = new int[2];
    System.out.println("");
    System.out.println("Student " + student.getFirstName() + " " + student.getLastName()+ " is in the Database!");
    System.out.println("Enter assigment number? ");
    assignmentEntry[0] = input.nextInt();
    System.out.println("");
    System.out.println("Enter the grade for the assigment? ");
    assignmentEntry[1] = input.nextInt();
    return assignmentEntry;
  }

  public int searchOptions(){
    System.out.println("");
    System. out.println("Select student by") ;
    System.out.println(" (1) Name" );
    System.out.println(" (2) Student ID");
    return input.nextInt();
  }

  public void studentNotFound(){
    System.out.println("");
    System.out.println("Student Not Found, please try again.");
  }

  public void displayStudentList(ArrayList<Student> studentList){
    for (Student student: studentList){
      System.out.println("-------------------------------------------------------------");
      System.out.println("Student name: " + student.getFirstName() + " " + student.getLastName());
      System.out.println("Student id: "  + student.getId());
      System.out.println("Student grade: " + student.getGrade());
      for (int i = 0; i < student.getAssignments().length; i++){
        System.out.println("Assignment " + i + " = " + student.getAssignments()[i]);
      }
      System.out.println("-----------------------------------------------------------");
    }
  }

  public int displayMenu(){
    System.out.println("----------------------------");
    System.out.println("(1) Add Students");
    System.out.println("(2) Add Student Grades");
    System.out.println("(3) Calculate Class Grade");
    System.out.println("(4) Print student list");
    System.out.println("(5) Exit");
    System.out.println("----------------------------");
    return input.nextInt();
  }

}
