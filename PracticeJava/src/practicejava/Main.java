
package practicejava;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();
        
        A.B obj2 = obj1.new B();
        obj2.config();
    }
}
