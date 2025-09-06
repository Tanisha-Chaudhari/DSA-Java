
class checkGeneric{
    public <E> void printArray(E []s){
       for(E x : s)
        System.out.println(x);
    }
}
public class GenericMethodExample {
    public static void main(String[] args) {
        checkGeneric g1 = new checkGeneric();
        String [] countries ={"India","Afganistan","Nepal"};
        Integer [] numbers ={27, 28, 30,34};
        g1.printArray(countries);
        g1.printArray(numbers);
    }
}
