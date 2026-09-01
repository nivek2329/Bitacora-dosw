package ejercicio09;

/**
 * Demostracion: Strategy + Chain of Responsibility.
 * Strategy elige el mecanismo de autenticacion segun el tipo de usuario.
 * Chain of Responsibility encadena las validaciones posteriores
 * (credenciales, permisos, ubicacion, horario laboral).
 */
public class Main {
    public static void main(String[] args) {
        AuthService authService = new AuthService();

        Credentials empleado = new Credentials("kevin", "empleado", "colombia", 10);
        authService.login(new PasswordStrategy(), empleado);

        System.out.println();
        Credentials fueraDeHorario = new Credentials("ana", "empleado", "colombia", 23);
        authService.login(new GoogleStrategy(), fueraDeHorario);
    }
}
