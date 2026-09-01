package ejercicio01;

public class TarjetaStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando $" + amount + " con Tarjeta de credito");
    }
}
