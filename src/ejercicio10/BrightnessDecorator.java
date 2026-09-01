package ejercicio10;

public class BrightnessDecorator extends ImageDecorator {
    public BrightnessDecorator(Image wrapped) { super(wrapped); }

    @Override
    public String render() {
        return wrapped.render() + " + [Brillo +20%]";
    }
}
