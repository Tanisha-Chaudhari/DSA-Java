//Question: Wrapper Class Practice
//Take an int value.
//Convert it into an Integer (wrapper class).
//Convert it back to primitive using intValue().
//Print both.

import java.util.Scanner;

public class WrapperExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter int value:");
        int value = input.nextInt();

        // Autoboxing: int -> Integer
        Integer wrapperObj = value;

        // Unboxing: Integer -> int
        int primitiveAgain = wrapperObj.intValue();

        System.out.println("Primitive int: "+ value);
        System.out.println("Wrapper Interger: " + wrapperObj);
        System.out.println("Unboxed back to primitve: " + primitiveAgain);

    }
}


//o/p:Enter int value:28
//Primitive int: 28
//Wrapper Interger: 28
//Unboxed back to primitve: 28