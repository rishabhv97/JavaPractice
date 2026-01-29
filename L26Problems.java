import java.util.*;


public class L26Problems {

    // q1 push at end of stack.

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top= s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    //Q2 Reverse a string using a stack
     public static void reverseStackStr(String s){
        Stack<Character> s1 = new Stack<>();
        for(int i=0; i< s.length(); i++){
            s1.push(s.charAt(i));
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.pop());
        }
     }


     public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
     }

     //Q3 reverse stack
     public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
     }


    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        reverseStack(s);
        printStack(s);
         


        
    }

    
}
