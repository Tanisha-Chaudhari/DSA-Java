class M extends Thread{
    public void run(){
        int i;
        for(i =1; i<=10;i++);
        System.out.println("i= "+i+" Thread 1");
    }
}
class N extends Thread{
    int i;
    public void run() {
        for(i =1;i<=10;i++);
        System.out.println("i= "+i+" Thread 2");
    }
}
public class ThreadClassExample {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = new N();
        obj1.start();
        obj2.start();
    }
}
