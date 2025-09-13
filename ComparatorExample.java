import com.sun.source.tree.Tree;

import java.util.*;
class Book1{
    private String title;
    private int price;
    public Book1(String title, int price){
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}
class MyComparartor implements Comparator{
    public int compare(Object o1, Object o2){
        //o1 reperesent b2, 02 represent b1
        //if b2 less than b1 then it should come in left of b1
        Book1 book1 =(Book1)o1;
        Book1 book2 =(Book1)o2;
        if(book1.getPrice() < book2.getPrice())
            return -1;
        else
            return 1;

    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        Book1 b1,b2,b3;
        b1 = new Book1("PHP" , 300);
        b2= new Book1("Java", 500);
        b3 = new Book1("C", 400);

        TreeSet t = new TreeSet(new MyComparartor());   //custom sorting method
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Book1 b;

        Iterator it = t.iterator();
        while(it.hasNext())
        {
            b =(Book1)it.next();  //points 1st element
            System.out.println(b.getTitle() + " "+ b.getPrice());
        }

    }
}
