import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWrittingUsingBufferedWritter {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\File Handling\\kp.txt");
            BufferedWriter bw = new BufferedWriter(f);
            bw.write("Hi");
            System.out.println("File Written Succefully");
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
