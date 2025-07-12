package Static;

public class Counter {
    //Using static key to store the variable in a constant class memory space.
    static int count = 0;
    static final String Alarm = "12:30 am";

    
    public Counter(){
        count++;
    }
    
    //Using static key for method to get the static variable.
    public static void showCount(){
        System.out.println("Number of counts: "+count);    
    }
    
    public static void showAlarm(){
         System.out.println("Alarm: " + Alarm);
    }
    
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        
        Counter.showCount();
        Counter.showAlarm();
    }
}
