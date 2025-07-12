package pkgif.pkgelse;
import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Enter the decimal value of a = ");
        a = input.nextInt();
        
        System.out.print("Enter the decimal value of b = ");
        b = input.nextInt();
        
        c = a&b;
        System.out.println("a&b = "+c);
        
        c = a|b;
        System.out.println("a|b = "+c);
        
        c = a^b;
        System.out.println("a^b = "+c);
        
        c = a>>3;
        System.out.println("a>>3 = "+c);
        
        c = a<<3;
        System.out.println("a<<3 = "+c);
    }
}
