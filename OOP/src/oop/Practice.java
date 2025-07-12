
package oop;

public class Practice {
    String name;
    int phoneNumber;
    String gender;
    
    Practice(String n,int p,String g){
        name = n;
        phoneNumber = p;
        gender = g;
    }
    
    Practice(){
        System.out.println("No value");
    }
    
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Gender: "+gender);
        System.out.println();
    }
}
