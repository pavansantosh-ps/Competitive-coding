

public class App {
    public static void main(String[] args) throws Exception {
        
        int i = 2;
        int []a = new int[]{4,1,3,9,2};
        int j = 0;
        int out = 0;
        while(j < a.length){
            if(a[i] > a[j]){
                out += a[j];
            }
            if(a[i] <= a[j] && i < j){
                out += a[i] - 1;
            }
            if(a[i] <= a[j] && i > j){
                out += a[i];
            }
        }

        System.out.println(out);
    }
}
