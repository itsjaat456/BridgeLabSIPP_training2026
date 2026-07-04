import java.util.Scanner;
public class MultiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i = s;i<=e;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i*j);
            }
            System.out.println();
        }
    }
}
