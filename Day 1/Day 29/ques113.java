// Q113 Write a program to Create menu-driven calculator
import java.util.Scanner;
class ques113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
        int choice = sc.nextInt();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Sum = " + (a+b)); break;
            case 2: System.out.println("Difference = " + (a-b)); break;
            case 3: System.out.println("Product = " + (a*b)); break;
            case 4: System.out.println("Quotient = " + (a/b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
