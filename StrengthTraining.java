class StrengthTraining extends Workout {

    StrengthTraining(String name, double duration) {
        super(name, duration);
    }

    @Override
    double calculateBurn(double weight) {
        return (5 * weight * duration) / 60;
    }
}