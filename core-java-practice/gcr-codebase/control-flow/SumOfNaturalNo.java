import java.util.Scanner;
public class SumOfNaturalNo {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter n = ");
        int n = sc.nextInt();
        if(n>=0) {
            System.out.println(n * (n + 1) / 2);
        }
        else {
            System.out.println("the no is not natural");
        }
    }
}
