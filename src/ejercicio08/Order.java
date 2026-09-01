package ejercicio08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
    private final Size size;
    private final Meat meat;
    private final List<String> toppings;
    private final List<String> sides;
    private final List<OrderObserver> observers = new ArrayList<>();

    // Constructor privado: solo el Builder puede crear un Order valido e inmutable.
    private Order(Size size, Meat meat, List<String> toppings, List<String> sides) {
        this.size = size;
        this.meat = meat;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(toppings));
        this.sides = Collections.unmodifiableList(new ArrayList<>(sides));
    }

    public static Order of(Size size, Meat meat, List<String> toppings, List<String> sides) {
        return new Order(size, meat, toppings, sides);
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void confirm() {
        for (OrderObserver o : observers) {
            o.onOrderConfirmed(this);
        }
    }

    @Override
    public String toString() {
        return "Hamburguesa " + size + " de " + meat + ", toppings=" + toppings + ", sides=" + sides;
    }
}
