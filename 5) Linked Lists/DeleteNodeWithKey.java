public class DeleteNodeWithKey {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;
    }

    public static Node deleteNode(Node head, int key) {
        //Case 1: Key is Head
        if (head.data == key) {
            return head.next;
        } 

        //Case 2: Search for the Key
        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void printList(Node head) {
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        deleteNode(head, 3);
        System.out.println();
        System.out.println("After deleting 3: ");
        printList(head);
    }
}
