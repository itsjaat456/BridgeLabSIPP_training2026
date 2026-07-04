import java.util.*;
public class Counter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter counter");
        int c = sc.nextInt();
        while(c>1){
            System.out.println(c);
            c--;
        }
    }
}
