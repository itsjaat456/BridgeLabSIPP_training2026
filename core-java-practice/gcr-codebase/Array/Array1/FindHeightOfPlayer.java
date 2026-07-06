package Array1;

import java.util.Scanner;
public class FindHeightOfPlayer {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double height[] = new double[11];

        double sum = 0.0;
        for(int i = 0;i<=10;i++){
            height[i]  = sc.nextInt();
            sum+=height[i];
        }
        System.out.println(sum/11);
    }
}
