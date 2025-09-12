import java.util.*;
public class SortedSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("B");
        t.add("C");
        t.add("A");
        t.add("D");
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("C"));
        System.out.println(t.tailSet("C"));
        System.out.println(t.subSet("B","D"));
        System.out.println(t.comparator()); //return null for natural order
    }
}
