// Q80 Write a program to Find column-wise sum
class ques80 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = A.length;
        int cols = A[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += A[i][j];
            }
            System.out.println("Sum of column " + (j+1) + " = " + sum);
        }
    }
}
