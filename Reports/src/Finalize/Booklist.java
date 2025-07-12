package Finalize;

class Book {
    String title;
    String author;
    int year;
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = 0;
    }
    Book(String t, String a) {
        this.title = t;
        this.author = a;
        this.year = 0;
    }
    Book(String t, String a, int y) {
        this.title = t;
        this.author = a;
        this.year = y;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    @Override
    protected void finalize() {
        System.out.println("Book object is destroyed by Garbage Collector");
    }
}
public class Booklist {
 public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Bleach", "Tite Kubo");
        Book b3 = new Book("Berserk", "Kentaro Miura", 1997);
        b1.display();
        b2.display();
        b3.display();
        b1 = null;
        b2 = null;
        System.gc();
        System.out.println("End of Main Method");
    }    
}

