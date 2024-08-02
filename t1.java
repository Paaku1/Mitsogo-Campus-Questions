import java.util.*;

public class t1 {
    static int num(int[] a) {
        int n = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            n = n * 10 + a[i];
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 8642;
        int i = 0;
        List<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n = n / 10;
            i++;
        }
        int[] x = new int[arr.size()];
        for (i = 0; i < x.length; i++) {
            x[i] = arr.get(i);
        }
        for (i = 0; i < x.length; i++) {
            if (x[0] > x[i]) {
                int t = x[i];
                x[i] = x[0];
                x[0] = t;
                break;
            }
        }
        for (int j = 0; j < i; j++) {
            for (int k = j + 1; k < i; k++) {
                if(i==x.length){
                break;
                }
                if (x[j] < x[k]) {
                    int t = x[j];
                    x[j] = x[k];
                    x[k] = t;
                }
            }
        }
        System.out.println(arr);
        System.out.println(Arrays.toString(x));
        System.out.println(num(x));
    }
}
