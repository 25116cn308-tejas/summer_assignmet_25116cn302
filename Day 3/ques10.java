import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers are:");

        for (int num = start; num <= end; num++) {
            if (num < 2)
                continue;

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }
    }
}