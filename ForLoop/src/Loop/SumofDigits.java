
package Loop;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r,num,temp;
        int sum = 0;
        
        System.out.print("Enter some digit: ");
        num = input.nextInt();
        
        temp = num;
        while(temp!=0)
        {
            r = temp%10;
            sum = sum + r;
            temp = temp/10;
        }
        
        System.out.println("Sum of digits: "+sum);
    }
}
