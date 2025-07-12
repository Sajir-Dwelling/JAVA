
package Loop;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,i;
        int count = 0;
        
        System.out.print("Enter a postive number: ");
        num = input.nextInt();
        
        if(num==0 || num==1)
        {
            System.out.println("Not Prime Number!");
        }
        
        else{
            for(i = 2 ; i<num ; i++)
            {
                if(num%2==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
        {
            System.out.println("Prime Number!");
        }
        
        else
        {
            System.out.println("Not Prime Number!");
        }
        }
        
    }
}
