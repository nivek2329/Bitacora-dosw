package ejercicio03;

public class ReportFactory {
    public static ReportGenerator create(String tipo) {
        return switch (tipo.toUpperCase()) {
            case "PDF" -> new PdfReport();
            case "EXCEL" -> new ExcelReport();
            case "CSV" -> new CsvReport();
            default -> throw new IllegalArgumentException("Tipo de reporte no soportado: " + tipo);
        };
    }
}
