package ejercicio05;

// Simula un servicio bancario antiguo con una interfaz incompatible.
public class LegacyBankService {
    public boolean executeTransaction(String accountRef, int cents) {
        System.out.println("[LEGACY] Ejecutando transaccion en cuenta " + accountRef
                + " por " + cents + " centavos");
        return true;
    }

    public int verifyBalance(String accountRef) {
        System.out.println("[LEGACY] Verificando saldo de la cuenta " + accountRef);
        return 100000; // saldo simulado en centavos
    }
}
