package MultiLevelInheritence;

public class Stuff extends Employee {
    public Stuff(String name, int age, String designation, double salary) {
        super(name, age, designation, salary);
    }

    void display_info3() {
        super.display_info2();
    }

    public static void main(String[] args) {
        Person p = new Person("MD Sajir Wasee", 21, "Founder");
        p.dsiplay_info1();
        System.out.println();

        Employee em = new Employee("Sami Hasan", 23, "CEO", 100000);
        em.display_info2();
        System.out.println();

        Stuff st = new Stuff("Saidqun Nabi", 23, "Caretaker", 20000);
        st.display_info3();
        System.out.println();
    }
}
