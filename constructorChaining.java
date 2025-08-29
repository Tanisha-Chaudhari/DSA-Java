class A{

    public A(){
        System.out.println("Class A");
    }
}
class C extends A{

    public C(){
        this(4);   //by default super also this and super cannot be called at once
        System.out.println("Class B");
    }
    public  C(int k){
        System.out.println("Class B 2");
    }
}
public class constructorChaining{
    public static void main(String[] args) {
        C obj = new C();
    }
}
