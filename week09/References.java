import java.util.ArrayList;

public class References {
    public static void main(String args[]) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);

        System.out.println("Array :");
        printArray(test);
        changeArray(test);
        printArray(test);

        //------------------

        int a = 3;
        Integer b = Integer.valueOf(3);

        System.out.println("Numbers :");
        changeNumber(a);
        changeNumberObject(b);

        System.out.println(a);
        System.out.println(b);
    }

    public static void changeArray(ArrayList<Integer> input) {
        input.add(-1);
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
