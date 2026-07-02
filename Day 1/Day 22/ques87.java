// Q87 Write a program to Character frequency
class ques87 {
    public static void main(String[] args) {
        String str = "programming";
        int[] freq = new int[256]; // ASCII size

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " = " + freq[i]);
            }
        }
    }
}
