
package StaticVar;

public class Student {
    String name;
    int id;
    static String uniName="DU";
    
    Student(String n,int i){
        name = n;
        id = i;
    }

    void display_info(){

    System.out.println("Name: "+name);
    System.out.println("ID: "+id);
    System.out.println("University Name: "+uniName);
    System.out.println();
    }
}