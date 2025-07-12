
package switchcase;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.print("Enter an option from 1-3: ");
        option = input.nextInt();
        
        switch(option){
        
            case 1:
                System.out.println("Bangla");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            default:
                System.out.println("English");
                
        }
    }
    
}
