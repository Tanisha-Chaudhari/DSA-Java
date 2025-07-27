public class StackExample {

    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackExample(int size) {

        maxSize = size;
        stackArray = new int[maxSize]; //dynamic allocation
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full u cannot push elements" + value);
        } else {
            top++;  //points to 0th index
            stackArray[top] = value;  //scope for insertion
            System.out.println("Pushed element is:" + value);

        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty cannot pop element");
            return -1;  // return and terminate the process
        } else {
            int value = stackArray[top];
            top--; // after returning decrement
            System.out.println("popped element is:" + value);
            return value;
        }
    }

    public int peek() {

        if (top == -1) {
            System.out.println("Stack is empty cannot peek element");
            return  -1;
        } else {
            return stackArray[top];
        }
    }

    //overflow , underflow functionality

    public  boolean isEmpty(){
        return  (top ==-1);
    }
    public  boolean isFull(){
        return (top == maxSize-1);
    }

    public  void display(){
        for(int i =top;i>=0; i--){
            System.out.println(stackArray[i] +" ");  //all elements from top to bottom will be displayed
        }
        System.out.println();
    }
    //driver code
    public static void main(String[] args) {
          StackExample obj =  new StackExample(5);

          obj.push(800);
          obj.push(900);
          obj.push(1000);
          obj.display();
          obj.pop();
          obj.display();

        System.out.println("Top element is: " + obj.peek());
        System.out.println("is stack empty? " + obj.isEmpty());
        System.out.println("is stack full? " + obj.isFull());
    }


}
