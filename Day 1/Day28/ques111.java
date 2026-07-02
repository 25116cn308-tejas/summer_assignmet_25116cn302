// Q111 Write a program to Create ticket booking system
import java.util.Scanner;
class ques111 {
    public static void main(String[] args) {
        int seats = 10;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tickets to book: ");
        int tickets = sc.nextInt();

        if (tickets <= seats) {
            seats -= tickets;
            System.out.println("Booking successful. Remaining seats = " + seats);
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}
