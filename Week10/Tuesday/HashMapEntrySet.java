import java.util.*;

public class HashMapEntrySet {
	public static void main(String[] args)
	{

		// Creating an empty HashMap
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(1, "Alpha");
		hash_map.put(2, "Beta");
		// hash_map.put(3, "Beta");
		hash_map.put(3, "Delta");
		hash_map.put(4, "Gamma");
		// hash_map.put(4, "Delta");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using entrySet() to get the set view
		System.out.println("The entry set is: " + hash_map.entrySet());
		System.out.println("The key set is: " + hash_map.keySet());
		System.out.println("The values are: " + hash_map.values());


        // ArrayList<Map.Entry<Integer, String>> eList = new ArrayList<>(hash_map.entrySet());
        // System.out.println(eList);

        // for(int i=0; i<eList.size(); i++){
        //     System.out.println(eList.get(i));
        //     System.out.println(eList.get(i).getKey());
        //     System.out.println(eList.get(i).getValue());
        // }

	}
}
