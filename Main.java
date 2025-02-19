import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<String>();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      words.add(input);
      System.out.println(input);
    }

    System.out.println();

    System.out.println(words.size());
    int lastIndex = words.size()-1;
    words.remove(lastIndex);
    System.out.println(words);

    String firstWord = words.get(0);
    words.set(words.size()-1, firstWord);
    System.out.println(words);
  }
}
