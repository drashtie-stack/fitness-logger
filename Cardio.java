class Cardio extends Workout {
    double MET;

    Cardio(String name, double duration, double MET) {
        super(name, duration);
        this.MET = MET;
    }

    @Override
    double calculateBurn(double weight) {
        double timeInHours = duration / 60.0;
        return MET * weight * timeInHours;
    }
}