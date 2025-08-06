import java.util.*;

public class valid_parenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        char chars[] = str.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                s.push(chars[i]);
            }

            else {
                if (s.isEmpty()) return false;

                char top = s.pop();
                if (
                    chars[i] == ')' && top != '(' ||
                    chars[i] == '}' && top != '{' ||
                    chars[i] == ']' && top != '[' 
                )
                return false;
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
