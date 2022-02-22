//int[] arr = {10,2,5,3}
//int[] arr = {7,1,14,11}
//int[] arr = {3,1,7,11}

class Problem1 {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};

        for(int i = 0; i < arr.length; i++) {
            int n = arr[i];
            for(int j = 0; j < arr.length; j++) {
                int m = arr[j];
                if(m * 2 == n) {
                    System.out.println("The number " + n + " is 2 times " + m);
                }
            }
        }
    }
}