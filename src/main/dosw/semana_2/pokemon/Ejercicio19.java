package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

/** Nivel 5 - #19 Top 3 entrenadores (sorted + limit). */
public class Ejercicio19 {
    public static void main(String[] args) {
        List<Entrenador> entrenadores = List.of(
                new Entrenador(1L, "Gary", 10, List.of(
                        new Pokemon(1L, "p", "t", 1, 2340, "Kanto", false))),
                new Entrenador(2L, "Ash", 8, List.of(
                        new Pokemon(2L, "p", "t", 1, 1850, "Kanto", false))),
                new Entrenador(3L, "Dawn", 7, List.of(
                        new Pokemon(3L, "p", "t", 1, 2100, "Kanto", false))),
                new Entrenador(4L, "Brock", 6, List.of(
                        new Pokemon(4L, "p", "t", 1, 1670, "Kanto", false)))
        );

        List<Entrenador> top3 = entrenadores.stream()
                .sorted(Comparator.comparingInt(Entrenador::getMedallas).reversed())
                .limit(3)
                .toList();

        for (int i = 0; i < top3.size(); i++) {
            Entrenador e = top3.get(i);
            double pc = e.getEquipo().stream().mapToDouble(Pokemon::getPoderCombate).sum();
            System.out.printf("#%d %-6s - %d medallas, PC: %.0f%n",
                    i + 1, e.getNombre(), e.getMedallas(), pc);
        }
    }
}
