package ejercicio01;

public class PseStrategy implements PaymentStrategy {
    @Override
    public void process(double amount) {
        System.out.println("Procesando $" + amount + " con PSE");
    }
}
