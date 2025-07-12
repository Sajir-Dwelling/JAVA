
package takeinput;
import java.util.Scanner;

public class StringNameInput {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String name;
        
        System.out.print("What is your name : ");
        name = input.nextLine();
        
        System.out.println("Name : "+name);
    }
}
