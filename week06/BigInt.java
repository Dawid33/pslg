import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BigInt {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int x = 100;
        ArrayList<Integer> otherNumber = new ArrayList<>();

        while (x > 9) {
            otherNumber.add(x % 10);
            x /= 10;
        }
        otherNumber.add(x);
        Collections.reverse(otherNumber);

        //printArray(otherNumber);

        boolean carryOne = false;
        for (int i = 0; i < numbers.size(); i++) {

            if (otherNumber.get(i) != null && numbers.get(i) != null) {
                int result = numbers.get(i) + otherNumber.get(i);
                if (carryOne) {
                    result += 1;
                    carryOne = false;
                }

                if (result > 9) {
                    carryOne = true;
                    result -= 10;
                }
                numbers.set(i, result);
            }
        }

        printArray(numbers);
    }

    public static void printArray(ArrayList<Integer> input) {
        for (Integer i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
