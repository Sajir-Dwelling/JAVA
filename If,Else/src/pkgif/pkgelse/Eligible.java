
package pkgif.pkgelse;
import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch1,ch2;
        System.out.print("Have you completed your master's degree?(y/n): ");
        ch1 = input.next().charAt(0);
        
        System.out.print("Are you fluent in english skill?(y/n): ");
        ch2 = input.next().charAt(0);
        
        
        if(ch1=='y'&&ch2=='y')
        {
            System.out.println("Your are eligible for the job");
        }
        
        else
        {
            System.out.println("Sorry, you are not eligible for the job");
        }        
    }
}
