import java.util.*;

public class SetCollection {
    public static void main(String[] args) {
      Set < Integer > s = new HashSet < > ();
      Random random = new Random();
      int count = 0;
      while (s.size() < 100) {
        s.add(random.nextInt(100));
        count++;
      }
      System.out.println("Bought " + count + " coupons  to  collect  all 100");
    }
}