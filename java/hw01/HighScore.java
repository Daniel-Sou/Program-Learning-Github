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

            // If type "end", the program will quit
            if ("end".equals(name)) {
                break;
            }

            System.out.println("Enter the score >> ");
            String score = scanner.nextLine();
            highScore.insert(name, Integer.parseInt(score));
            System.out.println("High score >> ");
            System.out.println(highScore.toString());
        }
    }

    // Constructor
    public HighScore() {
        // Create an empty ArrayList
        scores = new LinkedList<String>();
    }

    public void insert(String name, Integer score) {
        String newScore = name + " " + score.toString();
        if (scores.isEmpty()) {
            scores.add(newScore);
            return;
        }

        for (int i = 0; i <= scores.size(); i++) {
            if (i == scores.size()) {
                scores.add(newScore);
                break;
            }

            if (isGreaterThan(newScore, scores.get(i))) {
                scores.add(i, newScore);
                break;
            }
        }

        while (scores.size() > 10) {
            scores.remove(10);
        }
    }

    public boolean isGreaterThan(String first, String second) {
        Integer firstScore = Integer.parseInt(first.substring(first.lastIndexOf(" ") + 1));
        Integer secondScore = Integer.parseInt(second.substring(second.lastIndexOf(" ") + 1));
        return firstScore > secondScore;
    }

    public String toString() {
        String scoreList = "";

        for (int i = 0; i < scores.size(); i++) {
            scoreList = scoreList + scores.get(i) + "\n";
        }

        return scoreList;
    }
}