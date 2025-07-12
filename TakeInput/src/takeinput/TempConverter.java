package takeinput;
import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,f;
        System.out.print("Enter the value of Centigrade: ");
        c = input.nextDouble();
        System.out.print(c+ " Centigrade");
        
        f = 1.8*c + 32;
        System.out.println("\n"+f+ " Fahrenheit");
    }
}
