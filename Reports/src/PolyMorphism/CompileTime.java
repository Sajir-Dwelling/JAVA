
package PolyMorphism;

public class CompileTime {
    void add(int a,int b){
        System.out.println(a+b);
    }
    
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(double a, double b, double c){
        System.out.println(+a+b+c);
    }
    
    void add(){
        System.out.println("Nothing to add");
    }
    
    public static void main(String[] args) {
        CompileTime ct = new CompileTime();
        ct.add(6,7);
        ct.add(8,5,9);
        ct.add(7.54,8.59,5.62);
        ct.add();
    }
}
