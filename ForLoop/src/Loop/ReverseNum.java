
package Loop;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,temp,r;
        int sum = 0;
        
        System.out.print("Enter some digits: ");
        num = input.nextInt();
        temp = num;
        
        while(temp!=0){
        r = temp%10;
        sum = sum*10 + r;
        temp = temp/10;
        }   

        System.out.println("The resversed number is: "+sum);
        
    }
}
