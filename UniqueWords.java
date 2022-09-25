import java.util.*;
public class UniqueWords
{
    public static String[] dictWords(String textInput){
        String[] input = textInput.toLowerCase().split(" ");
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i = 0;i < input.length;i++){
            if(!map.containsKey(input[i])){
                map.put(input[i],1);
            }else{
                map.put(input[i],map.get(input[i]) + 1);
            }
        }
        
        int count = 0;
        
        int k = 0;
        
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key = mapElement.getKey();
            int value = mapElement.getValue();
            if(value > 1){
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        for (Map.Entry<String,Integer> mapElement : map.entrySet()) {
            String key = mapElement.getKey();
            int value = mapElement.getValue();
            if(value > 1){
                answer[k] = key;
                k++;
            }
        }
        
        Arrays.sort(answer,String.CASE_INSENSITIVE_ORDER);  
        
        return answer;
    }
    
    
	public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	    
	    String textInput = sc.nextLine();
	    String[] result = dictWords(textInput);
	    
	    for(int idx = 0;idx<result.length - 1;idx++){
	        System.out.print(result[idx] + " ");
	    }
	    System.out.print(result[result.length - 1]);
	}
	
}
