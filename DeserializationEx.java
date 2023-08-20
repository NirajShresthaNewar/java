import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeserializationEx {
    public static void main(String[] args) {
        try (FileInputStream fIn = new FileInputStream("niraj.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fIn)) {

            Person person = (Person) objectIn.readObject();
            System.out.println("Object deserialized: " + person.getName() + ", " + person.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}