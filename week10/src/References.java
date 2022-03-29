import java.util.ArrayList;

public class References {
    public static void main(String args[]) {
        int my_int = 3;

        // The variable a stays the same after being passed into the changeNumber function
        // This is because the value is "copied" into the function. The value stored in my_int
        // is copied because ints are primitive types.
        System.out.println("my_int before change : " + my_int);
        changeNumber(my_int);
        System.out.println("my_int after change : " + my_int);
        System.out.println();

        ArrayList<Integer> my_list = new ArrayList<Integer>();
        my_list.add(1);
        my_list.add(2);

        // The my_list variable initially contains two elements, 1 and 2.
        // A *reference* to my_list is passed into  the changeArray function.
        //
        // Since only a reference is copied, the changeArray uses that reference to
        // edit the my_list variable directly.
        //
        // In other words, instead of a list of numbers {1, 2} being copied into changeArray,
        // a reference to such a list is copied. Then, the changeArray function follows that
        // reference back to the my_list variable in this scope.
        System.out.print("my_list before change : ");
        printArray(my_list);
        changeArray(my_list);
        System.out.print("my_list after change : ");
        printArray(my_list);
    }

    public static void changeArray(ArrayList<Integer> input) {
        input.add(3);
    }

    public static void changeNumber(int i) {
        i = 4;
    }

    public static void changeNumberObject(Integer i) {
        i = 4;
    }

    public static void printArray(ArrayList<Integer> input) {
        for (Integer i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
