package ejercicio09;

public class BiometricStrategy implements AuthStrategy {
    @Override
    public AuthResult authenticate(Credentials c) {
        System.out.println("[Auth] Validando huella/biometria para " + c.getUsuario());
        return new AuthResult(true, "Autenticado con biometria");
    }
}
