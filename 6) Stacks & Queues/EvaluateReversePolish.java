import java.util.Stack;

public class EvaluateReversePolish {
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            String token = tokens[i];

            if(isOperator(token)) {
                int b = s.pop();
                int a = s.pop();
                int result = applyOperator(token, a, b);
                s.push(result);
            } else {
                s.push(Integer.parseInt(token));
            }
        }
        return s.pop();
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Invalid operator" + operator);
                return 0;
        }
    }

    
    public static void main(String[] args) {
        String[] expression = {"2","1","+","3","*"};        
        System.out.println("Result: " + evaluateRPN(expression));
    }
}
