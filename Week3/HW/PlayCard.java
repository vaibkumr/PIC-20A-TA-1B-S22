package hw2;

public class PlayCard {
  public  static  int  playRandom(MatchCardGame g){
    return 0;
  }

  public  static  int  playGood(MatchCardGame g){
    return 0;
  }

  // Monte Carlo Method
  public  static  double  randomMC(int N){
    return 0.0;
  }

  public  static  double  goodMC(int N){
    return 0.0;
  }

  public static void main(String[] args) {
    //set up reader to take inputs
    java.util.Scanner reader = new java.util.Scanner (System.in);
    
    int n = 16; //game size
    MatchCardGame g1 = new MatchCardGame(n);
    g1.shuffleCards();
    
    while(!g1.gameOver()) {
      //print board status
      System.out.println(g1.boardToString());
      
      //ask for a card to flip until we get a valid one
      System.out.println("Which card to play?");
      while(!g1.flip(reader.nextInt())) {}
      
      //print board status
      System.out.println(g1.boardToString());
      
      //ask for a card to flip until we get a valid one
      while(!g1.flip(reader.nextInt())) {} //flip card 15
      // previousflipidentity -> carvalues[15]
      //say whether the 2 cards were a match
      if(g1.wasMatch()) {
        System.out.println("Was a match!");
      } else {
        //print board to show mismatched cards
        System.out.println(g1.boardToString());		
        System.out.println("Was not a match.");
        //flip back the mismatched cards
        g1.flipMismatch();
      }
    }
    reader.close();

    //Report the score
    System.out.println("The game took " + g1.getFlips() + " flips.");
    
    //Using the AIs
    //int count;
    //MatchCardGame g2 = new MatchCardGame(n);
    //g2.shuffleCards();
    //count = playRandom(g2);
    //System.out.println("The bad AI took " + count + " flips.");
    //MatchCardGame g3 = new MatchCardGame(n);
    //g3.shuffleCards();
    //count = playGood(g3);
    //System.out.println("The good AI took " + count + " flips.");
    
    //Using MCs
    //int N = 1000;
    //System.out.println("The bad AI took " + randomMC(N) + " flips on average.");
    //System.out.println("The good AI took " + goodMC(N) + " flips on average.");
  }
}