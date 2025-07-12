
package InnerOuter;

public class Test {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
