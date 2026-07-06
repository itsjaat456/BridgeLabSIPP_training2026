package Array2;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        char[] c = n.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) System.out.print(c[i]);
    }
}