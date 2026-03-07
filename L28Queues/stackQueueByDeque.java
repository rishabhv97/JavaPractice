package L28Queues;

import java.util.Deque;
import java.util.LinkedList;

public class stackQueueByDeque {
    static class Stack {
    Deque<Integer> deque = new LinkedList<>();

    public void push(int data){
        deque.addLast(data);
    }

    public int pop(){
        return deque.removeLast();
    }

    public int peek(){
        return deque.getLast();
    }
        
    }

    //Similarly for Queue implementing, we can use these operation of deque
    //add= addLAst, remove=removeFirst, peek=getFirst


    public static void main(String[] args) {

        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Peek = "+ s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
    }
}
