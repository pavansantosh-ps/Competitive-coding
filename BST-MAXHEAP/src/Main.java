import java.util.*;

class Trunk{
    Trunk prev;
    String str;
 
    Trunk(Trunk prev, String str){
        this.prev = prev;
        this.str = str;
    }
};

public class Main {
    static int i;
    static class Node{
        int data;
        Node left, right;
    };

    static Node getNode(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    static void inorderTraversal(Node root, Vector<Integer> arr){
        if (root == null){
            return;
        }
        inorderTraversal(root.left, arr);
        arr.add(root.data);
        inorderTraversal(root.right, arr);
    }

    static void BSTToMaxHeap(Node root, Vector<Integer> arr){
        if (root == null){
            return;
        }
        BSTToMaxHeap(root.left, arr);
        BSTToMaxHeap(root.right, arr);
        root.data = arr.get(i++);
    }

    static void convertToMaxHeapUtil(Node root){
        Vector<Integer> arr = new Vector<Integer>();
        int i = -1;
        inorderTraversal(root, arr);
        BSTToMaxHeap(root, arr);
    }

    static void postorderTraversal(Node root){
        if (root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void showTrunks(Trunk p)
    {
        if (p == null) {
            return;
        }
 
        showTrunks(p.prev);
        System.out.print(p.str);
    }
 
    public static void printTree(Node root, Trunk prev, boolean isLeft){
        if (root == null) {
            return;
        }
        String prev_str = "    ";
        Trunk trunk = new Trunk(prev, prev_str);
        printTree(root.right, trunk, true);
        if (prev == null) {
            trunk.str = "---";
        }
        else if (isLeft) {
            trunk.str = ".---";
            prev_str = "   |";
        }
        else {
            trunk.str = "`---";
            prev.str = prev_str;
        }
        showTrunks(trunk);
        System.out.println(" " + root.data);
        if (prev != null) {
            prev.str = prev_str;
        }
        trunk.str = "   |";
        printTree(root.left, trunk, false);
    }

    public static void main(String[] args) throws Exception {
        Node root = getNode(4);
        root.left = getNode(2);
        root.right = getNode(6);
        root.left.left = getNode(1);
        root.left.right = getNode(3);
        root.right.left = getNode(5);
        root.right.right = getNode(7);

        printTree(root, null, false);
        convertToMaxHeapUtil(root);
        System.out.print("Postorder Traversal of Tree:" +"\n");
        postorderTraversal(root);
    }
}