package Array1;

import java.util.Scanner;
public class StoreUntilEnterZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
       double total = 0.0;
       int i =0;
       while(true){
           arr[i] = sc.nextInt();
           if(arr[i]<=0){
               break;
           }
           total+=arr[i];
           i++;
       }
       for(int el :arr){
           System.out.println(el);
       }
    }
}
