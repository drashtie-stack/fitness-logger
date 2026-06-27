class Record {
    static double maxCalories = 0;

    static void checkRecord(double calories) {
        if (calories > maxCalories) {
            maxCalories = calories;
            System.out.println("New Personal Best!");
        }
    }
}