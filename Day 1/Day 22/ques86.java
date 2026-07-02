// Q86 Write a program to Count words in a sentence
class ques86 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.trim().split("\\s+");

        System.out.println("Word count = " + words.length);
    }
}
