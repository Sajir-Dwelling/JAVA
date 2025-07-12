
package reports;

public class Car {
        String name;
        String model;
        int year;
    
    public Car(String name,String model, int year){
        this.name = name;
        this.model = model;
        this.year = year;
    }
        
        void start(){
        System.out.println("Start the engine.");
    }
        
    void stop(){
        System.out.println("Stop the car.");
    }
    
    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
    
    public static void main(String[] args) {
        Car cr = new Car("Marcedes","Mercedes-Benz EQB",2021);
        cr.displayDetails();
        cr.start();
        cr.stop();
    }
}
