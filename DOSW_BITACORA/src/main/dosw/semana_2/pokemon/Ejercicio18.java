package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/** Nivel 5 - #18 Top 5 pokemon mas fuertes (sorted + limit). */
public class Ejercicio18 {
    public static void main(String[] args) {
        List<Pokemon> pokedex = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psiquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragon", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 78, 610, "Kanto", false)
        );

        List<Pokemon> top5 = pokedex.stream()
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .limit(5)
                .toList();

        for (int i = 0; i < top5.size(); i++) {
            Pokemon p = top5.get(i);
            System.out.printf("#%d %-12s - PC: %.0f%n", i + 1, p.getNombre(), p.getPoderCombate());
        }
    }
}
