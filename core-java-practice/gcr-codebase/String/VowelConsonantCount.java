import java.util.Scanner;

public class VowelConsonantCount {

    static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }

            return "Consonant";
        }

        return "Not Letter";
    }

    static int[] count(String text) {

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < text.length(); i++) {

            String ans = check(text.charAt(i));

            if (ans.equals("Vowel")) {
                vowel++;
            } else if (ans.equals("Consonant")) {
                consonant++;
            }
        }

        return new int[]{vowel, consonant};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text : ");
        String text = sc.nextLine();

        int[] result = count(text);

        System.out.println("Vowels : " + result[0]);
        System.out.println("Consonants : " + result[1]);
    }
}