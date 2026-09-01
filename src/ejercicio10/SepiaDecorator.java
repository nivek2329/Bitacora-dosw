package ejercicio10;

public class SepiaDecorator extends ImageDecorator {
    public SepiaDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() {
        return wrapped.render() + " + [Sepia]";
    }
}
