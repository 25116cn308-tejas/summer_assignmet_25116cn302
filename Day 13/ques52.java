import java.util.Scanner;

class ques52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        System.out.println("Even elements count = " + evenCount);
        System.out.println("Odd elements count = " + oddCount);
    }
}

