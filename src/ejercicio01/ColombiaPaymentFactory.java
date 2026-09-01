package ejercicio01;

public class ColombiaPaymentFactory implements PaymentFactory {
    @Override
    public PaymentStrategy create(String type) {
        return switch (type.toLowerCase()) {
            case "tarjeta" -> new TarjetaStrategy();
            case "pse" -> new PseStrategy();
            case "nequi" -> new NequiStrategy();
            default -> throw new IllegalArgumentException("Medio de pago no soportado en Colombia: " + type);
        };
    }
}
