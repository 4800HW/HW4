package part_Two;

public class driver {
    public static void main(String[] args) {
        // Create 6 customers with different diet plans
        Customer[] customers = {
            new Customer("John", "No Restriction"),
            new Customer("Alice", "Paleo"),
            new Customer("Emily", "Nut Allergy"),
            new Customer("David", "No Restriction"),
            new Customer("Emma", "Paleo"),
            new Customer("Bob", "Vegan"),
        };

        // Generate meals for each customer
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer.getName()); 
            MealFactoryManager.getInstance().setCurrentDietPlan(customer.getDietPlan());
            MealFactory mealFactory = MealFactoryManager.getInstance().getCurrentMealFactory();
            Carbs carbs = mealFactory.createCarbs();
            Protein protein = mealFactory.createProtein();
            Fats fats = mealFactory.createFats();
            System.out.println("Carb: " + carbs.getCarb());
            System.out.println("Protein: " + protein.getProtein());
            System.out.println("Fats: " + fats.getFat());
            System.out.println("----------------------");
        }
    }
}