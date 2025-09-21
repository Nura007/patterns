// Product
interface Workout {
    void start();
}

class CardioWorkout implements Workout {
    @Override
    public void start() {
        System.out.println("Starting a cardio workout: Running, cycling, HIIT...");
    }
}

class StrengthWorkout implements Workout {
    @Override
    public void start() {
        System.out.println("Starting a strength workout: Squats, bench press, deadlifts...");
    }
}

// Creator
abstract class WorkoutFactory {
    public abstract Workout createWorkout();
}

class CardioWorkoutFactory extends WorkoutFactory {
    @Override
    public Workout createWorkout() {
        return new CardioWorkout();
    }
}

class StrengthWorkoutFactory extends WorkoutFactory {
    @Override
    public Workout createWorkout() {
        return new StrengthWorkout();
    }
}

// Client
public class FactoryDemo {
    public static void main(String[] args) {
        WorkoutFactory cardioFactory = new CardioWorkoutFactory();
        Workout cardio = cardioFactory.createWorkout();
        cardio.start();

        WorkoutFactory strengthFactory = new StrengthWorkoutFactory();
        Workout strength = strengthFactory.createWorkout();
        strength.start();
    }
}
