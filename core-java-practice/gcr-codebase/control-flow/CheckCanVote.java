import java.util.Scanner;
public class CheckCanVote {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age = ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("the age is "+age+" he can vote");
        }
        else{
            System.out.println("the age is "+age+"  he can not vote");
        }
    }
}
