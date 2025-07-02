package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRev {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "Hussain");
        hmap.put(3, "Amaan");
        hmap.put(2, "Mahaboobi");
        hmap.put(6, "Yasaswini");
        hmap.put(5, "Surya");
        hmap.put(4, "Bharath");

        System.out.println(hmap);
        System.out.println("------------------------------------------------------------------");

        //for printing the key and value separately we should use the concept of Entry in Map

        for(Map.Entry<Integer,String> entries : hmap.entrySet()){

            System.out.println(entries.getKey() + " --> "+ entries.getValue());
        }
        System.out.println("------------------------------------------------------------------");

        System.out.println(hmap.get(4));
        System.out.println("------------------------------------------------------------------");

        Set<Integer> keys=hmap.keySet(); // returns all keys in Set form
        System.out.println(keys);

        System.out.println("------------------------------------------------------------------");
        Collection values=hmap.values(); // returns all values in the form of Collection
        System.out.println(values);
    }
}
