
package SuperKeyWord;

public class Bike extends Vehicle{
    int tire;
    
    Bike(String n, double w, int t){
        super(n,w);
        this.tire = t;
    }
    
    @Override
    void attributes(){
        super.attributes();
        System.out.println("Number of tires: "+tire);
    }
}
