// Q78 Write a program to Check symmetric matrix
class ques78 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        int n = A.length;
        boolean symmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is NOT Symmetric");
    }
}
