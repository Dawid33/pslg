import java.util.*;
/*
1. Write the code for method with the following header

public dataSet(int size, int min, int max)
The method creates the ArrayList of integers that contains ‘size’ randomly chosen values in the range ‘min’ to ‘max’ inclusive.
No duplicates are allowed. If the difference between ‘min’ and ‘max’ is less than or equal to the value of ‘size’ the method
should return the ‘null’ value.
 */

class Problem1 {
    public static void main(String args[]) {
        var result = dataSet(5, 3, 10);
        printArrayList(result);
    }

    public static ArrayList<Integer> dataSet(int size, int min, int max) {
        if (max - min <= size) {
            return null;
        }

        ArrayList<Integer> result = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {

            boolean duplicateExists = false;
            int number = (int)((max + 1 - min) * Math.random()) + min;
            for (Integer j : result) {
                if (j == number) {
                    duplicateExists = true;
                    break;
                }
            }
            if (!duplicateExists) {
                result.add(number);
            } else {
                i--;
            }
        }

        return result;
    }

    public static void printArrayList(ArrayList<Integer> array) {
        for(Integer i : array) {
            System.out.print( i + " ");
        }
        System.out.println();
    }
}