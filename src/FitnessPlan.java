public class FitnessPlan {
    private final String goal;
    private final int durationWeeks;
    private final int workoutsPerWeek;
    private final String dietPlan;
    private final boolean includesCardio;
    private final boolean includesStrengthTraining;


    private FitnessPlan(Builder builder) {
        this.goal = builder.goal;
        this.durationWeeks = builder.durationWeeks;
        this.workoutsPerWeek = builder.workoutsPerWeek;
        this.dietPlan = builder.dietPlan;
        this.includesCardio = builder.includesCardio;
        this.includesStrengthTraining = builder.includesStrengthTraining;
    }

    @Override
    public String toString() {
        return "FitnessPlan {" +
                "goal='" + goal + '\'' +
                ", durationWeeks=" + durationWeeks +
                ", workoutsPerWeek=" + workoutsPerWeek +
                ", dietPlan='" + dietPlan + '\'' +
                ", includesCardio=" + includesCardio +
                ", includesStrengthTraining=" + includesStrengthTraining +
                '}';
    }

    // Builder
    public static class Builder {
        private String goal;
        private int durationWeeks;
        private int workoutsPerWeek;
        private String dietPlan;
        private boolean includesCardio;
        private boolean includesStrengthTraining;

        public Builder setGoal(String goal) {
            this.goal = goal;
            return this;
        }

        public Builder setDurationWeeks(int weeks) {
            this.durationWeeks = weeks;
            return this;
        }

        public Builder setWorkoutsPerWeek(int count) {
            this.workoutsPerWeek = count;
            return this;
        }

        public Builder setDietPlan(String dietPlan) {
            this.dietPlan = dietPlan;
            return this;
        }

        public Builder includeCardio(boolean value) {
            this.includesCardio = value;
            return this;
        }

        public Builder includeStrengthTraining(boolean value) {
            this.includesStrengthTraining = value;
            return this;
        }

        public FitnessPlan build() {
            return new FitnessPlan(this);
        }
    }
}
