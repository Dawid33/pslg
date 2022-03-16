import java.util.*;

public class NumberComparators {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            numbers.add( (int)(Math.random()*100+1));
        }

        System.out.println(numbers);

        // Add the code to sort and display the numbers in
        // NATURAL ORDERING (ASCENDING) sequence
        // Select this line and the next
        Collections.sort(numbers); // Natural Ordering (Ascending)
        System.out.println("Ascending order : " +numbers);
        // to unhide sample solution

        // Add the code to sort and display the numbers in
        // DESCENDING sequence
        // Select this line and the next
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order : " + numbers);
        // to unhide sample solution


        // Add the code to sort the numbers on 
        // ASCENDING RIGHTMOST DIGIT
        // using an ANONYMOUS COMPARATOR
        // Select this line and the next
        Collections.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return (x%10) - (y%10) ; // Sort on Rightmost Digit
            }
        });
        System.out.println("Rightmost Digit order : " + numbers);
        // to unhide sample solution

        // Add the code to sort the numbers on 
        // ASCENDING SUM OF THE DIGITS IN THE NUMBER
        // using a NAMED COMPARATOR called sumOfDigits.
        // You may find it convenient to include a method
        // that sums the digits of a number and returns the result
        // like the one shown below
        // Select this line and the next
        Comparator sumOfDigits = new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return sumDigits(x) - sumDigits(y);
            }
        };
        // Use sumOfDigits comparator
        Collections.sort(numbers, sumOfDigits);
        System.out.println("Sum of Digits order : " + numbers);
        // to unhide sample solution

    }

    private static int sumDigits(int n) {
        // Select this line and the next
        int sum = 0;
        while(n > 0) {
            sum = sum + (n % 10); // Add rightmost digit
            n = n / 10; // Remove rightmost digit
        }
        return sum;
    }
    // to unhide sample solution

}