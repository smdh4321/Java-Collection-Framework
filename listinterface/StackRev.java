package listinterface;

import java.util.Iterator;
import java.util.Stack;

public class StackRev {
    public static void main(String[] args) {
//        it is tbe child class of Vector (I)
        Stack<String> st = new Stack<>();
        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st.search("C")); //returns index of ele
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek()); //returns top ele of stack
        System.out.println("--------------------------------------------------------");

        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
