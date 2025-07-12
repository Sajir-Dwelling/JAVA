package CreateException;

public class Eligible {
    public static void eligible(int age) throws EligibleException
    {
        if(age<18){
            throw new EligibleException("Not accepted.");
        }
        
        else{
            System.out.println("Accepted.");
        }
    }
    
        public static void main(String[] args) throws EligibleException{
        eligible(12);
          
    }

}


