import java.util.Scanner;

class ques46 {
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0;
        int digits = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
