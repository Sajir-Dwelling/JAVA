
package Office;

public class Office {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Sajir";
        m.age = 32;
        m.designation = "CEO";
        m.department = "IT";
        System.out.println("<----- Manager Info (Multilevel Inheritance) ----->");
        m.displayManager();
        Student s = new Student();
        s.name = "Safir";
        s.age = 22;
        s.studentId = 1020;
        System.out.println("\n<----- Student Info (Hierarchical Inheritance) ----->");
        s.displayStudent();
}
}

