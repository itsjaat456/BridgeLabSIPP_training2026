import java.util.Scanner;

public class CounterByForLoop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter counter");
        int c = sc.nextInt();
        for(int i = c;i>1;i--){
            System.out.println(i);
        }
    }
}
