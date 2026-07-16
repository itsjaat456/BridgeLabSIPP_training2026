import java.util.*;

public class SubstringCompare {
    static String sub(String t, int st, int e) {
        String r = "";
        for (int i = st; i < e; i++) r += t.charAt(i);
        return r;
    }

    static boolean eq(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        int i = s.nextInt(), j = s.nextInt();
        String x = sub(t, i, j), y = t.substring(i, j);
        System.out.println(eq(x, y));
    }
}