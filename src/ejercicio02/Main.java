package ejercicio02;

/**
 * Demostracion: Observer + Factory Method.
 * Observer desacopla el Pedido de los canales de notificacion.
 * Factory Method construye el mensaje correcto (HTML, texto o JSON)
 * para cada canal, sin que el Observer sepa como armar el contenido.
 */
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("PED-2026-001");
        pedido.addObserver(new EmailNotifier());
        pedido.addObserver(new SmsNotifier());
        pedido.addObserver(new PushNotifier());

        pedido.cambiarEstado("CONFIRMADO");
        System.out.println();
        pedido.cambiarEstado("EN CAMINO");
    }
}
