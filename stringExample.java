public class stringExample {
    public static void main(String[] args) {

        String s1 = new String("Tanisha");
        System.out.println(s1);

        String s2 = s1.toUpperCase();
        System.out.println(s2);

        String s3 = s1.toLowerCase();
        System.out.println(s3);
        //output:
        //Tanisha
        //TANISHA
        //tanisha

        int i = s1.indexOf('n');
        System.out.println("index is: " + i);
    }
}
