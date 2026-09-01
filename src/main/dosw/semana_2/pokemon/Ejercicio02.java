package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 1 - #02 Pokedex gritona (map). */
public class Ejercicio02 {
    public static void main(String[] args) {
        List<String> nombres = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur");

        List<String> gritona = nombres.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(String.join(", ", gritona));
    }
}
