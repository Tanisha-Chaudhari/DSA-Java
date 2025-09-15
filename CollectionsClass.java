import java.util.*;
public class CollectionsClass {
    public static void main(String[] args) {
        Vector vt = new Vector();
        vt.add(20);
        vt.add(50);
        vt.add(10);
        vt.add(30);
        System.out.println(vt);
        Collections.sort(vt);
        int x = Collections.binarySearch(vt,30); //always apply binarysearch on sorted list otherwise o/p is wrong
        System.out.println(vt);
        System.out.println(x);
        Collections.reverse(vt);
        System.out.println(vt);
        Collections.swap(vt,0,3);
        System.out.println(vt);
    }
}
