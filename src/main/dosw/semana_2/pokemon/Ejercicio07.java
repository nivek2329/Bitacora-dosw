package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 2 - #07 Orden del profesor Oak (sorted). */
public class Ejercicio07 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Squirtle", "Pikachu", "Mewtwo", "Bulbasaur", "Charmander", "Abra");

        List<String> ordenados = nombres.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Pokedex ordenada: " + ordenados);
    }
}
