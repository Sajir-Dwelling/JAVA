
package Loop;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i,n,result=1;
        System.out.print("Enter a factorial number : ");
        n = input.nextInt();
        
        for(i=n ; i>=1 ; i--)
        {
            result = result*i;
        }
        
        System.out.println("Factorial value is : "+result);
    }
        
}

