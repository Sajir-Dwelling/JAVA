package HiararchicalInheritance;

public class Student extends Person{
    Student(String name,String designation){
        super(name,designation);
    }
    
    void display_info3(){
        super.display1();
    }
    
    public static void main(String[] args) {
        Teacher t = new Teacher("Zahidul Islam","Teacher");
        t.display_info2();
        
        Student st = new Student("MD Sajir Wasee","Student");
        st.display_info3();
        
    }
}
