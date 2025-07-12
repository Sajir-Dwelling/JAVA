package SuperMethod;

public class B extends A {
    @Override
    void display(){
        super.display();
        System.out.println("Access to class B");
    }
}
