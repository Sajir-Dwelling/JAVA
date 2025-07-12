
package pkgif.pkgelse;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer number : ");
        num = input.nextInt();
        System.out.println("Number: "+num);
        
        if(num%2==0)
        {
            System.out.println("Even");
        }
        
        else
        {
            System.out.println("Odd");
        }
    }
    
}
