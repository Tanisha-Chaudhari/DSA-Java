class Greeting{
    public void sayHello(){
        System.out.println("Hello");
    }
}
class india{
   Greeting a = new Greeting(){
       @Override
       public void sayHello() {
           System.out.println("Namskar...!");
       }
   };
}
public class AnonymsClassExample {
    public static void main(String[] args) {
        india ind = new india();
        ind.a.sayHello();
    }
}