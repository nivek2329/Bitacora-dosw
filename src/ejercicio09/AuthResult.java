package ejercicio09;

public class AuthResult {
    private final boolean exitoso;
    private final String mensaje;

    public AuthResult(boolean exitoso, String mensaje) {
        this.exitoso = exitoso;
        this.mensaje = mensaje;
    }

    public boolean isExitoso() { return exitoso; }
    public String getMensaje() { return mensaje; }
}
