
package Loop;
import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,r,temp;
        int sum = 0;
        
        System.out.print("Enter some digits: ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp!=0){
        r = temp%10;
        sum = sum + r*r*r;
        temp = temp/10;
        }
        
        if(sum==num)
        {   
            System.out.println("Armstrong Number!");
        }
        
        else
        {
            System.out.println("Not Armstrong Number!");
        }
    }
}
