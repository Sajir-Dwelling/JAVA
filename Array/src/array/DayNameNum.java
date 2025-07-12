
package array;
import java.util.Scanner;
public class DayNameNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter day number(1-7): ");
        n = input.nextInt();
        String[] day = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Satarday"};
        
        for (int i = 0; i < day.length ; i++) {
            if(n == i+1){
                System.out.println(day[i]);
            }
        }
    }
}
