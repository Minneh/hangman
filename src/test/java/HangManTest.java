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

}
