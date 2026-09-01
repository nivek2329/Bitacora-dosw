package ejercicio08;

/**
 * Demostracion: Builder + Observer.
 * Builder garantiza que el pedido quede completo y valido (inmutable)
 * antes de existir. Observer desacopla la confirmacion del pedido de los
 * subsistemas que reaccionan a ella (cocina, facturacion, domicilio).
 */
public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setSize(Size.LARGE)
                .setMeat(Meat.DOUBLE_BEEF)
                .addTopping("queso", "lechuga")
                .addSide("papas", "gaseosa")
                .build();

        order.addObserver(new KitchenService());
        order.addObserver(new BillingService());
        order.addObserver(new DeliveryService());

        System.out.println("Pedido construido: " + order);
        order.confirm();
    }
}
