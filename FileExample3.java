import java.io.*;
//Reading from file using fileinputstream
public class FileExample3 {
    public static void main(String[] args) throws IOException{

        int i;
        FileInputStream fis = new FileInputStream("./file1.txt");
        do{
            i = fis.read();
            if(i != -1)  // -1 indicates end of the file
                System.out.println((char)i);  //typecasting
        }while(i!=-1);
   fis.close();
    }
}
