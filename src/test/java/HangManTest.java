import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class HangManTest{

  // check if HangMan instantiates correctly
  @Test
  public void newHangMan_instantiatesCorrectly(){
    HangMan testHangMan = new HangMan("boy", "lsd");
    assertEquals(true, testHangMan instanceof HangMan);
  }

//ensure input is not blank
  @Test
  public void isNull_whenInputIsBlank_true(){
    HangMan testHangMan = new HangMan("end", "");
    assertEquals(true, testHangMan.isNull());
  }
//ensure input is all letters
  @Test
  public void isAllLetters_whenNotAllLetters_false(){
    HangMan testHangMan = new HangMan("end", "j4o*");
    assertEquals(false, testHangMan.isAllLetters());
  }


}
