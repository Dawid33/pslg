import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Reverse the sentence :
// String input = "This is my sentence!";

public class Sentence {
    public static void main(String args[]) {
//        String input = "This is my sentence!";
//        ArrayList<String> words = new ArrayList<>();
//
//        Scanner reader = new Scanner(input);
//        reader.useDelimiter(" ");
//
//        while(reader.hasNext()) {
//            words.add(reader.next());
//        }

//        String input = "This is my sentence!";
//        ArrayList<String> words = new ArrayList<>();
//
//        String currentWord = "";
//        char[] characters = input.toCharArray();
//
//        for(int i = 0; i < characters.length; i++) {
//            if(characters[i] == ' ') {
//                words.add(currentWord);
//                currentWord = "";
//            } else if (i == characters.length - 1) {
//                words.add(currentWord + characters[i]);
//                currentWord = "";
//            } else {
//                currentWord = currentWord + characters[i];
//            }
//        }

//        words = reverse(words);
//        for (String word : words) {
//            System.out.println(word);
//        }
    }

    static ArrayList<String> reverse(ArrayList<String> input) {
        ArrayList newArray = new ArrayList<String>();

        for (int i = 0; i < input.size(); i++) {
            newArray.add(input.get(input.size() - 1 - i));
        }

        return newArray;
    }
}
