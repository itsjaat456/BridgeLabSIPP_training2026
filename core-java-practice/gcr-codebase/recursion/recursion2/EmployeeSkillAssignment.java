import java.util.Scanner;

public class EmployeeSkillAssignment {

    public static void findTeams(int[] skills, int index,
                                 int target,
                                 int currentSum,
                                 String team) {

        if (index == skills.length) {

            if (currentSum == target)
                System.out.println("Team: [" + team + "]");

            return;
        }

        String newTeam;

        if (team.isEmpty())
            newTeam = String.valueOf(skills[index]);
        else
            newTeam = team + ", " + skills[index];

        findTeams(skills,
                index + 1,
                target,
                currentSum + skills[index],
                newTeam);

        findTeams(skills,
                index + 1,
                target,
                currentSum,
                team);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] skills = new int[n];

        System.out.println("Enter skill scores:");

        for (int i = 0; i < n; i++)
            skills[i] = sc.nextInt();

        System.out.print("Enter target skill score: ");
        int target = sc.nextInt();

        System.out.println("\nPossible Teams:");

        findTeams(skills, 0, target, 0, "");
    }
}