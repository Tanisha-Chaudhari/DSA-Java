class Class_and_Object {
    private int length, breadth, height;

    public void setDimension(int l, int b, int h) {

        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("Length is: " + length);
        System.out.println("breadth is: " + breadth);
        System.out.println("height is: " + height);
    }

}
class Box{
    public static void main(String args[]){

           Class_and_Object obj = new Class_and_Object();

           obj.setDimension(10, 20, 30);
           obj.showDimension();

       }
    }

