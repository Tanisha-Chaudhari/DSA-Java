package Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6,7,8,9,10};
        int[] reverseArray= new int[arr.length];

        for( int i= arr.length-1,  j =0 ;i >=0 ;i--,j++){
            reverseArray[j] = arr[i];

        }
        System.out.println("Reversed array is: "+ Arrays.toString(reverseArray));

    }
}
