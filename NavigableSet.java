import java.util.*;
public class NavigableSet {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
        t.add("O");
        t.add("P");
        t.add("M");
        t.add("N");
        t.add("L");
        System.out.println(t);
        System.out.println(t.ceiling("N")); //greater or equal to
        System.out.println(t.floor("Q")); //less or equal to
        System.out.println(t.higher("O")); //strictly higher
        System.out.println(t.lower("P")); //strictly lower
        System.out.println(t.pollFirst()); //returns sorted first
        System.out.println(t.pollLast()); //returns sorted last element
    }
}
