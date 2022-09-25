import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string with vowels");
        String A = sc.nextLine();
        String B = A.replaceAll("[AEIOUaeiou]", "");
        System.out.println();
        System.out.println("The string with vowels removed");
        System.out.println(B);
        sc.close();
    }
}
