package oop;

public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("MD Sajir Wasee","Male"); //Object Create
        teacher1.display_information();
        
        Teacher teacher2 = new Teacher("MD Safir Wasee","Male",1233545632); //Object Create
        teacher2.display_information();
        
        Teacher teacher3 = new Teacher();
        teacher3.display_information();
    }
}
