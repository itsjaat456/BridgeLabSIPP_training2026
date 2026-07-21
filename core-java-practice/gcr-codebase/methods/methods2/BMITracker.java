import java.util.Scanner;

public class BMITracker {

    public static void calculateBMI(double[][] persons) {

        for (int i = 0; i < persons.length; i++) {

            double weight = persons[i][0];
            double heightMeter = persons[i][1] / 100.0;

            persons[i][2] = weight / (heightMeter * heightMeter);
        }
    }

    public static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < 10; i++) {

            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    getStatus(persons[i][2]));
        }
    }
}