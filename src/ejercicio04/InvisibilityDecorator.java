package ejercicio04;

public class InvisibilityDecorator extends CharacterDecorator {
    public InvisibilityDecorator(Character wrapped) {
        super(wrapped);
    }

    @Override
    public String attack() {
        return wrapped.attack() + " + [Invisible durante el golpe]";
    }
}
