import java.io.FileOutputStream;                
import java.io.IOException;
public class WritingFile {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("niraj.txt") ;
            outputStream.write("i am writing in the file".getBytes());
            outputStream.close();
        } catch (Exception e) {
            
            System.out.println(e);
        } 
    }
}