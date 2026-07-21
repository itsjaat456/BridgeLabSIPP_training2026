import java.util.Scanner;

public class Power {

    public static long power(long x, long n) {

        if (n == 0)
            return 1;

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        long x = sc.nextLong();

        System.out.print("Enter Power: ");
        long n = sc.nextLong();

        System.out.println(power(x, n));
    }
}