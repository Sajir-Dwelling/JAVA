package SuperConStructor;

public class Cat extends Animal {
    String breed;
    
    Cat(String name, String breed){
        super(name);
        this.breed = breed;
        System.out.println("Cat constructor got called. Breed: "+breed);
    }
}
