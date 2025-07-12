
package BoxProject;

public class Box {
    double height,width,depth;
    
        Box(double h, double w, double d){
            height = h;
            width = w;
            depth = d;
        }
        
        void displayvol(){
            System.out.println("Height: "+height);
            System.out.println("Width: "+width);
            System.out.println("Depth: "+depth);
            System.out.println("Volume: "+height*width*depth);
            System.out.println();
        }
        
        public static void main(String[] args) {
        
        Box b1 = new Box(10,10,10);
        System.out.println("Box1 ");
        b1.displayvol();
        
        Box b2 = new Box(20,30,10);
        System.out.println("Box2 ");
        b2.displayvol();
    }
}


