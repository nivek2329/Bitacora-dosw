package ejercicio09;

public class PermissionValidator extends Validator {
    @Override
    protected boolean check(Credentials c) {
        return !c.getTipoUsuario().equalsIgnoreCase("bloqueado");
    }
}
