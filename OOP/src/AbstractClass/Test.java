
package AbstractClass;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;
        
        mu = new Ifaz() ;
        mu.sendmessage();
        mu.call();
        
        mu = new Iraz();
        mu.sendmessage();
    }
}
