
// package JavaDay01;

// import java.util.Random;

// public class DiceGame {
// static final int ROWS = 5;
// static final int COLS = 5;

// public static void main(String[] args) {
// char[][] board = new char[ROWS][COLS];
// Random rand = new Random();

// for (int i = 0; i < ROWS; i++) {
// for (int j = 0; j < COLS; j++) {
// board[i][j] = '.';
// }
// }

// // Snake initial position
// int snakeRow = 2;
// int snakeCol = 1;
// board[snakeRow][snakeCol] = 'S';

// // Food position
// int foodRow = rand.nextInt(ROWS);
// int foodCol = rand.nextInt(COLS);
// board[foodRow][foodCol] = 'F';

// System.out.println("Initial Board:");
// printBoard(board);

// // Move snake right 3 times
// for (int move = 1; move <= 3; move++) {

// // Clear old snake position
// board[snakeRow][snakeCol] = '.';

// // Move right
// snakeCol++;

// // Boundary check
// if (snakeCol >= COLS) {
// System.out.println("Snake hit the wall! Game Over");
// return;
// }
// if (snakeRow == foodRow && snakeCol == foodCol) {
// System.out.println("Snake ate the food! 🐍🍎");
// }
// board[snakeRow][snakeCol] = 'S';
// System.out.println("\nAfter move " + move + ":");
// printBoard(board);
// }
// }

// static void printBoard(char[][] board) {
// for (int i = 0; i < board.length; i++) {
// for (int j = 0; j < board[0].length; j++) {
// System.out.print(board[i][j] + " ");
// }
// System.out.println();
// }
// }
// }
