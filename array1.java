import java.util.Scanner;

class array1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 Numbers: ");

        for(int i=0; i< 5 ; i++){
            arr[i] = input.nextInt();
        }

        for(int i =0; i<5; i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }

    }
}
