public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    public static Node head;
    public static Node tail;

    //Methods
    public void addFirst(int data){
        //step1= create new node
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }


        //step2 - newNode next = head
        newNode.next = head; 

        //step 3 - head =newNode
        head = newNode;
    }
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
