package ejercicio05;

/**
 * Demostracion: Adapter + Facade.
 * Adapter traduce la interfaz moderna PaymentProcessor a la interfaz
 * incompatible del banco legado (centavos, executeTransaction).
 * Facade esconde los 8 pasos de inicializacion detras de un solo metodo
 * simple: procesarPago(monto). La Facade usa el Adapter internamente.
 */
public class Main {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade("ACC-00123");
        facade.procesarPago(250.50);
    }
}
