/*
6 Write the code for a main method that uses the following command line format
    java CommandLineCountLinesInFile filepath 
The program is passed a filepath string. If the file exists the program should count 
the number of lines in the files and display it on the screen.
 * 
 */

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String args[]) {
        String filePath = args[0];
        File myFile = new File(args[0]);
        
        if (myFile.exists()) {
            try {
                Scanner dataSource = new Scanner(myFile);
                int cnt = 0;
                while(dataSource.hasNextLine()) {
                    dataSource.nextLine();
                    cnt++;
                }
                System.out.println(cnt);
            } catch(Exception e) {
        
            }
        }
        
        
    }
}
