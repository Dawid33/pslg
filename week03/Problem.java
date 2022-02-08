class Problem {
    public static void main(String args[]) {
        int[] x = { 1, 2, 3, 4, 5 };
        int cnt = 0;
        for(int i = 0; i < x.length; i++) {
            cnt += x[i];
        }
        System.out.println(cnt);
    }
}