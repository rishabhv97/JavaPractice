public class L25Problems {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to get the intersection node of two linked lists
    public Node getIntersectionNode(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2; // Intersection found
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null; // No intersection found
    }
    

    

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addLast(1);
        ll.print();
    }
}
