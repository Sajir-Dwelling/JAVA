package EnCapsulation;

public class Person {
    private String name;
    private int age;
    private double salary;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("MD Sajir Wasee");
        p.setAge(21);
        p.setSalary(150000);
        
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getSalary());
    }
}
