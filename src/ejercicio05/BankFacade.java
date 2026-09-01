package ejercicio05;

// Facade: expone un metodo simple y orquesta los 8 pasos de inicializacion.
public class BankFacade {
    private final PaymentProcessor adapter;
    private final LegacyBankService legacy;
    private final String accountRef;

    public BankFacade(String accountRef) {
        this.legacy = new LegacyBankService();
        this.accountRef = accountRef;
        this.adapter = new LegacyBankAdapter(legacy, accountRef);
    }

    public void procesarPago(double monto) {
        System.out.println("[FACADE] Paso 1-7: inicializando conexion, sesion, cifrado, "
                + "validaciones de seguridad con el banco legado...");
        int saldoCentavos = legacy.verifyBalance(accountRef);
        if (saldoCentavos < monto * 100) {
            System.out.println("[FACADE] Saldo insuficiente, pago rechazado.");
            return;
        }
        System.out.println("[FACADE] Paso 8: ejecutando el pago a traves del Adapter");
        adapter.pay(monto);
        System.out.println("[FACADE] Pago procesado exitosamente.");
    }
}
