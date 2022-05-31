import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {
	public static void main(String[] args)
	{

		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

        hash_map.put("Alpha", 10);
        hash_map.put("Beta", 3);
        hash_map.put("Gamma", 12);
        hash_map.put("Delta", -3);

		System.out.println("Initial Mappings are: " + hash_map);

		System.out.println("The entry set is: " + hash_map.entrySet());

        ArrayList<Map.Entry<String, Integer>> hashMapList = new ArrayList<>(hash_map.entrySet());
        System.out.println(hashMapList);

        Collections.sort(hashMapList, new CustomComparator());

        System.out.println(hashMapList);


	}

    public static class CustomComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
            if (o1.getValue() < o2.getValue()) {
                return -1;
            } else if (o1.getValue() > o2.getValue()) {
                return 1;
            } else {
                return 0;
            }
        }
    }    
}
