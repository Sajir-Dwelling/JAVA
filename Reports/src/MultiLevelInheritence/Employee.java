package MultiLevelInheritence;

public class Employee extends Person{
    double salary; 
    
    public Employee(String name,int age,String designation, double salary ){
        super(name,age,designation);
        this.salary = salary;
    }
    
    void display_info2(){
        super.dsiplay_info1();
        System.out.println("Salary = "+salary);    
    }   
}
