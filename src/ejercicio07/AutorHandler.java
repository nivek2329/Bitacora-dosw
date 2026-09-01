package ejercicio07;

public class AutorHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return true; // el autor siempre revisa primero
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[AutorHandler] Revision de forma del autor: OK");
    }
}
