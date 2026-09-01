package dosw.semana_2.pokemon;

import java.util.List;
import java.util.stream.Collectors;

/** Nivel 1 - #01 Pokemon tipo Fuego (filter). */
public class Ejercicio01 {
    public static void main(String[] args) {
        List<PokemonBasico> equipo = List.of(
                new PokemonBasico("Pikachu", "Electrico", 45, false),
                new PokemonBasico("Charmander", "Fuego", 62, false),
                new PokemonBasico("Squirtle", "Agua", 38, false),
                new PokemonBasico("Vulpix", "Fuego", 55, false),
                new PokemonBasico("Bulbasaur", "Planta", 29, false),
                new PokemonBasico("Flareon", "Fuego", 71, false)
        );

        List<String> tipoFuego = equipo.stream()
                .filter(p -> p.getTipo().equals("Fuego"))
                .map(PokemonBasico::getNombre)
                .collect(Collectors.toList());

        System.out.println("Pokemon tipo Fuego: " + tipoFuego);
    }
}
