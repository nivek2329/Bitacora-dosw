package ejercicio07;

public class ApprovedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("El documento ya esta aprobado.");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("No se puede rechazar un documento ya aprobado.");
    }

    @Override
    public String getName() { return "APROBADO"; }
}
