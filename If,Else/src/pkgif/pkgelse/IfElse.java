
package pkgif.pkgelse;
import java.util.Scanner;


public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        
        System.out.print("Enter the value of age : ");
        age = input.nextInt();
        System.out.println("Age: "+age);
        
        if(age>=18)
        {
            System.out.println("Valid Voter");
        }
        
        else{
            System.out.println("Invalid voter");
        }
    }
    
}
