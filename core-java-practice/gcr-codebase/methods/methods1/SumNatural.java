import java.util.*;

public class SumNatural {
    static int findSum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) s += i;
        return s;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findSum(sc.nextInt()));
    }
}