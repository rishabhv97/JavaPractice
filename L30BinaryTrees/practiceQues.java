package L30BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class practiceQues {
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivalued(Node root, int val){
        

        if (root==null) {
            return true;
        }

        if (root.data!=val) {
            return false;
        }

        boolean left= isUnivalued(root.left, val);
        boolean right= isUnivalued(root.right, val);

        return left && right;



    }

    // question 2
    public static void invertBinaryTree(Node root){
        if (root==null) {
            return;
        }

        Queue<Node> q= new LinkedList<>();
    }

    // public static void levelOrder(Node root){
    //         if (root == null) {
    //             return;
    //         }
    //         Queue<Node> q = new LinkedList<>();
    //         q.add(root);
    //         q.add(null);

    //         while(!q.isEmpty()){
    //             Node currNode= q.remove();
    //             if (currNode==null) {
    //                 System.out.println();
    //                 if (q.isEmpty()) {
    //                     break;
    //                 }else{
    //                     q.add(null);
    //                 }
    //             }else{
    //                 System.out.print(currNode.data+" ");
    //                 if (currNode.left != null) {
    //                     q.add(currNode.left);
    //                 }
    //                 if (currNode.right!=null) {
    //                     q.add(currNode.right);
    //                 }
    //             }
    //         }
    //     }


    // Question 3
    public static Node deleteLeaf(Node root, int x) {
    if (root == null) {
        return null;
    }

    root.left = deleteLeaf(root.left, x);
    root.right = deleteLeaf(root.right, x);

    // Now check AFTER recursion
    if (root.left == null && root.right == null && root.data == x) {
        return null;
    }

    return root;
}


    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(isUnivalued(root, root.data));


    }
}
