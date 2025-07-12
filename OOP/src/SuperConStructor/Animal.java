package SuperConStructor;

public class Animal {
    String name;
    
    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor got called. Name: "+name);
    }
}
