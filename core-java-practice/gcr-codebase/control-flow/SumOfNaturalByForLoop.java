import java.util.Scanner;
public class SumOfNaturalByForLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no = ");
        int n = sc.nextInt();
        int sum1 = n*(n+1)/2;
        int sum = 0;
        if(n>0)
        for (int i = 1;i<=n;i++){
            sum+=i;
        }
        else{
            System.out.println("not natural no");
        }

        if(sum==sum1){
            System.out.println("both calculate same sum");
        }
        else {
            System.out.println("both cal different sum");
        }
    }
}
