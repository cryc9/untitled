import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FIS {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[1000];
        int len = fis.read(data);
        String line = new String(data,"utf-8").trim();
        System.out.println(line);



    }
}




