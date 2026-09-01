package ejercicio01;

/**
 * Demostracion: Strategy + Factory Method.
 * Strategy encapsula el algoritmo de pago (COMO se paga).
 * Factory Method decide QUIEN construye el objeto Strategy correcto
 * segun el pais del usuario, sin que el Checkout conozca la clase concreta.
 */
public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        System.out.println("--- Usuario en Colombia ---");
        PaymentFactory factoriaColombia = new ColombiaPaymentFactory();
        checkout.pagar(factoriaColombia, "nequi", 150000);
        checkout.pagar(factoriaColombia, "pse", 89000);

        System.out.println("--- Usuario en USA ---");
        PaymentFactory factoriaUsa = new UsaPaymentFactory();
        checkout.pagar(factoriaUsa, "paypal", 49.99);
        checkout.pagar(factoriaUsa, "tarjeta", 120.0);
    }
}
