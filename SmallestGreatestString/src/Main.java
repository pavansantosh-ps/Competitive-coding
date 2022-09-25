import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines of Strings");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the values of each line");
        String A[] = new String[N];
        for(int i = 0 ;i < N;i++){
            A[i] = sc.nextLine();
        }
        String greatest = "",smallest = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i < N;i++){
            if(min == A[i].length()){
                if(smallest.compareTo(A[i]) > 0){
                    smallest = A[i];
                }
            }

            if(max == A[i].length()){
                if(greatest.compareTo(A[i]) < 0){
                    greatest = A[i];
                }
            }

            if(min > A[i].length()){
                min = A[i].length();
                smallest = A[i];
            }

            if(max < A[i].length()){
                max = A[i].length();
                greatest = A[i];
            }
        }
        System.out.println();
        System.out.println("The smallest String is: " + smallest);
        System.out.println("The greatest String is: " + greatest);
        sc.close();
    }
}
