import java.util.*;

public class NumberCheck {
    static int checkNumber(int n) {
        return n > 0 ? 1 : n < 0 ? -1 : 0;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkNumber(sc.nextInt()));
    }
}