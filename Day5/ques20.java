import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long num = sc.nextLong();
        long largest = -1;
        while (num % 2 == 0) {
            largest = 2;
            num /= 2;
        }
        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largest = i;
                num /= i;
            }
        }
        if (num > 2)
            largest = num;
        System.out.println("Largest Prime Factor: " + largest);
    }
}
