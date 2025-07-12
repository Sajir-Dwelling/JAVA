
package array;
import java.util.Scanner;

public class ArrayInpSumAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " numbers: ");
        
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        
        double avg = (double)sum/n;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        
    } 
}
