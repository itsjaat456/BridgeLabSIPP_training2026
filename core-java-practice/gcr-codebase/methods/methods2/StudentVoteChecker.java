import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility");

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid Age");
            } else if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + ": Can Vote");
            } else {
                System.out.println("Student " + (i + 1) + ": Cannot Vote");
            }
        }
    }
}