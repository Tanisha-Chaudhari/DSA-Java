import java.util.*;
public class ArraysClass {
    public static void main(String[] args) {

        int a[] = {20, 5, 50, 10, 25};
        int b[]={10,20,30,40,50};
        int i;
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");

        Arrays.sort(a,2,5); //last index is excluded always
        System.out.println(" ");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");

        System.out.println(" ");
        System.out.println(Arrays.equals(a,b));


    }
}
