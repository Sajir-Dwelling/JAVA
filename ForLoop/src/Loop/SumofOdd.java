
package Loop;
import java.util.Scanner;

public class SumofOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n;
        int sum=0;
        
        System.out.print("Enter the starting number: ");
        m = input.nextInt();
        
        System.out.print("Enter the finishing number: ");
        n = input.nextInt();
        
        if(m>n){
            System.out.println("Error!Please try again.");
            
        }
        
        else
        {
            for (int i = m;  i<=n; i++) {
                if(i%2==0){
                continue;
                }
                
                else{
                sum = sum+i;
                }
            }
            System.out.println("Sum of odd numbers: "+sum);
        }
        
        
    }
}
