// Q105 Write a program to Create student record management system
class ques105 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        int[] marks = {85, 90};

        System.out.println("Student Records:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }
}
