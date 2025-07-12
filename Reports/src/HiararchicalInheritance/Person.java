
package HiararchicalInheritance;

public class Person {
   String name;
   String designation;
   
   Person(String name, String designation){
       this.name = name;
       this.designation = designation;
       System.out.println();
   }
   
   void display1(){
       System.out.println("Name: "+name);
       System.out.println("Designation: "+designation);
   }
}


