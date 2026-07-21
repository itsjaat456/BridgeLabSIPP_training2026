import java.util.*;

public class Trigonometry {
    static double[] f(double ang) {
        double r = Math.toRadians(ang);
        return new double[]{Math.sin(r), Math.cos(r), Math.tan(r)};
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        double[] x = f(sc.nextDouble());
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}