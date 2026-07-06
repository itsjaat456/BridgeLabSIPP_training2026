import java.util.Scanner;
public class PowerCalculation {
    public static int cal(int b,int e){
        if(e==1) return b;
        return b*cal(b,e-1);
    }
    public  static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter base = ");
        int b =sc.nextInt();
        System.out.print("enter exponential = ");
        int e = sc.nextInt();
        System.out.println("Power calculate = " + cal(b,e));
    }
}
