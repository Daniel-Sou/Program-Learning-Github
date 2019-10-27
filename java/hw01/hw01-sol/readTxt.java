/*
Solution
(3%) Write a Java program that inputs a document and then outputs the frequencies of each alphabet character that appears within that document.
*/

import java.io.BufferedReader; // Input
import java.io.FileReader; // File system

public class readTxt {
  public static void main(String[] args) throws Exception {
    // Fields
    FileReader file = new FileReader("./hw01.txt");
    BufferedReader reader = new BufferedReader(file); 

    // Read the file and print the word
    String text = "";
    String line = reader.readLine();
    
    while (line != null) {
      text += line;
      line = reader.readLine();
    }

    System.out.println(text);
    reader.close();

    System.out.println();

    for (char a = 'a'; a <= 'z'; a++) {
      int cractCount = text.length() - text.replaceAll(String.valueOf(a), "").length();
      System.out.println(a + " appear times >> " + cractCount + " \npercentage >> " + ((double) cractCount) / text.length() * 100 + "%");
    }
  }
}

