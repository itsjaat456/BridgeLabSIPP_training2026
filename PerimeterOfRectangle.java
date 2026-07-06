import java.util.*;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length = ");
        int l = sc.nextInt();
        System.out.print("enter breadth  = ");
        int b = sc.nextInt();

        System.out.println("perimeter of rectangle = "+(2*(l+b)));
    }
}
