import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("Tanisha");
        list.add(1,"Prakash");
        list.addLast("Chaudhari");
        System.out.println(list.getFirst());
        //to print middle
        System.out.println(list.get(1));
        System.out.println(list.getLast());


    }
}
