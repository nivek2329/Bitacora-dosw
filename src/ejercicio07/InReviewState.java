package ejercicio07;

public class InReviewState implements DocumentState {
    @Override
    public void approve(Document doc) {
        System.out.println("Documento aprobado durante la revision.");
        doc.setState(new ApprovedState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("Documento rechazado durante la revision.");
        doc.setState(new RejectedState());
    }

    @Override
    public String getName() { return "EN REVISION"; }
}
