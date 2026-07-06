package Array2;
import java.util.*;

public class DynamicLargestSecondLargest {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String x = s.next();
        int m = 10;
        int[] d = new int[m];
        int idx = 0;
        for (char c : x.toCharArray()) {
            if (idx == m) {
                m += 10;
                d = java.util.Arrays.copyOf(d, m);
            }
            d[idx++] = c - '0';
        }
        int l = 0, sl = 0;
        for (int j = 0; j < idx; j++) {
            if (d[j] > l) {
                sl = l;
                l = d[j];
            } else if (d[j] > sl && d[j] != l) sl = d[j];
        }
        System.out.println(l);
        System.out.println(sl);
    }
}