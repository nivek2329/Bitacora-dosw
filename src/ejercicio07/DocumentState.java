package ejercicio07;

public interface DocumentState {
    void approve(Document doc);
    void reject(Document doc);
    String getName();
}
