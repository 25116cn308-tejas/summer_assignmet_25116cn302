// Q114 Write a program to Create menu-driven array operations system
import java.util.Scanner;
import java.util.Arrays;
class ques114 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Display  2. Sort  3. Find Max");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println(Arrays.toString(arr)); break;
            case 2: Arrays.sort(arr); System.out.println("Sorted: " + Arrays.toString(arr)); break;
            case 3: int max = Arrays.stream(arr).max().getAsInt(); System.out.println("Max = " + max); break;
            default: System.out.println("Invalid choice");
        }
    }
}