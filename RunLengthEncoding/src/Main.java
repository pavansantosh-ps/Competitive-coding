import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be encoded");
        String s = sc.nextLine();
        String result = "";
        int n = s.length();
        int i = 0;
        while(i < n){
            int count = 0;
            char a = s.charAt(i);
            int j = i;
            while(j < n && s.charAt(j) == a){
                count++;
                j++;
            }
            result = result + String.valueOf(a) + String.valueOf(count);
            i = i + count;
        }
        System.out.println("String after encoding");
        System.out.println(result);

        sc.close();
    }
}
