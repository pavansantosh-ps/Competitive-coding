import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String S = sc.nextLine();
        System.out.println();
        System.out.println("Enter the number of elements in the string Array");
        int wordCount = sc.nextInt();
        System.out.println();
        sc.nextLine();
        System.out.println("Enter the words");
        String Words[] = new String[wordCount];
        for(int i = 0;i < wordCount;i++){
            Words[i] = sc.nextLine();
        }
        System.out.println();
        int wordSize = Words[0].length();
        ArrayList<Integer> Result = findSubString(S,Words,wordCount,wordSize);
        System.out.println(Result);
        sc.close();
    }

    private static ArrayList<Integer> findSubString(String s, String[] words, int wordCount, int wordSize) {
        int parseSize = wordCount * wordSize;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int n = s.length();
        if(parseSize > n){
            return res;
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String word:words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for(int i = 0; i < n - parseSize;i++){
            HashMap<String,Integer> temp = (HashMap<String, Integer>) map.clone();
            int j = i,count = wordCount;
            while(j < i + parseSize){
                String word = s.substring(j, j + wordSize);
                if(!map.containsKey(word) || temp.get(word) == 0){
                    break;
                }else{
                    temp.put(word, temp.get(word) - 1);
                    count --;
                }
                j += wordSize;
            }
            if(count == 0){
                res.add(i);
            }
        }
        return res;
    }
}
