
package array;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        int[][] result = new int[10][10];
        int r1, r2, c1, c2, i, j, k, sum = 0;

        System.out.print("Enter the number of rows and columns for A matrix: ");
        r1 = scanner.nextInt();
        c1 = scanner.nextInt();

        System.out.print("Enter the number of rows and columns for B matrix: ");
        r2 = scanner.nextInt();
        c2 = scanner.nextInt();

        while (c1 != r2) {
            System.out.println("\nError, enter a valid matrix! Column of A matrix and row of B matrix are not equal.");

            System.out.print("Enter the number of rows and columns for A matrix: ");
            r1 = scanner.nextInt();
            c1 = scanner.nextInt();

            System.out.print("Enter the number of rows and columns for B matrix: ");
            r2 = scanner.nextInt();
            c2 = scanner.nextInt();
        }

        // Scanning elements of A matrix
        System.out.println("Give input for A matrix:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Scanning elements of B matrix
        System.out.println("Give input for B matrix:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Multiplying Matrix
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                sum = 0;
                for (k = 0; k < c1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                result[i][j] = sum;
            }
        }

        // Printing A matrix
        System.out.println("\nA = ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Printing B matrix
        System.out.println("\nB = ");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Printing the result
        System.out.println("\nResult = ");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
