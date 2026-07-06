package Array1;

import java.util.Scanner;
public class Copy2DInto1DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row = ");
        int row = sc.nextInt();
        System.out.print("enter col = ");
        int col = sc.nextInt();
        int [][] arr = new int[row][col];

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = 0;
        int ans[] = new int[row*col];
        for(int i = 0;i<row;i++){
           for(int j = 0;j<col;j++){
               ans[k++] = arr[i][j];
           }
        }
        for(int el : ans){
            System.out.println(el);
        }
    }
}
