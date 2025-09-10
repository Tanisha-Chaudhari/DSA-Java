import java.util.*;
public class ListIteratorCursor {
    //bidirectionally accessible
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("C");
        l.add("CPP");
        l.add("Java");
        l.add("Python");
        l.add("PHP");
        System.out.println(l);

        ListIterator lit = l.listIterator();

        while (lit.hasNext()){
            String s=(String)lit.next();
            if(s.equals("Java"))
                lit.set("Java SE");
            else if(s.equals("C"))
                lit.add("DS");
            else if (s.equals("PHP"))
                lit.remove();

        }
        System.out.println(l);
    }

}
