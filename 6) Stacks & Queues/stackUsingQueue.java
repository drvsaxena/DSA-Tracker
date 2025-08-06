import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);

        
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        

        Queue<Integer> temp = new LinkedList<>();
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if(q1.isEmpty()) {
            System.out.print("Stack is empty: ");
            return -1;
        }
        return q1.remove();
    }

    public int peek() {
        if(q1.isEmpty()) {
            System.out.print("Stack is empty: ");
            return -1;
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }


    public static void main(String[] args) {
        stackUsingQueue s = new stackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
