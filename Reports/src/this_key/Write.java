package this_key;

public class Write {
    //Declaring instance variables
    String name;
    int num;
    String bookname;
    
    public Write(String name,int num,String bookname){
        //Storing the local variables in instance variables using this keyword
        this.name=name;
        this.num = num;
        this.bookname = bookname;
    }
    
    public void display_info(){
        System.out.println("Writer name: "+name);
        System.out.println("Page number: "+num);
        System.out.println("Book name: "+bookname);
    }
    
    public static void main(String[] args) {
        Write wr = new Write("James Clear",308,"Atomic Habit");
        wr.display_info();
    }
}
