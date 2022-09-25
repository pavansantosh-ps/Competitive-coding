import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        Stack<Integer> a = new Stack<>();
        System.out.println("Enter the elements:");
        for(int i = 0;i < n;i++){
            int b = sc.nextInt();
            a.push(b);
        }
        System.out.println("Stack before sorting:");
        System.out.println(a);
        sortStack(a);
        System.out.println("Stack after sorting:");
        System.out.println(a);
        sc.close();
    }

    private static void sortStack(Stack<Integer> a) {
        if(!a.isEmpty()){
            int x = a.pop();
            sortStack(a);
            sortedInsert(a,x);
        }
    }

    private static void sortedInsert(Stack<Integer> a, int x) {
        if(a.isEmpty() || x < a.peek()){
            a.push(x);
            return;
        }
        int b = a.pop();
        sortedInsert(a, x);
        a.push(b);
    }
}
