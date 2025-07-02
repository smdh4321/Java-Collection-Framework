package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapRev {
    public static void main(String[] args) {

        //same as HashMap but it will preserve insertion order
        Map<Integer, String> hmap = new LinkedHashMap<>();
        hmap.put(1, "Hussain");
        hmap.put(3, "Amaan");
        hmap.put(2, "Mahaboobi");
        hmap.put(6, "Yasaswini");
        hmap.put(5, "Surya");
        hmap.put(4, "Bharath");

        System.out.println(hmap);
        System.out.println("------------------------------------------------------------------");
    }
}
