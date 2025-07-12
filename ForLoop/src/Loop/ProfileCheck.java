
package Loop;
import java.util.Scanner;
public class ProfileCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int password;

        while(true)
        {
            System.out.print("Enter the username: ");
            username = input.nextLine();
        
            System.out.print("Enter the password: ");
            password = input.nextInt();
            
            if(username.equals("anis") && password == 123456)
            {
                System.out.println("Welcome to the system.");
                break;
            }
            
            else
            {
                System.out.println("Username and Password are incorect. Please try again.");
            }        
        }
    }
}
    
        



