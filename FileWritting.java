import java.io.FileWriter;

public class FileWritting {
    public static void main(String[] args) {
        try
        {
            FileWriter fw=new FileWriter("C:\\File Handling\\kpFile.txt");
            fw.write("Java Is The Best Programming Language");
            System.out.println("File Written Completed");
            fw.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
