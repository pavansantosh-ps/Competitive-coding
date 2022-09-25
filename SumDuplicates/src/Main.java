import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("I.Pavan Santosh"+"\n 19BCE7237");
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int Array[] = new int[N];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < N; i++){
            Array[i] = sc.nextInt();
        }
        Arrays.sort(Array);
        int sum = 0;
        for(int j = 0;j < N-1; j++){
            if(Array[j] == Array[j+1]){
                sum = sum + Array[j];
            }
        }
        System.out.println("Sum of all Duplicates is : ");
        System.out.println(sum);

        sc.close();
    }
}
