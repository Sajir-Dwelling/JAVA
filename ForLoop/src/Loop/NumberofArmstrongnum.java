
package Loop;
import java.util.Scanner;
public class NumberofArmstrongnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,i,r,sum=0,temp,count=0;
        
        System.out.print("Enter the initial number: ");
        m = input.nextInt();
        
        System.out.print("Enter the final number: ");
        n = input.nextInt();
        
        for(i = m ; i<=n ; i++)
        {
            temp = i;
            while(temp!=0)
            {
                r = temp%10;
                sum+= Math.pow(r,3);
                temp = temp/10;
            }
        
            if(sum==i)
            {
                System.out.println(" "+i);
                count++;
            }
            sum = 0;
        }
        System.out.println("The number of Armstrong number from "+m+" to "+n+" is: "+count); 
    }
}
