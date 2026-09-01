package ejercicio01;

public class UsaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        return switch (type.toLowerCase()) {
            case "tarjeta" -> new TarjetaStrategy();
            case "paypal" -> new PayPalStrategy();
            default -> throw new IllegalArgumentException("Medio de pago no soportado en USA: " + type);
        };
    }
}
