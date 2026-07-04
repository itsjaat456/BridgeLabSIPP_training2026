import java.util.Scanner;
public class TriangleChecker {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter value of x = ");
        int x = sc.nextInt();
        System.out.print("enter value of y = ");
        int y = sc.nextInt();
        System.out.print("enter value of z = ");
        int z = sc.nextInt();
        if(x+y+z==180){
            System.out.println("The given angles are internal angles of a triangle");
        }
        else{
            System.out.println("they are not");
        }
    }
}
