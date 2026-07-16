import java.util.Scanner;

public class SplitWords {

    static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }

        return count;
    }

    static String[] splitWords(String text) {

        int length = findLength(text);
        int words = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                result[index] = temp;
                index++;
                temp = "";
            }
        }

        result[index] = temp;

        return result;
    }

    static boolean compare(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        String[] user = splitWords(text);

        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result : " + compare(user, builtIn));

        System.out.println();

        System.out.println("Words");

        for (String word : user) {
            System.out.println(word);
        }
    }
}