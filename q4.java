import java.util.Stack;

public class q4 {
    public static void main(String[] args) {
        // valid mathematical expression
        String s = ")(a+b()";
        String res = isValid(s) && isValidOp(s) ? "valid" : "Invalid";
        System.out.println(res);
    }

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }

    static boolean isValidOp(String s) {
            for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i > 0 && i < s.length() - 1) {
                if ((s.charAt(i - 1) != '+' || s.charAt(i - 1) != '-' || s.charAt(i - 1) != '*'
                        || s.charAt(i - 1) != '/') &&
                        s.charAt(i + 1) != '+' || s.charAt(i + 1) != '-' || s.charAt(i + 1) != '*'
                        || s.charAt(i + 1) != '/') {
                    continue;
                }
            } else {
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    return false;
                }
            }
        }
        return true;
    }
}
