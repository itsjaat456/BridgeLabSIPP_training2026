import java.util.*;
public class Average {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("enter b = ");
        int b = sc.nextInt();
        System.out.print("enter c = ");
        int c = sc.nextInt();

        System.out.println("average of three no = "+((a+b+c)/3));
    }
}
