 class Outer1{
    //non static inner class : first we have to create object of outer then inner class
    class Inner1{
        void if2(){
            System.out.println("if2()");
        }

    }
}
public class NestedClass2{
    public static void main(String[] args) {

        Outer1 out = new Outer1();
        Outer1.Inner1 o1 = out.new Inner1();
        o1.if2();
    }
}
