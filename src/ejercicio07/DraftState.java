package ejercicio07;

public class DraftState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("Un borrador no puede aprobarse directamente, debe enviarse a revision.");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("Un borrador no puede rechazarse, aun no ha sido revisado.");
    }

    @Override
    public String getName() { return "BORRADOR"; }
}
