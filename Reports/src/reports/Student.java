
package reports;

public class Student {
    String name = "Md Sajir Wasee";
    int age = 21;
    float marks = 86.5f;

void call(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Marks: "+marks);
}

    public static void main(String[] args) {
        Student st = new Student();
        st.call();
    }
}


