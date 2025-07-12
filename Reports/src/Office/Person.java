
package Office;


public class Person {
     String name;
    int age;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    String designation;
    void displayEmployee() {
        displayPerson();
        System.out.println("Designation: " + designation);
    }
}
class Manager extends Employee {
    String department;
    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
    }
}
class Student extends Person {
    int studentId;

    void displayStudent() {
        displayPerson();
        System.out.println("Student ID: " + studentId);
    }
}

