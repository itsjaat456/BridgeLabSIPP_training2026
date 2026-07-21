import java.util.*;

public class ChocolateDistribution {
    static int[] f(int c, int ch) {
        return new int[]{c / ch, c % ch};
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[] r = f(sc.nextInt(), sc.nextInt());
        System.out.println("Each=" + r[0]);
        System.out.println("Remaining=" + r[1]);
    }
}