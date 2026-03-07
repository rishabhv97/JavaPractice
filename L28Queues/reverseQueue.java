package L28Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        int n=q.size();
        for(int i=0; i<n; i++){
            
            s.push(q.remove());

        }
        for(int i=0; i<n; i++){
            
            q.add(s.pop());

        }

        
        
    }

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reverseQueue(q);
        System.out.println(q);
    }
}
