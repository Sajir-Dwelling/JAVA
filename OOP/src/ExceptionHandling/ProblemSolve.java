package ExceptionHandling;

import java.util.Scanner;

public class ProblemSolve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                int num1, num2;
                System.out.print("Please enter num1: ");
                num1 = input.nextInt();
                System.out.print("Please enter num2: ");
                num2 = input.nextInt();
                int result = num1 / num2;
                System.out.println("Result:" + num1 + "/" + num2 + " = " + result);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter integer. Please try again");
                input.nextLine();
            }

        }

    }

}
