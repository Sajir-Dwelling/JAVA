package SuperKeyWord;

public class Vehicle {
    String name;
    double weight;
    
    Vehicle(String n, double w){
        this.name = n;
        this.weight = w;       
    }
    
    void attributes(){
        System.out.println("Name : "+name);
        System.out.println("Weight : "+weight);
    }
}
