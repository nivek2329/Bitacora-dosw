package ejercicio05;

// Adapter: traduce la interfaz moderna PaymentProcessor a la interfaz legada.
public class LegacyBankAdapter implements PaymentProcessor {
    private final LegacyBankService legacy;
    private final String accountRef;

    public LegacyBankAdapter(LegacyBankService legacy, String accountRef) {
        this.legacy = legacy;
        this.accountRef = accountRef;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) Math.round(amount * 100); // traduccion de unidades
        legacy.executeTransaction(accountRef, cents);
    }
}
