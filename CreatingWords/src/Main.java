import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String dict[] = {"ABCE","ESFC","XDEE"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the created word");
        for(int i = 0;i < n ;i++){
            String createdWord = sc.nextLine();
            if(checkFor(createdWord,dict,0) && checkFor(createdWord,dict,1) && checkFor(createdWord,dict,2)){
                System.out.println(createdWord + " : " + 1);
            }else{
                System.out.println(createdWord + " : " + 0);
            }
        }
        sc.close();
    }

    private static boolean checkFor(String createdWord, String[] dict, int r) {
        char[] Array = createdWord.toCharArray();
        int flag = 0;
        for(int i = 0;i < createdWord.length();i++){
            if(dict[r].contains(Character.toString(Array[i]))){
                flag++;
            }
        }
        if(flag != 0 ){
            return true;
        }
        return false;
    }
}
