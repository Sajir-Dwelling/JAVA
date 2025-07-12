package Exception;

public class Exception {
    public static void main(String[] args) {
    try{
        int x = 10;
        int y = 0;
        int z = x/y;
    }
    
    catch(ArrayIndexOutOfBoundsException e1){
        System.out.println("Exception: "+e1);
    }
    
    catch(StringIndexOutOfBoundsException e2){
        System.out.println("Exception: "+e2);
    }
       
    catch(NullPointerException e3){
        System.out.println("Exception: "+e3);
    }
    
    catch(ArithmeticException e4){
        System.out.println("Exception: "+e4);
    }
    
    finally{
        System.out.println("Final Statement.");
    }
  }
}
