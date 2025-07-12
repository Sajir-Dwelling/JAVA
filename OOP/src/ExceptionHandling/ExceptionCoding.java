
package ExceptionHandling;

public class ExceptionCoding {
    public static void main(String[] args) {
        
    try{
        int x = 10;
        int y = 0;
        int z = x/y;
        System.out.println(z);
        }
    catch(ArrayIndexOutOfBoundsException e1){
        System.out.println("Exception: "+e1);
    }
    catch(ArithmeticException e2){
        System.out.println("Exception: "+e2);
    }
    finally{
        System.out.println("Final statement.");
    }
   }
}
