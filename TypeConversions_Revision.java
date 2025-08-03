import java.util.Scanner;

public class TypeConversions_Revision {


    public static void main(String[] args) {
//      1)  int a = 100;
//        double b = a;  // Automatic Type Conversion (Widening): int to double
//
//        System.out.println("Value of a: " + a);
//        System.out.println("Value of b: "+ b);

//      2)  double A = 45.67;
//        int B = (int) A;
//
//        System.out.println("Value of double type A:" + A);
//        System.out.println("Value of int type B: " + B);

        //o/p:
        //Value of double type A:45.67
        //Value of int type B: 45

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        String strNumber = input.nextLine();  //input as a string

        int num = Integer.parseInt(strNumber);  //convert string into int

        System.out.println("Double of entered number: " + (num * 2));


//  o/p:  Enter a number:
//        28
//        Double of entered number: 56


    }
}
