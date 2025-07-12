
package ConstructorOverloading;

public class ConstructorOverloadingTest {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Md Sajir Wasee","Male");
        teacher2.display_information();
        
        Teacher teacher3 = new Teacher("Md Safir Wasee","Male",1231223123);
        teacher3.display_information();
    }
}
