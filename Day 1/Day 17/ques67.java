import java.util.HashSet;

class ques67 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4};
        
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) set1.add(num);
        
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) intersection.add(num);
        }
        
        System.out.println("Intersection: " + intersection);
    }
}
