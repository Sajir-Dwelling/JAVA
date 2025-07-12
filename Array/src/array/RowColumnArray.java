
package array;
import java.util.Scanner;
public class RowColumnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.print("Enter the number of rows and columns: ");
        row = input.nextInt();
        col = input.nextInt();
        
        int[][] A = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.print("\nA : ");
        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print("\t"+A[i][j]);
            }
        }
        System.out.println();
        
    }
}
