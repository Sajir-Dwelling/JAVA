package ExceptionHandling.Throw;

public class EligiBlity {

    public static void eligible(int age) throws EligibleException {
        if (age < 18) {
            throw new EligibleException("Not eligible.");
        } 
    }
    
    public static void main(String[] args) throws EligibleException {
        eligible(12);
    }    
}
