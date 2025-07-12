package super_key;

public class Car extends Vehicle{
    int gear;
    
    public Car(String name,String color,double weight,int gear){
        //Using super keyword to call the parent constructor
        super(name,color,weight);
        this.gear = gear;
    }
    
    public void display1(){
        //Using super keyword to call the parent method
        super.display();
        System.out.println("Number of gear: "+gear);
        System.out.println();

    }
}
