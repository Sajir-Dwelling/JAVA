
package oop;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    int accountBalance;
    
        BankAccount(int n,String h,int b)
        {
            accountNumber = n;
            accountHolderName = h;
            accountBalance = b;
        }
        
        void display_information(){
            System.out.println("Account Number: "+accountNumber);
            System.out.println("Account Holder Name: "+accountHolderName);
            System.out.println("Account Balance: "+accountBalance);
            System.out.println();
        }
        
        public static void main(String[] args) {
        BankAccount bk = new BankAccount(20,"MD Sajir Wasee",999999999);
        bk.display_information();
    }
}
