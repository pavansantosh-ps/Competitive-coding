import java.util.Scanner;

public class Main {
    static int MAX = 100001;

    static int minHalls(int lectures[][], int n){
        int []prefix_sum = new int[MAX];
        for (int i = 0; i < n; i++){
            prefix_sum[lectures[i][0]]++;
            prefix_sum[lectures[i][1] + 1]--;
        }
    
        int ans = prefix_sum[0];
        for (int i = 1; i < MAX; i++){
            prefix_sum[i] += prefix_sum[i - 1];
            ans = Math.max(ans, prefix_sum[i]);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of matches");
        int N = sc.nextInt();
        System.out.println("Enter the start time and end time of each match");
        int matches[][] = new int[N][2];
        for(int i = 0;i < N;i++){
            for(int j = 0 ;j < 2;j++){
                matches[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("Minimum number of grounds required : "+ minHalls(matches, N));
        sc.close();
    }
}
