
package reports;

public class Book {
    String name;
    String writer;
    int page;
    
    public Book(){
        System.out.println("This block of code is empty");
        
    }
    
    public Book(String name,String writer){
        this.name = name;
        this.writer = writer;
    }
    
    public Book(String name, String writer, int page){
        this.name = name;
        this.writer = writer;
        this.page = page;
    }
    
    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Writer: "+writer);
        System.out.println("Page: "+page);
    }
    
    public static void main(String[] args) {
        Book bk1 = new Book();
        bk1.displayInfo();
        System.out.println();
        
        Book bk2 = new Book("Atomic Habit","James Clear");
        bk2.displayInfo();
        System.out.println();
        
        Book bk3 = new Book("Atomic Habit","James Clear",306);
        bk3.displayInfo();
        System.out.println();
    }
}
