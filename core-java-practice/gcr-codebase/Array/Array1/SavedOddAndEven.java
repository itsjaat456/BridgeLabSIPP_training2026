package Array1;

import java.util.Scanner;
public class SavedOddAndEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n  = ");
        int n = sc.nextInt();
        int even[] = new int[n / 2 + 1];
        int[] odd = new int[n / 2 + 1];

        int e = 0;
        int o = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even[e++] = i;
            } else {
                odd[o++] = i;
            }
        }
        for (int el : even) {
            System.out.println(el);
        }
        for (int el : odd) {
            System.out.println(el);
        }

    }
}
