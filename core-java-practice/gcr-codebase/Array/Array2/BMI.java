package Array2;
import java.util.*;

public class BMI {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] w = new double[n], h = new double[n], b = new double[n];
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            w[i] = s.nextDouble();
            h[i] = s.nextDouble();
            b[i] = w[i] / (h[i] * h[i]);
            st[i] = b[i] < 18.5 ? "Underweight" : b[i] < 25 ? "Normal" : b[i] < 30 ? "Overweight" : "Obese";
            System.out.println(h[i] + " " + w[i] + " " + b[i] + " " + st[i]);
        }
    }
}