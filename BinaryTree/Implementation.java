package BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class Implementation {
    public static void main(String[] arg){
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        levelOrder(a);
//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(product(a));
//        System.out.println(maximum(a));
//        System.out.println(non_zero_product(a));
//        System.out.println(length(a));
    }
    public static void display(Node root){
        if(root ==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }

    public static int size(Node root){
        if(root ==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public static int sum(Node root){
        if(root ==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int product(Node root){
        if(root ==null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    public static int non_zero_product(Node root){
        //     0
        //   /   \
        //   3    2
        // return 3*2 do not return root

        if(root==null) return 1;
        int product_right = non_zero_product(root.right);
        int product_left = non_zero_product(root.left);

        if(root.val ==0){
            return product_left * product_right;
        }
        return root.val * product_left * product_right;
    }

    public static int maximum(Node root){
        if(root ==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maximum(root.left),maximum(root.right)));
    }

    public static int  length(Node root){
        if(root == null) return 0;
        return 1 + Math.max(length(root.left),length(root.right));
    }
    public static void preorder(Node root){
        if(root ==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left !=null) q.add(front.left);
            if(front.right !=null) q.add(front.right);
        }
        System.out.println();
    }
}
