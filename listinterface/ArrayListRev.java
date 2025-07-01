package listinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRev {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("pineapple");
        list.add("grapes");
        System.out.println(list.get(3));
        list.add(0,"mango");
        list.set(3,"orange");
        System.out.println(list);
        System.out.println("--------------------------------------------------------------");
//        iterating through list using for each
        for(String s :list){
            System.out.println(s);
        }
        System.out.println("--------------------------------------------------------------");
//        iterating through list using iterator
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------------------------------------------------");
    }
}
