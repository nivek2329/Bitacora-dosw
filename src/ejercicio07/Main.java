package ejercicio07;

/**
 * Demostracion: Chain of Responsibility + State.
 * Chain of Responsibility encadena los validadores (autor, lider, juridico);
 * cada handler decide si procesa el documento y siempre puede pasarlo al siguiente.
 * State maneja las transiciones propias del documento (borrador, en revision,
 * aprobado, rechazado), eliminando los switch/if de estado.
 */
public class Main {
    public static void main(String[] args) {
        Document contrato = new Document("Contrato de arrendamiento");

        // Chain of Responsibility: distintos validadores segun el tipo de documento
        DocumentHandler autor = new AutorHandler();
        DocumentHandler lider = new LiderHandler();
        DocumentHandler juridico = new JuridicoHandler();
        autor.setNext(lider).setNext(juridico);

        System.out.println("Estado inicial: " + contrato.getEstadoActual());
        autor.handle(contrato);

        // State: transiciones del documento
        contrato.enviarARevision();
        System.out.println("Estado actual: " + contrato.getEstadoActual());
        contrato.aprobar();
        System.out.println("Estado final: " + contrato.getEstadoActual());

        contrato.aprobar(); // demuestra que un documento aprobado no puede re-aprobarse
    }
}
