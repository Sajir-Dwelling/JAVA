package InterFace;

public class Duck implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Duck can fly.");
    }
    
    @Override
    public void swim(){
        System.out.println("Duck can swim.");
    }
    
    public static void main(String[] args) {
        Duck du = new Duck(); 
        du.fly();
        du.swim();
    }
}
