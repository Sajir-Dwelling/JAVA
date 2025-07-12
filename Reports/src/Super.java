public class Super {
    String name;
    int age;
    double salary;
    
    public Super(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    
    }
}
