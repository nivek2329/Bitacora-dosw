package ejercicio03;

public abstract class ReportGenerator {
    // Template Method: define el esqueleto fijo del algoritmo
    public final void generate() {
        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    protected void fetchData() {
        System.out.println("Obteniendo datos de la base de datos...");
    }

    protected void processData() {
        System.out.println("Procesando y consolidando datos...");
    }

    protected abstract void applyFormat();
    protected abstract void exportFile();
}
