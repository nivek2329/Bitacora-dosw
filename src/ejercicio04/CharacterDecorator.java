package ejercicio04;

public abstract class CharacterDecorator implements Character {
    protected final Character wrapped;

    protected CharacterDecorator(Character wrapped) {
        this.wrapped = wrapped;
    }

    public Character getWrapped() {
        return wrapped;
    }
}
