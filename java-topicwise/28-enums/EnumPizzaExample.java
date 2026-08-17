enum PizzaSize {
    SMALL,
    MEDIUM,
    LARGE
}

class Pizza {

    String name;
    PizzaSize size;

    Pizza(String name, PizzaSize size) {
        this.name = name;
        this.size = size;
    }

    void displayPizza() {
        System.out.println("Pizza: " + name);
        System.out.println("Size : " + size);
    }
}

public class EnumPizzaExample {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Margherita", PizzaSize.SMALL);
        Pizza pizza2 = new Pizza("Farmhouse", PizzaSize.MEDIUM);
        Pizza pizza3 = new Pizza("Pepperoni", PizzaSize.LARGE);

        pizza1.displayPizza();
        System.out.println();

        pizza2.displayPizza();
        System.out.println();

        pizza3.displayPizza();
    }
}