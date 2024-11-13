import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWrittingUsingPrintWritter {
    public static void main(String[] args) {
        try
        {
            PrintWriter pw=new PrintWriter(new FileWriter("C:\\File Handling\\kpFile.txt",true) );
            String data="hello";
            pw.write(data);
            pw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
