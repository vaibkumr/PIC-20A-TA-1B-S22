package hw2;

public class MatchCardGame {
  final public int n;
  final private char[] CardValues;
  
  public MatchCardGame(int n) {  

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