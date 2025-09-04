import java.io.*;
//writing to file using fileoutputstream
public class FileExample2 {
    public static void main(String[] args) throws IOException {
        int i;
        FileOutputStream fout = new FileOutputStream("file1.txt",true);
        String s = "TATA";
        char ch[] = s.toCharArray();
        for(i =0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();
    }
}
