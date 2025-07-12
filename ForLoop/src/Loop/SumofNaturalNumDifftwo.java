
package Loop;
import java.util.Scanner;
public class SumofNaturalNumDifftwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        int sum=0;
        
        System.out.print("Enter the number of terms: ");
        n = input.nextInt();
        
        for(i = 1; i<=n ; i = i+2){
            System.out.print(" "+i); // i + "X" + i+" ";
            sum = sum+i; //for 1^2 + 2^2 + 3^3 +........+n^2 just put sum = sum + i*i
        
        }
        
        System.out.println("\nSum: "+sum);
    }
}
