import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        //insertion order is not preserved
        HashSet h = new HashSet();
        h.add("One");
        h.add("Two");
        h.add("Three");
        h.add("Four");
        h.add("Obne");  //duplicate : it will return false
        System.out.println(h);


    }
}
