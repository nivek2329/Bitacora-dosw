package ejercicio07;

public class Document {
    private final String nombre;
    private DocumentState state = new DraftState();

    public Document(String nombre) {
        this.nombre = nombre;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void enviarARevision() {
        this.state = new InReviewState();
        System.out.println(nombre + " enviado a revision.");
    }

    public void aprobar() { state.approve(this); }
    public void rechazar() { state.reject(this); }

    public String getEstadoActual() { return state.getName(); }
    public String getNombre() { return nombre; }
}
