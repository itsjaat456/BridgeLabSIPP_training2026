import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of pi = ");
        int r = sc.nextInt();
        System.out.println("Area of circle = "+(3.14*r*r));
    }
}

