package ejercicio07;

public class JuridicoHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return doc.getNombre().toLowerCase().contains("contrato");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[JuridicoHandler] Revision juridica requerida: OK");
    }
}
