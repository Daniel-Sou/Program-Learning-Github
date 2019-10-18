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

        }
    }

    // Constructor

}