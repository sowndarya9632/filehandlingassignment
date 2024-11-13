import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadingUsingBufferedReader {
    public static void main(String[] args) {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("C:\\File Handling\\kpFile.txt"));
            String line;
            while((line=br.readLine())!= null)
            {
               System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
