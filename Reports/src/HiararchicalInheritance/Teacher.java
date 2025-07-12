package HiararchicalInheritance;

public class Teacher extends Person{
    Teacher(String name, String designation){
        super(name,designation);
    }
    
    void display_info2(){
        super.display1();
    }
}
