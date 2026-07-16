import java.util.*;

public class IllegalArgumentDemo {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        try {
            System.out.println(t.substring(4, 2));
        } catch (RuntimeException e) {
            System.out.println("Handled");
        }
    }
}