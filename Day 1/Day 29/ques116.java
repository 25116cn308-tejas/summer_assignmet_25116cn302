// Q116 Write a program to Create inventory management system
class ques116 {
    public static void main(String[] args) {
        String[] items = {"Pen", "Book", "Laptop"};
        int[] stock = {10, 5, 2};

        System.out.println("Inventory:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + stock[i] + " units");
        }
    }
}
