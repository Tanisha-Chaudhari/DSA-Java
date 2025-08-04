//Q3: Static Variable Practice
//Problem:
//Create a class Counter that:
//
//Has a static int variable count
//
//Increases count by 1 every time a new object is created
//
//Prints the current value of count from main

class Counter {
    static  int count =0;
    public void increment(){
        count++;
        System.out.println("Counter: "+ count);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        c1.increment();

        Counter c2 = new Counter();
        c2.increment();

        Counter c3 = new Counter();
        c3.increment();

    }
}
//
//o/p:
//Counter: 1
//Counter: 2
//Counter: 3