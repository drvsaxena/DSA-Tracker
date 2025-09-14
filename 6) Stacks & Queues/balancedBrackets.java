import java.util.*;

public class BalancedBrackets {
    public static boolean brackcheck(String str) {
        Stack<Character> s = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.isEmpty()) {
                    return false;
                } else {
                    char top = s.pop();
                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                            return false; 
                        }
                }
            }
        }
        return s.isEmpty();
    }


    public static void main(String[] args) {
        System.out.print("Enter String with brackets: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Result: " + brackcheck(str));
        sc.close();
    }
    
}
