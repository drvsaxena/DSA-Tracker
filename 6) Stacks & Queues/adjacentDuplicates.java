import java.util.Stack;

public class adjacentDuplicates {
    public static String duplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(!s.isEmpty() && ch == s.peek()) {
                s.pop();
            } else {
                s.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.size(); i++) {
            sb.append(s.get(i));
        }

        return sb.toString();
    }

    
    public static void main(String[] args) {
        String input = "abbaca";
        String output = duplicate(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }    
}
