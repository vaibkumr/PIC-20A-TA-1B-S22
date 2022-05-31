import java.util.*;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorsTest {
  public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Iterator<String> it = cars.iterator();
    System.out.println(it.next());

    while(it.hasNext()){
        System.out.println(it.next());
    }

    //HashMap Iterator


    // HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

    // hash_map.put("Alpha", 10);
    // hash_map.put("Beta", 3);
    // hash_map.put("Gamma", 12);
    // hash_map.put("Delta", -3);

    // Iterator<Entry<String, Integer>> h_it = hash_map.entrySet().iterator();
    // while(h_it.hasNext()){
    //     System.out.println(h_it.next());
    // }    

  }

}