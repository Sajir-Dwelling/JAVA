
package pkgif.pkgelse;
import java.util.Scanner;

public class NumberSpelling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer number between 0-9 : ");
        num = input.nextInt();
        System.out.println("Number: "+num);
        
        if(num==0)
        {
            System.out.println("Zero");
        }    
        else if(num==1)
        {
            System.out.println("One");
        }    
        else if(num==2)
        {
            System.out.println("Two");
        }    
        else if(num==3)
        {
            System.out.println("Three");
        }    
        else if(num==4)
        {
            System.out.println("four");
        }    
        else if(num==5)
        {
            System.out.println("Five");
        }    
        else if(num==6)
        {
            System.out.println("Six");
        }    
        else if(num==7)
        {
            System.out.println("Seven");
        }    
        else if(num==8)
        {
            System.out.println("Eight");
        }    
        else if(num==9)
        {
            System.out.println("Nine");
        }
        else
        {
            System.out.println("The number is not in between 0-9!");
            System.out.print("PLease enter an integer number between 0-9 : ");
            num = input.nextInt();
            System.out.println("Number: "+num);
            
            if(num==0)
                {
                    System.out.println("Zero");
                }    
            else if(num==1)
                {
                    System.out.println("One");
                }    
            else if(num==2)
                {
                    System.out.println("Two");
                }    
            else if(num==3)
                {
                    System.out.println("Three");
                }    
            else if(num==4)
                {
                    System.out.println("four");
                }    
            else if(num==5)
                {
                    System.out.println("Five");
                }    
            else if(num==6)
                {
                    System.out.println("Six");
                }    
            else if(num==7)
                {
                    System.out.println("Seven");
                }    
            else if(num==8)
                {
                    System.out.println("Eight");
                }    
            else if(num==9)
                {
                    System.out.println("Nine");
                }
        }
        
    }
}
