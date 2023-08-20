import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriteIOstream {
    public static void main(String[] args) {
        try {
            File inputFile = new File("niraj.txt");
            File outputFile = new File("nirajCopy.txt");

            // Check if the input file exists before proceeding
            if (!inputFile.exists()) {
                System.out.println("Input file does not exist.");
                return;
            }

            FileReader reader = new FileReader(inputFile);
            char[] ch = new char[(int) inputFile.length()];

            // Reading data from the input file
            int bytesRead = reader.read(ch);
            reader.close();

            if (bytesRead == -1) {
                System.out.println("Input file empty.");
                return;
            }

            // Writing data to the output file
            FileWriter writer = new FileWriter(outputFile);
            writer.write(ch);
            writer.close();

            System.out.println("  data copied from input file to output file.");
        } catch (IOException e) {
            System.out.println("error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}