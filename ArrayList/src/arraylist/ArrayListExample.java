package arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size: "+number.size());
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3 , 40);
        
        //System.out.println(number);
        for(int x : number){
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Size: "+number.size());
        
        boolean x = number.isEmpty();
        System.out.println(x);
        
        boolean y = number.contains(20);
        System.out.println(y);
        
        int z = number.indexOf(30);
        System.out.println(z);
        
        number.set(3, 60);
        System.out.println(number);
        
        int w = number.get(0);
        System.out.println("Value of index 0 = "+w);
        
        System.out.println();
        
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        System.out.println("Size: "+number1.size());
        
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(4, 5);
        System.out.println(number1);
        number1.remove(2);
        System.out.println("After removing : "+number1);
        number1.removeAll(number1);
        System.out.println("After removing all: "+number1);
        System.out.println("Size: "+number1.size());
        
        
        
    }
}
