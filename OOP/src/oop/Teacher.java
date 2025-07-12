
package oop;

public class Teacher {
    String name,gender;
    int number;
    
    Teacher(){
        System.out.println("Empty");
    }
    
    Teacher(String n,String g){
        name = n;
        gender = g;
    }
    
    Teacher(String n,String g,int ph){
        name = n;
        gender = g;
        number = ph;
    }
    
    void display_information(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Number: "+number);
        System.out.println();
    }
    
}
