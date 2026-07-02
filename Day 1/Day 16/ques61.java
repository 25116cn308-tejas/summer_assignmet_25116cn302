class ques61 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // Example array
        int n = arr.length + 1;   // Total numbers should be 5
        int total = n * (n + 1) / 2; // Sum of first n natural numbers
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Missing number: " + (total - sum));
    }
}
