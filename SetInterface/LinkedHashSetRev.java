package SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetRev {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        lhs.add(6);
        lhs.add(null);
        System.out.println(lhs);


    }
}
