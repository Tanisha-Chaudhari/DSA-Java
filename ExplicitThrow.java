public class ExplicitThrow {
    //syntax: throw <throwableInstance>
    public static void main(String[] args) {

        int balance = 5000;
        int withdrawalamount = 6000;
       try {
           if (balance < withdrawalamount)
               throw new ArithmeticException("Insufficient Balance");
           balance = balance - withdrawalamount;
           System.out.println("Transaction successfully completed");
           System.out.println("Program continue....");
       }catch(ArithmeticException e){
           System.out.println("Exception: "+ e.getMessage());
       }
        System.out.println("Program Continue...");
//        int balance = 5000;
//        int withdrawalamount = 6000;
//
//        if(balance < withdrawalamount)
//            throw new ArithmeticException("Insufficient Balance");
//        balance = balance - withdrawalamount;
//        System.out.println("Transaction successfully completed");
//        System.out.println("Program continue....");
//
//       output: Exception in thread "main" java.lang.ArithmeticException: Insufficient Balance
//        at ExplicitThrow.main(ExplicitThrow.java:8)

    }
}
