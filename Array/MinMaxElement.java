package Array;
import java.util.Arrays;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] arr = {50, 20, 30, 40, 10};
        int max = arr[0];  //50
        int min = arr[0];//50

        for (int i = 0; i < arr.length; i++) {  //from oth to 4th index
            if (arr[i] > max)  //i =0 : max stays 50
                max = arr[i];
            if (arr[i] < min) //i =0 min stays 50 , i =1 20<50 : min =20
                min = arr[i];
        }
        System.out.println("Max: "+max );
        System.out.println("Min: "+ min);
    }
}

//At i = 0:
//
//arr[0] > max → 50 > 50 → false, max stays 50
//
//arr[0] < min → 50 < 50 → false, min stays 50
//
//At i = 1:
//
//arr[1] > max → 20 > 50 → false
//
//arr[1] < min → 20 < 50 → true → min = 20
//
//At i = 2:
//
//arr[2] > max → 30 > 50 → false
//
//arr[2] < min → 30 < 20 → false
//
//And so on for i = 3, 4.