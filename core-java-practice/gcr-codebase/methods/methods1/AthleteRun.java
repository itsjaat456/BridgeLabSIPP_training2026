import java.util.*;

public class AthleteRun {
    static double calculateRounds(double a, double b, double c) {
        return 5000 / (a + b + c);
    }

    public static void main(String[] x) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.2f", calculateRounds(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
    }
}