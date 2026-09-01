package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/** Nivel 5 - #20 Pokedex analitica (groupingBy + counting, todo con Streams). */
public class Ejercicio20 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psiquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragon", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 78, 610, "Kanto", false),
                new Pokemon(7L, "Mew", "Psiquico", 85, 600, "Kanto", true),
                new Pokemon(8L, "Chikorita", "Planta", 20, 180, "Johto", false),
                new Pokemon(9L, "Totodile", "Agua", 23, 195, "Johto", false)
        );

        Map<String, Long> porTipo = pokedex.stream()
                .collect(Collectors.groupingBy(Pokemon::getTipo, Collectors.counting()));

        Map<String, Long> porRegion = pokedex.stream()
                .collect(Collectors.groupingBy(Pokemon::getRegion, Collectors.counting()));

        long legendarios = pokedex.stream()
                .filter(Pokemon::isLegendario)
                .count();

        double promedioNivel = pokedex.stream()
                .mapToInt(Pokemon::getNivel)
                .average()
                .orElse(0.0);

        String masFuerte = pokedex.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .map(p -> p.getNombre() + " (PC: " + (int) p.getPoderCombate() + ")")
                .orElse("N/A");

        System.out.println("Por tipo:     " + porTipo);
        System.out.println("Por region:   " + porRegion);
        System.out.println("Legendarios:  " + legendarios);
        System.out.printf("Promedio niv: %.1f%n", promedioNivel);
        System.out.println("Mas fuerte:   " + masFuerte);
    }
}
