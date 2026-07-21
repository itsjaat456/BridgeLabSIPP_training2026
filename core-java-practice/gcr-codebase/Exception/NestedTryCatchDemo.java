import java.util.Scanner;

public class NestedTryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {

            System.out.print("Enter Index: ");
            int index = sc.nextInt();

            try {

                int value = arr[index];

                System.out.print("Enter Divisor: ");
                int divisor = sc.nextInt();

                System.out.println("Result = " + value / divisor);

            } catch (ArithmeticException e) {

                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid array index!");
        }
    }
}