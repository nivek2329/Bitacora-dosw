package ejercicio10;

import java.util.function.Function;

// Command: encapsula una operacion reversible sobre la imagen del editor.
public class ApplyFilterCommand implements ImageCommand {
    private final ImageEditor editor;
    private final Function<Image, Image> filtro;
    private Image imagenAnterior;

    public ApplyFilterCommand(ImageEditor editor, Function<Image, Image> filtro) {
        this.editor = editor;
        this.filtro = filtro;
    }

    @Override
    public void execute() {
        imagenAnterior = editor.getImage();
        Image nueva = filtro.apply(imagenAnterior);
        editor.setImage(nueva);
        System.out.println("Aplicado -> " + nueva.render());
    }

    @Override
    public void undo() {
        editor.setImage(imagenAnterior);
        System.out.println("Deshecho -> " + imagenAnterior.render());
    }
}
