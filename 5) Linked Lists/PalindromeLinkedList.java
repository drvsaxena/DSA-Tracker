import java.util.Arrays;

public class PalindromeLinkedList {
    public static Boolean isPalindrome(int arr[]) {
        int first = 0;
        int last = arr.length-1;
        while (first<last) {
            if (arr[first] != arr[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static int[] convertArray(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int arr[] = new int[length];
        int idx = 0;
        temp = head;
        while (temp != null) {
            arr[idx++] = temp.data;
            temp = temp.next;
        }

        return arr;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            tail = head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printLinked() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        PalindromeLinkedList ll = new PalindromeLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        // ll.add(5);
        printLinked();

        // convertArray(head);
        System.out.println(Arrays.toString(convertArray(head)));
        System.out.println(isPalindrome(convertArray(head)));
    }
}
