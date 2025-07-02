package QueueInterface;

import java.util.*;

public class PriorityQueueRev {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(10);
        q1.add(100);
        q1.offer(50); // used to add element into queue

        System.out.println(q1.peek()); // returns the head element of queue
        System.out.println(q1.element()); // returns the head element of queue if the queue is empty
                                        // it returns NoSuchElementException

        System.out.println(q1); // it may not returns the elements in sorted order
//        but when we do poll() or remove() operations it will returns the elements
//        in sorted order

        System.out.println(q1.poll()); // removes the head element from queue if the queue is empty returns null
        System.out.println(q1.remove()); //removes the head element from queue if the queue is empty returns
                                        // NoSuchElementException
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }


    }
}
