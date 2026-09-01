package ejercicio03;

/**
 * Demostracion: Template Method + Factory Method.
 * Template Method fija el orden de los pasos (fetch, process, format, export)
 * y deja que las subclases varien solo applyFormat() y exportFile().
 * Factory Method crea la subclase correcta sin que el cliente la instancie directamente.
 */
public class Main {
    public static void main(String[] args) {
        String[] tiposSolicitados = {"PDF", "CSV", "EXCEL"};

        for (String tipo : tiposSolicitados) {
            System.out.println("=== Generando reporte " + tipo + " ===");
            ReportGenerator report = ReportFactory.create(tipo);
            report.generate();
            System.out.println();
        }
    }
}
