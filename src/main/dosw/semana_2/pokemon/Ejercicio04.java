package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/** Nivel 1 - #04 Pokemon Alfa (max con Comparator). */
public class Ejercicio04 {
    public static void main(String[] args) {
        List<PokemonBasico> equipo = List.of(
                new PokemonBasico("Pikachu", "Electrico", 45, false),
                new PokemonBasico("Charmander", "Fuego", 62, false),
                new PokemonBasico("Squirtle", "Agua", 38, false),
                new PokemonBasico("Snorlax", "Normal", 90, false),
                new PokemonBasico("Mewtwo", "Psiquico", 88, false)
        );

        equipo.stream()
                .max(Comparator.comparingInt(PokemonBasico::getNivel))
                .ifPresent(p -> System.out.println(
                        "Pokemon Alfa: " + p.getNombre() + " (nivel " + p.getNivel() + ")"));
    }
}
