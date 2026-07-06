package Array2;
import java.util.*;

public class StudentGrade {
    public static void main(String[] a) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            double p = s.nextDouble(), c = s.nextDouble(), m = s.nextDouble();
            double per = (p + c + m) / 3;
            String g = per >= 90 ? "A" : per >= 75 ? "B" : per >= 60 ? "C" : "D";
            System.out.println(per + " " + g);
        }
    }
}