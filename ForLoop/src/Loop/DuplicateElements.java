
package Loop;
import java.util.Scanner;
public class DuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("String: "+input);
        
        String result = "";
        for(int i = 0; i<input.length(); i++)
        {
            String ch = ""+input.charAt(i);
            if(result.contains(ch))
            {
                continue;
            }
            result+=ch;
        }
        System.out.println(result);
        scanner.close();
    }
}
