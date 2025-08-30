public class array2D {
  public static void main(String[] args) {
//        int [][] arr =  new int[4][];
//        System.out.println("arr[0][0]"+arr[0][0]); //"arr[0]" is null

//      int[][]a = new int[4][];
//      System.out.println("a[0]="+a[0]); //a[0]=null

       // int[][] arr = new int[4][];
//      System.out.println("Length="+ arr.length); //Length=4

    //  System.out.println("Length="+arr[0].length);  //"arr[0]" is null

      //In java it is possible to declare a 2d array with different length of each array

      int[][] arr= new int[4][];
      arr[0] = new int[5];
      arr[1] = new int[3];
      System.out.println("Length="+ arr[1].length); //Length=3

  }
}
