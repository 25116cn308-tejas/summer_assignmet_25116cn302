import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner var1 = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int var2 = var1.nextInt();

        int var3 = 0;

        for (int var4 = 1; var4 <= var2; ++var4) {
            var3 += var4;
        }

        System.out.println("Sum of first " + var2 + " natural numbers = " + var3);

        var1.close();
    }
}




        