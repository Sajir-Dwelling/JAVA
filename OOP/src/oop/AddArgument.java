
package oop;

public class AddArgument {
    void add_num(int ... num){
        int sum = 0;
        
        for(int x:num){
            sum+=x;
        }
        System.out.println("Sum: "+sum);
    }
    
    public static void main(String[] args) {
        AddArgument ob = new AddArgument();
        ob.add_num(10,20,30);
        ob.add_num(10,20,30,40);
        ob.add_num(10,20,30,40,50);       
    }
}
