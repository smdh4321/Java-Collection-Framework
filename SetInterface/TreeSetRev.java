package SetInterface;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

public class TreeSetRev {
    public static void main(String[] args) {
        Comparator<Integer> com = (i,j) ->{
                return i < j ? -1 : i == j ? 0 : 1;
        }; // used for printing in descending order
        TreeSet<Integer> ts = new TreeSet<>(com);
        ts.add(1);
        ts.add(2);
        ts.add(15);
        ts.add(13);
        ts.add(11);
        ts.add(22);
        ts.add(15);
        ts.add(31);
        System.out.println(ts);
        System.out.println(ts.subSet(1,20)); // returns all elements between the passed values
        System.out.println(ts.headSet(13)); //returns all elements below to the passed element
        System.out.println(ts.tailSet(13)); // returns all elements from passed element
        System.out.println(ts.lower(30)); //returns greatest ele below/less than 30
        System.out.println(ts.higher(30)); //returns lower ele above/greater than 30

        System.out.println("--------------------------------------------------------");

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("A");
        ts2.add("AA");
        ts2.add("BA");
        ts2.add("BAB");
        ts2.add("AAAAAA");
        ts2.add("ACB");
        System.out.println(ts2);
        System.out.println("---------------------------------------------------------");

        //for descending order of string use stream
        ts2.stream()
                .sorted((o1,o2)->o2.compareTo(o1))
                        .forEach(System.out::println);
        System.out.println("---------------------------------------------------------");

    }
}
