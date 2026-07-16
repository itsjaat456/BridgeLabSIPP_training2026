import java.util.Scanner;

public class TrimString {

    static int[] trimIndex(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String text, int start, int end) {

        String ans = "";

        for (int i = start; i <= end; i++) {
            ans += text.charAt(i);
        }

        return ans;
    }

    static boolean compare(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text : ");
        String text = sc.nextLine();

        int[] index = trimIndex(text);

        String user = createSubstring(text, index[0], index[1]);

        String builtIn = text.trim();

        System.out.println("User Trim : " + user);
        System.out.println("Built In : " + builtIn);
        System.out.println("Same : " + compare(user, builtIn));
    }
}