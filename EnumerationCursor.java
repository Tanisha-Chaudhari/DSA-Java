import java.util.*;
public class EnumerationCursor {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("One");
        v.addElement("Two");
        v.addElement("Three");
        System.out.println(v);

        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            String s =(String)e.nextElement(); //type casting
            System.out.println(s+" "+s.length());
        }
    }
}
