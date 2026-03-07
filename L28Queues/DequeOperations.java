package L28Queues;

import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> q=new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        q.addFirst(3);
        q.addLast(4);
        System.out.println(q);
        q.removeFirst();
        q.removeLast();
        System.out.println(q);
    }
}
