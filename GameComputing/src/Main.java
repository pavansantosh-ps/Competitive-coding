import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of games happened");
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        System.out.println("Enter the total points in each game of A");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the total points in each game of B");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }
        int aScore = 0,bScore = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] == B[i]){
                aScore++;
                bScore++;
            }else if(A[i] > B[i]){
                aScore++;
            }else{
                bScore++;
            }
        }

        if(aScore == bScore){
            System.out.println("Both A and B are the winners with same points");
        }else if(aScore > bScore){
            System.out.println("A is the winner since A has more points than B");
        }else{
            System.out.println("B is the winner since B has more points than A");
        }
        
        sc.close();
    }
}
