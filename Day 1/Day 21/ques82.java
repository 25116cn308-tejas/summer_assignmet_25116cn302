// Q82 Write a program to Reverse a string
class ques82 {
    public static void main(String[] args) {
        String str = "Copilot";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string = " + rev);
    }
}
