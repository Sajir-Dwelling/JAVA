package reports;

public class A {
    final int a = 20;
    final void value(){
        System.out.println("Value: "+a);
    }
    
    public static void main(String[] args) {
        A a = new A();
        a.value();
    }
}
