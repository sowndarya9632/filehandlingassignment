import java.io.FileInputStream;

public class FileReadingUsingFileInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("C:\\File Handling\\kpFile.txt");
            int i;
            while((i=fs.read()) != -1)
            {
                System.out.print((char) i);
            }
            fs.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
