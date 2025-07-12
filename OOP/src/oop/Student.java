
package oop;
import java.util.Scanner;

public class Student {
    String name;
    int age;
    String grade;
    
    
    Student(String n,int a, String g){
        name = n;
        age = a;
        grade = g;
    }
    Student(String n,int a){
        name = n;
        age = a;
    }
    
    void display_information(){
    
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+grade);
        System.out.println();
    }
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter infos about Student1: ");
        System.out.print("Enter your name: ");
        String name1 = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter your grade: ");
        String grade1 = input.nextLine();
        
        Student st1 = new Student(name1,age1,grade1);
        
        System.out.println();
        
        System.out.println("Enter infos about Student2: ");
        System.out.print("Enter your name: ");
        String name2 = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age2 = input.nextInt();
        input.nextLine();
        
        Student st2 = new Student(name2,age2);
        
        st1.display_information();
        st2.display_information();
        input.close();
    }
}
