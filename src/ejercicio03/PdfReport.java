package ejercicio03;

public class PdfReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato PDF (encabezados, tablas, estilos)");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando reporte.pdf");
    }
}
