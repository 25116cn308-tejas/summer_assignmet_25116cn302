// Q115 Write a program to Create menu-driven string operations system
import java.util.Scanner;
class ques115 {
    public static void main(String[] args) {
        String str = "Hello World";
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Length  2. Reverse  3. Uppercase");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Length = " + str.length()); break;
            case 2: System.out.println("Reverse = " + new StringBuilder(str).reverse()); break;
            case 3: System.out.println("Uppercase = " + str.toUpperCase()); break;
            default: System.out.println("Invalid choice");
        }
    }
}
