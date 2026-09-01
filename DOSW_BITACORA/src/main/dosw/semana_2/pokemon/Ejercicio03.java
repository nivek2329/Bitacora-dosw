package dosw.semana_2.pokemon;

import java.util.List;

/** Nivel 1 - #03 Poder total del equipo (reduce). */
public class Ejercicio03 {
    public static void main(String[] args) {
        List<Integer> niveles = List.of(45, 62, 38, 71, 55, 29);

        int sumaTotal = niveles.stream()
                .reduce(0, Integer::sum);

        System.out.println("Suma total de niveles: " + sumaTotal);
    }
}
