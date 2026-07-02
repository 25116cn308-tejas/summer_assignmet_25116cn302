// Q99 Write a program to Sort names alphabetically
import java.util.Arrays;
class ques99 {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "David"};
        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
