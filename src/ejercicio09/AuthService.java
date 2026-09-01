package ejercicio09;

public class AuthService {
    private final Validator cadenaValidacion;

    public AuthService() {
        CredentialValidator cred = new CredentialValidator();
        PermissionValidator perm = new PermissionValidator();
        LocationValidator loc = new LocationValidator();
        ScheduleValidator horario = new ScheduleValidator();
        cred.setNext(perm).setNext(loc).setNext(horario);
        this.cadenaValidacion = cred;
    }

    // Strategy selecciona COMO se autentica; la cadena valida QUE MAS se requiere despues.
    public void login(AuthStrategy strategy, Credentials credentials) {
        AuthResult result = strategy.authenticate(credentials);
        if (!result.isExitoso()) {
            System.out.println("Autenticacion fallida: " + result.getMensaje());
            return;
        }
        System.out.println(result.getMensaje() + ". Ejecutando validaciones posteriores...");
        boolean acceso = cadenaValidacion.validate(credentials);
        System.out.println("Acceso concedido: " + acceso);
    }
}
