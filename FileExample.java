import java.io.File;
import java.io.IOException;
class FileExample {
    public static void main(String[] args) throws IOException {
        File f1= new File("Name.txt");
        f1.createNewFile(); //error if not written throws IOException
        System.out.println("Is Exists: "+f1.exists());   //Is Exists: false
        System.out.println("File Size: "+f1.length());
        System.out.println("Absolute Path: " + f1.getAbsolutePath());
        System.out.println("File Name: "+ f1.getName());
       // f1.delete();

        //to represent file there exists metadata //data about data


    }
}
