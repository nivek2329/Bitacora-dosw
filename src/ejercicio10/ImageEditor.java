package ejercicio10;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImageEditor {
    private Image image;
    private final Deque<ImageCommand> historial = new ArrayDeque<>();

    public ImageEditor(Image imagenInicial) {
        this.image = imagenInicial;
    }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }

    public void ejecutar(ImageCommand comando) {
        comando.execute();
        historial.push(comando);
    }

    public void deshacerUltimo() {
        if (!historial.isEmpty()) {
            ImageCommand ultimo = historial.pop();
            ultimo.undo();
        } else {
            System.out.println("No hay operaciones para deshacer.");
        }
    }
}
