public class q2 {
    public static void main(String[] args) {
        int n = 6;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(k + " ");
                    k++;
                } else {
                    System.out.print(k + n - 1 + " ");
                    k--;
                    if (j == n - 1) {
                        k += 2 * n;
                    }
                }
            }
            System.out.println();
        }
    }
}
