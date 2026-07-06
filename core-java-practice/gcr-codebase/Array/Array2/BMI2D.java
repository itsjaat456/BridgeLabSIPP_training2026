package Array2;
import java.util.*;

public class BMI2D {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[][] p = new double[n][3];
        String[] st = new String[n];
        for (int i = 0; i < n; i++) {
            p[i][1] = s.nextDouble();
            p[i][0] = s.nextDouble();
            p[i][2] = p[i][1] / (p[i][0] * p[i][0]);
            st[i] = p[i][2] < 18.5 ? "Underweight" : p[i][2] < 25 ? "Normal" : p[i][2] < 30 ? "Overweight" : "Obese";
        }
    }
}