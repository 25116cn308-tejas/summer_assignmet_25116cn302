// Q108 Write a program to Create marksheet generation system
class ques108 {
    public static void main(String[] args) {
        String name = "Alice";
        int[] marks = {85, 90, 95};
        int total = 0;

        for (int m : marks) total += m;
        double avg = total / (double)marks.length;

        System.out.println("Marksheet for " + name);
        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
    }
}
