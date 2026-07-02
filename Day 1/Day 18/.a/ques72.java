import java.util.*;

class ques72 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        // Bubble sort in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
