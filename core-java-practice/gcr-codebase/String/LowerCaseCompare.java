import java.util.*;

public class LowerCaseCompare {
    static String l(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
            r += c;
        }
        return r;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(l(t).equals(t.toLowerCase()));
    }
}