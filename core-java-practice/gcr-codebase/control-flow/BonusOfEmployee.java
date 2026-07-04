import java.util.Scanner;
public class BonusOfEmployee {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter salary = ");
        int salary = sc.nextInt();
        System.out.print("enter year = ");
        int year = sc.nextInt();

        if(year>5){
            System.out.println("Bonus of salary = "+(salary*(5/100.0)));
        }
        else{
            System.out.println(0);
        }


    }
}
