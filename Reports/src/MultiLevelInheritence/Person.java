package MultiLevelInheritence;

public class Person {
    String name;
    int age;
    String designation;

    public Person(String name,int age,String designation){
    this.name = name;
    this.age = age;
    this.designation = designation;
    }
    
    void dsiplay_info1(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Designation: "+designation);
    }
}


