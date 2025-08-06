import java.util.Stack;

public class push_bottom {
    public static void pushAtBottom(Stack <Integer> s, int Data) {
        if (s.isEmpty()) {
            s.push(Data);
            return;
        }
        
        int top = s.pop();
        pushAtBottom(s, Data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
