import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HangmanTest{

  // check if Hangman instantiates correctly
  @Test
  public void newHangman_instantiatesCorrectly(){
    Hangman testHangman = new Hangman("b");
    assertEquals(true, testHangman instanceof Hangman);
  }

//ensure input is not blank
  @Test
  public void isNull_whenInputIsBlank_true(){
    Hangman testHangman = new Hangman("");
    assertEquals(true, testHangman.isNull());
  }
//ensure input is all letters
  @Test
  public void isAllLetters_whenNotAllLetters_false(){
    Hangman testHangman = new Hangman("5");
    assertEquals(false, testHangman.isAllLetters());
  }

}
