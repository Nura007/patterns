// Abstract Products
interface WorkoutAF {
    void start();
}

interface DietPlan {
    void follow();
}

class WeightLossWorkout implements WorkoutAF {
    @Override
    public void start() {
        System.out.println("Starting weight loss workout: Cardio and light strength training...");
    }
}

class LowCarbDiet implements DietPlan {
    @Override
    public void follow() {
        System.out.println("Following a low-carb diet with calorie deficit...");
    }
}

class MuscleGainWorkout implements WorkoutAF {
    @Override
    public void start() {
        System.out.println("Starting muscle gain workout: Heavy strength training...");
    }
}

class HighProteinDiet implements DietPlan {
    @Override
    public void follow() {
        System.out.println("Following a high-protein diet with calorie surplus...");
    }
}

// Abstract Factory
interface FitnessPlanFactory {
    WorkoutAF createWorkout();
    DietPlan createDietPlan();
}

class WeightLossPlanFactory implements FitnessPlanFactory {
    @Override
    public WorkoutAF createWorkout() {
        return new WeightLossWorkout();
    }

    @Override
    public DietPlan createDietPlan() {
        return new LowCarbDiet();
    }
}

class MuscleGainPlanFactory implements FitnessPlanFactory {
    @Override
    public WorkoutAF createWorkout() {
        return new MuscleGainWorkout();
    }

    @Override
    public DietPlan createDietPlan() {
        return new HighProteinDiet();
    }
}

// Client
public class AbstractDemo {
    public static void main(String[] args) {
        FitnessPlanFactory weightLossFactory = new WeightLossPlanFactory();
        WorkoutAF weightLossWorkout = weightLossFactory.createWorkout();
        DietPlan weightLossDiet = weightLossFactory.createDietPlan();

        weightLossWorkout.start();
        weightLossDiet.follow();

        FitnessPlanFactory muscleGainFactory = new MuscleGainPlanFactory();
        WorkoutAF muscleGainWorkout = muscleGainFactory.createWorkout();
        DietPlan muscleGainDiet = muscleGainFactory.createDietPlan();

        muscleGainWorkout.start();
        muscleGainDiet.follow();
    }
}
