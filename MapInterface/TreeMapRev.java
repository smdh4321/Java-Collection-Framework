package MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRev {
    public static void main(String[] args) {
        Map<Integer,String> tMap = new TreeMap<>();
        // returns in ascending order of Key - Value pairs
        tMap.put(1, "Hussain");
        tMap.put(3, "Amaan");
        tMap.put(2, "Mahaboobi");
        tMap.put(6, "Yasaswini");
        tMap.put(5, "Surya");
        tMap.put(4, "Bharath");

        System.out.println(tMap);
        System.out.println("------------------------------------------------------------------");

    }
}
