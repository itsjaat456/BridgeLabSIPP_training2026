package Array2;

import java.util.*;

public class EmployeeBonus {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        double[] s = new double[10], y = new double[10], b = new double[10], n = new double[10];
        double tb = 0, os = 0, ns = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Salary: ");
            s[i] = sc.nextDouble();
            System.out.print("Years: ");
            y[i] = sc.nextDouble();
            if (s[i] < 0 || y[i] < 0) {
                i--;
                continue;
            }
            b[i] = s[i] * (y[i] > 5 ? 0.05 : 0.02);
            n[i] = s[i] + b[i];
            tb += b[i];
            os += s[i];
            ns += n[i];
        }
        System.out.println(tb);
        System.out.println(os);
        System.out.println(ns);
    }
}