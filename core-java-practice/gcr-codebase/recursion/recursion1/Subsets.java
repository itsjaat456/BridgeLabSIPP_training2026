import java.util.Scanner;

public class Subsets {

    public static void generate(int[] arr, int index, String subset) {

        if (index == arr.length) {
            System.out.println("[" + subset + "]");
            return;
        }

        generate(arr, index + 1, subset);

        if (subset.isEmpty())
            generate(arr, index + 1, subset + arr[index]);
        else
            generate(arr, index + 1, subset + "," + arr[index]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        generate(arr, 0, "");
    }
}