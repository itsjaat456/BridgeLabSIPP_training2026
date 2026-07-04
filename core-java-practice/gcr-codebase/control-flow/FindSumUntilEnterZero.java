import java.util.Scanner;
public class FindSumUntilEnterZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        int temp = 0;
        while ((temp=sc.nextInt())!=0){
            total+=temp;
        }
        System.out.println(total);
    }
}
