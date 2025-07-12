
package defaultvalues;

public class DefaultValues {

    byte b;
    short s;
    long l;
    int i;
    float f;
    double d;
    
    
    public static void main(String[] args) {
        
        DefaultValues dv = new DefaultValues();
        
        System.out.println("Default value of byte = "+dv.b);
        System.out.println("Default value of short = "+dv.s);
        System.out.println("Default value of long = "+dv.l);
        System.out.println("Default value of integer = "+dv.i);
        System.out.println("Default value of float = "+dv.f);
        System.out.println("Default value of double = "+dv.d);
        
    }
    
}
