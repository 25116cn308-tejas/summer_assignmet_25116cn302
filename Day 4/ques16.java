import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int low = sc.nextInt();
        System.out.print("Enter upper range: ");
        int high = sc.nextInt();
        
        for (int num = low; num <= high; num++) {
            int temp = num, sum = 0;
            int digits = String.valueOf(num).length();
            
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == num)
                System.out.println(num);
        }
    }
}
