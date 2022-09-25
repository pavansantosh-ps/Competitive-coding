import java.util.ArrayList;

class Node{
    int data;
    Node left, right;
  
    Node(int item){
        data = item;
        left = right = null;
    }
}

public class Main {

    Node root;
    Node root1;

    Main() { 
        root = null; 
        root1 = null;
    }

    public static void main(String[] args) throws Exception {
        Main tree = new Main();
        tree.root = new Node(3);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.left.right.left  = new Node(1);
        tree.root.left.right.right  = new Node(2);
        tree.root.right.left.left  = new Node(2);
        tree.root.right.left.right  = new Node(1);

        ArrayList<Integer> a = new ArrayList<>();
        inOrder(tree.root,a);

        for(int i = 0 ;i < a.size();i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");

        if(checkPalindrom(a)){
            System.out.println("The given tree is aPalindromic tree");
        }else{
            System.out.println("The given tree is not a Palindromic tree");
        }

        tree.root1 = new Node(3);
        tree.root1.left = new Node(1);
        tree.root1.right = new Node(1);
        tree.root1.left.left = new Node(1);
        tree.root1.left.right = new Node(2);
        tree.root1.right.left = new Node(1);
        tree.root1.right.right = new Node(2);

        ArrayList<Integer> b = new ArrayList<>();
        inOrder(tree.root1,b);

        for(int i = 0 ;i < b.size();i++){
            System.out.print(b.get(i) + " ");
        }
        System.out.println("");

        if(checkPalindrom(b)){
            System.out.println("The given tree is aPalindromic tree");
        }else{
            System.out.println("The given tree is not a Palindromic tree");
        }        
    }

    private static boolean checkPalindrom(ArrayList<Integer> a) {
        int n = a.size();
        for(int i = 0;i < n/2;i++){
            if(a.get(i) != a.get(n - 1 - i)){
                return false;
            }
        }

        return true;
    }

    private static void inOrder(Node root, ArrayList<Integer> a) {
        if(root == null){
            return;
        }

        inOrder(root.left,a);

        a.add(root.data);

        inOrder(root.right,a);
    }
}
