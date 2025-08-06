import java.util.Stack;

public class queueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }


    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();
        
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}