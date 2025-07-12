package mathprograme;

public class MathPrograme {

    public static void main(String[] args) {
      int a = 4;
      int b = 2;
      int c = -5;
      
      int max = Math.max(a, b);
        System.out.println("Maximum: "+max);
        
      int min = Math.min(a, b);
        System.out.println("Minimum: "+min);
        
      int absolute = Math.abs(c);
        System.out.println("Absolute: "+absolute);
        
      int round = Math.round(5.7f);
        System.out.println("Round: "+round);
      
      int power = (int) Math.pow(a, b);
        System.out.println("a to the power b is: "+power);
        
      double pi = Math.PI;
        System.out.println("PI: "+pi);
    }   
}
