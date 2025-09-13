public class FitnessMain {
    public static void main(String[] args) {
        FitnessPlan weightLossPlan = new FitnessPlan.Builder()
                .setGoal("Weight Loss")
                .setDurationWeeks(12)
                .setWorkoutsPerWeek(5)
                .setDietPlan("Low Carb")
                .includeCardio(true)
                .includeStrengthTraining(true)
                .build();

        FitnessPlan muscleGainPlan = new FitnessPlan.Builder()
                .setGoal("Muscle Gain")
                .setDurationWeeks(16)
                .setWorkoutsPerWeek(4)
                .setDietPlan("High Protein")
                .includeCardio(false)
                .includeStrengthTraining(true)
                .build();

        System.out.println(weightLossPlan);
        System.out.println(muscleGainPlan);
    }
}
