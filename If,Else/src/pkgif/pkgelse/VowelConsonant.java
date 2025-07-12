
package pkgif.pkgelse;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a letter: ");
        ch = input.next().charAt(0);
        System.out.println("Character: "+ch);
        
        
        if(ch=='A'||ch=='a')
        {
            System.out.println("Vowel");
        }
        else if(ch=='E'||ch=='e')
        {
            System.out.println("Vowel");
        }
        else if(ch=='I'||ch=='i')
        {
            System.out.println("Vowel");
        }
        else if(ch=='O'||ch=='o')
        {
            System.out.println("Vowel");
        }
        else if(ch=='U'||ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
 
}
