import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to rotate");
        String A = sc.nextLine();
        String B = A.substring(1) + A.substring(0,1);
        System.out.println();
        System.out.println("The rotated string is: "+ B);
        sc.close();
    }
}
