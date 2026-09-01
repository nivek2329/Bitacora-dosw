package ejercicio08;

import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private Size size = Size.MEDIUM;
    private Meat meat = Meat.SINGLE_BEEF;
    private final List<String> toppings = new ArrayList<>();
    private final List<String> sides = new ArrayList<>();

    public OrderBuilder setSize(Size size) {
        this.size = size;
        return this;
    }

    public OrderBuilder setMeat(Meat meat) {
        this.meat = meat;
        return this;
    }

    public OrderBuilder addTopping(String... items) {
        toppings.addAll(List.of(items));
        return this;
    }

    public OrderBuilder addSide(String... items) {
        sides.addAll(List.of(items));
        return this;
    }

    public Order build() {
        return Order.of(size, meat, toppings, sides);
    }
}
