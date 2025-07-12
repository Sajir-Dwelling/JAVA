package Loop;

public class BreakContinue {
    public static void main(String[] args) {
        int i;
        
        for(i=1 ; i<=100 ; i++)
        {
            if(i>15){
                break;
            }
            
            if(i==10){
                continue;
            }
            
            System.out.println(i);
        }
        
        
    }
    
}
