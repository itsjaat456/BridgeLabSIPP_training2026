package Array1;
import java.util.Scanner;
public class MultiplicationOfNo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int arr [] = new int[10];
        for (int i = 0;i<10;i++){
            arr[i] = (i+1)*m;
        }
        for(int i =0;i<10;i++){
            System.out.println(m+" * "+(i+1)+" = "+(m*(i+1)));
        }
    }
}
