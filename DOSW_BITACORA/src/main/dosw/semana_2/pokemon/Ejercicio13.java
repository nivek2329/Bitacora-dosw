package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Nivel 3 - #13 Organizar por tipo (groupingBy). */
public class Ejercicio13 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(2L, "Psyduck", "Agua", 40, 230, "Kanto", false),
                new Pokemon(3L, "Charmander", "Fuego", 62, 300, "Kanto", false),
                new Pokemon(4L, "Vulpix", "Fuego", 55, 280, "Kanto", false),
                new Pokemon(5L, "Bulbasaur", "Planta", 29, 200, "Kanto", false)
        );

        Map<String, List<String>> porTipo = equipo.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        Collectors.mapping(Pokemon::getNombre, Collectors.toList())));

        porTipo.forEach((tipo, nombres) -> System.out.println(tipo + ": " + nombres));
    }
}
