import java.io.FileInputStream;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream = new FileInputStream("niraj.txt");
            int data = inputStream.read();
            while (data !=-1) {
                data = inputStream.read();
                System.out.println(data);
            }
        inputStream.close();
        } catch(IOException e){
            System.out.println(e);
        }
    }

}