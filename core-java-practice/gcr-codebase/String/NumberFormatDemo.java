import java.util.*;

public class NumberFormatDemo {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println(Integer.parseInt(s.next()));
        } catch (NumberFormatException e) {
            System.out.println("Handled");
        }
    }
}