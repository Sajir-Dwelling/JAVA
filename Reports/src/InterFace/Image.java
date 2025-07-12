package InterFace;

public class Image implements Printable{

    @Override
    public void print(){
        System.out.println("Printing Image.");
    }
    
    public static void main(String[] args) {
        Printable doc = new Document();
        Printable img = new Image();
        
        doc.print();
        img.print();
    }
}
