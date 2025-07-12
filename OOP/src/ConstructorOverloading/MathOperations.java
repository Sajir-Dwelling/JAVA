
package ConstructorOverloading;

class MathOperations {
    
    public int multiply(int a,int b){
        return a*b;
    }
    
    public int multiply(int a,int b,int c){
        return a*b*c;
    }
    
    public double multiply(double a,double b){
        return a*b;
    }
    
    public static void main(String[] args) {
        MathOperations mt = new MathOperations();
        
       int result1 = mt.multiply(6,4);
       int result2 = mt.multiply(10,50,20);
       double result3 = mt.multiply(75.43,45.24);
        
        System.out.println("Result of Multiply 6 and 4: "+result1); 
        System.out.println("Result of Multiply 10,50 and 20: "+result2); 
        System.out.println("Result of Multiply 75.43 and 45.24: "+result3); 
    }
}
