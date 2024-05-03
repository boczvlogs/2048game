import java.util.Scanner;

public class Game2048 {
    private static final int SIZE = 4;
    private int[][] board;
 
    public Game2048() {
        board = new int[SIZE][SIZE];
        initializeBoard();
    }

    private void initializeBoard() { 
        // Initialize the board with two random tiles
        addRandomTile();
        addRandomTile();
    }                                                                                                                                                                                                                

    private void addRandomTile() {
        // Add a random tile (2 or 4) to a random empty
        // (In this example, we'll just add a 2 for simplicity)
        int row, col; 
        do {
            row = (int) (Math.random() * SIZE);
            col = (int) (Math.random() * SIZE);
        } while (board[row][col] != 0);  
        board[row][col] = 2;
    }

    private void printBoard() {
        // Display the current state of the board
        for (int[] row : board) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        char move;

        do {
            printBoard();
            System.out.print("Enter move (W/A/S/D): ");
            move = scanner.next().charAt(0);

            if (isValidMove(move)) {
                moveTiles(move);
                addRandomTile();
            }
        } while (!isGameOver());

        System.out.println("Game Over. Your score: " + calculateScore());
        scanner.close();
    }

    private boolean isValidMove(char move) {
        // Check if the move is valid (W/A/S/D)
        // (In this example, we assume all moves are valid)
        return true;
    }

    private void moveTiles(char move) {
      
    }

    private boolean isGameOver() {
        // Implement the logic to check if the game is over
        // (In this example, we assume the game is never over)
        return false;
    }

    private int calculateScore() {
        // Implement the logic to calculate the score
        // (In this example, we just return 0 for simplicity)
        return 0;
    }

    public static void main(String[] args) {
        Game2048 game = new Game2048();
        game.play();
    }
}
