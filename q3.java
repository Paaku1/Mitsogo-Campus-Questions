import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
        int[] arr = { 6,5,3,2,10,20,4,3,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int n = arr.length;
        int[] res = new int[n];
        int j = n - 1;
        int i = 0;
        int k = 0;
        while (k < n && i < j) {
            res[k++] = arr[j--];
            res[k++] = arr[i++];
            if(i==j){
                res[k] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(res));
        //System.out.println(n);
    }
}
