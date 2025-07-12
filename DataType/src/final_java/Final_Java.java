
package final_java;

public class Final_Java {

    
    public static void main(String[] args) {
        final int min_value = 0;
        final int max_value = 100;
        final double Pi = 3.1416;
        
        //The values cant be typecasted, cause it is declared as final;
        
        System.out.println("Minimum Value: "+min_value);
        System.out.println("Maximum Value: "+max_value);
        System.out.println("Pi value: "+Pi);
    }
    
}
