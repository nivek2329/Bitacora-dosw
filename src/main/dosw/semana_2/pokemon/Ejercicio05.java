package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 1 - #05 Pokemon legendarios por nivel (filter + count). */
public class Ejercicio05 {
    public static void main(String[] args) {
        List<PokemonBasico> equipo = List.of(
                new PokemonBasico("Pikachu", "Electrico", 45, false),
                new PokemonBasico("Mewtwo", "Psiquico", 88, false),
                new PokemonBasico("Dragonite", "Dragon", 82, false),
                new PokemonBasico("Squirtle", "Agua", 38, false),
                new PokemonBasico("Mew", "Psiquico", 85, false),
                new PokemonBasico("Charmander", "Fuego", 62, false)
        );

        List<String> nivelAlto = equipo.stream()
                .filter(p -> p.getNivel() > 80)
                .map(PokemonBasico::getNombre)
                .collect(Collectors.toList());

        System.out.println("Pokemon con nivel > 80: " + nivelAlto.size() + " " + nivelAlto);
    }
}
