import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class fos {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String line = "lrc";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.close();
    }
}

