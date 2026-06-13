public class PizzaOverloading {

    static void bakePizza() {
        System.out.println("Baking a regular pizza.");
    }

    static void bakePizza(String size) {
        System.out.println("Baking a " + size + " pizza.");
    }

    static void bakePizza(String size, String topping) {
        System.out.println("Baking a " + size + " pizza with " + topping + ".");
    }

    static void bakePizza(String size, String topping, int quantity) {
        System.out.println("Baking " + quantity + " " + size + " pizzas with " + topping + ".");
    }

    public static void main(String[] args) {

        bakePizza();
        bakePizza("Medium");
        bakePizza("Large", "Cheese");
        bakePizza("Small", "Pepperoni", 2);

    }
}