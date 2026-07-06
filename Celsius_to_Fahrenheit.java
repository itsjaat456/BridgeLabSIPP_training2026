import java.util.Scanner;
public class Celsius_to_Fahrenheit {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("enter temp = ");
       int celsius = sc.nextInt();
       System.out.println("conver celcius into farenheit = "+((celsius * 9/5) + 32));
    }
}
