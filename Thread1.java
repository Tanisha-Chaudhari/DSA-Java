class E implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println("Thread E: " + i);
    }
}
class F implements Runnable{
    @Override
    public void run() {
        for(int i =0; i<=10;i++)
        System.out.println("Thread F:" + i);
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new E());
        Thread t2 = new Thread(new F());
        t1.start();
        t2.start();
    }
}
//output:
//Thread F:0
//Thread F:1
//Thread F:2
//Thread F:3
//Thread F:4
//Thread F:5
//Thread F:6
//Thread F:7
//Thread F:8
//Thread E: 0
//Thread E: 1
//Thread F:9
//Thread F:10
//Thread E: 2
//Thread E: 3
//Thread E: 4
//Thread E: 5
//Thread E: 6
//Thread E: 7
//Thread E: 8
//Thread E: 9
//Thread E: 10