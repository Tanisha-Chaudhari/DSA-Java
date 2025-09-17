package Array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {12, 17, 18, 1,5,9,24,68};

        int even =0;
        int odd = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0) {
                even++;
            }
            else{
                odd++;

            }
        }
        System.out.println("Count of even elements in array is: "+even);
        System.out.println("Count of odd elements in array is: "+odd);

    }
}
