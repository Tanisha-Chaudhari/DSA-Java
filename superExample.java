public class superExample {
    int z;   //default variable
    public void f1() {

    }
}
class B extends superExample{
     int z;   //instance variable
    public void f1() {
       super.f1();
    }
    public void f2(){
        int z; //local variable
        z=2;
        this.z=3; //to put value in instance variable
        super.z=4;
        System.out.println(z);
    }
}

class Example{
    public static  void main(String[] args){

        B obj = new B();
        obj.f1();
        obj.f2();

    }
}