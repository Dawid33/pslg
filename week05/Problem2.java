import java.util.ArrayList;
import java.util.Arrays;

class Problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,5,3,7,2));

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (j == numbers.size() - 1) {
                    continue;
                }

                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Swap j and j + 1
                    int temp = numbers.get(j + 1);
                    numbers.set(j + 1,  numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}