import java.util.HashMap;

class ques62 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 3, 4, 3, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0, element = -1;
        for (int key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                element = key;
            }
        }
        System.out.println("Element with max frequency: " + element);
    }
}
