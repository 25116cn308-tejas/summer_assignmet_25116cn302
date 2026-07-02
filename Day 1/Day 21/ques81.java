// Q81 Write a program to Find string length without strlen()
class ques81 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        int length = 0;

        for (char c : str.toCharArray()) {
            length++;
        }

        System.out.println("Length of string = " + length);
    }
}
