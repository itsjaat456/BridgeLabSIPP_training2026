import java.util.Scanner;
public class CheckNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age = ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(" the no is zero");
        }
        else if(n>0){
            System.out.println("the no is positive");
        }
        else{
            System.out.println("the no is negative");
        }
    }
}
