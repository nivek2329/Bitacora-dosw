package ejercicio09;

public class GoogleStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials c) {
        System.out.println("[Auth] Validando token de Google para " + c.getUsuario());
        return new AuthResult(true, "Autenticado con Google");
    }
}
