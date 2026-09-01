package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/** Nivel 3 - #12 Campeon regional (max con Comparator). */
public class Ejercicio12 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psiquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragon", 82, 530, "Kanto", false),
                new Pokemon(4L, "Charizard", "Fuego", 78, 610, "Kanto", false)
        );

        equipo.stream()
                .max(Comparator.comparingDouble(Pokemon::getPoderCombate))
                .ifPresent(p -> System.out.println(
                        "Campeon: " + p.getNombre() + " con PC: " + (int) p.getPoderCombate()));
    }
}
