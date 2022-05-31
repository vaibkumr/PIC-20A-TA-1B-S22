import java.util.*;

public class HashMapsBest {
    private Map < String, Integer > m = new HashMap <> ();
    public static void main(String[] args){
        HashMapsBest obj = new HashMapsBest();
        obj.addNum("UCLA", 1);
        obj.addNum("UCB", 2);
        obj.addNum("UCSD", 3);

        System.out.println(obj.haveNumber("UCLA"));
        System.out.println(obj.haveNumber("UCI"));
        
        System.out.println(obj.getNum("UCLA"));
        System.out.println(obj.getNum("UCI"));
        
    }

    public void addNum(String name, Integer num) {
      m.put(name, num);
    }
    public Integer getNum(String name) {
      return m.get(name);
    }
    public boolean haveNumber(String name) {
      return m.containsKey(name);
    }
  }