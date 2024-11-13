import java.io.File;

public class fileInfo {
    public static void main(String[] args) {
        File f=new File("C:\\File Handling\\kpFile.txt");
        if(f.exists())
        {
           System.out.println(f.exists());
            System.out.println(f.canExecute());
            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getAbsoluteFile());
        }
    }
}
