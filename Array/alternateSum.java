package Array;

import java.util.Arrays;
import java.util.Scanner;

public class alternateSum {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int evenIndexSum=0;
        int oddIndexSum =0;
        System.out.println("Enter array elements: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for(int i =0; i< arr.length;i++){
            if(i % 2 ==0){  //based on odd and even indices
                evenIndexSum+= arr[i];

            }
            else{
                oddIndexSum+= arr[i];
            }
        }
        System.out.println("Even place elements sum: "+ evenIndexSum);
        System.out.println("Odd places elements sum: " + oddIndexSum);
    }
}
