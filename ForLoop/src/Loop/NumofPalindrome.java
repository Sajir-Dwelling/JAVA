package Loop;
import java.util.Scanner;
public class NumofPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,r,sum=0,temp,i,count=0;
        
        System.out.print("Enter the initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter the final number: ");
        n = input.nextInt();
        
        for(i=m ; i<=n; i++)
        {
            temp = i;
            while(temp!=0)
            {
                r = temp%10;
                sum = sum*10 + r;
                temp = temp/10;
            }
            
            if(sum==i)
            {
                System.out.println(" "+i);
                count++;
            }
            sum = 0;
        }
        System.out.println();
        System.out.println("Total number of palindrome from "+m+" to "+n+" is: "+count);
    }
}
    



