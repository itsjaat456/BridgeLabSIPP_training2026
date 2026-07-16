import java.util.Scanner;

public class WordLength2D {

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

    static String[][] wordDetails(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = wordDetails(words);

        System.out.println();

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}