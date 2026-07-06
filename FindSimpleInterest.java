import java.util.Scanner;
public class FindSimpleInterest {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("enter principal = ");
       int p =sc.nextInt();
       System.out.print("enter rate = ");
       int r = sc.nextInt();
       System.out.print("enter time = ");
       int t = sc.nextInt();

       System.out.println("simple interest = "+((p*r*t)/100.0));
    }
}
