package super_key;

public class Bike extends Vehicle{
    int tire;
    
    public Bike(String name,String color,double weight,int tire){
        //Using super keyword to call the parent constructor
        super(name,color,weight);
        this.tire = tire;
    }
    
    public void display2(){
        //Using super keyword to call the parent method
        super.display();
        System.out.println("Number of tire: "+tire);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Car c = new Car("Marcedes","Black",3759,8);
        Bike b = new Bike("Royal Enfield","Golden",429.901,4);
        
        c.display1();
        b.display2();
    }
}
