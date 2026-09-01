package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/** Nivel 4 - #17 Equipo mas poderoso (mapToDouble + sum, luego max). */
public class Ejercicio17 {
    public static void main(String[] args) {
        List<Pokemon> equipoAsh = List.of(
                new Pokemon(1L, "Pikachu", "Electrico", 45, 320, "Kanto", false),
                new Pokemon(2L, "Charizard", "Fuego", 78, 610, "Kanto", false),
                new Pokemon(3L, "Squirtle", "Agua", 38, 210, "Kanto", false),
                new Pokemon(4L, "Bulbasaur", "Planta", 29, 200, "Kanto", false),
                new Pokemon(5L, "Butterfree", "Bicho", 40, 200, "Kanto", false),
                new Pokemon(6L, "Snorlax", "Normal", 90, 310, "Kanto", false)
        );
        List<Pokemon> equipoGary = List.of(
                new Pokemon(7L, "Eevee", "Normal", 40, 250, "Kanto", false),
                new Pokemon(8L, "Nidoking", "Veneno", 70, 480, "Kanto", false),
                new Pokemon(9L, "Arcanine", "Fuego", 82, 610, "Kanto", false),
                new Pokemon(10L, "Golem", "Roca", 75, 500, "Kanto", false),
                new Pokemon(11L, "Kingler", "Agua", 60, 500, "Kanto", false)
        );
        List<Pokemon> equipoBrock = List.of(
                new Pokemon(12L, "Onix", "Roca", 55, 450, "Kanto", false),
                new Pokemon(13L, "Geodude", "Roca", 40, 320, "Kanto", false),
                new Pokemon(14L, "Vulpix", "Fuego", 30, 250, "Kanto", false),
                new Pokemon(15L, "Golbat", "Veneno", 65, 400, "Kanto", false),
                new Pokemon(16L, "Rhyhorn", "Roca", 45, 250, "Kanto", false)
        );

        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Ash", 8, equipoAsh),
                new Entrenador(2L, "Gary", 10, equipoGary),
                new Entrenador(3L, "Brock", 6, equipoBrock)
        );

        entrenadores.stream()
                .max(Comparator.comparingDouble(e ->
                        e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum()))
                .ifPresent(e -> {
                    double total = e.getEquipo().stream()
                            .mapToDouble(Pokemon::getPoderCombate).sum();
                    System.out.println("Entrenador mas poderoso: " + e.getNombre());
                    System.out.println("Poder acumulado del equipo: " + (int) total);
                });
    }
}
