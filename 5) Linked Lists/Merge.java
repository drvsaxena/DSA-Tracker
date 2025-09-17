import java.util.Arrays;

public class Merge {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Add element to linked list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print linked list
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Convert both lists into array
    public static int[] addToArr(Node head1, Node head2) {
        int len = 0;
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null) {
            len++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            len++;
            temp2 = temp2.next;
        }

        int arr[] = new int[len];
        int idx = 0;
        temp1 = head1;
        temp2 = head2;

        while (temp1 != null) {
            arr[idx++] = temp1.data;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            arr[idx++] = temp2.data;
            temp2 = temp2.next;
        }

        return arr;
    }

    // Merge two sorted lists (array-based)
    public static Merge mergeSorted(Node head1, Node head2) {
        int[] res = addToArr(head1, head2);
        Arrays.sort(res);  // sort array

        Merge mergedList = new Merge();
        for (int val : res) {
            mergedList.add(val);
        }
        return mergedList;
    }

    public static void main(String[] args) {
        Merge node1 = new Merge();
        Merge node2 = new Merge();

        node1.add(1);
        node1.add(3);
        node1.add(5);

        node2.add(2);
        node2.add(4);
        node2.add(6);

        Merge merged = mergeSorted(node1.head, node2.head);
        merged.printLL();
    }
}
