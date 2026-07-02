// Q89 Write a program to Find first non-repeating character
class ques89 {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            freq[c]++;
        }

        for (char c : str.toCharArray()) {
            if (freq[c] == 1) {
                System.out.println("First non-repeating character = " + c);
                break;
            }
        }
    }
}
