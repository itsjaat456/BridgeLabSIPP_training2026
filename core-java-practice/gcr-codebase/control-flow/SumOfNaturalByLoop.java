import java.util.Scanner;
public class SumOfNaturalByLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no = ");
        int n = sc.nextInt();
        int sum1 = n*(n+1)/2;
        int sum = 0;
        if(n>0)
        while(n>0){
            sum+=n;
            n--;
        }
        else{
            System.out.println("it is not natural");
        }
        if(sum==sum1){
            System.out.println("both calculate same sum");
        }
        else{
            System.out.println("both not calculate same sum");
        }
    }
}
