package Array1;
import  java.util.*;
public class CheckNoPositiveOrNeg {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter no of input");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int el :arr){
            if(el<0){
                System.out.println("no is negative");
            }
            else if(el>0){
                System.out.println("no is positive");
                if(el%2==0){
                    System.out.println("no is even");
                }
                else{
                    System.out.println("no is odd");
                }
            }
            else {
                System.out.println("no is zero");
            }
        }
        if(arr[0]==arr[n-1]){
            System.out.println("both last and first equal");
        } else if (arr[0]>arr[n-1]) {
            System.out.println("first is greater");
        }
        else{
            System.out.println("last is greater");
        }
    }
}
