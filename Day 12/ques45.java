import java.util.Scanner;

class ques45 {
    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if (isPalindrome(num))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
