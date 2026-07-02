// Q101 Write a program to Create number guessing game
import java.util.Scanner;
class ques101 {
    public static void main(String[] args) {
        int number = 7; // fixed for demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess = sc.nextInt();

        if (guess == number)
            System.out.println("Correct Guess!");
        else
            System.out.println("Wrong Guess!");
    }
}
