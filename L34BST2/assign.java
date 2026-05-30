package L34BST2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class assign {
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

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int sumRange(Node root, int L, int R) {
        if (root == null) {
            return 0;
        }
        if (root.data < L) {
            return sumRange(root.right, L, R);
        }
        if (root.data > R) {
            return sumRange(root.left, L, R);
        }

        return root.data + sumRange(root.left, L, R) + sumRange(root.right, L, R);

    }

    // qs 2
    static int diff=Integer.MAX_VALUE;
    static int ans=0;
    public static int minDifference(Node root, int K){
        if (root == null) {
            return ans;
        }

    

        int currDiff= Math.abs(K-root.data);
        if (currDiff < diff) {
            diff= currDiff;
            ans=root.data;
        }


        minDifference(root.left, K);
        minDifference(root.right, K);

        return ans;

    }

    // Qs 3
    public static void kthSmallest(Node root, int k, ArrayList<Integer> list){
        if (root == null) {
            return;
        }

        kthSmallest(root.left, k, list);
        list.add(root.data);
        kthSmallest(root.right, k, list);

        
    }

    // Qs 4 
    static int sum =0;
    public static void transform(Node root ){
        if (root == null) {
            return;
        }

        transform(root.right);
        int temp= root.data;
        root.data=sum;
        sum+=temp;

        transform(root.left);
    }

    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);

        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        // System.out.println(sumRange(root, 2, 6));

        ArrayList<Integer> list= new ArrayList<>();
        kthSmallest(root, 2, list);
        System.out.println(list.get(2-1));
    }
}
