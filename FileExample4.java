import java.io.*;
//writing to file using bufferedwriter (it is not time consumingg like fileoutputstream!)
public class FileExample4 {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("file1.txt");
        BufferedWriter bf = new BufferedWriter(fw);
        bf.write("Proud of you Tanisha :)!!!");
        bf.close();

    }
}

