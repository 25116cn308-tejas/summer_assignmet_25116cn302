// Q84 Write a program to Convert lowercase to uppercase
class ques84 {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            el