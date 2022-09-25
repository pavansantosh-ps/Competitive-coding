import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void reverse(int Array[],int N){
        int reversedArray[] = new int[N];
        int middle,l_max,r_min;
        middle = N/2;
        if(N % 2 == 0)
        {
            l_max = middle - 1;
            r_min = middle;
        }else{
            l_max = middle - 1;
            r_min = middle + 1;
            reversedArray[middle] = Array[middle];
        }
        int i = 0;
        while (l_max >= 0){
            reversedArray[i] = Array[l_max];
            l_max--;
            i++;
        }
        int len = N - 1;
        while (r_min < N){
            reversedArray[len] = Array[r_min];
            len--;
            r_min++;
        }

        System.out.println("Array after reversing"); 
        System.out.println(Arrays.toString(reversedArray));

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("I.Pavan Santosh"+"\n 19BCE7237"); 
        System.out.println("Enter the size of the array"); 
        int N = sc.nextInt(); 
        int Array[] = new int[N]; 
        System.out.println("Enter the elements of the array"); 
        for(int i = 0;i < N;i++){ 
            Array[i] = sc.nextInt(); 
        }
         
        System.out.println("Array before reversing"); 
        System.out.println(Arrays.toString(Array));

        reverse(Array, N);

        sc.close();
    }
}
