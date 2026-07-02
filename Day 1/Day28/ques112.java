// Q112 Write a program to Create contact management system
class ques112 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        String[] numbers = {"1234567890", "9876543210"};

        System.out.println("Contacts:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + numbers[i]);
        }
    }
}
