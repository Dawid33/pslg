import java.io.File;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileTest {
    public static void main(String args[]) {


    }
}










//        try {
//            File myfile = new File("hello");
//            Scanner s = new Scanner(myfile);
//            while(s.hasNext()) {
//                String theNextLine = s.next();
//                System.out.println(theNextLine);
//            }
//        } catch(Exception e) {
//            System.out.println("Got Error : " + e.getMessage());
//        }

//        try {
//            File myfile = new File("resources/mydata.txt");
//            Scanner fileReader = new Scanner(myfile);
//        } catch(Exception e) {
//            // If we get an exception, we do this to handle the error.
//            System.out.println("Got exception : " + e.getMessage());
//        }


//        File current_dir = new File("resources");
//        for (String s : current_dir.list()) {
//            System.out.println(s);
//        }


//    public static Scanner getFileReader(String filename) throws Exception {
//        File myfile = new File(filename);
//        if (!myfile.exists()) {
//            throw new Exception("shit, file does not exist.");
//        }
//        return new Scanner(myfile);
//    }

