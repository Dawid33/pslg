import java.util.ArrayList;
import java.util.Arrays;

class Problem2 {
    public static void main(String[] args) {
        String input = "I am human";
        String wordToSearch = "am";
        String wordToAdd = "(not)";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(input.split(" ")));

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(wordToSearch)) {
                words.add(i + 1,  wordToAdd);
            }
        }

        for ( int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");
        }
    }
}