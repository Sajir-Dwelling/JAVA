package Inheritence;

public class Teacher extends Person1 {
    
        //Person's name,age properties are added;    
        String qualification;
       
        
        
        void display_info2(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Qualification: "+qualification);
            System.out.println();
        }
        
        public static void main(String[] args) {
         Person1 p = new Person1();
         p.name = "Sajir";
         p.age = 21;
         
         Teacher t1 = new Teacher();
         t1.name = "Sabrina";
         t1.age = 25;
         t1.qualification = "BBA";
         
         Teacher t2 = new Teacher();
         t2.name = "Ringky";
         t2.age = 24;
         t2.qualification = "BSC";
         
         
         
         p.display_info1();
         t1.display_info2();
         t2.display_info2();
         
                 
     }
    }

