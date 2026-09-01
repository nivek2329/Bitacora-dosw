package ejercicio07;

public class RejectedState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("No se puede aprobar un documento rechazado sin reiniciar el flujo.");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("El documento ya esta rechazado.");
    }

    @Override
    public String getName() { return "RECHAZADO"; }
}
