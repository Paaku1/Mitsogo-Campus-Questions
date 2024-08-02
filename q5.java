import java.util.*;

public class q5 {
    public static void main(String[] args) {
        // minimum number of decimals with digits of 1's and 0's sums to n
        int n = 120;
        List<Integer> list = new ArrayList<>();
        int[] digits = { 111, 110, 101, 100, 11, 10, 1 };
        for (int digit : digits) {
            while (n >= digit) {
                n -= digit;
                list.add(digit);
            }
        }
        System.out.println(list);
    }
}
