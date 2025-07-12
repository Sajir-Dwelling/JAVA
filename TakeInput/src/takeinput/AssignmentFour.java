
package takeinput;
import java.util.Scanner;

public class AssignmentFour {

    public static void main(String[] args) {
        int phoneprice = 1800;
        System.out.println("Phone Price: "+phoneprice);
        
        Scanner input = new Scanner(System.in);
        int number_of_installment, installment_per_month;
        
        System.out.print("Enter the number of installment : ");
        number_of_installment = input.nextInt();
        
        installment_per_month = phoneprice/number_of_installment;
        
        System.out.println("Your per month installment: " +installment_per_month+ " euros");
    }
    
}
