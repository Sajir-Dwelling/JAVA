
package Inheritence;

public class Employee extends Person {
        //Links with Person Attributes
        double salary;
        String designation;
        
        void display_info2(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Salary: "+salary+"$");
            System.out.println("Designation: "+designation);
            System.out.println();
        }
        
        public static void main(String[] args) {
        Person p = new Person();
        p.name = "MD Sajir Wasee";
        p.age = 21;
        
        Employee em = new Employee();
        em.name = "MD Safir Wasee";
        em.age = 12;
        em.salary = 300;
        em.designation = "Manager";
        
        p.display_info1();
        em.display_info2();
    }
}
