package L30BinaryTrees;

public class heightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if (root==null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;

    }

    public static int nodeNum(Node root){
        if (root == null) {
            return 0;
        }

        int lc = nodeNum(root.left);
        int rc = nodeNum(root.right);
        return (lc+rc+1); 
    }

    public static int sum(Node root){
        if (root==null) {
            return 0;
        }

        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum + root.data ; 
    }

public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int leftDiameter = diameter(root.left);
    int lh=height(root.left);
    int rightDiameter = diameter(root.right);
    int rh=height(root.right);
    int selfDiameter = lh+rh+1;
    

    return Math.max( Math.max(rightDiameter, leftDiameter), selfDiameter);
}

// 2nd Approach for diameter counting
static class info {
    int diam;
    int ht;
    public info( int diam, int ht){
        this.diam=diam;
        this.ht=ht;
    }
    
}
public static info diameter2(Node root){
    if (root==null) {
        return new info(0, 0);
    }

    info leftInfo=diameter2(root.left);
    info rightInfo=diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
    int ht= 1+Math.max(leftInfo.ht , rightInfo.ht); 

    return new info(diam, ht);
}
    public static void main(String[] args) {
        Node root =new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println(diameter2(root).diam);
    }
}
