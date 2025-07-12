package PolyMorphism.RunTime;

public class Teacher extends Person{
    
    int age;
    
    Teacher(String name,String designation,int age){
        super(name,designation);
        this.age = age;
    }
    
    @Override
    void display_info(){
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println("Age: "+age);
    }
    
    public static void main(String[] args) {
        Teacher t = new Teacher("MD Sajir Wasee","Teacher",31);
        t.display_info();
    }
}
