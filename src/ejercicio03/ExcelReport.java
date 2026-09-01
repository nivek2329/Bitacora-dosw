package ejercicio03;

public class ExcelReport extends ReportGenerator {
    @Override
    protected void applyFormat() {
        System.out.println("Aplicando formato Excel (celdas, formulas, hojas)");
    }

    @Override
    protected void exportFile() {
        System.out.println("Exportando reporte.xlsx");
    }
}
