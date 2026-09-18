package Revision;

import java.util.Stack;

public class qs {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        reverse(s);

        System.out.println(s);
    }

    public static void reverse(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int x=s.pop();
        reverse(s);
        s.push(x);

    }
}
