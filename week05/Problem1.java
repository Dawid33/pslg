import java.util.*;

class Problem1 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int cnt = 0;

        for(int i = 0; i < numbers.size(); i++) {
            cnt += numbers.get(i);
        }
        
        System.out.println(cnt);
    }
}