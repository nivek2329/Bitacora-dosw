package ejercicio03;

public class CsvReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato CSV (separado por comas)");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando reporte.csv");
    }
}
