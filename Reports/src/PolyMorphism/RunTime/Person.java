
package PolyMorphism.RunTime;

public class Person {
    String name;
    String designation;
    
    Person(String name,String designation){
        this.name = name;
        this.designation = designation;
    }
    
    void display_info(){
        System.out.println("Name: "+name);
        System.out.println("Designation: "+designation);
        System.out.println();
    }
}
