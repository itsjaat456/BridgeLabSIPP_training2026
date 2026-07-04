import java.util.Scanner;
public class FindSmallestNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no  = ");
        int a = sc.nextInt();
        System.out.print("enter second no = ");
        int b = sc.nextInt();
        System.out.print("enter third no = ");
        int c = sc.nextInt();

        if(a<b && a<c){
            System.out.println(a +" is small");
        }
        else if(b<a && b<c){
            System.out.println(b+" is small");
        }
        else {
            System.out.println(c+" is small");
        }
    }
}
