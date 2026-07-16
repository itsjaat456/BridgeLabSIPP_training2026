import java.util.*;

public class CompareStrings {
    static boolean eq(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        String a = s.next(), b = s.next();
        System.out.println(eq(a, b));
        System.out.println(a.equals(b));
    }
}