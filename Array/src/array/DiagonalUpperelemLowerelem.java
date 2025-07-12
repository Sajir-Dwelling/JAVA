
package array;
import java.util.Scanner;
public class DiagonalUpperelemLowerelem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3]; 
        int SumOfDiagonalElements = 0;
        int SumOfUpperElements = 0;
        int SumOfLowerElements = 0;
        
        //Getting input for A matrix
        System.out.println("Give input for A matrix: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("A[%d][%d] : ",row,col);
                A[row][col] = input.nextInt();
            }
        }
        
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if(row==col){
                    SumOfDiagonalElements+=A[row][col];
                }
                
                if(row<col){
                    SumOfUpperElements+=A[row][col];
                }
                
                if(row>col){
                    SumOfLowerElements+=A[row][col];
                }
            }
        }
        
        System.out.println("Sum of Diagonal Elements: "+SumOfDiagonalElements);
        System.out.println("Sum of Upper Triangle Elements: "+SumOfUpperElements);
        System.out.println("Sum of Lower Triangle Elements: "+SumOfLowerElements);
    }
}
