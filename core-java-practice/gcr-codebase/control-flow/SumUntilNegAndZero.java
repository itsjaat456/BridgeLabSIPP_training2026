import java.util.Scanner;
public class SumUntilNegAndZero {

        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double total = 0.0;

            while (true){
               int temp = sc.nextInt();
               if(temp==0 || temp<0){
                   break;
               }
               total+=temp;
            }
            System.out.println(total);

    }
}
