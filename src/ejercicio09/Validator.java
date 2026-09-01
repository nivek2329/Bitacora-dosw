package ejercicio09;

public abstract class Validator {
    private Validator next;

    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }

    public boolean validate(Credentials c) {
        if (!check(c)) {
            System.out.println("[" + getClass().getSimpleName() + "] RECHAZADO");
            return false;
        }
        System.out.println("[" + getClass().getSimpleName() + "] OK");
        if (next != null) {
            return next.validate(c);
        }
        return true;
    }

    protected abstract boolean check(Credentials c);
}
