package dosw.semana_1.streams;

import java.util.List;

/**
 * Ejercicio 05 - Transacciones bancarias.
 * Usar peek() para ver cada transaccion procesada, verificar si existe
 * al menos una transaccion no aprobada y retornar si el lote es valido
 * (valido = todas las transacciones estan aprobadas).
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction("T1", 150.0, true),
                new Transaction("T2", 320.5, true),
                new Transaction("T3", 90.0, false),
                new Transaction("T4", 500.0, true)
        );

        boolean hayNoAprobada = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.isApproved());

        boolean loteValido = !hayNoAprobada;

        System.out.println("Existe alguna transaccion no aprobada: " + hayNoAprobada);
        System.out.println("El lote es valido: " + loteValido);
    }
}
