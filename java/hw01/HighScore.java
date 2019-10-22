// Perform the previous project, but use a doubly linked list. Moreover, your implementation of remove(i) should make the fewest number of pointer hops to get to the game entry at index i.

import java.util.LinkedList;
import java.util.Scanner;

public class HighScore {
    private LinkedList<String> scores;

    public static void main(String[] args) {
        HighScore highScore = new HighScore();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the name (type 'end' to quit) >> ");
            String name = scanner.nextLine();
            if ("end".equals(name)) {
                break;
            }
            System.out.println("Enter the score >> ");
            String score = scanner.nextLine();
            highScore.insert(name, Integer.parseInt(score));
            System.out.println("High score >> ");
            System.out.println

        }
    }

    // Constructor
<<<<<<< HEAD
    public HighScore() {
        // Create an empty ArrayList
        scores = new LinkedList<String>();
    }

    public void insert(String name, Integer score) {
=======
    
>>>>>>> fa4fa18fce5940d0b52ed5a61c6e642093dfcf10

    }
}