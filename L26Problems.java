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
     public static void reverseStack(String s){
        Stack<Character> s1 = new Stack<>();
        for(int i=0; i< s.length(); i++){
            s1.push(s.charAt(i));
        }
        while (!s1.isEmpty()) {
            System.out.print(s1.pop());
        }
     }


    public static void main(String[] args) {
        Stack<Character> s= new Stack<>();
        String a= "All is well";
        reverseStack(a);

        


        
    }

    
}
