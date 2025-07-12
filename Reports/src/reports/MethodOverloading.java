
package reports;

public class MethodOverloading {
    void add(double a,double b){
        System.out.println(a+b);
    }
    
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(){
        System.out.println("Nothing to add");
    }
    
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.add(5.875,3.146);
        mo.add(6,4,9);
        mo.add();
    }
}
