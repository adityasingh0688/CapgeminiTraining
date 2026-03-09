package JavaDay01.fiveProblems;

import java.util.*;

public class firstClass {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Information");

    System.out.print("Enter roll: ");
    int rollno = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter name: ");
    String name = sc.nextLine();

    System.out.println("\nStudent Details:");
    System.out.println("Roll No: " + rollno);
    System.out.println("Name: " + name);

    sc.close();
  }
}