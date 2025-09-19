package Array;
//Time complexity: O(n)
// interviewr want optimised ans so this is correct
//Space: O(1)

public class SecondLarge {
    public static void main(String[] args) {
        int arr[]={10, 98, 45,32,23,67};

        //If array has negative numbers, initializing with 0 would fail.
        int largest = Integer.MIN_VALUE;  //Integer.MIN_VALUE is the smallest possible integer value in Java
        int secondLargest = Integer.MIN_VALUE; //We use it here to initialize largest and secondLargest so that any element in the array will be greater than this initially.

        for(int i=0; i< arr.length;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        System.out.println("Second largest element is: "+secondLargest);
    }
}
