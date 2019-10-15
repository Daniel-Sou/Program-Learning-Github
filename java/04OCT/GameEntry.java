// Java Example - Game Entries

public class GameEntry {
  // name of the person earning this score
  private String name;
  // The score value
  private int score;

  // ** Constructs a game entry with given parameters ** //
  public GameEntry(String n, int s) {
    name = n;
    score = s;
  }

  // Returns the name field
  public String getName() {
    return name;
  }

  // Returns the score field
  public int getScore() {
    return score;
  }

  // Return a string representation of this entry;
  public String toString() {
    return "(" + name + ", " + score + ")";
  }
}

