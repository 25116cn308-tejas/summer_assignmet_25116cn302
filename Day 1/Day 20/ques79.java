// Q79 Write a program to Find row-wise sum
class ques79 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            System.out.println("Sum of row " + (i+1) + " = " + sum);
        }
    }
}
