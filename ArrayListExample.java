import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();
        //adding and removing
        l1.add("Tanisha");
        l1.add("Mumma");
        l1.add(1,"Vanshu");
        l1.add("Pappa");
        System.out.println("L1 array is: "+l1);
        l1.add(0,"Bappa");
        l1.remove("Pappa");
        System.out.println("L1 array is: "+l1);
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(l1.get(0)); //element at 0th index
        l1.set(1,"Tanaya");
        System.out.println(l1.size());
        System.out.println("L1 array is: "+l1);
        System.out.println(l1.contains("Tanisha"));
        System.out.println(l1.contains("Vanshu"));
        System.out.println(l1.lastIndexOf("Tanisha"));
    }
}
