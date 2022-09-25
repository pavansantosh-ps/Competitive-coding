import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    Node(int item){
        data = item;
        left = right = null;
    }
}

public class Main{
    Node root;
    Node buildTree(int inorder[], int start, int end, Node node)
    {
        if (start > end){
            return null;
        }
        int i = max(inorder, start, end);
        node = new Node(inorder[i]);
        if (start == end){
            return node;
        }
        node.left = buildTree(inorder, start, i - 1, node.left);
        node.right = buildTree(inorder, i + 1, end, node.right);
        return node;
    }
  
    int max(int arr[], int strt, int end){
        int i, max = arr[strt], maxind = strt;
        for (i = strt + 1; i <= end; i++){
            if (arr[i] > max){
                max = arr[i];
                maxind = i;
            }
        }
        return maxind;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs:");
        int n = sc.nextInt();
        System.out.println("Enter the inorder array of tree inputs");
        int inorder[] = new int[n];
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
        }
        Main tree = new Main();
        Node mynode = tree.buildTree(inorder, 0, n - 1, tree.root);
        int max = tree.findMax(mynode);
        System.out.println("The maximum value of the node key of given tree is: "+ max);
        sc.close();
    }

    private int findMax(Node root2) {
        if(root2 == null){
            return -1;
        }
        int res = root2.data;
        int lres = findMax(root2.left);
        int rres = findMax(root2.right);
        if(lres > res){
            res = lres;
        }
        if(rres > res){
            res = rres;
        }
        return res;
    }

}
