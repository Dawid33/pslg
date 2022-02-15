class Problem2 {
    public static void main(String[] args) {
        int[][] arr = {
                        {7,1,14,11},
                        {1,4,70,10}
                      };
        int current_largest = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > current_largest) {
                    current_largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest number in the two dimensional array : " + current_largest);
    }
}