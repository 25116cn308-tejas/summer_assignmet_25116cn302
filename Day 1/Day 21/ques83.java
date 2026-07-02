// Q83 Write a program to Count vowels and consonants
class ques83 {
    public static void main(String[] args) {
        String str = "Programming";
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
