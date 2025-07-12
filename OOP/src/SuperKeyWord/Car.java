package SuperKeyWord;

public class Car extends Vehicle{
    int gear;
    
    Car(String n , double w, int g){
        super(n,w);
        this.gear = g;
    }
    
    @Override
    void attributes(){
        super.attributes();
        System.out.println("Gear: "+gear);
        System.out.println();
    }
}
