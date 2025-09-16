package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr={ 2,5,7,9,12};
        int sum =0;

        for(int i =0; i< arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of all elements of array is: "+sum);
    }
}
//i used above bruteforce approach
//Can be slightly optimized for readability with for-each loop or += operator.
