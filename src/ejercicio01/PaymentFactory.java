package ejercicio01;

public interface PaymentFactory {
    PaymentStrategy create(String type);
}
