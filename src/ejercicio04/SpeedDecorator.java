package ejercicio04;

public class SpeedDecorator extends CharacterDecorator {
    public SpeedDecorator(Character wrapped) {
        super(wrapped);
    }

    @Override
    public String attack() {
        return wrapped.attack() + " + [Velocidad extra]";
    }
}
