// Q76 Write a program to Find diagonal sum
class ques76 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = A.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i][i]; // main diagonal
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}
