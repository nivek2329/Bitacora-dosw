package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 2 - #08 Evoluciones preparadas (filter). */
public class Ejercicio08 {
    public static void main(String[] args) {
        List<PokemonBasico> equipo = List.of(
                new PokemonBasico("Pikachu", "Electrico", 30, true),
                new PokemonBasico("Raichu", "Electrico", 55, false),
                new PokemonBasico("Charmander", "Fuego", 25, true),
                new PokemonBasico("Charizard", "Fuego", 78, false),
                new PokemonBasico("Squirtle", "Agua", 28, true),
                new PokemonBasico("Blastoise", "Agua", 80, false)
        );

        List<String> listosParaEvolucionar = equipo.stream()
                .filter(PokemonBasico::isPuedeEvolucionar)
                .map(PokemonBasico::getNombre)
                .collect(Collectors.toList());

        System.out.println("Listos para evolucionar: " + listosParaEvolucionar);
    }
}
