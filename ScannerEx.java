import java.util.*;
public class ScannerEx {
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your data: ");
    String data = in.nextLine();
    System.out.println("Data input=: " + data);
    in.close();
    }
}