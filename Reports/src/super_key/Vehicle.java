package super_key;

public class Vehicle {
    String name;
    String color;
    double weight;
    
    public Vehicle(String name,String color,double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Weight(Pounds): "+weight);
    }
}
