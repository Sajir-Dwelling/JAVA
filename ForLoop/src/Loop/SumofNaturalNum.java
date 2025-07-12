package Loop;
import java.util.Scanner;
 
public class SumofNaturalNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        int sum = 0;
        
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        
        for(i = 1; i<=n ; i++)
        {
            System.out.print(" "+i);
            sum = sum+i;
        }
        
        System.out.println("\nSum: "+sum);
    }
}
