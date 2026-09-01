package ejercicio01;

public class Checkout {
    // El Checkout solo conoce la interfaz PaymentStrategy, no la implementacion concreta.
    public void pagar(PaymentFactory factory, String medio, double monto) {
        PaymentStrategy strategy = factory.create(medio);
        strategy.process(monto);
    }
}
