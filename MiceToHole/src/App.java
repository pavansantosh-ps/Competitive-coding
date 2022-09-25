import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rabbits");
        int n = sc.nextInt();
        System.out.println("Enter the position of the Rabbits");
        int[] rabbits = new int[n];
        for(int i = 0;i < n;i++){
            rabbits[i] = sc.nextInt();
        }
        System.out.println("Enter the no of holes");
        int m = sc.nextInt();
        System.out.println("Enter the position of the holes");
        int[] holes = new int[m];
        for(int i = 0;i < n;i++){
            holes[i] = sc.nextInt();
        }
        System.out.println("Last Rabbit gets assigned into the hole in " + assignHoles(rabbits,holes,n,m) + " minutes");
        sc.close();
    }

    private static int assignHoles(int[] rabbits, int[] holes, int n, int m) {
        if(m != n){
            return -1;
        }

        Arrays.sort(rabbits);
        Arrays.sort(holes);

        int max = 0;
        for(int i = 0;i < n;i++){
            if(max < Math.abs(rabbits[i] - holes[i])){
                max = Math.abs(rabbits[i] - holes[i]);
            }
        }
        return max;
    }
}
