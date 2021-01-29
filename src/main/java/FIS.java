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

        FileInputStream fis = new FileInputStream("raf.dat");
        FileOutputStream fos = new FileOutputStream("fos.txt");
        int len;

        byte[] data = new byte[1024*10];
        while((len = fis.read(data))!=-1){
            fos.write(data,0,len);
        }


    }
}




