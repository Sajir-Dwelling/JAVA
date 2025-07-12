public class Super1 extends Super{
    double weight;
    
    public Super1(String name,int age,double salary, double weight){
        super(name,age,salary);
        this.weight = weight;
    }
    
    public void display1(){
        super.display();
        System.out.println("Weight: "+weight);
    }
}
