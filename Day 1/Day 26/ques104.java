// Q104 Write a program to Create quiz application
import java.util.Scanner;
class ques104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q: What is 2+2?");
        System.out.println("a) 3  b) 4  c) 5");
        String ans = sc.next();

        if (ans.equalsIgnoreCase("b"))
            System.out.println("Correct!");
        else
            System.out.println("Wrong!");
    }
}
