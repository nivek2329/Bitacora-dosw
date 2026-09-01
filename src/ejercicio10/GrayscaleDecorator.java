package ejercicio10;

public class GrayscaleDecorator extends ImageDecorator {
    public GrayscaleDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() {
        return wrapped.render() + " + [Blanco y Negro]";
    }
}
