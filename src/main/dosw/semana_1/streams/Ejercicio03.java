package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 03 - Nombres de usuarios activos.
 * Filtrar unicamente los usuarios activos, obtener sus nombres en
 * mayuscula y ordenados alfabeticamente.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 30, false),
                new User(3, "Beatriz", 22, true),
                new User(4, "David", 40, true),
                new User(5, "Elena", 19, false)
        );

        List<String> sortedUsers = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Usuarios activos (mayuscula, ordenados): " + sortedUsers);
    }
}
