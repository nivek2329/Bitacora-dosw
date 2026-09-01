package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 2 - #06 Pokedex sin duplicados (distinct). */
public class Ejercicio06 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Pikachu", "Charmander", "Pikachu", "Squirtle", "Charmander", "Mewtwo");

        List<String> sinDuplicados = nombres.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Pokedex sin duplicados: " + sinDuplicados);
    }
}
