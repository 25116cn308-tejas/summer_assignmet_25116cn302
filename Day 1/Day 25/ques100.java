// Q100 Write a program to Sort words by length
import java.util.Arrays;
import java.util.Comparator;
class ques100 {
    public static void main(String[] args) {
        String[] words = {"Java", "Programming", "Is", "Fun"};
        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

