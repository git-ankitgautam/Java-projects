import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileHandling 
{
    public static void main(String args[]) 
    {
        try 
        {
            String str="Welcome";
            FileOutputStream fo = new FileOutputStream("sample.txt"); //creates a new file or will overwrite any existing files with the given name
            byte w[]=str.getBytes();  // converts string into byte array
            fo.write(w);   // writes the bytes into file
            fo.close();
            FileInputStream fi = new FileInputStream("sample.txt");
            int i=0;
            while((i =fi.read())!=-1) 
            {
                System.out.print((char)i); //reading from file
            }

        fi.close();
        } 
        catch (IOException e) 
        {
            System.out.print("Exception");
        }

    }

}
