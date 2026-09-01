package ejercicio09;

public interface AuthStrategy {
    AuthResult authenticate(Credentials c);
}
