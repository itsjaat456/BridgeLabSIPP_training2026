import java.util.*;

public class StringToArray {
    static char[] f(String s) {
        char[] c = new char[s.length()];
        for (int i = 0; i < s.length(); i++) c[i] = s.charAt(i);
        return c;
    }

    public static void main(String[] x) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        System.out.println(java.util.Arrays.equals(f(t), t.toCharArray()));
    }
}