class Outer{

    //static inner class example : we have to create object of inner class only
     static class Inner{
         void if1(){
             System.out.println("if1()");
         }
     }//static class cannot access members of non static class
    //but it can access outer class's static members
}

public class NestedClass1{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.if1();
    }
}