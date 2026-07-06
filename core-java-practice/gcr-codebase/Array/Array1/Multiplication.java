package Array1;

import java.util.Scanner;

public class Multiplication {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int arr [] = new int[41];
            for(int j = 0;j<4;j++) {
                for (int i = 0; i < 10; i++) {
                    arr[i + (1 + (j * 10))] = (i + 1) * m;
                }
                m++;
            }
            for(int i:arr){
                System.out.println(i);
            }
        }
    }


