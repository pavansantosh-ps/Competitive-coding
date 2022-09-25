import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("I.Pavan Santosh"+"\n 19BCE7237");
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        int Array[] = new int[N];
        int temp[] = new int[N];
        System.out.println("Enter the elements of the array");
        for(int i = 0;i < N;i++){
            Array[i] = sc.nextInt();
        }
        for(int i = 0;i < N;i++){
            temp[i] = Array[i];
        }
        System.out.println("Enter number of left rotations");
        int K = sc.nextInt();

        System.out.println("Array before rotation");
        System.out.println(Arrays.toString(temp));

        for(int i = 0;i < N;i++){
            Array[(i + N - (K % N)) % N] = temp[i];
        }
        
        System.out.println("Array after rotation");
        System.out.println(Arrays.toString(Array));

        sc.close();
    }
}
