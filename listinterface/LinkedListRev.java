package listinterface;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListRev {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.addFirst("E");
        ll.addLast("F");
        System.out.println(ll);
        System.out.println("----------------------------------------------------");
        Iterator it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------------------");
        Collections.reverse(ll);
        System.out.println(ll);
        System.out.println("----------------------------------------------------");
        Collections.sort(ll);
        System.out.println(ll);
        System.out.println("----------------------------------------------------");
        System.out.println(ll.contains("A")); //checks the element present or not
        System.out.println("----------------------------------------------------");
        System.out.println(ll.getFirst()); // returns first ele
        System.out.println(ll.getLast()); // returns last ele
        System.out.println("----------------------------------------------------");
        System.out.println(ll.size()); //returns length of linkedlist

    }
}
