package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** Nivel 3 - #09 Equipo elite (filter, PC > 500, orden descendente). */
public class Ejercicio09 {
    public static void main(String[] args) {
        List<Pokemon> equipo = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Mewtwo", "Psiquico", 88, 680, "Kanto", true),
                new Pokemon(3L, "Dragonite", "Dragon", 82, 530, "Kanto", false),
                new Pokemon(4L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(5L, "Gengar", "Fantasma", 65, 495, "Kanto", false),
                new Pokemon(6L, "Charizard", "Fuego", 78, 610, "Kanto", false)
        );

        List<Pokemon> equipoElite = equipo.stream()
                .filter(p -> p.getPoderCombate() > 500)
                .sorted(Comparator.comparingDouble(Pokemon::getPoderCombate).reversed())
                .collect(Collectors.toList());

        System.out.print("Equipo Elite (PC > 500): [");
        System.out.println(equipoElite.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) + "]");
    }
}
