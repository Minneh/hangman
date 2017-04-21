public class HangMan{

  //declare private variables to hold the answer word and letters the uers has entered respectively

  private String mAnswer;
  private String mPastLetters;

  public HangMan(String answer, String pastLetters){
    //equate private variable tvalues to those in input
    mAnswer = answer;
    mPastLetters = pastLetters;
  }
  public boolean isNull(){
    return mPastLetters.equals("");
  }
}
