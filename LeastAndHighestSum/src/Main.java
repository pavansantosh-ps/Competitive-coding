import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int removeDuplicates(int arr[], int n){
        if (n == 0 || n == 1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i + 1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) throws Exception {
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
        int P = removeDuplicates(Array, N);
        int ArrayClean[] = new int[P];
        for (int i = 0; i < P; i++){
            ArrayClean[i] = Array[i];
        }
        int highestProduct = 1;
        int highestSum = 0;
        int leastProduct = 1;
        int leastSum = 0;
        for (int i = 0; i < P; i++){
            highestProduct = highestProduct * ArrayClean[i];
            highestSum = highestSum + ArrayClean[i];
        }
        leastProduct = leastProduct * ArrayClean[0] * ArrayClean[1];
        leastSum = leastSum + ArrayClean[0] + ArrayClean[1];
        System.out.println("Highest Product = " + highestProduct + " Highest Sum = " + highestSum);
        System.out.println("Least Product = " + leastProduct + " Least Sum = " + leastSum);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Part-II");
        System.out.println("Enter the shortened size of the array");
        int M = sc.nextInt();
        int highestArray[] = new int[M];
        int leastArray[] = new int[M];
        for(int i = 0; i < M; i++){
            highestArray[i] = ArrayClean[P - 1 - i];
        }
        for(int i = 0; i < M; i++){
            leastArray[i] = ArrayClean[i];
        }
        highestProduct = 1;
        highestSum = 0;
        leastProduct = 1;
        leastSum = 0;
        for (int i = 0; i < M; i++){
            highestProduct = highestProduct * highestArray[i];
            highestSum = highestSum + highestArray[i];
            leastProduct = leastProduct * leastArray[i];
            leastSum = leastSum + leastArray[i];
        }
        System.out.println("Highest Product = " + highestProduct + " Highest Sum = " + highestSum);
        System.out.println("Least Product = " + leastProduct + " Least Sum = " + leastSum);
        sc.close();
    }
}
