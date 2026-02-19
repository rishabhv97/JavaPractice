package L28Queues;
import java.util.LinkedList;
import java.util.Queue;

public class L28Queues {
    // Queue implementation using Stack

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }

    static class QueueLL{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null & tail==null;
        }

        public static void add(int data){
            Node newNode= new Node(data);
            if (head==null) {
                head =tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front=head.data;
            if (tail==head) {
                tail=head=null;
            }else head=head.next;
            
            return front;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
        
    }
    public static void main(String[] args) {
        // QueueLL q=new QueueLL();
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }

//Queue Implementation using  
        Queue<Integer> q= new LinkedList<>();  
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
