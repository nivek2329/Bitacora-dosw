package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 04 - Personas mayores de edad.
 * Filtrar los usuarios mayores de edad y obtener sus nombres.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "Carlos", 25, true),
                new User(2, "Ana", 17, false),
                new User(3, "Beatriz", 22, true),
                new User(4, "David", 15, true),
                new User(5, "Elena", 19, false)
        );

        List<String> mayoresDeEdad = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .collect(Collectors.toList());

        System.out.println("Mayores de edad: " + mayoresDeEdad);
    }
}
