
package Inheritence;

class Grandfather {
    public void grandfather_message(){
        System.out.println("Hello, this is your Grandfather");
    }
}

class Father extends Grandfather{
    public void father_message(){
        System.out.println("Hello, this is your Father");
    }
}

class Child extends Father{
    public void child_message(){
        System.out.println("Hello, I am the Child");
    }   
}

class Main{
    public static void main(String[] args) {
        Child ch = new Child();
        
        ch.grandfather_message();
        ch.father_message();
        ch.child_message();
    }
}



