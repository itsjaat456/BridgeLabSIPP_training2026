import java.util.Scanner;
public class ConverKmToMiles {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter km = ");
        int km =sc.nextInt();

        System.out.println("km to miles = "+(km * 0.621371));
    }
}
