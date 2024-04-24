import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CopyFile
{
    public static void main(String[] args) {
        try
        {
            FileInputStream ip = new FileInputStream("Source");
            FileOutputStream op = new FileOutputStream("Destination");

            while(ip.available()!=0)
            {
                op.write(ip.read());
            }
            System.out.println("Copied from source file to destination file");
            ip.close();
            op.close();
        }
        catch(FileNotFoundException obj)
        {
            System.out.println("Invalid file name");
        }
        catch(IOException obj)
        {
            System.out.println("Invalid input or output");
        }
    }
}