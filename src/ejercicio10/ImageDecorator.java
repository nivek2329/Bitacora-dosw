package ejercicio10;

public abstract class ImageDecorator implements Image {
    protected final Image wrapped;

    protected ImageDecorator(Image wrapped) {
        this.wrapped = wrapped;
    }

    public Image getWrapped() {
        return wrapped;
    }
}
