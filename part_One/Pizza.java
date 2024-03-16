import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 class Pizza {
    private String size;
    private String chainName;
    private List<String> toppings;

    private Pizza(String chainName, String size)
    {
        this.chainName = chainName;
        toppings = new ArrayList<>();
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public void addTopping(String topping)
    {
        toppings.add(topping);
    }

    public void eat()
    {
        System.out.println("Ate " + size + "-sized pizza from " + chainName + " with toppings:\n");
        for (String topping : toppings)
        {
            System.out.println("- " + topping);
        }
        System.out.println();
    }

    public static class PizzaBuilder {
    private List<String> availableToppings = Arrays.asList(
    "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
    "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
    "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"
    );

    private List<String> availableSizes = Arrays.asList("Small", "Medium", "Large");

    private Pizza pizza;

    public PizzaBuilder(String chainName, String size)
    {
        if (checkSize(size) == true)
        {
            pizza = new Pizza(chainName, size);
        } else {
            System.out.println("Pizza size isn't valid!");
            return;
        }
    }

    public boolean checkSize(String size)
    {
        if (availableSizes.contains(size))
        {
            return true;
        } else {
            return false;
        }
    }

    public PizzaBuilder addTopping(String topping)
    {
        if (availableToppings.contains(topping))
        {
            pizza.addTopping(topping);
            return this;
        } else {
            System.err.println("ERROR: Unavailable Topping: " + topping);
            return null;
        }
    }

    public Pizza build()
    {
        return pizza;
    }
    }
}