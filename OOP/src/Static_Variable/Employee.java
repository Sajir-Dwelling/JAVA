
package Static_Variable;

public class Employee {
    static int count = 0;
    
    Employee(){
        count++;
    }
    
    void total_employee(){
        System.out.println("Total: "+count);
    }
}
