import org.junit.*;
import static org.junit.Assert.*;

public class HangManTest{
  @Test
  public void newHangMan_instantiatesCorrectly(){
    HangMan testHangMan = new HangMan("boy", "lsd");
    assertEquals(true, testHangMan instanceof HangMan);
  }

  // public void newRectangle_instantiatesCorrectly() {
  //   Rectangle testRectangle = new Rectangle(2, 4);
  //   assertEquals(true, testRectangle instanceof Rectangle);
  // }z
}
