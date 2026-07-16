import java.util.*;

public class StringIndexDemo {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String t = s.next();
        try {
            System.out.println(t.charAt(t.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled");
        }
    }
}