// Q106 Write a program to Create employee management system
class ques106 {
    public static void main(String[] args) {
        String[] employees = {"John", "David"};
        int[] salaries = {50000, 60000};

        System.out.println("Employee Records:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i] + " - " + salaries[i]);
        }
    }
}
