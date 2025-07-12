
package takeinput;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base,height,area;
        
        System.out.print("Enter a base value : ");
        base = input.nextInt();
        System.out.print("Base : "+base);
        
        System.out.print("\nEnter a height value : ");
        height = input.nextInt();
        System.out.print("Height : "+height);
        
        area = 0.5*base*height;
        System.out.println("\nArea : "+area);
    }    
}
