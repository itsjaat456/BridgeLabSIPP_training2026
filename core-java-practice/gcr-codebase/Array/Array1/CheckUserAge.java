package Array1;

import java.util.Scanner;
public class CheckUserAge {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no of student = ");
        int n = sc.nextInt();
        int[] age = new int[n];
        for(int i =0;i<n;i++){
            age[i] = sc.nextInt();
        }
        for(int el :age){
            if(el<0){
                System.out.println("age invalid");
            }
            else if(el>=18){
                System.out.println("eligible for vote");
            }

            else{
                System.out.println("not eligible for vote");
            }
        }
    }
}
