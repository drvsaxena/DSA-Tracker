import java.util.Stack;

public class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (minStack.isEmpty() || x<=minStack.peek()) {
            minStack.push(x);
        }
        else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!mainStack.isEmpty()) {
            mainStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }


    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);

        System.out.println("Min: " + s.getMin()); // 2
        s.pop(); // remove 2
        System.out.println("Min: " + s.getMin()); // 3
        System.out.println("Top: " + s.top());    // 7
    }
}
