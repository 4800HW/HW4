package part_Two;

import java.util.Random;

// Abstract Factory
interface MealFactory {
    Carbs createCarbs();
    Protein createProtein();
    Fats createFats();
}

interface Carbs {
    String getCarb();
}

interface Protein {
    String getProtein();
}

interface Fats {
    String getFat();
}

// Concrete Factory for Carbs
class CarbsFactory implements MealFactory {
    @Override
    public Carbs createCarbs() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomCarb();
            case "Paleo":
                return new PaleoCarbs();
            case "Vegan":
                return new VeganCarbs();
            case "Nut Allergy":
                return new NutAllergyCarbs();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Protein createProtein() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomProtein();
            case "Paleo":
                return new PaleoProtein();
            case "Vegan":
                return new VeganProtein();
            case "Nut Allergy":
                return new NutAllergyProtein();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Fats createFats() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomFats();
            case "Paleo":
                return new PaleoFats();
            case "Vegan":
                return new VeganFats();
            case "Nut Allergy":
                return new NutAllergyFats();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }
}

// Concrete Factory for Protein
class ProteinFactory implements MealFactory {
    @Override
    public Carbs createCarbs() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomCarb();
            case "Paleo":
                return new PaleoCarbs();
            case "Vegan":
                return new VeganCarbs();
            case "Nut Allergy":
                return new NutAllergyCarbs();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Protein createProtein() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomProtein();
            case "Paleo":
                return new PaleoProtein();
            case "Vegan":
                return new VeganProtein();
            case "Nut Allergy":
                return new NutAllergyProtein();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Fats createFats() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomFats();
            case "Paleo":
                return new PaleoFats();
            case "Vegan":
                return new VeganFats();
            case "Nut Allergy":
                return new NutAllergyFats();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }
}


// Concrete Factory for Fats
class FatsFactory implements MealFactory {
    @Override
    public Carbs createCarbs() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomCarb();
            case "Paleo":
                return new PaleoCarbs();
            case "Vegan":
                return new VeganCarbs();
            case "Nut Allergy":
                return new NutAllergyCarbs();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Protein createProtein() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomProtein();
            case "Paleo":
                return new PaleoProtein();
            case "Vegan":
                return new VeganProtein();
            case "Nut Allergy":
                return new NutAllergyProtein();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }

    @Override
    public Fats createFats() {
        switch (MealFactoryManager.getInstance().getCurrentDietPlan()) {
            case "No Restriction":
                return new RandomFats();
            case "Paleo":
                return new PaleoFats();
            case "Vegan":
                return new VeganFats();
            case "Nut Allergy":
                return new NutAllergyFats();
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }
}

// Create specific Carbs implementations for each diet plan
class PaleoCarbs implements Carbs {
    @Override
    public String getCarb() {
        // Return only Pistachio for Paleo diet
        return "Pistachio";
    }
}

class VeganCarbs implements Carbs {
    @Override
    public String getCarb() {

        String[] options = {"Bread", "Lentils", "Pistachio"};
        return options[new Random().nextInt(options.length)];
    }
}

class NutAllergyCarbs implements Carbs {
    @Override
    public String getCarb() {

        String[] options = {"Cheese", "Bread", "Lentils"};
        return options[new Random().nextInt(options.length)];
    }
}

// Create specific Protein implementations for each diet plan
class PaleoProtein implements Protein {
    @Override
    public String getProtein() {
        // Exclude Tofu for Paleo diet
        String[] options = {"Fish", "Chicken", "Beef"};
        return options[new Random().nextInt(options.length)];
    }
}

class VeganProtein implements Protein {
    @Override
    public String getProtein() {

        String[] options = {"Beef", "Tofu"};
        return options[new Random().nextInt(options.length)];
    }
}

class NutAllergyProtein implements Protein {
    @Override
    public String getProtein() {
        // No restriction for Nut Allergy
        return new RandomProtein().getProtein();
    }
}

// Create specific Fats implementations for each diet plan
class PaleoFats implements Fats {
    @Override
    public String getFat() {

        String[] options = {"Avocado", "Tuna", "Peanuts"};
        return options[new Random().nextInt(options.length)];
    }
}

class VeganFats implements Fats {
    @Override
    public String getFat() {
        
        String[] options = {"Avocado", "Peanuts"};
        return options[new Random().nextInt(options.length)];
    }
}

class NutAllergyFats implements Fats {
    @Override
    public String getFat() {

        return new RandomFats().getFat();
    }
}

// Concrete Products for Protein
class RandomProtein implements Protein {
    private static final String[] PROTEIN_OPTIONS = {"Fish", "Chicken", "Beef", "Tofu"};
    private Random random;

    public RandomProtein() {
        random = new Random();
    }

    @Override
    public String getProtein() {
        return PROTEIN_OPTIONS[random.nextInt(PROTEIN_OPTIONS.length)];
    }
}

class RandomCarb implements Carbs {
    private static final String[] CARB_OPTIONS = {"Cheese", "Bread", "Lentils", "Pistachio"};
    private Random random;

    public RandomCarb() {
        random = new Random();
    }

    @Override
    public String getCarb() {
        return CARB_OPTIONS[random.nextInt(CARB_OPTIONS.length)];
    }
}

class RandomFats implements Fats {
    private static final String[] FAT_OPTIONS = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    private Random random;

    public RandomFats() {
        random = new Random();
    }

    @Override
    public String getFat() {
        return FAT_OPTIONS[random.nextInt(FAT_OPTIONS.length)];
    }
}