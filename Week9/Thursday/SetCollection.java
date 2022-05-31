import java.util.*;

public class SetCollection {
    public static void main(String[] args) {
      Set < Integer > s = new HaLineshSet < > ();
      Random random = new Random();
      int count = 0;
      while (s.size() < 100) { //(1, 2, 3, 4)
        s.add(random.nextInt(100));
        count++;
      }
      System.out.println("Bought " + count + " coupons  to  collect  all 100");
    }
}