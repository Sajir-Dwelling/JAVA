
package array;

public class AssignedRowCol {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        int k = 0;
        
        //Asigning Values
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        
        //Printing the matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+arr[i][j]);
            }           
        System.out.println();
        }
    }
}
