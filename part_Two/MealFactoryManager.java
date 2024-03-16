package part_Two;

public class MealFactoryManager {
    private static MealFactoryManager instance;
    private final MealFactory carbsFactory;
    private final MealFactory proteinFactory;
    private final MealFactory fatsFactory;
    private String currentDietPlan;

    private MealFactoryManager() {
        carbsFactory = new CarbsFactory();
        proteinFactory = new ProteinFactory();
        fatsFactory = new FatsFactory();
        currentDietPlan = "No Restriction";
    }

    public static MealFactoryManager getInstance() {
        if (instance == null) {
            instance = new MealFactoryManager();
        }
        return instance;
    }

    public MealFactory getCarbsFactory() {
        return carbsFactory;
    }

    public MealFactory getProteinFactory() {
        return proteinFactory;
    }

    public MealFactory getFatsFactory() {
        return fatsFactory;
    }

    public void setCurrentDietPlan(String dietPlan) {
        this.currentDietPlan = dietPlan;
    }

    public String getCurrentDietPlan() {
        return currentDietPlan;
    }

    public MealFactory getCurrentMealFactory() {
        switch (currentDietPlan) {
            case "No Restriction":
                return carbsFactory;
            case "Paleo":
                return proteinFactory;
            case "Vegan":
                return proteinFactory;
            case "Nut Allergy":
                return fatsFactory;
            default:
                throw new IllegalArgumentException("Invalid diet plan: " + currentDietPlan);
        }
    }
}