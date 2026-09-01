package ejercicio10;

public class BaseImage implements Image {
    private final String nombreArchivo;

    public BaseImage(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public String render() {
        return "Imagen[" + nombreArchivo + "]";
    }
}
