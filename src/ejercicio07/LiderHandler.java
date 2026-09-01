package ejercicio07;

public class LiderHandler extends DocumentHandler {
    @Override
    protected boolean canHandle(Document doc) {
        return true;
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[LiderHandler] Revision del lider de equipo: OK");
    }
}
