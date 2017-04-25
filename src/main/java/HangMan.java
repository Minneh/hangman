public class Hangman{

  //declare private variables to hold the answer word and letters the uers has entered respectively

  private String mAnswer;
  private String mPastLetters;

  public Hangman(String answer){
    //equate private variable tvalues to those in input
    mAnswer = answer;
  }

  public boolean isNull(){
    return mAnswer.equals("");
  }

  public boolean isAllLetters(){
    return mAnswer.chars().allMatch(Character::isLetter);
  }

}
