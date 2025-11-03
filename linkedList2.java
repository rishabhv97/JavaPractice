import java.util.LinkedList;
import java.util.*;

public class linkedList2 {

    // public Node mergeSort(Node head){
    //     //find Mid
    //     Node mid =getMid();

    //     //left and right 
    // }
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll =new LinkedList<>();
        
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
