public class q1 {
    public static void main(String[] args) {
        int n = 4;
        String s = "";
        for(int i=0;i<n;i++){
            s += (char)('A'+i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(s.substring(i, n) + s.substring(0, i));
        }
    }
}
