
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(45);
        number.add(27);
        number.add(24);
        number.add(90);
        number.add(-3);
        number.add(-5);
        
        System.out.println(number);
        
        Collections.sort(number);
        System.out.println(number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println(number);
    }
}
