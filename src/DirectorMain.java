public class DirectorMain {
    public static void main(String[] args) {
        FitnessPlanDirector director = new FitnessPlanDirector();

        FitnessPlan weightLossPlan = director.createWeightLossPlan();
        FitnessPlan muscleGainPlan = director.createMuscleGainPlan();
        FitnessPlan maintenancePlan = director.createMaintenancePlan();

        System.out.println(weightLossPlan);
        System.out.println(muscleGainPlan);
        System.out.println(maintenancePlan);
    }
}
