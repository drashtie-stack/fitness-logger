import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Weight: ");
            double weight = sc.nextDouble();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            User user = new User(name, weight, age);

            System.out.println("Choose Workout: 1.Cardio 2.Strength");
            int choice = sc.nextInt();

            System.out.print("Enter Duration (minutes): ");
            double duration = sc.nextDouble();

            if (duration <= 0) {
                throw new InvalidDataException("Duration must be positive!");
            }

            Workout workout;
            double calories;

            if (choice == 1) {
                System.out.print("Enter MET value: ");
                double MET = sc.nextDouble();
                workout = new Cardio("Running", duration, MET);
            } else {
                workout = new StrengthTraining("Weight Lifting", duration);
            }

            calories = workout.calculateBurn(weight);

            System.out.println("Calories Burned: " + calories);

            Record.checkRecord(calories);

            FileManager.saveData(workout.workoutName + "," + calories);

        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}