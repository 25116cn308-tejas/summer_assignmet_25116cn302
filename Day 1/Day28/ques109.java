// Q109 Write a program to Create library management system
class ques109 {
    public static void main(String[] args) {
        String[] books = {"Java Basics", "Data Structures"};
        boolean[] issued = {false, true};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i] + " - " + (issued[i] ? "Issued" : "Available"));
        }
    }
}
