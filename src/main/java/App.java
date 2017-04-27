import java.io.Console;

public class App{

  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Welcome to Hangman!");
    System.out.println("Please enter a letter to guess the word!:");
    String userInput = myConsole.readLine();
    Hangman newHangman = new Hangman(userInput);
  }
}
