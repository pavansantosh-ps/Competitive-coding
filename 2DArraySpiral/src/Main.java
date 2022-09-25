import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: n , m");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the values of the matrix");
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the order of printing \n 1)Clockwise\n 2)AntiClockwise ");
        int condition = sc.nextInt();
        printSpiralOrder(matrix,condition);
        sc.close();
    }

    private static void printSpiralOrder(int[][] mat, int condition){
        if(condition == 1){
            if (mat == null || mat.length == 0) {
                return;
            }
     
            int top = 0, bottom = mat.length - 1;
            int left = 0, right = mat[0].length - 1;
            System.out.println("Clockwise print of the matrix is: ");
            while(true){
                if (left > right) {
                    break;
                }

                for(int i = left; i <= right;i++){
                    System.out.print(mat[top][i] + " ");
                }
                top++;

                if(top > bottom){
                    break;
                }

                for(int i = top;i <= bottom;i++){
                    System.out.print(mat[i][right] + " ");
                }
                right--;

                if (left > right) {
                    break;
                }

                for(int i = right; i >= left;i--){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;

                if(top > bottom){
                    break;
                }

                for(int i = bottom;i >= top;i--){
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }else if(condition == 2){
            if (mat == null || mat.length == 0) {
                return;
            }
     
            int top = 0, bottom = mat.length - 1;
            int left = 0, right = mat[0].length - 1;
            System.out.println("AntiClockwise print of the matrix is: ");
            while(true){
                if(top > bottom){
                    break;
                }

                for(int i = top;i <= bottom;i++){
                    System.out.print(mat[i][left] + " ");
                }
                left++;

                if (left > right) {
                    break;
                }

                for(int i = left; i <= right;i++){
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;

                if(top > bottom){
                    break;
                }

                for(int i = bottom;i >= top;i--){
                    System.out.print(mat[i][right] + " ");
                }
                right--;

                if (left > right) {
                    break;
                }

                for(int i = right; i >= left;i--){
                    System.out.print(mat[top][i] + " ");
                }
                top++;                
            }
        }
    }
}
