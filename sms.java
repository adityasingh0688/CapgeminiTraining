package JavaDay01;

import java.util.*;

class Student {
  String username;
  String password;
  ArrayList<Integer> semesterMarks;

  Student(String username, String password) {
    this.username = username;
    this.password = password;
    this.semesterMarks = new ArrayList<>();
  }
}

public class sms {
  static ArrayList<Student> students = new ArrayList<>();
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("STUDENT MANAGEMENT SYSTEM");
      System.out.println("1. Registration");
      System.out.println("2. Login");
      System.out.println("3. Exit");
      System.out.print("Enter choice: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          register();
          break;
        case 2:
          login();
          break;
        case 3:
          System.out.println("Exiting System");
          break;
        default:
          System.out.println("Invalid Choice");
      }
    } while (choice != 3);
  }

  static void register() {
    System.out.print("Enter Username: ");
    String username = sc.nextLine();
    System.out.print("Enter Password: ");
    String password = sc.nextLine();
    students.add(new Student(username, password));
    System.out.println("Registration Successful");
  }

  static void login() {
    System.out.print("Enter Username: ");
    String username = sc.nextLine();
    System.out.print("Enter Password: ");
    String password = sc.nextLine();
    for (Student s : students) {
      if (s.username.equals(username) && s.password.equals(password)) {
        System.out.println("Login Successful");
        studentMenu(s);
        return;
      }
    }
    System.out.println("Invalid Login Credentials");
  }

  static void studentMenu(Student s) {
    int choice;
    do {
      System.out.println("STUDENT DASHBOARD");
      System.out.println("1. Study Material");
      System.out.println("2. Enter Semester Marks");
      System.out.println("3. View Total Marks");
      System.out.println("4. Logout");
      System.out.print("Enter choice: ");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          studyMaterial();
          break;
        case 2:
          enterMarks(s);
          break;
        case 3:
          showTotalMarks(s);
          break;
        case 4:
          System.out.println("Logged Out");
          break;
        default:
          System.out.println("Invalid Choice");
      }
    } while (choice != 4);
  }

  static void studyMaterial() {
    System.out.println("PDF Opened Successfully");
  }

  static void enterMarks(Student s) {
    System.out.print("Enter Semester Marks: ");
    int marks = sc.nextInt();
    s.semesterMarks.add(marks);
    System.out.println("Marks Added");
  }

  static void showTotalMarks(Student s) {
    int total = 0;
    for (int m : s.semesterMarks)
      total += m;
    System.out.println("Total Semester Marks: " + total);
  }
}
