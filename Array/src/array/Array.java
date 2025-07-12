
package array;
public class Array {

    public static void main(String[] args) {
        int[] number = new int[5];
        
        number[0] = 1; 
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        int len = number.length;
        
        System.out.println("Sum: "+sum);
        System.out.println("Array size: "+len);
    }
    
}
