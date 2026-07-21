import java.util.*;

public class QuotientRemainder {
    static int[] f(int n, int d) {
        return new int[]{n / d, n % d};
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[] r = f(sc.nextInt(), sc.nextInt());
        System.out.println("Quotient=" + r[0]);
        System.out.println("Remainder=" + r[1]);
    }
}