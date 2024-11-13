import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
       File f=new File("C:\\File Handling\\kpFile.txt");
       if(f.createNewFile())
       {
           System.out.println("File Successfully Created");
       }
       else
       {
            System.out.println("File Already Exists");
       }
    }
}
