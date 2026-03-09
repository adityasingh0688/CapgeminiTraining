// package JavaDay01;

// import java.util.Random;
// import java.util.Scanner;

// public class DiceGame {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// Random rand = new Random();
// int choice;
// System.out.println("Enter 1 For Rolling a Dice and 2 For Stopping the Game :
// ");
// System.out.print("Enter your choice: ");
// choice = sc.nextInt();
// if (choice == 1) {
// int x = rand.nextInt(6) + 1;
// int y = rand.nextInt(6) + 1;
// System.out.println("Player 1 rolled: " + x);
// System.out.println("Player 2 rolled: " + y);
// if (x > y) {
// System.out.println("Player 1 Wins!");
// } else if (y > x) {
// System.out.println("Player 2 Wins!");
// } else {
// System.out.println("Draw!");
// }
// } else if (choice == 2) {
// System.out.println("Stopped");
// } else {
// System.out.println("Invalid choice");
// }
// }
// }