import java.util.ArrayList;

class ArrayListImplementaion {
    public static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        //EMPTY CHECK
        public boolean isEmpty() {
            return list.size() == 0;
        }

        //PUSH
        public void push(int n) {
            list.add(n);
        }

        //POP
        public int pop() {
            if (list.isEmpty()) {
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.get(list.size()-1));
            return top;
        }

        //PEEK
        public int peek() {
            if (list.isEmpty()) {
                return -1;
            }
            
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        System.out.println(s.peek());
        System.out.println(s.pop());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
