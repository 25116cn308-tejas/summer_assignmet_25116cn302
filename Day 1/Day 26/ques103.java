// Q103 Write a program to Create ATM simulation
import java.util.Scanner;
class ques103 {
    public static void main(String[] args) {
        int balance = 1000;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance = " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
