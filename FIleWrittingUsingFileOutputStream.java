import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FIleWrittingUsingFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fs = new FileOutputStream("C:\\File Handling\\kpFile.txt" ,true);
            String data="hi";
            fs.write(data.getBytes(StandardCharsets.UTF_8));
            System.out.println("File Written Suceesfully");
            fs.close();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }

    }
}
