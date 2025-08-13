public class DetectLoop {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public static boolean hasLoop(Node head) {
        if(head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create a loop: 5 -> 2
        head.next.next.next.next.next = head.next;

        if (hasLoop(head)) {
            System.out.println("Loop detected in Linked List!");
        } else {
            System.out.println("No loop found in Linked List.");
        }
    }

}



