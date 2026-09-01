package ejercicio04;

/**
 * Demostracion: Builder + Decorator.
 * Builder construye el personaje base paso a paso al inicio de la partida.
 * Decorator agrega poderes temporales en tiempo de ejecucion sin tocar
 * la clase base ni generar una explosion combinatoria de subclases.
 */
public class Main {
    public static void main(String[] args) {
        // Builder: construccion al inicio de la partida
        WarriorBuilder builder = new WarriorBuilder();
        Character guerrero = builder
                .setArmor("acero")
                .setWeapon("espada")
                .setSkill("rabia")
                .build();
        System.out.println(guerrero.attack());

        // Director: arquetipo predefinido
        CharacterDirector director = new CharacterDirector();
        Character elite = director.crearGuerreroElite(new WarriorBuilder());
        System.out.println(elite.attack());

        // Decorator: poderes dinamicos durante la partida
        Character potenciado = new ShieldDecorator(new SpeedDecorator(guerrero));
        System.out.println(potenciado.attack());

        Character invisibleYVeloz = new InvisibilityDecorator(new SpeedDecorator(elite));
        System.out.println(invisibleYVeloz.attack());
    }
}
