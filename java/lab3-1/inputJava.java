import java.io.*;

public class inputJava {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = null;

    System.out.println("Enter your value > ");
    str = br.readLine();

    System.out.println("Your value is > " + str);  
  }
}