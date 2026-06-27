abstract class Workout {
    String workoutName;
    double duration; // in minutes

    Workout(String workoutName, double duration) {
        this.workoutName = workoutName;
        this.duration = duration;
    }

    abstract double calculateBurn(double weight);
}