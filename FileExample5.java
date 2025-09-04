import java.io.*;
public class FileExample5
{
    public static void main(String[] args) throws IOException {
        int ch;
        BufferedReader bf = new BufferedReader(new FileReader("file1.txt"));
        while((ch = bf.read()) != -1){
            System.out.print((char)ch);
        }

bf.close();
    }
}
