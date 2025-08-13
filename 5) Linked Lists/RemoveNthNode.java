public class RemoveNthNode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
    }

    public static Node removeNode(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = head;
        Node second = head;

        for(int i=0; i<=n; i++) {
            first = first.next;
        }

        while(first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;
    }

    public static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        removeNode(head, 2);
        System.out.println("Removed nth List:");
        printList(head);
    }
}
