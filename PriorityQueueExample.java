import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("A");
        pq.offer("C");
        pq.offer("D");
        pq.offer("B");
        System.out.println(pq); //o/p : [A, B, D, C] sequence for storing element doesnt matter
        System.out.println(pq.poll());//deleted in natural order: ABCD
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
