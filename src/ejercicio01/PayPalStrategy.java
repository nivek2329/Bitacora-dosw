package ejercicio01;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando $" + amount + " con PayPal");
    }
}
