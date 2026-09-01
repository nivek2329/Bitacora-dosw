package ejercicio09;

public class CredentialValidator extends Validator {
    @Override
    protected boolean check(Credentials c) {
        return c.getUsuario() != null && !c.getUsuario().isBlank();
    }
}
