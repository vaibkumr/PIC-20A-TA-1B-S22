package hw2;

public class MatchCardGame {
  final public int n;
  final private char[] CardValues; //ith element of this array is the type of card i
  // private int n_flips = 0;
  private boolean[] FlipState;


  
  public MatchCardGame(int n) {  
    // final int UPPER_LMT_N = 26*4;
    // final int LOWER_LMT_N = 1*4;

    boolean condition = n <= UPPER_LMT_N && n >= LOWER_LMT_N && n%4==0;
    // if(condition)
    // assert condition
    // this.n = n; //`this` is the current object of the class

    int nTypes = n/4;
    char cType = 'a';
    for(int i=0; i<nTypes; i++){
      for(int j=0; j<4; j++){
        //insert cType in CardValues
      }
      cType += 1;
    }

    //if n is 4, nTypes is 1, cType ='a'
    //CardValues: [a, a, a, a]

  }
  
  public void shuffleCards() {
  }
  
  public boolean gameOver() {
    return false;
  }
  
  public int getFlips() {
    return 0;
  }
  
  public boolean flip(int i) {  
    //assertr statements for valid i
    //valid i??
    // i<=n
    // i>=0   
    // FlipState[i] == false
    // char prevType = CardValues[i]
    // n_flips += 1;
    return true;
  }
 
  public boolean wasMatch() {
	  return false;
  }

  public char previousFlipIdentity(){
    return 0;
  }

  public void flipMismatch() {
  }
    
  
  public String boardToString() {
    String s = "\n";
    return s;
  }
}