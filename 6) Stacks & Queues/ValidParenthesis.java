import java.util.*;

public class ValidParenthesis {
   public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        char arr[] = str.toCharArray();

        for (char ch : arr) {
            if (ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            }
            else {
                if (s.isEmpty()) {
                    return false;
                }
                int top = s.pop();
                if ((ch == '}') && (top != '{') ||
                (ch == ')') && (top != '(') || 
                (ch == ']') && (top != '['))
                {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "({[]})";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    
}
