public class IntersectionPoint {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersectionPt(Node headA, Node headB) {
        if(headA == null || headB == null) return null; 
        
        Node a = headA;
        Node b = headB;

        while(a !=b ) {
            if(a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if(b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10); 

        Node headA  = new Node(3);
        headA.next  = new Node(6);
        headA.next.next  = new Node(9);
        headA.next.next.next  = common;

        Node headB = new Node(4);
        headB.next = new Node(7);
        headB.next.next = common;

        Node intersection = intersectionPt(headA, headB);

        if(intersection != null) {
            System.out.println("Intersection Point: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}
