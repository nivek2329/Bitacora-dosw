package dosw.semana_1.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 02 - Palabras con mas de 4 caracteres.
 * Filtrar palabras con mas de 4 caracteres, convertirlas a mayusculas,
 * ordenarlas alfabeticamente y obtener la cantidad total.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        List<String> palabras = List.of("java", "stream", "api", "functional", "code", "git");

        List<String> resultado = palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Entrada: " + palabras);
        System.out.println("Resultado ordenado: " + resultado);
        System.out.println("Cantidad de palabras resultantes: " + resultado.size());
    }
}
