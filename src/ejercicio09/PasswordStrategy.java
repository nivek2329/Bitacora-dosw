package ejercicio09;

public class PasswordStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials c) {
        System.out.println("[Auth] Validando usuario/contrasena para " + c.getUsuario());
        return new AuthResult(true, "Autenticado con usuario y contrasena");
    }
}
