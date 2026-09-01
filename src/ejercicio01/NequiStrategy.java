package ejercicio01;

public class NequiStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando $" + amount + " con Nequi");
    }
}
