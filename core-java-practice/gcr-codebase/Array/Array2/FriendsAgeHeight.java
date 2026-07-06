package Array2;
import java.util.*;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] h = new double[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            h[i] = sc.nextDouble();
        }
        int ya = 0;
        int th = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[ya]) ya = i;
            if (h[i] > h[th]) th = i;
        }
        System.out.println(n[ya]);
        System.out.println(n[th]);
    }
}