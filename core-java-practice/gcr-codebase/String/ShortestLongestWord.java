import java.util.Scanner;

public class ShortestLongestWord {

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

        int words = 1;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] arr = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {

            if (text.charAt(i) != ' ') {
                temp += text.charAt(i);
            } else {
                arr[index++] = temp;
                temp = "";
            }
        }

        arr[index] = temp;

        return arr;
    }

    static String[][] createArray(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static int[] findIndex(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            if (Integer.parseInt(data[i][1]) <
                    Integer.parseInt(data[shortest][1])) {

                shortest = i;
            }

            if (Integer.parseInt(data[i][1]) >
                    Integer.parseInt(data[longest][1])) {

                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text : ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] data = createArray(words);

        int[] ans = findIndex(data);

        System.out.println();

        System.out.println("Shortest Word : " + data[ans[0]][0]);

        System.out.println("Longest Word : " + data[ans[1]][0]);
    }
}