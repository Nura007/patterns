public class FitnessPlanDirector {

    public FitnessPlan createWeightLossPlan() {
        return new FitnessPlan.Builder()
                .setGoal("Weight Loss")
                .setDurationWeeks(12)
                .setWorkoutsPerWeek(5)
                .setDietPlan("Low Carb")
                .includeCardio(true)
                .includeStrengthTraining(true)
                .build();
    }

    public FitnessPlan createMuscleGainPlan() {
        return new FitnessPlan.Builder()
                .setGoal("Muscle Gain")
                .setDurationWeeks(16)
                .setWorkoutsPerWeek(4)
                .setDietPlan("High Protein")
                .includeCardio(false)
                .includeStrengthTraining(true)
                .build();
    }

    public FitnessPlan createMaintenancePlan() {
        return new FitnessPlan.Builder()
                .setGoal("Maintain Fitness")
                .setDurationWeeks(8)
                .setWorkoutsPerWeek(3)
                .setDietPlan("Balanced")
                .includeCardio(true)
                .includeStrengthTraining(false)
                .build();
    }
}
