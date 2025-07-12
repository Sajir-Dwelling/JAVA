package takeinput;
import java.util.Scanner;

public class Input {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int num;
    
    System.out.print("Enter any integer number: ");
    num = input.nextInt();
    
    System.out.println("Number: "+num);
    
    }
  
}
