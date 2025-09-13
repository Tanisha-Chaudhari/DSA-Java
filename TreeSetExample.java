import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet t = new TreeSet();
       // t.add(null);  //not allowed after version 6 : they treated it as bug and changed after version 6
//        t.add("A");
//        t.add(10); ClassCastException



//        TreeSet stores elements in sorted order.
//
//        Elements must implement Comparable, or you must provide a Comparator.
//
//                If you add an object that doesn’t implement Comparable and you don’t give a Comparator → ClassCastException at runtime
//        t.add(new StringBuffer("B"));
//        t.add(new StringBuffer("D"));
//        t.add(new StringBuffer("A"));
//        t.add(new StringBuffer("C"));
//        System.out.println(t);
    }
}
