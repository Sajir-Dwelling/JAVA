
package Loop;


public class ForLoop {

   
    public static void main(String[] args) {
        int i;
        int sum=0;
        
        for(i=1 ; i<=10 ; i++)
        {
            System.out.println(i);
            sum = sum+i;        
        }
        
        System.out.println("Sum: "+sum);
    }
    
}
