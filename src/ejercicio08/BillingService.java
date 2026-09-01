package ejercicio08;

public class BillingService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Facturacion] Generando cuenta para: " + order);
    }
}
