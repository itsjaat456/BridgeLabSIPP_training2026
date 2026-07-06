package Array2;
import java.util.*;

public class LargestSecondLargest {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int[] d = new int[10];
        int i = 0;
        while (n != 0 && i < 10) {
            d[i++] = (int) (n % 10);
            n /= 10;
        }
        int l = 0, sl = 0;
        for (int j = 0; j < i; j++) {
            if (d[j] > l) {
                sl = l;
                l = d[j];
            } else if (d[j] > sl && d[j] != l) sl = d[j];
        }
        System.out.println(l);
        System.out.println(sl);
    }
}