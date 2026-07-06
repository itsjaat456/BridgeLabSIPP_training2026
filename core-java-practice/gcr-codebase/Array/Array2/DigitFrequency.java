package Array2;
import java.util.*;

public class DigitFrequency {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int[] f = new int[10];
        for (char c : n.toCharArray()) f[c - '0']++;
        for (int i = 0; i < 10; i++) System.out.println(i + " " + f[i]);
    }
}