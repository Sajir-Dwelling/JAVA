
package Loop;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();


        String str2 = new StringBuilder(str1).reverse().toString();


        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);


        if (str1.equals(str2)) 
        {
            System.out.println("Palindrome");
        } 
        else 
        {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
