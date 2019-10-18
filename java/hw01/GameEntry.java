// A game entry stores the name of a player and his best score so far in a game

public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String toString() {

    }

    class Scoreboard {
        private int numEntries = 0;
        private GameEntry[] board;
    }
}