public class driver {
    public static void main(String[] args) {
        
        Pizza pizzaHut1 = new Pizza.PizzaBuilder("Pizza Hut", "Large")
                            .addTopping("Pepperoni")
                            .addTopping("Mushrooms")
                            .build();

        Pizza pizzaHut2 = new Pizza.PizzaBuilder("Pizza Hut", "Small")
                            .addTopping("Pepperoni")
                            .addTopping("Extra Cheese")
                            .build();

        Pizza littleCaesars1 = new Pizza.PizzaBuilder("Little Caesars", "Medium")
                            .addTopping("Pepperoni")
                            .addTopping("Sausage")
                            .addTopping("Mushrooms")
                            .addTopping("Bacon")
                            .addTopping("Onions")
                            .addTopping("Extra Cheese")
                            .addTopping("Peppers")
                            .addTopping("Chicken")
                            .build();

        Pizza littleCaesars2 = new Pizza.PizzaBuilder("Little Caesars", "Small")
                            .addTopping("Pepperoni")
                            .addTopping("Sausage")
                            .addTopping("Mushrooms")
                            .addTopping("Bacon")
                            .addTopping("Peppers")
                            .addTopping("Chicken")
                            .build();

        Pizza dominos1 = new Pizza.PizzaBuilder("Dominos", "Small")
                            .addTopping("Ham and Pineapple")
                            .build();

        Pizza dominos2 = new Pizza.PizzaBuilder("Dominos", "Large")
                            .addTopping("Sausage")
                            .addTopping("Spicy Pork")
                            .addTopping("Tomato and Basil")
                            .build();

        pizzaHut1.eat();
        pizzaHut2.eat();
        littleCaesars1.eat();
        littleCaesars2.eat();
        dominos1.eat();
        dominos2.eat();
    }
}
