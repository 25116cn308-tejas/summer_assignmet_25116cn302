import java.util.Arrays;
class ques97 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5};
        int[] B = {2, 4, 6};
        int[] merged = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) merged[k++] = A[i++];
            else merged[k++] = B[j++];
        }
        while (i < A.length) merged[k++] = A[i++];
        while (j < B.length) merged[k++] = B[j++];

        System.out.println("Merged array = " + Arrays.toString(merged));
    }
}
