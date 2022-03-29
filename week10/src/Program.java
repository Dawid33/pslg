import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File my_file = new File("hello.txt");

        System.out.println("Scanner Example :");
        scannerExample(my_file);

        System.out.println();

        System.out.println("FileReader Example :");
        fileReaderExample(my_file);
    }

    public static void scannerExample(File my_file) {
        try {
            Scanner reader = new Scanner(my_file);
            while(reader.hasNext()) {
                String data = reader.next();
                System.out.print("[" + data + "]");
            }
            System.out.println();
        } catch(IOException e) {
            System.out.println("Cannot open file, received an error :" + e.getMessage());
        }
    }

    public static void fileReaderExample(File my_file) {
        try {
            FileReader reader = new FileReader(my_file);
            while(reader.ready()) {
                int data = reader.read();
                //char[] letters = Character.toChars(data);
                System.out.print("[" + data + "]");
            }
            System.out.println();
        } catch(IOException e) {
            System.out.println("Cannot open file, received an error :" + e.getMessage());
        }
    }
}
