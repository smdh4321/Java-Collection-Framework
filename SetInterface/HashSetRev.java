package SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetRev {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hussain");
        set.add(null);
        set.add("A");
        System.out.println(set);
        System.out.println(set.contains("A"));
        System.out.println("------------------------------------------");
    }
}
